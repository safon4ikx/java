import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ПЕРЕМЕННЫЕ
        float a3 = 10.2f;
        float a4 = 15.3f;
        float sum2 = a3 + a4;
        System.out.println(sum2);

        double a1 = 10.2;
        double a2 = 15.3;
        double sum3 = a2 + a3;
        System.out.println(sum3);

        double test = a2 + a3;




        char digit = '1';
        String digits = "123456";
        //СТРОКИ
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(a1 + str3);

        int calculation = (1 + 2) * 3 * (4 + 8);
        String string = "значение:";
        System.out.println(string + calculation);

        String stringresult = "результат";
        int result = 1 + 2 / (3*4) + 6;
        System.out.println(stringresult + result);

        System.out.print("введите возраст: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18 && age <= 25) {
            System.out.println("документы покажи");
        }else if (age >=26 && age < 100) {
            System.out.println("Продать");
        } else{
            System.out.println("нельзя");
        }
    }
}
