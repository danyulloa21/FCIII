import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el limite que desea para mostrar la secuencia de fibonacci: ");
        int n=sc.nextInt();
        int a=0,b=1, con=0;
        Fibo(n, a, b, con);
    }

    public static int Fibo(int n,int a, int b, int con) {
        int c=a+b;;
        if (con==n) {
            return 0;
        } else if(c==1){
            System.out.print(1+", ");
            con++;
            return Fibo(n, c, a, con);
        }else {
            System.out.print(c+", ");
            con++;
            return Fibo(n, c, a, con);
        }
    }
}