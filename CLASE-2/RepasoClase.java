import java.util.Scanner;
public class RepasoClase {
    public static void main(String[] args) {
    String Nombre ;
    Double Estatura;
    int Edad ;


    Scanner teclado = new Scanner(System.in); 
    System.out.println("Ingrese su nombre: ");
    Nombre = teclado.nextLine();
    System.out.println("Ingrese su Estatura: ");
    Estatura = teclado.nextDouble();  
    System.out.println("Ingrese su Edad: ");
    Edad = teclado.nextInt();          
    System.out.println("Mi nombre es: " + Nombre + ",mi estatura es: " + Estatura + " y mi edad es: " + Edad + " años");



    }
}
