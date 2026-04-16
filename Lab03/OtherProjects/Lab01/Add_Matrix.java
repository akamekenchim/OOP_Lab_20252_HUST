package Lab01;
import java.util.*;
public class Add_Matrix {
    public static void main(String[] args) {
        int[][] Matrix1 = new int[10][10];
        int[][] Matrix2 = new int[10][10];
        Scanner akame = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap so hang cua ma tran: ");
        a = akame.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        b = akame.nextInt();
        System.out.println("Nhap cac phan tu cho ma tran 1: ");
        // nhap theo kieu
        // 1 2 3
        // 4 5 6
        // 7 8 9
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                Matrix1[i][j] = akame.nextInt();
            }
        }
        System.out.println("Nhap cac phan tu cho ma tran 2: ");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                Matrix2[i][j] = akame.nextInt();
            }
        }
        int[][] MatrixSum = new int[10][10];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                MatrixSum[i][j] = Matrix1[i][j]+Matrix2[i][j];
            }
        }
        System.out.println("Ket qua: ");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                System.out.printf("%d ",MatrixSum[i][j]);
            }
            System.out.println();
        }
        akame.close();
    }
    
}
