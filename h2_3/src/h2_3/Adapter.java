package h2_3;

public class Adapter {
    private C3Nr c3nr;

    public Adapter(C3Nr c3nr) {
        this.c3nr = c3nr;
    }

    public int sum(int n1, int n2) {
        return c3nr.sum(n1, n2, 0);
    }
}
