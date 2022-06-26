package projectBook;

import java.util.Scanner;

public class Bookmain 
{
	static Scanner sc=new Scanner(System.in);
    static int choice;
    
    public static void menu()
    {
    	System.out.println("Select one option from below:");
    	System.out.println("0:Enter no of books and authors");
    	System.out.println("1.Add authors");
    	System.out.println("2.Add books");
    	System.out.println("3.Search book by name");
    	System.out.println("4.Display book details");
    	System.out.println("5.Display author details");
    	System.out.println("6.Display all books");
    	System.out.println("7.Display all authors");
    	System.out.println("8.Update an author");
    	System.out.println("9.Delete an author");
    	System.out.println("10.Update book:Through choice");
    	System.out.println("11.Update a book:all fields");
    	System.out.println("12.Delete a book");
    	System.out.println("Enter your choice");
    	choice=sc.nextInt();
    	
    }
    public static void main(String args[])
    {
    	Book book[]=null;
    	Book book1=null;
    	Author author[]=null;
    	Author author1=null;
    	int noOfAuthors=0;
    	int noOfBook=0;
    	
    	while(true)
    	{
    		menu();
    		switch(choice)
    		{
    		   case 0:
    			      System.out.println("Enter no of Authors");
    			      noOfAuthors=sc.nextInt();
    			      System.out.println("Enter no of books");
    			      noOfBook=sc.nextInt();
    			      book=new Book[noOfBook];
    			      author=new Author[noOfAuthors];
    			      break;
    			      
    		   case 1:
    			   
    			   System.out.println("add"+noOfAuthors+"add deatils");
    			   for(int i=0;i<noOfAuthors;i++)
    			   {
    				   System.out.println("Enter authorId");
    				   int authorId=sc.nextInt();
    				   sc.nextLine();
    				   System.out.println("Enter author name");
    				   String authorName=sc.next();
    				   author1=new Author();
    				   author1.setAuthorId(authorId);
    				   author1.setAuthorName(authorName);
    				   author[i]=author1;
    			   }
    			   
    				   
    				   
    				   
    				   
    				   
    			   }
    			      
    		}
    	}
    	
    	
    }
	

