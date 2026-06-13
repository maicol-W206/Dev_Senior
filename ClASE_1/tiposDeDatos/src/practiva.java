import javax.swing.JOptionPane;
public class practiva {
    public static void main(String[] args){
        
        // Delcaración de variables

        String nombre_proyecto;
        int opcion;    
        int valor_chatbot_basico = 30;
        int valor_agente_automatizado = 60;     
        int valor_asistente_avanzado = 90;     


        // Entrada de datos por ventana emergente
       nombre_proyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto: ");
       opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción de (1-3) \n(1)Chatbot Basico con valor de: 30USD  \n(2)Agente automatizado-LangGraph con valor de: 60USD \n(3)Asistente Avanzado con Machine Learning con valor de: 90USD"));

            // Guaradar valorres con un switch case
      switch (opcion) {
        case 1:
            JOptionPane.showMessageDialog(null, "Se ha selecionado el Chatbot Basico con un valor de: 30USD");
            JOptionPane.showMessageDialog(null, "\nEl proyecto: " + nombre_proyecto +"\ntendra un  valor total de: " + valor_chatbot_basico *40 +"USD");
            JOptionPane.showMessageDialog(null, "Con algo se comienza...");
           
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Se ha selecionado el Agente automatizado-LangGraph con un valor de: 60USD");
              JOptionPane.showMessageDialog(null, "\nEl proyecto: " + nombre_proyecto +"\ntendra un  valor total de: " + valor_agente_automatizado *40 +"USD");
               JOptionPane.showMessageDialog(null, "Vamos con todo ehh...");
            break;

             case 3:
            JOptionPane.showMessageDialog(null, "Se ha selecionado el Asistente Avanzado con Machine Learning con un valor de: 90USD");
             JOptionPane.showMessageDialog(null, "\nEl proyecto: " + nombre_proyecto +"\ntendra un  valor total de: " + valor_asistente_avanzado *40 +"USD");
              JOptionPane.showMessageDialog(null, "Estas invitiendo en el mejor asistente del mundo no te defraudaremos...");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Escogiste un opcion no valida por favor vuele a intantarlo ingresando valores de 1 a 3");
            break;


    }
    
}

}

