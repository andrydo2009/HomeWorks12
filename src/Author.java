public class Author

{
    String firstNameAuthor;     //Имя
    String middleNameAuthor;   //Отчевство
    String lastNameAuthor;    //Фамилия

    public Author(String lastNameAuthor,String firstNameAuthor,String middleNameAuthor)
    {
        this.firstNameAuthor=firstNameAuthor;
        this.middleNameAuthor=middleNameAuthor;
        this.lastNameAuthor=lastNameAuthor;
    }
    public String getFirstNameAuthor()
    { return this.firstNameAuthor;}
    public String getMiddleNameAuthor()
    { return this.middleNameAuthor;}
    public String getLastNameAuthor()
    { return this.lastNameAuthor;}


}


