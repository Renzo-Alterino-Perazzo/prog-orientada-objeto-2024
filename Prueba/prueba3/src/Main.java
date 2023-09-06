import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        String opcion;
        do {
            System.out.println("Dame 3 numeros enteros A, B, C: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if ((a >= b) && (a >= c)) {
                System.out.println("El numero mayor es A: " + a);
            }
            else if (b >= c){
                System.out.println("El numero mayor es B: "+ b);
            }
            else {
                System.out.println("El numero mayor es C: "+ c);
            }
            sc.nextLine();
            System.out.print("Quiero probar de nuevo (S/N): " );
            opcion = sc.nextLine();
        } while (opcion.equals("s")||opcion.equals("S"));
        System.out.println("Fin del programa\n");
    }
}