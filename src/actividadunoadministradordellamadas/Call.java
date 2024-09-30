
package actividadunoadministradordellamadas;


public class Call 
{
    private String type; // tipo de llamada: local, nacional, internacionaal
    private double minuteValue; // valor minuto
    private int duration; // duración minutos
    private boolean paid; // estado de pago

    public Call(String type, double minuteValue, int duration, boolean paid) 
    {
        this.type = type;
        this.minuteValue = minuteValue;
        this.duration = duration;
        this.paid = false; //inicialmente quda como no paga
    }
    
    public double calculateTotal() 
    {
        double subtotal = minuteValue * duration;
        double surcharge = 0;

        if (type.equalsIgnoreCase("Nacional")) {
            surcharge = subtotal * 0.05; // Recargo del 5%   
        } else if (type.equalsIgnoreCase("Internacional")) {
            surcharge = subtotal * 0.10; // Recargo del 10%
        } else if (type.equalsIgnoreCase("Local")) {
            surcharge = 0; // Sin recargo para llamadas locales
        }
        
        double total = subtotal + surcharge;
        total += total * 0.19; // IVA del 19%
        return total;
    }
    
     public boolean isPaid() 
    {
        return paid;
    }

    public void markAsPaid() 
    {
        paid = true;
    }
    
    @Override
    public String toString() {
        return "Tipo: " + type + ", Duración: " + duration + " min, Total: $" + calculateTotal();
    }
    
}
