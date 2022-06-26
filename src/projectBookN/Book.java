package projectBookN;

public class Book 
{
    long bookId;
    String bookName;
    String description;
    double price;
    Author auth;
 
    
    void setbookId(long bId)
    {
    	bookId=bId;
    }
    void setbookName(String bName)
    {
    	bookName=bName;
    }
    void setdescription(String desc)
    {
    	description=desc;
    }
    void setprice(double pr)
    {
    	price=pr;
    }
    void setauth(Author au)
    {
    	auth=au;
    }
    long getbookId()
    {
    	return bookId;
    }
    String getbookName()
    {
    	return bookName;
    }
	String getdescription()
	{
		return description;
	}
	double getprice()
	{
		return price;
	}
	Author getauth()
	{
		return auth;
	}
}
