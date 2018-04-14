package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import components.LoginForm;
import components.RegisterForm;


public class MainPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	//VISUAL CONTENT
	private Image background;
	private Font titleFont = new Font("Eras Bold ITC",Font.BOLD,30);
	
	//INPUTS
	private LoginForm login;
	private RegisterForm register;
	
	//VIEW STATE BOOLEANS
	private boolean loginView;
	private boolean registerView;
	
	public MainPanel(){
		setLayout(null);
		try{
			background = ImageIO.read(new File("img/mainbackground2.jpg"));
		}catch(Exception e){
			System.out.println("Imagen no encontrada");
		}
		login = new LoginForm(this);
		register= new RegisterForm(this);
		
		loginView = true;
		registerView = false;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(loginView) drawMainView(g);
		else if(registerView) drawRegisterView(g);
	}


	private void drawMainView(Graphics g){
		g.drawImage(background, 0, 0, null);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Login", MainFrame.WIDTH / 3 + 60, 50);
		login.draw(g);
	}
	
	private void drawRegisterView(Graphics g){
		g.drawImage(background, 0, 0, null);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Register", MainFrame.WIDTH / 3 + 60, 50);
		register.draw(g);
	}
	
	public void setViews(boolean mainView, boolean registerView){
		this.loginView = mainView;
		this.registerView = registerView;
	}

	public RegisterForm getRegister() {
		return register;
	}

	public void setRegister(RegisterForm register) {
		this.register = register;
	}

	public LoginForm getLogin() {
		return login;
	}

	public void setLogin(LoginForm login) {
		this.login = login;
	}

	public boolean isLoginView() {
		return loginView;
	}

	public void setLoginView(boolean mainView) {
		this.loginView = mainView;
	}

	public boolean isRegisterView() {
		return registerView;
	}

	public void setRegisterView(boolean registerView) {
		this.registerView = registerView;
	}
}
