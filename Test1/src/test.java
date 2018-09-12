import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			 in = new FileInputStream("C:\\Users\\love_\\OneDrive\\바탕 화면\\goo.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	// 얼만지 몰라
		while(true) {
			//읽어낸 한 바이트의 데이터는  int값으로 나온다 <---1바이트의 쓰여있는 값
			try {
				int count = in.read();
				if (count == -1) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		try {
			 out  = new FileOutputStream("zzz1.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
