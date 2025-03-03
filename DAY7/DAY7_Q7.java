interface LibraryItem {
    void borrow(String userName);
    void returnItem();
}

interface LibraryUser {
    void borrowItem(LibraryItem item);
    void returnItem(LibraryItem item);
}

class Book implements LibraryItem {
    private int id;
    private boolean isBorrowed;
    private String borrowedBy;

    public Book(int id) {
        this.id = id;
        this.isBorrowed = false;
    }

    @Override
    public void borrow(String userName) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = userName;
            System.out.println("Book with ID " + id + " is borrowed by " + userName);
        } else {
            System.out.println("Book with ID " + id + " is already borrowed by " + borrowedBy);
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            System.out.println("Book with ID " + id + " is returned.");
            isBorrowed = false;
            borrowedBy = null;
        } else {
            System.out.println("Book with ID " + id + " was not borrowed.");
        }
    }
}

class DVD implements LibraryItem {
    private int id;
    private boolean isBorrowed;
    private String borrowedBy;

    public DVD(int id) {
        this.id = id;
        this.isBorrowed = false;
    }

    @Override
    public void borrow(String userName) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = userName;
            System.out.println("DVD with ID " + id + " is borrowed by " + userName);
        } else {
            System.out.println("DVD with ID " + id + " is already borrowed by " + borrowedBy);
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            System.out.println("DVD with ID " + id + " is returned.");
            isBorrowed = false;
            borrowedBy = null;
        } else {
            System.out.println("DVD with ID " + id + " was not borrowed.");
        }
    }
}

class LibraryMember implements LibraryUser {
    private String name;

    public LibraryMember(String name) {
        this.name = name;
    }

    @Override
    public void borrowItem(LibraryItem item) {
        item.borrow(name);
    }

    @Override
    public void returnItem(LibraryItem item) {
        item.returnItem();
    }
}

public class DAY7_Q7 {
    public static void main(String[] args) {
        Book book = new Book(101);
        DVD dvd = new DVD(201);
        LibraryMember alice = new LibraryMember("Alice");

        alice.borrowItem(book);
        alice.borrowItem(dvd);

        alice.returnItem(book);
        alice.returnItem(dvd);
    }
}
