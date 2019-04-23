import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//Write a program - Open Notebook and type string INDIA with font size 16

public class Test3 {
static Font f1;
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\vijaya\\Desktop\\123.txt",true);
		fw.write("INDIA");
		//f1 = new Font("DialogInput", Font.BOLD, 169);
	     fw.close();
		
		

	}

}
