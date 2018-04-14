package command;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.FormValidator;
import view.MainFrame;

public class ButtonDevice implements Actions{

	@Override
	public void accept() {
		ArrayList<JTextField> in = new ArrayList<JTextField>();
		String msgOK = "";
		String msgKO = "";
 		String title = "";
		
		if(MainFrame.mainView.isLoginView()){
			System.out.println("LOGGIN BUTTON WORKING");
			in = MainFrame.mainView.getLogin().getInputs();
			msgOK = "<html><body>Greetings ";
			msgKO = "Access denied...";
			title = "Login";
		}else if(MainFrame.mainView.isRegisterView()){
			System.out.println("REGISTER BUTTON WORKING");
			in = MainFrame.mainView.getRegister().getInputs();
			msgOK = "<html><body>---NEW USER---<br>";
			msgKO = "Incomplete or wrong form...";
			title = "Register form";
		}
		
		for(JTextField f: in){
			System.out.println(f.getText());
		}
		
		FormValidator validator = new FormValidator(in);
		if(validator.validate()){
			JOptionPane.showMessageDialog(null, msgOK + validator.toString(), title, 1);
			if(MainFrame.mainView.isRegisterView()){
				resetComponents(false);
			}else{
				loginViewOff();
			}
		}else{
			JOptionPane.showMessageDialog(null, msgKO, title, 0);
		}

	}

	@Override
	public void cancel() {
		if(MainFrame.mainView.isRegisterView()){
			resetComponents(false);
		}
		
	}

	@Override
	public void register() {
		resetComponents(true);

	}

	private void resetComponents(boolean isLogin){
		if(isLogin){
			MainFrame.mainView.getLogin().hideComponents();
			MainFrame.mainView.getLogin().cleanInput();
			MainFrame.mainView.getRegister().showComponents();
			MainFrame.mainView.setViews(false, true);
			MainFrame.mainView.repaint();
		}else{
			MainFrame.mainView.getRegister().hideComponents();
			MainFrame.mainView.getRegister().cleanInput();
			MainFrame.mainView.getLogin().showComponents();
			MainFrame.mainView.setViews(true, false);
			MainFrame.mainView.repaint();
		}
	}
	private void loginViewOff(){

		MainFrame.mainView.getLogin().cleanInput();
		MainFrame.mainView.setVisible(false);
		MainFrame.taskView.setVisible(true);
		MainFrame.taskView.repaint();
	}
}
