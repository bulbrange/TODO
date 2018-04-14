package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TaskPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private TextPanePanel description;
	public static final int DESCRIPTION_TOPOFFSET = 50;

	private Image background;
	
	public TaskPanel(){
		
		try {
			background = ImageIO.read(new File("img/taskbackground.jpg"));
		} catch (IOException e) {System.out.println("Image not found @ TASK PANEL");}
		
		setLayout(null);
		//setVisible(false);
		description = new TextPanePanel();
		description.setBounds(MainFrame.WIDTH/2, TaskPanel.DESCRIPTION_TOPOFFSET, MainFrame.WIDTH/2 - 20, MainFrame.HEIGHT - 150);
		
		add(description);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(background, 0, 0, null);
	}
}
