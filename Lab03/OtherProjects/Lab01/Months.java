package Lab03.OtherProjects.Lab01;
import java.util.*;
public class Months {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        while(true){
            String thang = akame.next();
            if(thang.equals("1") || thang.equals("January") || thang.equals("Jan") || thang.equals("Jan.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("2") || thang.equals("February") || thang.equals("Feb") || thang.equals("Feb.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();

                if(nam % 4 != 0) System.out.printf("28 ngay, nam %d\n", nam);
                else{
                    if(nam % 4 == 0 && nam % 100 == 0 && nam % 400 != 0){
                        System.out.printf("28 ngay, nam %d\n", nam);
                        break;
                    }
                    else{
                        System.out.printf("29 ngay, nam %d\n", nam);
                        break;
                    }
                }
            }
            else if(thang.equals("4") || thang.equals("April") || thang.equals("Apr") || thang.equals("Apr.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("30 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("5") || thang.equals("May")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
            }
            else if(thang.equals("6") || thang.equals("June") || thang.equals("Jun") || thang.equals("Jun.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("30 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("7") || thang.equals("July") || thang.equals("Jul") || thang.equals("Jul.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("8") || thang.equals("August") || thang.equals("Aug") || thang.equals("Aug.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("9") || thang.equals("September") || thang.equals("Sep") || thang.equals("Sep.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("30 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("10") || thang.equals("October") || thang.equals("Oct") || thang.equals("Oct.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("11") || thang.equals("November") || thang.equals("Nov") || thang.equals("Nov.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("30 ngay, nam %d\n", nam);
                break;
            }
            else if(thang.equals("12") || thang.equals("December") || thang.equals("Dec") || thang.equals("Dec.")){
                System.out.printf("Nhap nam: ");
                int nam = akame.nextInt();
                System.out.printf("31 ngay, nam %d\n", nam);
                break;
            }
            else{
                System.out.println("Khong hop le! Nhap lai: ");
            }
        }
        akame.close();
    }
}
