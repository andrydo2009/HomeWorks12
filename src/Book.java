public class Book
{
    String nameBook;
    Author fullName;
    int yearPublication;

    public Book(String nameBook,Author fullName,int yearPublication)
    {
        this.nameBook=nameBook;
        this.fullName=fullName;
        this.yearPublication=yearPublication;
    }

    public String getNameBook()
    {return  this.nameBook;}

    public Author getFullName()
    {return  this.fullName;}

    public int getYearPublication()
    {return this.yearPublication;}

    public void setYearPublication(int yearPublication)
    {this.yearPublication=yearPublication;}





}

//THE END


 //System.out.println(bookOne.getNameBook()+" "+bookOne.getAllNameAuthorBook()+" "+bookOne.getYearPublication());