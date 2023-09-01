package code.buildon.aws.codewhisperer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:applicationContext.xml"})
public class DataStructuresWithCW {

	public static void main(String[] args) {
		SpringApplication.run(DataStructuresWithCW.class, args);
	}

}
