package buttons;

import javax.swing.JPanel;

import command.ButtonDevice;
import command.ButtonPattern;
import components.Task;

public class DisplayTaskButton extends ButtonPattern{

	private static final long serialVersionUID = 1L;
	private Task task;
	
	public DisplayTaskButton(String title, int x, int y, ButtonDevice device, JPanel view, Task task) {
		super(title, x, y, device, view);
		this.task = task;
	}

	@Override
	public void execute() {
		device.displayTask(task);
		
	}

}
