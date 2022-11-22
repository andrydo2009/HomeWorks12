public class HomeWorks12
{
    public static void main(String[] args)
    {
        Author authorOne=new Author("Сорокин","Питирим","Александрович");


        Book bookOne=new Book("ЧЕЛОВЕК. ЦИВИЛИЗАЦИЯ. ОБЩЕСТВО", authorOne.getAllName(), 1992);
        System.out.println("Название книги: "+bookOne.getNameBook());
        System.out.println("Автор: "+bookOne.getAllNameAuthorBook());
        System.out.println("Год издания: "+bookOne.getYearPublication());
        bookOne.setYearPublication(2010);
        System.out.println("Книга переиздавалась в "+bookOne.getYearPublication());

        Author authorToo=new Author("Мартин","Роберт","Сесил");

        Book bookToo=new Book("Чистый Код", authorToo.getAllName(), 2008);
        System.out.println("Название книги: " + bookToo.getNameBook());
        System.out.println("Автор: " + bookToo.getAllNameAuthorBook());
        System.out.println("Год издания: " + bookToo.getYearPublication());
        bookToo.setYearPublication(2022);
        System.out.println("Книга переиздавалась в "+bookToo.getYearPublication());





        //THE END














































    }
}
