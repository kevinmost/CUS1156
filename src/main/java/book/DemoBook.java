package book;

import java.util.Scanner;

/**
 * @author kevin
 * @date 4/2/14
 */
public class DemoBook {

    public static void main(String[] args) {
        Book book = new Book();
        Textbook textbook = new Textbook();

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your book's title");
        book.setTitle(in.nextLine());
        System.out.println("Please enter the number of pages in your book");
        book.setNumberOfPages(in.nextInt());


        in.nextLine(); // Used to consume the rest of the output from the last integer so that we can read in the textbook's title later


        System.out.println("book.Book: " + book.getTitle());
        System.out.println("Number of pages: " + book.getNumberOfPages());

        System.out.println();
        System.out.println();

        System.out.println("Please enter your textbook's title");
        textbook.setTitle(in.nextLine());
        System.out.println("Please enter the number of pages in your textbook");
        textbook.setNumberOfPages(in.nextInt());
        System.out.println("Please enter the grade level of your textbook");
        textbook.setGradeLevel(in.nextInt());

        System.out.println("book.Textbook: " + textbook.getTitle());
        System.out.println("Number of pages: " + textbook.getNumberOfPages());
        System.out.println("Grade level: " + textbook.getGradeLevel());

    }

}
