package CoreJava.Q13;
import java.io.Serializable;

public class Q13 {
    public static class Book implements Serializable {
        public int Book_id;
        protected String title;
        private final String author;
        protected double price;

        public Book() {
            Book_id = 0;
            title = null;
            author = null;
            price = 0;
        }

        public Book(int b_No, String title, String author, double price) {
            this.Book_id = b_No;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return "\n TITTLE:" + title + "\n AUTHOR :" + author +
                    "\n B_ID" + Book_id + "\n PRICE" + price + "\n";

        }
    }


    interface lib_Staff {                               // interface class used
        public void test();
    }

    static class library implements lib_Staff {
        public void test() {
            System.out.println("Interface Method Implemented");
        }

        public static void main(String[] args) {
            library p = new library();
            p.test();
        }
    }



    abstract static class price {                   // abstraction class used
        int mrp = 200;

        abstract public void calculateprice();
    }

    public static class account extends price {
        public static void main(String[] args) {
            account obj = new account();
            obj.mrp= 100;
            obj.calculateprice();
        }

        public void calculateprice() {
            System.out.println("book price  is " + mrp);
        }
    }
}