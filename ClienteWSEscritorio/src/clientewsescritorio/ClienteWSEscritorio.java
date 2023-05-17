/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientewsescritorio;

/**
 *
 * @author luis2
 */
public class ClienteWSEscritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idProducto = 1;
        int precio = 1234;
        int num_Productos = 3;
        int total = 1;
        
        boolean com = comprar (idProducto, precio, num_Productos, total);
        
        if(com == true){
            System.out.println("Compra realizada exitosamente (:");
        } else {
            System.out.println("Compra no realizada ):");
        }
        
        int numTarjeta = 123456789;
        int monto = 6700;
        String nombre = "Jorge Perez";
        int cvv = 456;
        
        boolean pay = pagar(numTarjeta, monto, nombre, cvv);
        
        if(pay == true){
            System.out.println("Pago realizado exitosamente (:");
        } else {
            System.out.println("Pago no realizado ):");
        }
        
    }

    private static Boolean comprar(int idProducto, int precio, int numProducto, int total) {
        clientewsescritorio.TansaccWS_Service service = new clientewsescritorio.TansaccWS_Service();
        clientewsescritorio.TansaccWS port = service.getTansaccWSPort();
        return port.comprar(idProducto, precio, numProducto, total);
    }

    private static Boolean pagar(int numTarjeta, int monto, java.lang.String nombre, int cvv) {
        clientewsescritorio.TansaccWS_Service service = new clientewsescritorio.TansaccWS_Service();
        clientewsescritorio.TansaccWS port = service.getTansaccWSPort();
        return port.pagar(numTarjeta, monto, nombre, cvv);
    }
    
    
}
