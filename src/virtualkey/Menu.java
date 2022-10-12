package virtualkey;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Menu {

	public static void ascendingorder()
	{


		File dir = new File("D:\\Virtual Key Repository\\Project Files");
		if(dir.isDirectory())
		{
			//  fetching the file from the list directory
			File[] files = dir.listFiles();

			System.out.println("All the files including folders");
			System.out.println("--------------------------------");



			// sort files by name
			Arrays.sort(files, new Comparator()
			{
				@Override
				public int compare(Object f1, Object f2) {
					return ((File) f1).getName().compareTo(((File) f2).getName());
				}
			});

			//  print the file name in ascending order.
			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("\nAfter sorting by name");
			System.out.println("|||----------------------------------|||");

			// This is through sort files by size.
			Arrays.sort(files, new Comparator()
			{
				@Override
				public int compare(Object f1, Object f2)
				{
					if (((File) f1).length() < ((File) f2).length())
					{
						return -1;
					}
					else if (((File) f1).length() > ((File) f2).length())
					{
						return 1;
					}
					else
					{
						return 0;
					}
				}
			});

			// Prints files in order by file size
			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("\nAfter sorting by length");
			System.out.println("<<<------------------------------->>>");


			for(File file:files)
			{
				System.out.println(file.getName());
			}
			System.out.println("-------------------------");
			System.out.println("-------------------------");
		}

	}


	public static void add() throws IOException
	{
		System.out.println("Enter your file name");
		Scanner sc = new Scanner(System.in);
		String add = sc.nextLine();

		File file = new File("D:\\Virtual Key Repository\\Project Files\\"+add);

		if(file.createNewFile())
			System.out.println("File is created");
		else
			System.out.println("File is alredy exist");
	}



	public static void delete()
	{
		System.out.println("Enter file name to delete");
		Scanner sc = new Scanner(System.in);
		String delete = sc.nextLine();

		File file = new File("D:\\Virtual Key Repository\\Project Files\\"+delete);	

		if(file.delete())
			System.out.println("File is deleted");
		else
			System.out.println("File is not deleted or file not found");
	}



	public static void search()
	{
		System.out.println("Enter your file name to search");
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		File file = new File("D:\\Virtual Key Repository\\Project Files\\"+search);
		if( file.exists())
		{
			System.out.println("File is available"); 
		}
		else 
			System.out.println("File is not available");
	}



	public static void main(String[] args) throws IOException {
		System.out.println("##################### WELCOME TO LockedMe.com ####################");
		System.out.println("Application Name: Virtual Key For Your Repository\n");
		System.out.println("################### Developer Details ###################");
		System.out.println("Name: Tejas Zanzad");
		System.out.println("Designation: Full Stack Java Developer");
		System.out.println("#################################################################");	
		System.out.println();
		System.out.println("Press Enter to Start the Application");
		Scanner s = new Scanner(System.in);
		String Enter = s.nextLine();
		System.out.println("--------------------------------------------------------------------");
		while(true)
		{
			System.out.println("Enter 1: Get file names in ascending order");
			System.out.println("Enter 2: For Business Level Operation");
			System.out.println("Enter 3: Close the Application");

			System.out.println("Enter your choice");

			Scanner sc = new Scanner(System.in);

			int option= sc.nextInt();

			if(option==1)
			{
				ascendingorder();
			}

			else if(option==2)
			{
				System.out.println("\n--->Select Any one to perform business level operations");
				System.out.println("\nEnter 1 : Add file");
				System.out.println("Enter 2:  Delete file");
				System.out.println("Enter 3:  Search file");
				System.out.println("Enter 4:  Go back");

				System.out.println("Enter your choice :- ");

				int input = sc.nextInt();

				switch(input)
				{

				case 1: {  add();  
				break;  }

				case 2: { delete(); 
				break;   }

				case 3: { search(); 
				break;  }

				case 4: {  System.out.println("Back is Successful"); 
				break;  }

				}
			}

			else if(option == 3 )	
			{ 	 System.out.println("<<Thank you for using this Application>>");	
			System.out.println("-----------------Exit-------------------");
			System.exit(option); 
			}

			else
			{
				System.out.println("Kindly enter valid input");
			}
		}

	}
}



