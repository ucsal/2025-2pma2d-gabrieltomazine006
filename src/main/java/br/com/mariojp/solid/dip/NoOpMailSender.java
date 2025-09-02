package br.com.mariojp.solid.dip;

public class NoOpMailSender implements MailSender {
@Override
	public void send(String to, String subject, String body) {
	        System.out.println("DRY_RUN: Email não enviado (No-Op) para: " + to + " - Assunto: " + subject);
	    }
	}
