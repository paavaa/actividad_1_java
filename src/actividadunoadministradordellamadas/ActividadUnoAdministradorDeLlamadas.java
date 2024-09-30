
package actividadunoadministradordellamadas;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ActividadUnoAdministradorDeLlamadas
{

    public static void main(String[] args)
    {
        ManagmentCall tabla=new ManagmentCall();
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null);
        
        SimpleLinkedList callList=new SimpleLinkedList();
        Scanner input=new Scanner (System.in);
        String opc;
        double minuteValue = 0;
        int datum, refDatum;
        
        do {
            System.out.println("\033[0;36m");
            System.out.println("Menú de Administrador de Llamadas");
            System.out.println("\033[0m");
            System.out.println("0. Salir");
            System.out.println("1. Establecer valor del minuto");
            System.out.println("2. Realizar una llamada");
            System.out.println("3. Ver detalles de las llamadas");
            System.out.println("4. Marcar llamada como pagada");
            System.out.println("5. Cancelar llamada sin pagar");
            System.out.print("Ingrese su opción: ");
            opc = input.nextLine();
            
            switch(opc)
            {
                 case "0":
                    break;
                case "1":
                    System.out.print("Ingrese el valor del minuto: ");
                    minuteValue = input.nextDouble();
                    input.nextLine(); //Limpiar buffer
                    break;
                 case "2":
                    if (minuteValue <= 0) {
                        System.out.println("Error");
                        break;
                    }else{
                        break;
                    }
            }
            
        } while (!opc.equals("0"));
        
        input.close(); //cierra el scanner
    }
    
}
