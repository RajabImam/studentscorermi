/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ng.pencode.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rajabimam
 */
public interface PromotionInterface extends Remote{
    int add_student() throws RemoteException;
    
}
