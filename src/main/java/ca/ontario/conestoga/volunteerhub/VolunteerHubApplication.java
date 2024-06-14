package ca.ontario.conestoga.volunteerhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "ca.ontario.conestoga.volunteerhub.mapper")
public class VolunteerHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(VolunteerHubApplication.class, args);
	}

}
