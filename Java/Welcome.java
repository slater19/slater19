// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		

		String filename;

		

		File directory = new File("C:\\Users\\Sachin\\Desktop\\New folder");

		String[] list = directory.list();

		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Java Project 1");
		System.out.println();
		System.out.println("Sachin Aggarwal");

		System.out.println();
		System.out.println("Full Stack Developer");
		System.out.println();
		
		boolean open=true;

		do {

			System.out.println("Select input \n");
			System.out.println("1.File List");
			System.out.println("2.Select File Options");
			
		
			
			System.out.println("3.Exit");

			int selection = input.nextInt();
			
			
            switch (selection) {

			
             case 1:
				
				FileClass file1=new FileClass();
				
				file1.filelist();
				break;

			case 2:
                System.out.println("2.Select File Options");
                
                	System.out.println("a File Add");
			        System.out.println("b File Delete");
			        System.out.println("c File Search");
			        System.out.println("d Back to Main");
			
			char ch = input.next().charAt(0);
			
				FileClass file2=new FileClass();
				
				
			
			
			if(ch == 'A' || ch == 'a')
			{
			file2.fileadd();    
			}
			else if(ch == 'B' || ch == 'b')
			{
			file2.fileremove();    
			}
			
			else if(ch == 'C' || ch == 'c')
			{
			file2.filesearch();    
			}
			
			else if(ch == 'D' || ch == 'd')
			{
			
			
			System.out.println("Back to main");
			
		
			Hello.main(new String[1]);
			
			}
			else
			{
		    System.out.println("Choose again");
		    }
			
			
                 
            break;

			
			case 3:

				System.out.println("Exiting...");
				open =false;
				break;

			default:

				System.out.println("Choose again");
				break;

			}
		

		} while (open);

	}}



class FileClass{
	
	void filelist() {
		
		String[] listOfFiles;
		File folder = new File("C:\\Users\\Sachin\\Desktop\\New folder");
		
		
		listOfFiles =folder.list();
		
		  
      int n=listOfFiles.length;
      
  
 
         
         for(int i = 0; i<n; i++) 
         {  
             for (int j = i+1; j<n; j++) 
             {  
                
                if(listOfFiles[i].compareTo(listOfFiles[j])>0)   
                {  
                   
                    String temp = listOfFiles[i];  
                    listOfFiles[i] = listOfFiles[j];  
                    listOfFiles[j] = temp;  
                 }  
              }  
           }
           
           
           
		for (String pathname : listOfFiles) {
			
   System.out.println(pathname);
		}
	}
	
	void fileadd(){
	    
		System.out.println("Enter the file name");
		        String filename;
                Scanner input = new Scanner(System.in);
				filename = input.next();

				try {
					File file = new File("C:\\Users\\Sachin\\Desktop\\New folder\\" + filename + ".txt");

					if (file.createNewFile()) {

						System.out.println(filename + " Created Successfully \n");
					} 
					else {
						if (file.exists()) {
							System.out.println(filename+ " Already Exists");
						}
						else {
							System.out.println( filename+" Doesen't exist");
						}

						

					
				}
				    
				} 
				catch (IOException e) {
					
					e.printStackTrace();
				}    
	    
	}
	
	void fileremove(){
	    
		System.out.println("Enter the file name");
                String filename;
                Scanner input = new Scanner(System.in);
				filename = input.next();

				File directory = new File("C:\\Users\\Sachin\\Desktop\\New folder");

				String[] rlist = directory.list();

				
				int remove = 0;
				if (rlist == null) {
					System.out.println("There is no file present in the directory");
				} else {

					// Linear search in the array
					for (int i = 0; i < rlist.length; i++) {
						String filename1 = rlist[i];
                        
						if (filename1.equalsIgnoreCase(filename)) {
                         System.out.println(filename1);   
							File dfile = new File(
									"C:\\Users\\Sachin\\Desktop\\New folder\\" + filename1);
                                    

                                    if (dfile.delete()) {
								System.out.println( filename +" deleted");
							} else {
								System.out.println(filename +" not deleted");
							}
						  remove= 1;
						}
					}
				}

				if (remove == 0) {
					System.out.println( filename + "Not Found");
				}    
	    
	}
	
	void filesearch(){
	    
   System.out.println("Enter the file name for searching");
   Scanner input = new Scanner(System.in);
   String filename;
   filename = input.next();

				File directory = new File("C:\\Users\\Sachin\\Desktop\\New folder");

				String[] slist = directory.list();
				int search = 0;
				if (slist == null) {
					System.out.println("There is no file preseent in the directory");
				} else {

					
					for (int i = 0; i < slist.length; i++) {
						String filename1 = slist[i];
						if (filename1.equalsIgnoreCase(filename)) {
							System.out.println(filename + " is found");
							search = 1;
						}
					}
				}

				if (search== 0) {
					System.out.println(filename + " not Found");
				}
	    
	    
	    
	}
	
	
	

}
