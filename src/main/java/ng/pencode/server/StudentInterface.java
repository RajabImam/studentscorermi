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
public interface StudentInterface extends Remote{
    int add_exam(Exam exam) throws RemoteException;
    
    String print_exams() throws RemoteException;
    
    double calculate_average()throws RemoteException;
}
