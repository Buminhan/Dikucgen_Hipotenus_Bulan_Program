import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double a, b;
        System.out.println("Please enter triangle's catheus legs.");
        a= inp.nextDouble();
        b= inp.nextDouble();
        System.out.println("Triangle's hipotenus: "+(Math.sqrt(a*a+b*b)));

        double c,d,e,u;
        System.out.println("Please enter triangle's legs' value.");
        c= inp.nextDouble();
        d= inp.nextDouble();
        e= inp.nextDouble();
        System.out.println("Triangle's circumference: "+(c+d+e));
        u = (c+d+e)/2;
        System.out.println("Triangle's area: "+Math.sqrt((u*(u-c)*(u-d)*(u-e))));


    }
}
