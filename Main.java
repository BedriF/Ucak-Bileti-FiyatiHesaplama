import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km,age,tt;
        double tc=0.10 ,total;
        Scanner input = new Scanner(System.in);
        System.out.println("Gideceginiz mesafeyi giriniz : ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini girin tek yön(1) yada gidiş dönüş(2) giriniz : ");
        tt = input.nextInt();
        if (tt!=1 && tt!=2){
            System.out.println("Hatalı giriş yaptınız !: ");
        } else {

            total = km * 0.10;
            if (age < 12) {
                total = total / 2;
            } else if (age >= 12 && age <= 23) {
                total = total * 0.9;
            } else if (age > 65) {
                total = total * 0.7;
            }
            if (tt == 2) {
                total = total-(total * 0.2);
                total= total*2;
            }
            System.out.println("Toplam tutar: " + total);
        }
    }
}