package files_1;

import java.io.DataInputStream;
//import java.io.FileNotFoundException;
//import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WrieData {
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream dos=new FileOutputStream("mytext.txt",true);
		System.out.println("Type The  @ at the end of Text");
		char ch;
			while((ch=(char)dis.read())!='@') {
				dos.write(ch);
			
			}
			dos.close();
		
	}
}
