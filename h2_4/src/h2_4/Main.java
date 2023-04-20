package h2_4;

public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();

        Observer aparat1 = new Aparat1();
        Observer aparat2 = new Aparat2();
        Observer aparat3 = new Aparat3();

        prelungitor.addObserver(aparat1);
        prelungitor.addObserver(aparat2);
        prelungitor.addObserver(aparat3);

        prelungitor.plugIn();
    }
}