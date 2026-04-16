package Lab03.OtherProjects.Lab01;
import java.util.*;
public class Star {
    public static void main(String[] args) {
        int n;
        Scanner akame = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        n = akame.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0+i; j<n-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        akame.close();
    }
}
