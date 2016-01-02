/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import interfaces.IService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author frank
 */
public class Client {
    
    public static void main(String args[]){
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 8001);
            IService service = (IService) registry.lookup("Service server");
            System.out.println(service.getMessage("This is a string from the client"));
        }catch(Exception e){
            System.err.println("Client exception");
            e.printStackTrace();
        }
    }
    
}
