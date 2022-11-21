public class Book
{
    String nameBook;
    String allNameAuthorBook;
    int yearPublication;

    public Book(String nameBook,String allNameAuthorBook,int yearPublication)
    {
        this.nameBook=nameBook;
        this.allNameAuthorBook=allNameAuthorBook;
        this.yearPublication=yearPublication;
    }

    public String getNameBook()
    {return  this.nameBook;}

    public String getAllNameAuthorBook()
    {return  this.allNameAuthorBook;}

    public int getYearPublication()
    {return this.yearPublication;}

    public void setYearPublication(int yearPublication)
    {this.yearPublication=yearPublication;}


}

//THE END


 //System.out.println(bookOne.getNameBook()+" "+bookOne.getAllNameAuthorBook()+" "+bookOne.getYearPublication());