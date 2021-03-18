package Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON {
	private final String filePath;

	public JSON(String filePath) {
		this.filePath = filePath;
	}
	public String getJSONAsString() throws IOException {
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}
	
	public String convertIntoJSON(String issueSummary, String issueDescription) {
		String jsonBody ="{\"fields\":\r\n"
				+ " {\r\n"
				+ " \"project\":{\"key\":\"ThoughtCoders\"},\r\n"
				+ " \"summary\":\""+issueSummary+"\",\r\n"
				+ " \"description\":\""+issueDescription+"\",\r\n"
				+ " \"issuetype\":{\"name\":\"Bug\"}\r\n"
				+ " }\r\n"
				+ "}";
		System.out.println("JSON of Issue: \n"+jsonBody);
		return jsonBody;
	}
	
	
}
