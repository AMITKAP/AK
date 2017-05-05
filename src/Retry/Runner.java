package Retry;

import java.util.ArrayList;

import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) 
	{

	 TestNG runner=  new TestNG();
	 
	 ArrayList<String> st=  new ArrayList<String>();
	 st.add("C:\\Users\\akapoor2\\Desktop\\SELENIUM_PRACTICE\\Interview_Prep\\test-output\\testng-failed.xml");
	 runner.setTestSuites(st);
	 runner.run();
	
	
	}

}
