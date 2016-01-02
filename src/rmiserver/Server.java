/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import interfaces.IService;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author frank
 */
public class Server {
    
    public static void main(String args[]){
        System.out.println("Launching server..");
        try{
            IService service = new Service();
            Registry registry = LocateRegistry.createRegistry(8001);
            registry.rebind("Service server", service);
            System.out.println("Server is running");
        }catch(Exception e){
            System.err.println("Server exception");
            e.printStackTrace();
        }
        
    }
}
