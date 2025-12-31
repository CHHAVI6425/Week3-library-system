package library;

import java.time.LocalDate;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private FileHandler fh = new FileHandler();

    public Library() {
        books = fh.loadBooks();
        members = fh.loadMembers();
    }

    public void addBook(Book b) {
        books.add(b);
        fh.saveBooks(books);
        System.out.println("Book added.");
    }

    public void registerMember(Member m) {
        members.add(m);
        fh.saveMembers(members);
        System.out.println("Member registered.");
    }

    public Book findBook(String isbn) {
        return books.stream().filter(b -> b.getIsbn().equals(isbn)).findFirst().orElse(null);
    }

    public Member findMember(String id) {
        return members.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }

    public void borrowBook(String isbn, String memberId) {
        Book b = findBook(isbn);
        Member m = findMember(memberId);

        if (b == null || m == null || !b.isAvailable()) {
            System.out.println("Borrow failed.");
            return;
        }

        b.setAvailable(false);
        b.setBorrowedBy(memberId);
        b.setDueDate(LocalDate.now().plusWeeks(2));
        fh.saveBooks(books);
        System.out.println("Borrowed. Due: " + b.getDueDate());
    }

    public void returnBook(String isbn) {
        Book b = findBook(isbn);
        if (b == null) return;

        double fine = 0;
        if (b.isOverdue()) {
            fine = java.time.temporal.ChronoUnit.DAYS
                    .between(b.getDueDate(), LocalDate.now()) * 5;
        }

        b.setAvailable(true);
        b.setBorrowedBy("NA");
        b.setDueDate(null);
        fh.saveBooks(books);

        System.out.println("Returned. Fine: ₹" + fine);
    }

    public void showBooks() {
        books.forEach(System.out::println);
    }
}
