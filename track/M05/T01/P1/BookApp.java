
public class BookApp {

    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-100);
        b.getData();
    }
}

class Book {

    private int pageNum;

    public void setData(int x) {
        pageNum = x;
    }

    public void getData() {
        System.err.println(pageNum);
    }
}
