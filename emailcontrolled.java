package com.example.demo.controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailcontrolled {

	@Autowired
	JavaMailSender javaMailSender;
	
	@GetMapping("/sendEmail")
	public void sendEmail()
	{
		SimpleMailMessage m = new SimpleMailMessage();
		m.setTo("kunal57shingote@gmail.com");
		m.setFrom("kunal57shingote@gmail.com");
		m.setSubject("Skill Up Now");
		m.setText("Hii...How are you");
		
		javaMailSender.send(m);
	}
	
	
	
	
	
}
