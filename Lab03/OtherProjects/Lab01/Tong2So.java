package Lab03.OtherProjects.Lab01;
import java.util.*;
public class Tong2So {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        System.out.printf("Nhap so thu nhat: ");
        double a = akame.nextDouble();
        System.out.printf("Nhap so thu hai: ");
        double b = akame.nextDouble();
        System.out.printf("Tong cua hai so la: %.2f\n", (a + b));
        System.out.printf("Hieu cua hai so la: %.2f\n", (a - b));
        System.out.printf("Tich cua hai so la: %.2f\n", (a * b));
        if(b != 0) {
            System.out.printf("Thuong cua hai so la: %.2f", (a / b));
        }  
        else System.out.printf("Khong the chia cho 0");
        akame.close();
    }   
}
