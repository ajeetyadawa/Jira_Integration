package Listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Client.JiraClient;
import Utils.JSON;

public class TestListener implements ITestListener  {

	public void onTestFailure(ITestResult result) {
	   String testSummary = "Test "+ result.getTestClass().getName()+"failed";
	   String testDescription= "Test Method "+ result.getInstanceName();
	  JSON json = new JSON(" ");
	   String jsonBody = json.convertIntoJSON(testSummary,testDescription );
	   try {
		JiraClient jira = new JiraClient();
		jira.CreateJiraIssue(jsonBody);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
	  }
	
}
