import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.junit.Test;

import controller.FormValidator;

public class ControllerTest {

	@Test
	public void test() {
		
		JPasswordField repass = new JPasswordField();
		repass.setName("Re-Password:");
		repass.setText("12345");
		JPasswordField pass = new JPasswordField();
		pass.setName("Password:");
		pass.setText("1234");
		
		ArrayList<JTextField> inputs = new ArrayList<JTextField>();
		inputs.add(pass);
		inputs.add(repass);
		
		FormValidator validator = new FormValidator(inputs);
		System.out.println(validator.validate());
		
		for(JTextField p : inputs){
			System.out.println("TEST INPUTS : " + p.getText());
		}
		
		System.out.println("Same ");
		assertTrue(validator.validate());
	}

	
}
