package Q_01;

public class Q_01 {
    public static void main(String[] args) {
        int A=1,B=2,C=3,X=4,Y=5;
        System.out.println("A=1,B=2,C=3,X=4,Y=5");

        double a=Math.sqrt((Math.pow(B,2)+(4*A*C)));
        System.out.println(("a="+a));

        double b = Math.sqrt((X+4*Math.pow(Y,3)));
        System.out.println("b= "+b);

        double c = Math.cbrt(X*Y);
        System.out.println("c= "+c);

        final double PI = 3.14;
        int radius = B;
        double area = PI*radius*radius;
        System.out.println("The area of a circle which radius is 2: "+area);

    }
}
