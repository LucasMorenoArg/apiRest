package libro.cap14.instancias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class X {

    private int a;
    private int b;

    public X(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {

        return "("+a+", "+b+")";
    }
}
