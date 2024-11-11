package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService {
	private String username;
	private String password;
	private Properties properties;

	public EmailService(String smtpHost, int smtpPort, String username, String password) {
		this.username = username;
		this.password = password;

		// Configuración de propiedades SMTP
		properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", smtpHost);
		properties.put("mail.smtp.port", smtpPort);
	}

	private Session createSession() {
		return Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});
	}

	// Método para enviar correo a varios destinatarios
	public String enviarCorreoPersonalizado(List<String> destinatarios, String subject, String body) {
		try {
			Session session = createSession();
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			destinatarios.add("samueledcardenas@gmail.com");

			// Agregar múltiples destinatarios
			for (String toEmail : destinatarios) {
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			}

			message.setSubject(subject);
			message.setText(body);

			Transport.send(message);
			System.out.println("Correo enviado exitosamente a los destinatarios.");
			return "Se envio un correo con la informacion";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hubo un error al enviar el correo a los destinatarios.");
		}
		return null;
	}

//	public void enviarCorreo(ArrayList<String> correos, String asunto, String cuerpo) {
////		String smtpHost = "smtp.gmail.com";
////		int smtpPort = 587;
////
////		String username = "bosquehealthapp8@gmail.com";
////		String password = "nljl rlsz mods rpov";
////
////		EmailService emailService = new EmailService(smtpHost, smtpPort, username, password);
//
//		// Enviar correo a múltiples destinatarios
//		emailService.enviarCorreoPersonalizado(correos, asunto, cuerpo);
//	}
}