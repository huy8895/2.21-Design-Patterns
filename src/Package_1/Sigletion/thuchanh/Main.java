package Package_1.Sigletion.thuchanh;

public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("bookBorrower1.getAuthorAndTittle() = " + bookBorrower1.getAuthorAndTittle());

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower2.getAuthorAndTittle() = " + bookBorrower2.getAuthorAndTittle());

        bookBorrower1.returnBook();
        System.out.println("bookBorrower 1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("bookBorrower2.getAuthorAndTittle() = " + bookBorrower2.getAuthorAndTittle());
    }
}
