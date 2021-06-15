package Module6.Polimorphism;

public class SuperClass {
    public int a;
    public int b;

    public SuperClass(int a) {
        this.a = 15;
        this.b = 33;
    }

    public int add(int v) {
        this.a += v;
        return a;
    }
}
