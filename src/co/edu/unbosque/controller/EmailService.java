package co.edu.unbosque.controller;

import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Clase encargada de enviar correos
 * 
 * @author Mariana Ovallos
 */
public class EmailService {
	/**
	 * Atributo encargado de guardar un nombre
	 */
	private String username;
	/**
	 * Atributo encargado de guardar una contraseña
	 */
	private String password;
	/**
	 * Atributo encargado de almacenar unas propiedades
	 */
	private Properties properties;

	/**
	 * Metodo constructor
	 * 
	 * @param smtpHost valor del dominio de envio del correo
	 * @param smtpPort valor del puerto requerido para su configuracion
	 * @param username valor del correo remitente
	 * @param password valor de la contraseña que da el proveedor de correos
	 */
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

	/**
	 * Metodo encargado de enviar un correo personalizado
	 * 
	 * @param destinatarios Valor que contiene los correos de destino
	 * @param subject       Valor del asunto del correo
	 * @param body          valor del cuerpo del correo
	 * @return mensaje indicando que debe revisar su correo
	 */
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
		return "Revise su correo";
	}
}