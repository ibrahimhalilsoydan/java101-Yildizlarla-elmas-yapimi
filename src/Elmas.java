import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("bir sayı giriniz :");
        int n = input.nextInt();
        System.out.println();


            for (int i=n;i>=0;i--){
                for (int j=1; j<=(n-i);j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }

    }
}
