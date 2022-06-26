package projectBookN;

import java.util.Scanner;
import java.util.*;

public class Bookmain 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int noOfBooks=0;
		int noOfAuthors=0;
		Author authArray[]=null;
		Book boArray[]=null;
		Author author=null;
		
		do
		{
			System.out.println("select any option from below");
			System.out.println("0.Enter no of books and autors");
			System.out.println("1.Add authors");
			System.out.println("2.Add books");
			System.out.println("3.Search a book by name");
			System.out.println("4.Display book deatils");
			System.out.println("5.Display author details");
			System.out.println("6.Display all books");
			System.out.println("7.Display all authors");
			System.out.println("99.Exit programme");
			choice=sc.nextInt();
			
			switch(choice)
			{
			
			case 0:
			{
				System.out.println("selected choice is :"+choice);
				System.out.println("Enter no of books and no of authors");
				System.out.println("number of books?");
				noOfBooks=sc.nextInt();
				while(noOfBooks<=0)
				{
					System.out.println("invaild input");
					System.out.println("number of book?");
					noOfBooks=sc.nextInt();
				}
				System.out.println("no of authors?");
				noOfAuthors=sc.nextInt();
				while(noOfAuthors<=0)
				{
					System.out.println("invaild input");
					System.out.println("no of authors?");
					noOfAuthors=sc.nextInt();
				}
				System.out.println("no of books:"+noOfBooks);
				System.out.println("no of authors:"+noOfAuthors);
				System.out.println();
			}
			break;
			
			case 1:
			{
				System.out.println("selected choice is :"+choice);
				if(noOfBooks==0||noOfAuthors==0)
				{
					System.out.println("please option 0 to enter no of books and authors");
				}
				else
				{
					authArray=new Author[noOfAuthors];
					System.out.println("enter deatils"+noOfAuthors+"authors");
					for(int i=0;i<authArray.length;i++)
					{
						authArray[i]= new Author();
						System.out.println("Enter author id for author"+(i+1));
						authArray[i].setauthorId(sc.nextInt());
						sc.nextLine();
						System.out.println("Enter author name for author"+(i+1));
						authArray[i].setauthorName(sc.next());
						
					}
						
					}
					System.out.println();
				}
			break;
			case 2:
			{
				
				System.out.println("selected choice is :"+choice);
                if(noOfBooks==0 || noOfAuthors==0)
                {
                	System.out.println("please select option 0 to add author and book");
                }
                else
                {
                	boArray=new Book[noOfBooks];
                	System.out.println("Enter a details"+noOfBooks+"books");
                	for(int j=0;j<boArray.length;j++)
                	{
                		boArray[j]=new Book();
                		author= new Author();
                		System.out.println("Enter a book Id"+(j+1));
                		boArray[j].setbookId(sc.nextLong());
                		sc.nextLine();
                		System.out.println("Enter a book name"+(j+1));
                		boArray[j].setbookName(sc.nextLine());
                		System.out.println("Enter book description"+(j+1));
                		boArray[j].setdescription(sc.nextLine());
                		System.out.println("Enter a book price"+(j+1));
                		boArray[j].setprice(sc.nextDouble());
                		sc.nextLine();
                		System.out.println("Enter author details"+(j+1));
                		System.out.println("Enter a author id"+(j+1));
                		int aId=sc.nextInt();
                		System.out.println("enter a author name"+(j+1));
                		String aName=sc.next();
                		boArray[j].setauth(author);
                		
                	}
                }
                System.out.println();
			}
					
			break;
			
			case 3:
			{
				System.out.println("selected choice is :"+choice);
				int flag=0;
				if(noOfBooks==0)
				{
					System.out.println("select option 0 for enter no of books and authors");
					
				}
				else if(boArray.length==0)
				{
					System.out.println("select option 2 to enter a book details");
				}
				else
				{
					System.out.println("enter abook name or part of name");
					String boSearch=sc.nextLine();
					System.out.println("Search keyword enter"+boSearch);
					for(Book book:boArray)
					{
						if(book.getbookName().toLowerCase().contains(boSearch.toLowerCase()))
						{
							flag++;
							System.out.println("bookname"+flag+"matched is"+book.getbookName());
							
						}
					}
					if(flag==0)
					{
						System.out.println("match not found!please select option 3");
					}
					
				}
				System.out.println();

			}
			break;
			
			case 4:
			{
				System.out.println("selected choice is :"+choice);
                if(noOfBooks==0)
                {
                	System.out.println("please select option 0 for enter no of books and authors");
                }
                else if(boArray.length==0)
                {
                	System.out.println("please select option 2 before option 4");
                }
                else
                {
                	System.out.println("Displaying 1st book deatils");
                	System.out.println("book Id"+boArray[0].getbookId());
                	System.out.println("book name"+boArray[0].getbookName());
                	System.out.println("book description"+boArray[0].getdescription());
                	System.out.println("book price"+boArray[0].getprice());
                	System.out.println("book author id"+boArray[0].getauth().getauthorId());
                	System.out.println("book name of author"+boArray[0].getauth().getauthorName());
                }
                System.out.println();
			}
			break;
			case 5:
			{
				System.out.println("selected choice is :"+choice);
				if(noOfAuthors==0)
				{
					System.out.println("select option 0 for entering author and book");
				}
				else if(boArray.length==0)
				{
					System.out.println("select option 1 to enter author details first");
				}
				else
				{
					System.out.println("displaying author details");
					System.out.println("author id"+authArray[0].getauthorId());
					System.out.println("authar name"+authArray[0].getauthorName());
				}
               System.out.println();
			}
			break;
			
			case 6:
			{
				System.out.println("selected choice is :"+choice);
				if(noOfBooks==0)
				{
					System.out.println("please select option 0 to enter no of books");
				}
				else if(boArray.length==0)
				{
					System.out.println("select option 2 to enter book details");
				}
				else
				{
					System.out.println("displaying book deatils"+(boArray.length)+"books available");
					for(int j=0;j<boArray.length;j++)
					{
						System.out.println("id of book"+(j+1)+"is"+boArray[j].getbookId());
						System.out.println("name of book"+(j+1)+"is"+boArray[j].getbookName());
						System.out.println("description of book"+(j+1)+"is"+boArray[j].getdescription());
						System.out.println("price of book"+(j+1)+"is"+boArray[j].getprice());
						System.out.println("authorid of book"+(j+1)+"is"+boArray[j].getauth().getauthorId());
                        System.out.println("name of author"+(j+1)+"is"+boArray[j].getauth().getauthorName());					
					}
				}
				System.out.println();

			}
			break;
			
			case 7:
			{
				System.out.println("selected choice is :"+choice);

				if(noOfAuthors ==0)
				{
					System.out.println("please select option 0 for enter no of author and book");
				}
				else if(authArray.length==0)
				{
					System.out.println("please select option 1 for enter deatils for author ");
					
				}
				else
				{
					System.out.println("displaying all authors deatils"+authArray.length+"author");
					for(int i=0;i<authArray.length;i++)
					{
						System.out.println("author id"+authArray[i].getauthorId());
						System.out.println("author name"+authArray[i].getauthorName());
					}
					
				}
				System.out.println();
			}
			break;
			
			case 99:
				System.out.println("selected choice is :"+choice);
                System.out.println("programme is terminating");
                
                default:
                	System.out.println("select valid option");
                    System.out.println();
				}
			

			
		}while(choice!=99);

	}
		}
