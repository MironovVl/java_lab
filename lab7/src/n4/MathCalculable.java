package n4;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public interface MathCalculable {
    public static double PI = 3.1415926;
    static double power(double a, double n){

        return pow(a,n);
    }
    static double module(double a){
        return abs(a);
    }
}
