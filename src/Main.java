import java.util.Scanner;

public class Main {
    static int sum(int a, int b) {
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        b = inp.nextInt();
        result = a + b;
        return result;
    }

    static int sub(int a, int b) {
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        b = inp.nextInt();
        result = a - b;
        return result;
    }

    static int times(int a, int b) {
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        b = inp.nextInt();
        result = a * b;
        return result;
    }

    static int divided(int a, int b) {
        int result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi giriniz:");
        b = inp.nextInt();
        if (b == 0) {
            System.out.println("ikinci sayi 0'dan farkli olmalidir.");
            return 0;
        }
        result = a / b;
        System.out.println("Sonuc:" + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("us giriniz:");
        b = inp.nextInt();
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int factorial(int a) {
        int result = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("sayiyi giriniz:");
        a = inp.nextInt();
        for (int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mod alinacak sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Modu giriniz:");
        b = inp.nextInt();
        result=a%b;
        return result;
    }

    static int rectangle(int a, int b) {
        int alan,cevre;
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenari giriniz:");
        a = inp.nextInt();
        System.out.print("Kisa kenari giriniz:");
        b = inp.nextInt();
        alan=a*b;
        cevre=2*(a+b);
        System.out.println("Alan: "+alan+"\n"+"cevre: "+cevre);
        return 1;
    }
    public static void main(String[] args) {
        int select, a = 0, b = 0;
        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- Cikis Yap";

        Scanner inp = new Scanner(System.in);
        System.out.println(menu);

        while (true) {
            System.out.print("Yapmak istediginiz islemi giriniz: ");
            select = inp.nextInt();
            if (select == 0) {
              break;
            }
            switch (select) {
                case 1:
                    System.out.println("-----Toplama-----");
                    System.out.println("Sonuc: " + sum(a, b));
                    break;
                case 2:
                    System.out.println("-----Cikarma-----");
                    System.out.println("Sonuc: " + sub(a, b));
                    break;
                case 3:
                    System.out.println("-----Carpma-----");
                    System.out.println("Sonuc: " + times(a, b));
                    break;
                case 4:
                    System.out.println("-----Bolme-----");
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("-----Us Alma-----");
                    System.out.println("Sonuc: " + power(a, b));
                    break;
                case 6:
                    System.out.println("-----Faktoriyel-----");
                    System.out.println("Sonuc: " + factorial(a));
                    break;
                case 7:
                    System.out.println("-----Mod Alma-----");
                    System.out.println("Sonuc: " + mod(a, b));
                    break;
                case 8:
                    System.out.println("-----Dikdortgen Alan ve Cevre Hesaplama-----");
                    rectangle(a,b);
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Tekrar deneyiniz");
                    break;
            }


        }
        System.out.println("Hoscakalin");
    }

}
