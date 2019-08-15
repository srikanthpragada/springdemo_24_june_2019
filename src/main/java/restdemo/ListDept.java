package restdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication 
public class ListDept implements CommandLineRunner {
	private RestTemplate restTemplate;
	
	public ListDept(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ListDept.class,args);
	}

	@Override
	public void run(String... args) {
		  Department dept = restTemplate.getForObject
				     ("http://localhost:8888/rest/dept/10",
				     Department.class);
		  System.out.println("Name     : " + dept.getName());
	}
}