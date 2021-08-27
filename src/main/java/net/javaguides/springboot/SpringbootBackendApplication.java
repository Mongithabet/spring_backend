package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Mongi","Thabet","stechnopc@yahoo.fr"));
		this.userRepository.save(new User("Faten","Hafsi","stechnopc@yahoo.fr"));
		this.userRepository.save(new User("Adem","Thabet","stechnopc@yahoo.fr"));
		userRepository.findAll().forEach(
				p->{
					System.out.println(p.getFirstName());
					System.out.println(p.getLastName());
					System.out.println(p.getEmail());

				}); 
    	   
       
	}

}
