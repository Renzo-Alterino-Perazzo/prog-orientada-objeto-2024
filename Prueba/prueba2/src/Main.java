import java.util.Scanner;

//estructura de comparacion
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
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
        String opcion;
        System.out.print("Quiero probar de nuevo (S/N): " );
        opcion = sc.nextLine();
        if (opcion.equals("s")||opcion.equals("S")){
            System.out.println("Quiero volver a intentar\n");
        }
        else {
            System.out.println("Quiere salir\n");
        }
    }
}