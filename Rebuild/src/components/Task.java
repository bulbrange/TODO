package components;

import java.util.Calendar;

import buttons.DisplayTaskButton;

public class Task {
	
	private Calendar start;
	private Calendar end;
	private Calendar creation;
	private String title;
	private String description;
	private DisplayTaskButton task;
	public static int posY = 50;
	public static int posx = 50;
	
	public Task(Calendar start, Calendar end, Calendar creation, String title, String description, DisplayTaskButton task){
		this.start = start;
		this.end = end;
		this.creation = creation;
		this.title = title;
		this.description = description;
		this.task = task;
	}


	public Calendar getStart() {
		return start;
	}


	public void setStart(Calendar start) {
		this.start = start;
	}


	public Calendar getEnd() {
		return end;
	}


	public void setEnd(Calendar end) {
		this.end = end;
	}


	public Calendar getCreation() {
		return creation;
	}


	public void setCreation(Calendar creation) {
		this.creation = creation;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

}
