package components;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import buttons.ConfirmButton;
import buttons.RegisterButton;
import command.ButtonPattern;
import listeners.ButtonListener;
import view.MainFrame;

public class LoginForm  extends Form{

	private ArrayList<ButtonPattern> buttons;
	
	private ConfirmButton login;
	private RegisterButton register;

	//TESTING USER STRINGS
	public static String user = "Jander";
	public static String pass = "1234";
	
	public LoginForm(JPanel view) {
		super(view);
		// INIT BUTTONS
		login = new ConfirmButton("Login", nameX, nameY * 2, MainFrame.device, view);
		register = new RegisterButton("Register", nameX + 150, nameY * 2, MainFrame.device, view);
		buttons = new ArrayList<ButtonPattern>();
		buttons.add(login);
		buttons.add(register);
		
		//ADDING BUTTON LISTENERS
		listener = new ButtonListener(buttons);
		login.addActionListener(listener);
		register.addActionListener(listener);
	}

	public void hideComponents(){
		for(ButtonPattern p : buttons){
			p.setVisible(false);
		}
		for(JTextField f: inputs){
			f.setVisible(false);
		}
	}

	
	public void showComponents(){
		for(ButtonPattern p : buttons){
			p.setVisible(true);
		}
		for(JTextField f: inputs){
			f.setVisible(true);
		}
	}
}
