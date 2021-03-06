package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import buttons.CreateButton;
import buttons.DeleteButton;
import buttons.FinishButton;
import buttons.ModifyButton;
import command.ButtonPattern;
import listeners.ButtonListener;
import view.MainFrame;

public class TaskButtonPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	//FURNITURE
	private Image background;
	
	//SINGLETON
	private static TaskButtonPanel butonPanel;
	
	//BUTTONS
	private CreateButton createTask;
	private DeleteButton deleteTask;
	private FinishButton finishTask;
	private ModifyButton modifyTask;
	public static ArrayList<ButtonPattern> buttons;
	
	//LISTENERS
	private ButtonListener listener;
	
	public TaskButtonPanel(){
		
		setLayout(null);
		
		try {
			background = ImageIO.read(new File("img/buttonsbackground.jpg"));
		} catch (IOException e) {System.out.println("IMAGE NOT FOUND @ BUTTON PANEL");}
		
		createTask = new CreateButton("Create",80,10,MainFrame.device,this);
		deleteTask = new DeleteButton("Delete",240,10,MainFrame.device,this);
		finishTask = new FinishButton("Finish",440,10,MainFrame.device,this);
		modifyTask = new ModifyButton("Modify",600,10,MainFrame.device,this);
		
		buttons = new ArrayList<ButtonPattern>();
		buttons.add(createTask);
		buttons.add(deleteTask);
		buttons.add(finishTask);
		buttons.add(modifyTask);
		
		listener = new ButtonListener(buttons);
		
	}
	
	public static TaskButtonPanel getInstance(){
		if(TaskButtonPanel.butonPanel == null){
			TaskButtonPanel.butonPanel = new TaskButtonPanel();
		}
		return TaskButtonPanel.butonPanel;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, null);
	}
}

















