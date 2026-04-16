package Lab03.OtherProjects.Lab01;
import java.util.*;
//2.26
public class PhuongTrinh {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        System.out.println("1. First Degree - 1 an");
        System.out.println("2. He 2 phuong trinh 2 an tuyen tinh");
        System.out.println("3. Phuong trinh bac 2 mot an");
        System.out.printf("Ban muon chon: ");
        int luachon;
        luachon = akame.nextInt();
        if(luachon == 2){
            double a11, a12, b1; //cac he so
            double a21, a22, b2; //cac he so
            double x = 0; //x1
            double y = 0; //x2
            System.out.println("Nhap a11, a12, b1 cho phuong trinh 1: ");
            a11 = akame.nextDouble();
            a12 = akame.nextDouble();
            b1 = akame.nextDouble();

            System.out.println("Nhap a21, a22, b2 cho phuong trinh 2: ");
            a21 = akame.nextDouble();
            a22 = akame.nextDouble();
            b2 = akame.nextDouble();

            double nhan = a21/a11;
            a11 = a11*nhan;
            a12 = a12*nhan;
            b1 = b1*nhan;

            a21 = a21 - a11;
            a22 = a22 - a12;
            b2 = b2 - b1;
            if(a22 == 0){
                if(b2 == 0) System.out.println("Vo so nghiem");
                else System.out.println("Vo nghiem");
            }
            else{
                y = b2/a22;
                x = (b1 - a12*y)/a11;
                System.out.printf("x = %.2f --- y = %.2f", x, y);
            }
            
            akame.close();
        }
        if(luachon == 1){
            double a;
            double b;
            double x;
            System.out.printf("Nhap a: ");
            a = akame.nextDouble();
            System.out.printf("Nhap b: ");
            b = akame.nextDouble();
            if(a == 0){
                if(b == 0) System.out.println("Vo so nghiem");
                else System.out.println("Vo nghiem");
            }
            else{
                x = -b/a;
                System.out.printf("Nghiem cua phuong trinh la: %.3f", x);
            }
            akame.close();
        }
        if(luachon == 3){
            double a, b, c;
            double x1;
            double x2;
            System.out.printf("Nhap a: ");
            a = akame.nextDouble();
            System.out.printf("Nhap b: ");
            b = akame.nextDouble();
            System.out.printf("Nhap c: ");
            c = akame.nextDouble();
            
            double delta = b*b - 4*a*c;
            if(delta < 0) System.out.println("Vo nghiem");
            else if(delta == 0){
                x1 = -b/(2*a);
                System.out.printf("Co 1 nghiem kep: %.3f", x1);
            }
            else{
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Co 2 nghiem: %.3f va %.3f", x1, x2);
            }
            akame.close();
        }
    }
}

