import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {


        // Declaración de variablesApp
        String nombre  ;
        int edad;
        double salario ;
        float promedio ;
        Boolean estado ;
        char sexo ;


        // entrada de datos por ventana emergente
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del estudiante: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio del estudiante: "));   
        sexo = JOptionPane.showInputDialog("Ingrese el sexo del estudiante: ").charAt(0);   
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el estado del estudiante (true/false): "));       
      
    





    
    

        
        // Salida de datos
        JOptionPane.showMessageDialog(null, "Nombre:  " + nombre+ "\nEdad: " + edad + "\nSalario: " + salario + "\nPromedio: " + promedio + "\nSexo: " + sexo + "\nEstado: " + estado);
         
      
    
     
    }
}
