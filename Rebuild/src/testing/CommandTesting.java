package testing;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import command.ButtonDevice;
import command.ButtonPattern;

class CommandTesting {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void buttonDeviceTest() {
		ButtonDevice p = new ButtonDevice();
		assertNull(p);
		/*assertNull(p.cancel());
		assertNull(p.createTask());
		assertNull(p.deleteTask());
		assertNull(p.exitView());
		assertNull(p.finishTask());
		assertNull(p.modifyTask());*/
		
	}
	
	public void buttonPattern() {
		assertNull(ButtonPattern.WIDTH);
		assertNull(ButtonPattern.HEIGHT);
		
	}
	
	

}
