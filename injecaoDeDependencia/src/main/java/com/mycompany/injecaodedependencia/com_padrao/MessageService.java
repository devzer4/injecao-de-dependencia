/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia.com_padrao;

/**
 *
 * @author gabri
 */
public class MessageService {
    private final IMessageSender messageSender;
    
    // Injeção de dependência via construtor
    public MessageService(IMessageSender messageSender){
        this.messageSender = messageSender;
    }
    
    public void processMessage(String message){
        // Aqui, messageSender é usado sem saber qual implementação concreta está sendo usada.
        messageSender.sendMessage(message);
    }
    
}
