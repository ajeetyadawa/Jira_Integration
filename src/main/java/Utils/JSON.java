package Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSON {
private final String filePath;
public JSON(String filePath) {
	this.filePath= filePath;
}
public String getJSONAsString() throws IOException {
	
return new String(Files.readAllBytes(Paths.get(filePath)));
}
}
