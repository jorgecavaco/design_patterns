package workshop.prototype;

public class C extends B implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new C();
    }

}
