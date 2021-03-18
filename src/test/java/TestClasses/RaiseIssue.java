package TestClasses;
import java.io.IOException;

import Client.JiraClient;
import Utils.JSON;

public class RaiseIssue {

	public static void main(String[] args) throws IOException {
		String issueJSONPath =System.getProperty("user.dir")
				+"\\src\\main\\resources\\IssueDetails.json";
    JSON json = new JSON(issueJSONPath);
	JiraClient jira = new JiraClient();
	jira.CreateJiraIssue(json.getJSONAsString());
	}

}
