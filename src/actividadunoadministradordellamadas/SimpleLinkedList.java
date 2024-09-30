
package actividadunoadministradordellamadas;


public class SimpleLinkedList 
{
    public Nodo head;
    
    public SimpleLinkedList() {
        this.head = null;
    }
    
    public void add(int info){
        Nodo newNode=new Nodo(info);
        newNode.link = head;
        head = newNode;
    }
    
    public void printLSL() {
        Nodo p = this.head;
        int i = 1;
        while (p != null) {
            System.out.println("Nodo " + i + ": " + p.info);
            System.out.println("Dirección del nodo: " + p);
            System.out.println("Dirección de la liga del nodo: " + p.link);
            System.out.println("--------");
            p = p.link;
            i++;
        }
    }
    
}
