import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int n = sc.nextInt();

        System.out.println("Square matrix pattern");
        MBymMatrix.squareMatrix(n);
        System.out.println("Right angle triangle matrix pattern");
        Triangle.rtTriangle(n);
        System.out.println("Right-Angled Number Pyramid");
        RtAngleNumPyr.NumPyr(n);
    }
}
