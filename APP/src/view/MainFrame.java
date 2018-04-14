package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import command.ButtonDevice;
import controller.DBController;

public class MainFrame extends JFrame {

	//POSITION AND BOUNDS VARAIBLES
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	//VIEWS
	public static MainPanel mainView;
	public static TaskPanel taskView;
	
	//FUNCTIONALITY
	public static ButtonDevice device;
	
	public MainFrame(){
		
		//FRAME CONFIG
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension screen = tool.getScreenSize();
		setBounds(screen.width / 4, screen.height / 5, WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("---Project IC---");
		setBackground(Color.BLACK);
		
		//FUNCTIONALITY INIT
		device = new ButtonDevice();
		
		//VIEWS INIT
		mainView = new MainPanel();
		taskView = new TaskPanel();
		this.add(taskView);
		//this.add(mainView);

	}

}
