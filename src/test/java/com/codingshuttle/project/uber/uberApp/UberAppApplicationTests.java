package com.codingshuttle.project.uber.uberApp;

import com.codingshuttle.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail("pelisif969@suggets.com",
				"This is the testing email",
						"This is body my my mail");
	}

	@Test
	void sendEmailMultiple(){
		String email[] = {
				"pelisif969@suggets.com",
				"jatinbawne2347@gmail.com",
				"nidhibawne2000@gmail.com"
		};

		emailSenderService.sendEmail(email, "This is mail Subject, J", "This is mail Body J");
	}

}
