package utilities;

import org.openqa.selenium.winium.WiniumDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Utilities {

	public void maximizeWindow(WiniumDriver driver) {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_WINDOWS);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_WINDOWS);
			System.out.println("Window maximized");
		} catch (Exception e) {
			System.out.println("Window could not be maximised");
			e.printStackTrace();
			
		}
	}

}
