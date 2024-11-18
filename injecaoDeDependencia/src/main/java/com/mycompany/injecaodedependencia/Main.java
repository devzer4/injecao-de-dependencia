/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args) {
        // Cria um MessageService que está diretamente acoplado ao EmailSender
        MessageService messageService = new MessageService();
        messageService.processMessage("Sua fatura pode ser paga agora mesmo usando pix!");
    }
}
