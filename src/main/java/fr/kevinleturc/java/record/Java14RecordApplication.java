package fr.kevinleturc.java.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Java14RecordApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java14RecordApplication.class, args);
	}

}
