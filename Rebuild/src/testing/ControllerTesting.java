package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

import controller.FormValidator;

class ControllerTesting {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void Formtest() {
		JTextField j1 = new JTextField();
		j1.setName("E-Mail:");
		j1.setText("PeppeterlovesJander");
		JTextField j2 = new JTextField();
		j2.setName("Password:");
		j2.setText("1234");		
		JTextField j3 = new JTextField();
		j3.setName("User:");
		j3.setText("PeppeterlovesJander");
		JTextField j4 = new JTextField();
		j4.setName("Re-Password:");
		j4.setText("123477");	
		
		ArrayList<JTextField> paco = new ArrayList<JTextField>();
		paco.add(j1);
		paco.add(j2);
		paco.add(j3);
		paco.add(j4);
		
		FormValidator f = new FormValidator(paco);
		assertTrue(f.validate());
		
		
	}
	
	

}
