public class HomeWorks12
{
    public static void main(String[] args)
    {
        Author authorOne=new Author("Сорокин","Питирим","Александрович");
        String allNameOne=authorOne.getLastNameAuthor()+" "+authorOne.getFirstNameAuthor()+" "+authorOne.getMiddleNameAuthor();

        Book bookOne=new Book("ЧЕЛОВЕК. ЦИВИЛИЗАЦИЯ. ОБЩЕСТВО",allNameOne,1992);
        System.out.println("Название книги: "+bookOne.getNameBook());
        System.out.println("Автор: "+bookOne.getAllNameAuthorBook());
        System.out.println("Год издания: "+bookOne.getYearPublication());
        bookOne.setYearPublication(2010);
        System.out.println("Книга переиздавалась в "+bookOne.getYearPublication());

        Author authorToo=new Author("Мартин","Роберт","Сесил");
        String allNameToo=authorToo.getLastNameAuthor()+" "+authorToo.getFirstNameAuthor()+" "+authorToo.getMiddleNameAuthor();

        Book bookToo=new Book("Чистый Код",allNameToo,2008);
        System.out.println("Название книги: " + bookToo.getNameBook());
        System.out.println("Автор: " + bookToo.getAllNameAuthorBook());
        System.out.println("Год издания: " + bookToo.getYearPublication());
        bookToo.setYearPublication(2022);
        System.out.println("Книга переиздавалась в "+bookToo.getYearPublication());





        //THE END














































    }
}
