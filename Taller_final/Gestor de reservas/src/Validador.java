public class Validador {

    // Verifica que la hora esté entre 8 y 17 inclusiva
    public static boolean horaValida(int hora) {
        boolean esMayorOIgualA8 = (hora >= 8);
        boolean esMenorOIgualA17 = (hora <= 17);
        
        if (esMayorOIgualA8 && esMenorOIgualA17) {
            return true; // La hora está en el rango permitido
        } else {
            return false; // La hora está fuera del rango
        }
    }

    // Verifica que el nombre sea válido paso a paso
    public static boolean nombreValido(String nombre) {
        // Primero verificamos si el dato es nulo
        if (nombre == null) {
            return false; 
        }
        
        // Eliminamos espacios en blanco de los extremos
        String nombreLimpio = nombre.trim();
        
        // Verificamos si, después de limpiar, la cadena quedó vacía
        boolean estaVacio = nombreLimpio.isEmpty();
        
        if (estaVacio) {
            return false; // El nombre no tiene contenido real
        } else {
            return true; // El nombre es correcto
        }
    }

    // Verifica que el servicio sea 1, 2 o 3
    public static boolean servicioValido(int codigo) {
        boolean esCorte = (codigo == 1);
        boolean esTinte = (codigo == 2);
        boolean esManicure = (codigo == 3);
        
        if (esCorte) {
            return true;
        } else if (esTinte) {
            return true;
        } else if (esManicure) {
            return true;
        } else {
            return false; // No coincide con ninguna opción válida
        }
    }
}