import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookImpl {
    public static void main(String[] args) {
        List<Book> bookList =
                Arrays.asList(new Book("java","Rajiv",340,678634989L),
                        new Book("C++","Rajiv",540,67863498969L),
                        new Book("C","Rajiv",673,6786349098L),
                        new Book("python","Rajiv",900,6712654989L),
                        new Book("js","Rajiv",678,6786210809L),
                        new Book("Ds","Rajiv",399,6781657689L),
                        new Book("Os","Rajiv",789,678248789L),
                        new Book("CN","Rajiv",450,678633289L),
                        new Book("SQL","Rajiv",396,67863889L),
                        new Book("DBMS","Rajiv",840,675434989L)
                );
        for (Book val : bookList) {
            System.out.println(val);
        }
        Collections.sort(bookList);
        System.out.println("-------------------------------");
        for ( Book val : bookList) {
            System.out.println(val);
        }

    }
}