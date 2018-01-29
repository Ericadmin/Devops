import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.scene.shape.Path;

public class FileLister {

	public static void main(String[] args) {
		String pathName = args[0];
		
		File inputDir = new File(pathName);
		
		if (inputDir.exists()) {
			if (inputDir.list().length == 0) {
				try {
					throw new Exception("Directory does not contain any file");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				try {
					Files.list(Paths.get(pathName)).forEach(System.out::println);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			try {
				throw new Exception("Invalid Directory");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		

	}

}
