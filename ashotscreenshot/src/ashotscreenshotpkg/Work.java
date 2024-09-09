package ashotscreenshotpkg;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Work {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		org.openqa.selenium.devtools.v125.page.model.
		Screenshot screen = new ASho().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		ImageIO.write(screen.getImage(), "png" ,new File ("C:\\Users\\HARI\\OneDrive\\Desktop\\selenium automation\\screenshot\\pc3.png"));
		System.out.println("all screenshot captured");

	}

}
