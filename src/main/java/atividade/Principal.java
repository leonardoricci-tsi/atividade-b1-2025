package atividade;

public class Principal{
    public static void main(String[] args){
        System.out.println("Funciona");

        Notificacao not = new Notificacao("Primeiro Exemplo");

        NotificacaoSMS sms = new NotificacaoSMS("Segundo exemplo");

        not.enviar();
        sms.enviar();








    }
}


