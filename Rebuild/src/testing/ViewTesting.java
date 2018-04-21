package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.MainFrame;
import view.MainPanel;
import view.TaskPanel;

class ViewTesting {

	@Test
	void test() {
 		fail("Not yet implemented");
	}

	public void mainFrameTest() {
		MainFrame f = new MainFrame();
		
		assertNull(f);
		assertNull(MainFrame.device);
	 	assertNull(MainFrame.container);
			
	}
	
	public void mainPaneltest() {
		MainPanel p = new MainPanel();		
		assertNull(p);
		assertNull(MainPanel.loginBackground);
		assertNull(MainPanel.titleFont);
	 	assertNull(p.getLogin());
	 	assertNull(p.getRegister());
	 	assertNull(p.isLoginView());
	 	assertNull(p.isRegisterView());	 	
	}
	
	public void taskPanelTest() {
		assertNull(TaskPanel.buttonPanel);		
	}
	
	
	
	
	
}
