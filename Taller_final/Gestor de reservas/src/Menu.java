import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ GESTOR DE RESERVAS ---");
        System.out.println("1. Agendar reserva");
        System.out.println("2. Listar reservas");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Reporte del día");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    public static int leerOpcion(Scanner sc) {
        // Retorna el entero que el usuario escribe
        return sc.nextInt();
    }
}