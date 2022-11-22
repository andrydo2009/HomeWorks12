public class HomeWorks12
{
    public static void main(String[] args)
    {
        Author authorOne=new Author("Сорокин","Питирим","Александрович");


        Book bookOne=new Book("ЧЕЛОВЕК. ЦИВИЛИЗАЦИЯ. ОБЩЕСТВО", authorOne, 1992);
        System.out.println("Название книги: "+bookOne.getNameBook());
        System.out.println("Автор: "+authorOne.getLastNameAuthor()+" "+authorOne.getFirstNameAuthor()+" "+authorOne.getMiddleNameAuthor());
        System.out.println("Год издания: "+bookOne.getYearPublication());
        bookOne.setYearPublication(2010);
        System.out.println("Книга переиздавалась в "+bookOne.getYearPublication());

        Author authorToo=new Author("Мартин","Роберт","Сесил");

        Book bookToo=new Book("Чистый Код", authorToo, 2008);
        System.out.println("Название книги: " + bookToo.getNameBook());
        System.out.println("Автор: "+authorToo.getLastNameAuthor()+" "+authorToo.getFirstNameAuthor()+" "+authorToo.getMiddleNameAuthor());
        System.out.println("Год издания: " + bookToo.getYearPublication());
        bookToo.setYearPublication(2022);
        System.out.println("Книга переиздавалась в "+bookToo.getYearPublication());





        //THE END














































    }
}
