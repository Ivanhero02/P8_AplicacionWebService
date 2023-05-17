/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.me.trans;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author luis2
 */
@WebService(serviceName = "TansaccWS")
public class TansaccWS {

    /**
     * This is a sample web service operation
     
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Comprar")
    public Boolean Comprar(@WebParam(name = "id_producto") int id_producto, @WebParam(name = "precio") int precio, @WebParam(name = "num_producto") int num_producto, @WebParam(name = "total") int total) {
        boolean k=false;
        int saldo=1000;
        if(id_producto==1){
        total=num_producto*precio;
        if(total<saldo){
            k=true;}
        }else{
            k=false;}
        
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pagar")
    public Boolean Pagar(@WebParam(name = "num_tarjeta") int num_tarjeta, @WebParam(name = "monto") int monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "cvv") int cvv) {
        int saldo=1000;
        boolean k=false;
        if(num_tarjeta==123456789&&cvv==456){
        if(monto<=saldo){
        saldo=saldo-monto;
        k=true;        
        }
        else
            k=false;
        }
        return k;
    }
}
