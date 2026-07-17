public class Operaciones {
    // Definición de arreglos 
    public static final int CUPO_MAXIMO = 10;
    public static String[] nombresClientes = new String[CUPO_MAXIMO];
    public static int[] horasReservadas = new int[CUPO_MAXIMO];
    public static int[] serviciosReservados = new int[CUPO_MAXIMO];
    
    // Contador para saber cuántas reservas hay guardadas
    public static int contadorReservas = 0;

    // Método para agendar 
    public static void agendar(String nombre, int hora, int servicio) {
        // 1. Validar si hay cupo
        if (contadorReservas >= CUPO_MAXIMO) {
            System.out.println("Lo siento, no hay más cupos disponibles.");
            return;
        }

        // 2. Validar si la hora ya está ocupada
        if (esHoraOcupada(hora)) {
            System.out.println("Error: Esa hora ya tiene una reserva.");
            return;
        }

        // 3. Guardar los datos en los arreglos usando el contador como índice
        nombresClientes[contadorReservas] = nombre;
        horasReservadas[contadorReservas] = hora;
        serviciosReservados[contadorReservas] = servicio;

        // 4. Aumentar el contador para la siguiente reserva
        contadorReservas++;
        System.out.println("Reserva agendada con éxito.");
    }

    // Método auxiliar para buscar si una hora ya existe
    public static boolean esHoraOcupada(int hora) {
        for (int i = 0; i < contadorReservas; i++) {
            if (horasReservadas[i] == hora) {
                return true; // La hora está ocupada
            }
        }
        return false; // La hora está libre
    }

    // Método para listar (Bloque 5)
    public static void listar() {
        if (contadorReservas == 0) {
            System.out.println("Aún no hay reservas.");
            return;
        }
        for (int i = 0; i < contadorReservas; i++) {
            System.out.println((i + 1) + ". " + nombresClientes[i] + " | Hora: " + horasReservadas[i] + " | Servicio: " + serviciosReservados[i]);
        }
    }
    public static void cancelar(int numeroReserva) {
    int indiceABorrar = numeroReserva - 1;

    boolean esNumeroValido = (numeroReserva >= 1 && numeroReserva <= contadorReservas);

    if (esNumeroValido == false) {
        System.out.println("No se pudo cancelar: Ese número de reserva no existe.");
        return; // Salimos del método, no hacemos nada más
    }

    for (int i = indiceABorrar; i < contadorReservas - 1; i++) {
        nombresClientes[i] = nombresClientes[i + 1];
        horasReservadas[i] = horasReservadas[i + 1];
        serviciosReservados[i] = serviciosReservados[i + 1];
    }


    nombresClientes[contadorReservas - 1] = null;
    horasReservadas[contadorReservas - 1] = 0;
    serviciosReservados[contadorReservas - 1] = 0;

    contadorReservas = contadorReservas - 1;

    System.out.println("La reserva " + numeroReserva + " ha sido eliminada correctamente.");
}
public static void reporte() {
    System.out.println("--- GENERANDO REPORTE DEL DÍA ---");
    

    int dineroTotal = 0;

  
    for (int i = 0; i < contadorReservas; i++) {
        int codigoServicio = serviciosReservados[i];
        
       
        int precioDelServicio = 0;
        
        if (codigoServicio == 1) {
            precioDelServicio = 25000;
        } else if (codigoServicio == 2) {
            precioDelServicio = 60000;
        } else if (codigoServicio == 3) {
            precioDelServicio = 30000;
        }
        

        dineroTotal = dineroTotal + precioDelServicio;
    }

  
    System.out.println("Total de citas realizadas: " + contadorReservas);
    System.out.println("Monto total facturado: $" + dineroTotal);
}

}