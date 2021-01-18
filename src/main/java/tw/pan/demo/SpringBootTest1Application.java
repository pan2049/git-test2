package tw.pan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"tw.pan.demo","tw.pan.model","tw.pan.controller"})
@EntityScan({"tw.pan.demo","tw.pan.model","tw.pan.controller"})
public class SpringBootTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest1Application.class, args);
	}

}
