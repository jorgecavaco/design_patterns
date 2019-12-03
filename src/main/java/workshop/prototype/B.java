package workshop.prototype;

import java.util.ArrayList;
import java.util.List;

public class B{
    List<String> list = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new B();
    }
}
