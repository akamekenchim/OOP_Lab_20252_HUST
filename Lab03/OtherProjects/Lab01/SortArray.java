package Lab03.OtherProjects.Lab01;
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = akame.nextInt();
        int[] array = new int[100];
        for(int i = 0; i<n; i++){
            System.out.printf("Nhap phan tu thu %d: ", i+1);
            array[i] = akame.nextInt();
        }
        int temp = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1; j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Mang da sap xep: ");
        for(int i = 0; i<n; i++){
            System.out.printf("%d ", array[i]);
        }
        akame.close();
    }
}
