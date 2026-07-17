import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            Menu.mostrarMenu();
            opcion = Menu.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("Hora: ");
                    int hora = sc.nextInt();
                    System.out.print("Servicio (1: Corte, 2: Tinte, 3: Manicure): ");
                    int servicio = sc.nextInt();

                    // Llamada a validadores y al método de agendar
                    if (Validador.nombreValido(nombre) && Validador.horaValida(hora) && Validador.servicioValido(servicio)) {
                        Operaciones.agendar(nombre, hora, servicio);
                    } else {
                        System.out.println("Error: Datos inválidos. Verifique nombre, hora (8-17) y servicio (1-3).");
                    }
                    break;

                case 2:
                    // Listar todas las reservas actuales
                    Operaciones.listar();
                    break;

                case 3:
                    // Cancelar reserva: pedir número y llamar al método
                    System.out.print("¿Qué número de reserva deseas cancelar? ");
                    int numCancelacion = sc.nextInt();
                    Operaciones.cancelar(numCancelacion);
                    break;

                case 4:
                    // Generar reporte del día
                    Operaciones.reporte();
                    break;

                case 5:
                    System.out.println("Cerrando el programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Esa opción no existe, intenta de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}