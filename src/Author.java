public class Author

{
    String firstNameAuthor;     //Имя
    String middleNameAuthor;   //Отчевство
    String lastNameAuthor;    //Фамилия

    String allName;

    public Author(String lastNameAuthor,String firstNameAuthor,String middleNameAuthor)
    {
        this.firstNameAuthor=firstNameAuthor;
        this.middleNameAuthor=middleNameAuthor;
        this.lastNameAuthor=lastNameAuthor;
        this.allName= lastNameAuthor + " " + firstNameAuthor + " " + middleNameAuthor;
    }
    public String getFirstNameAuthor()
    { return this.firstNameAuthor;}
    public String getMiddleNameAuthor()
    { return this.middleNameAuthor;}
    public String getLastNameAuthor()
    { return this.lastNameAuthor;}
    public String getAllName()
    { return this.allName;}


}


//THE END