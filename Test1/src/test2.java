import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test2 {

	public static void main(String[] args) throws Exception {
	String[] num1 = {"1","2","3","4","5"};
	String[] num2 = {"a","b","c","d","e"};
	String[] num3 = {"¤¡","¤¤","¤§","¤©","¤±"};
		
	int aa = num1.length;
	int bb = num2.length;
	int cc = num3.length;
		
		int aaa = (int)(Math.random()* aa);
		int bbb = (int)(Math.random()* bb);
		int ccc = (int)(Math.random()* cc);
	
	String abc = num1[aaa] + " "+ num2[bbb]+" "+num3[ccc];
		System.out.println(abc);
		System.out.println(aaa);
	}
}
