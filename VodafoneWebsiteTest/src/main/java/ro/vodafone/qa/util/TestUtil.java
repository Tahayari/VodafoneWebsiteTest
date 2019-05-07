package ro.vodafone.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ro.vodafone.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 30 ;
	public static long IMPLICIT_WAIT = 10 ;

//	public void switchToFrame(){
//		driver.switchTo().frame("mainpanel");
//	}
//	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		String timeStamp = new SimpleDateFormat("yyyy.MM. dd.HH.mm.ss").format(new Date());
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + timeStamp + ".png"));
	}
	
}
