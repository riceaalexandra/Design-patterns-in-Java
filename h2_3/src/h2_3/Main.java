package h2_3;

public class Main {
    public static void main(String[] args) {
        C2Nr c2nr=new C2Nr();
        System.out.println("Sum (C2Nr): "+ c2nr.sum(2,3));
        C3Nr c3nr=new C3Nr();
        System.out.println("Sum (C3Nr): "+ c3nr.sum(2,3,1));
        Adapter adapter=new Adapter(c3nr);
        System.out.println("Sum (Adapter): "+adapter.sum(2,4));
    }
}