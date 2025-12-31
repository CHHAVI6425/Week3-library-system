package library;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private final String BOOK_FILE = "data/books.txt";
    private final String MEMBER_FILE = "data/members.txt";

    // ---------- BOOKS ----------
    public List<Book> loadBooks() {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(BOOK_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                Book book = new Book(
                        d[0], d[1], d[2],
                        Integer.parseInt(d[3]),
                        Boolean.parseBoolean(d[4]),
                        d[5],
                        d[6].equals("null") ? null : LocalDate.parse(d[6])
                );
                books.add(book);
            }
        } catch (Exception e) {
            System.out.println("Books file not found. Starting fresh.");
        }
        return books;
    }

    public void saveBooks(List<Book> books) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOK_FILE))) {
            for (Book b : books) pw.println(b);
        } catch (Exception e) {
            System.out.println("Error saving books.");
        }
    }

    // ---------- MEMBERS ----------
    public List<Member> loadMembers() {
        List<Member> members = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(MEMBER_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                members.add(new Member(d[0], d[1]));
            }
        } catch (Exception e) {
            System.out.println("Members file not found. Starting fresh.");
        }
        return members;
    }

    public void saveMembers(List<Member> members) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(MEMBER_FILE))) {
            for (Member m : members) pw.println(m);
        } catch (Exception e) {
            System.out.println("Error saving members.");
        }
    }
}
