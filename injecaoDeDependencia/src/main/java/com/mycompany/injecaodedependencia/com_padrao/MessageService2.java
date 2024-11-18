/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia.com_padrao;

/**
 *
 * @author gabri
 */
public class MessageService2 {
    private IMessageSender messageSender;
    
    // Getter
    public IMessageSender getMessageSender(){
        return messageSender;
    }
    
    // Setter para injeção de dependência
    public void setMessageSender(IMessageSender messageSender){
        this.messageSender = messageSender;
    }
    
    public void processMessage(String message){
        if(messageSender != null){
            messageSender.sendMessage(message);
        } else {
            System.out.println("Tipo de envio nulo");
        }
    }
}
