/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import interfaces.IService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author frank
 */
public class Service extends UnicastRemoteObject implements IService{
    
    public Service() throws RemoteException{
        super();
    }

    @Override
    public String getMessage(String message) throws RemoteException {
        return "Server says: " + message;
    }
    
}
