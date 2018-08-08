package readcsvone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCsv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String fileName="data.csv";
  
  File file=new File(fileName);
  try{
	  
	  Scanner inputStream=new Scanner(file);
	  while(inputStream.hasNext()){
	  String data=inputStream.next();
	  System.out.println(data);
	  }
	  inputStream.close();
	  }
  catch(FileNotFoundException e){
	  
	  e.printStackTrace();
  }
	}

}
