/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia;

/**
 *
 * @author gabri
 */
public class MessageService {
    private final IMessageSender messageSender;
    
    public MessageService(){
        // Acoplamento direto à implementação EmailSender
        this.messageSender = new EmailSender();
    }
    
    public void processMessage(String message){
        messageSender.sendMessage(message);
    }
}
