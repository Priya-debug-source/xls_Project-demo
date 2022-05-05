package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTestFile {

	public static void main(String[] args) throws IOException {


		
		//creating new text file(Data File)
		
		File f=new File("C:\\testing\\temp.txt");
		 f.createNewFile();		
		
		
		
		//Write into text file
		 FileWriter w = new FileWriter(f);
		 
		BufferedWriter out = new BufferedWriter(w);
		 
		 out.write("1st Line");
		 //for the new line
		 out.newLine();
		 out.write("2nd Line");
		 out.newLine();
		 
		 out.write("3rd Line");
		 out.newLine();
		 
		 out.write("4th Line");
		 out.newLine();
		 
		 out.write("5th Line");
		 out.flush();
		 //closing the connection
		 out.close();
		 
		 
		 //Read from the  text file
		 FileReader r= new FileReader(f);
		 BufferedReader rd= new BufferedReader(r);
		 
		/* System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine()); 
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 System.out.println(rd.readLine());
		 rd.close();*/
		
		 
		
		
	 
		String x;
		int i=0;//to see the total number of line
		
		while((x= rd.readLine())!=null) {
			System.out.println(x);
			i++;
		}
	System.out.println("total number of line"  +i);
	
	
		 
	rd.close();
		 
		 
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
