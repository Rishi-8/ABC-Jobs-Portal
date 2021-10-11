package com.finalproject.action;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.finalproject.dao.ForgotPassEmailDao;
import com.opensymphony.xwork2.ActionSupport;

public class ForgotPassEmailAction extends ActionSupport{
	
	private static final long serialVersionUID = -153621026663813058L;
	private String email;
	public String msg = null; 
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	static Properties props = new Properties();
	static {props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");}

	public String execute() throws Exception{
		String to = email;
		ForgotPassEmailDao Dao = new ForgotPassEmailDao();
		
		final String from = "javatestabcj@gmail.com";
		final String password = "java%test1";
		
		try {
			
			boolean check = Dao.validate(email);
			if (check==false) {
				msg = "There is no account registered with this Email Id";
				System.out.println("There is no such email");
				return "error";
			}
			else{
				
				Session session = Session.getInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from, password);
					}
				});
				
				Message message = new MimeMessage(session);
				
				message.setFrom(new InternetAddress(from));
				
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
				
				message.setSubject("ABC Jobs - Update your password");
				
				message.setContent("<h1>To update your password</h1><p>Click on this link <a href=\"http://localhost:8080/FinalProject/updatepass.jsp\">email</a></p>","text/html");
				
				Transport.send(message);
				
				System.out.println("Message sent successfully");
				
				return "send";
				
				}
			
			}catch (MessagingException e) {
				e.printStackTrace();
				msg="Sorry try again";
				return "error";
			}
			
	}


	public static void setProps(Properties props) {
		ForgotPassEmailAction.props = props;
	}

}
