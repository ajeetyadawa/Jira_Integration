package Utils;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	private final String filePath;

	public ConfigReader(String filePath) throws IOException {
		this.filePath = System.getProperty("user.dir")+ "\\src\\main\\resources\\"+filePath;
		loadProperty();
	}

	public void loadProperty() throws IOException {
		BufferedReader bufferReader = new BufferedReader(new FileReader(filePath));
		properties = new Properties();
		properties.load(bufferReader);
		bufferReader.close();
	}
public String getPropertyValue(String key) {
	String value= properties.getProperty(key);
//	System.out.println("Value of Given Key "+value);
	return value;
	
}
}
