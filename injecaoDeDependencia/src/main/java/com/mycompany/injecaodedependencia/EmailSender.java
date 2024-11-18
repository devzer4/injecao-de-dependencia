/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia;

/**
 *
 * @author gabri
 */
public class EmailSender implements IMessageSender{

    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando e-mail com a mensagem: " + message);
    }

}
