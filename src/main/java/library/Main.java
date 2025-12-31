package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Book 2.View Books 3.Register Member");
            System.out.println("4.Borrow Book 5.Return Book 6.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> lib.addBook(new Book("101", "Java", "Joshua Bloch", 2018));
                case 2 -> lib.showBooks();
                case 3 -> lib.registerMember(new Member("M01", "Ravi"));
                case 4 -> lib.borrowBook("101", "M01");
                case 5 -> lib.returnBook("101");
                case 6 -> System.exit(0);
            }
        }
    }
}
