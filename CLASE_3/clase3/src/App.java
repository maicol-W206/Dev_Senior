import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
      Scanner teclado = new Scanner(System.in);

       System.out.println("Cuantas personas para la mesa ?");
    int personas = teclado.nextInt();

    teclado.nextLine(); // Limpiar el buffer después de leer un entero

    System.out.println("Nombre del cliente:");
    String nombre = teclado.nextLine();

   
    
    System.out.println("Mesa de "+ nombre + " , " + personas + " personas");

        //!
    double subtotal = 120000;
        boolean tieneCupon = true;
        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica descuento? " + aplicaDescuento);


        int unidades = 5;
        double comoDecimal = unidades;
        System.out.println("Implicita; " + comoDecimal);

        double precio = 19990.75;
        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado);


    }
}
