import java.util.Scanner;
//entrada de datos
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre;
        double radio;
        int n;
        System.out.println("Me de decis tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola "+ nombre);
        System.out.println("Me decis el radio de una circunferencia: ");
        radio = sc.nextDouble();
        System.out.println("El perimetro es "+ (2 * Math.PI * radio));
        System.out.println("Dime tu edad: ");
        n = sc.nextInt();
        System.out.println(n + " uuh ya sos viejo!!");
    }
}