import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class _4 {
	 public static void main(String[] args) throws FileNotFoundException, IOException {
	        FileReader fr = new FileReader("F:/Compiler/src/antor.txt");
	        BufferedReader br = new BufferedReader(fr);
	        String buffer;
	        String fulltext="";
	        while ((buffer = br.readLine()) != null) {
	            System.out.println(buffer);
	            fulltext += buffer;
	        }
	        br.close();
	        fr.close();
	    }

}
