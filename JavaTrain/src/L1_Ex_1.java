import java.util.ArrayList;
public class L1_Ex_1 {


    public class Book {
        private String title;
        private String author;
        private boolean isBorrowed;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isBorrowed = false;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void borrowBook() {
            if (!isBorrowed) {
                isBorrowed = true;
                System.out.println("The book \"" + title + "\" has been borrowed.");
            } else {
                System.out.println("The book \"" + title + "\" is already borrowed.");
            }
        }

        public void returnBook() {
            if (isBorrowed) {
                isBorrowed = false;
                System.out.println("The book \"" + title + "\" has been returned.");
            } else {
                System.out.println("The book \"" + title + "\" was not borrowed.");
            }
        }
    }
    public class Member {
        private String name;
        private int memberId;

        public Member(String name, int memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        public String getName() {
            return name;
        }

        public int getMemberId() {
            return memberId;
        }
    }


    public class Library {
        private ArrayList<Book> books;
        private ArrayList<Member> members;

        public Library() {
            books = new ArrayList<>();
            members = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("The book \"" + book.getTitle() + "\" has been added to the library.");
        }

        public void addMember(Member member) {
            members.add(member);
            System.out.println("Member \"" + member.getName() + "\" has been added to the library.");
        }

        public void borrowBook(String title, int memberId) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.borrowBook();
                    return;
                }
            }
            System.out.println("The book \"" + title + "\" is not available in the library.");
        }

        public void returnBook(String title, int memberId) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    book.returnBook();
                    return;
                }
            }
            System.out.println("The book \"" + title + "\" is not available in the library.");
        }
    }


    }




