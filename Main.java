import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int a;
      Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Değer Giriniz: ");
        a = inp.nextInt();

      for (int i = 1; i<=a; i*=4){
          System.out.println("4'ün Kuvvetleri: " + i);
      }
        System.out.println();

      for (int i = 1; i<=a; i*=5){
          System.out.println("5'in Kuvvetleri: " + i);
      }



    }
}