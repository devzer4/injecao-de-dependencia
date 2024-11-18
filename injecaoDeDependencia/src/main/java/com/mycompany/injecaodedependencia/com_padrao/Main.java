/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.injecaodedependencia.com_padrao;

/**
 *
 * @author gabri
 */
public class Main {
    //Injeção usando construtor;
    public static void main(String[] args){
        // Injetando a dependência EmailSender em MessageService
        IMessageSender emailSender = new EmailSender();
        MessageService emailService = new MessageService(emailSender);
        emailService.processMessage("Sua fatura pode ser paga agora mesmo usando pix!");

        // Injetando a dependência SMSSender em MessageService
        IMessageSender smsSender = new SMSSender();
        MessageService smsService = new MessageService(smsSender);
        smsService.processMessage("Seu plano de internet precisa ser renovado");
    }
        
    //Injeção usando propriedades getter e setter
//    public static void main(String[] args){
//        // Cria uma instância de MessageService2
//        MessageService2 messageService2 = new MessageService2();
//
//        // Injeção de dependência com o setter, configurando um EmailSender
//        messageService2.setMessageSender(new EmailSender());
//        messageService2.processMessage("Sua fatura pode ser paga agora mesmo usando pix!");
//
//        // Mudando a dependência para SMSSender usando o mesmo setter
//        messageService2.setMessageSender(new SMSSender());
//        messageService2.processMessage("Seu plano de internet precisa ser renovado");
//    }
    
    //Injeção usando interface
//    public static void main(String[] args) {
//       // Cria uma instância de MessageService3
//       MessageService3 messageService3 = new MessageService3();
//
//       // Verifica se messageService3 implementa MessageSenderInjection antes de injetar a dependência
//       if (messageService3 instanceof MessageSenderInjection) {
//           ((MessageSenderInjection) messageService3).setMessageSender(new EmailSender());
//       }
//        messageService3.processMessage("Sua fatura pode ser paga agora mesmo usando pix!");
//
//        // Mudando a dependência para SMSSender usando o mesmo método
//        if (messageService3 instanceof MessageSenderInjection) {
//            ((MessageSenderInjection) messageService3).setMessageSender(new SMSSender());
//        }
//        messageService3.processMessage("Seu plano de internet precisa ser renovado");
//    }
}
