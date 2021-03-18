package Client;

import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.sun.jersey.core.util.Base64;

import Utils.ConfigReader;

public class JiraClient {
private String auth;
private final String JIRA_USERNAME;
private final String JIRA_API_TOKEN;
public ConfigReader configReader;

public JiraClient() throws IOException{
		configReader = new ConfigReader("Config.properties");
		JIRA_USERNAME=configReader.getPropertyValue("JIRA_USERNAME");
		JIRA_API_TOKEN=configReader.getPropertyValue("JIRA_API_TOKEN");
		String auth = new String(Base64.encode(JIRA_USERNAME + ":" + JIRA_API_TOKEN));
	}
		
	public void CreateJiraIssue(String jsonBody) {
		try {
		    CloseableHttpClient client = HttpClientBuilder.create().build();
		    HttpPost httpPost = new HttpPost("https://YOUR_URL.atlassian.net/rest/api/2/issue");
	        httpPost.setHeader(HttpHeaders.AUTHORIZATION, "Basic "+auth);
	        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "application/json");
	        httpPost.setHeader(HttpHeaders.ACCEPT, "application/json");
	     //   String body = "{\"fields\":{\"project\":{\"key\":\""+key+"\"},\"summary\":\""+summary+"\",\"description\":\""+description+"\",\"issuetype\":{\"name\":\""+issueType+"\"}}}";
	        StringEntity entity = new StringEntity(jsonBody);
	        httpPost.setEntity(entity);

	        HttpResponse response = client.execute(httpPost);
	        int statusCode = response.getStatusLine().getStatusCode();
	        String responseBody = EntityUtils.toString(response.getEntity());
	        System.out.println("Body: " +responseBody);
	        System.out.println("Status Code: " +statusCode);

	}catch(Exception e) {
		System.out.println("JIRA issue not created");
	}
	
	
	
	
}
}
