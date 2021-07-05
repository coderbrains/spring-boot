package com.boot.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.jpa.dap.UserRepository;
import com.boot.jpa.entities.Userr;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		
		  ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		  
		  UserRepository repository = context.getBean(UserRepository.class);
		  
		  //saving the single user
		  
//		  Userr user = new Userr();
//		  user.setName("Awanish");
//		  user.setAbout("Hello . I am a java programmer.");
//		  user.setAddress("mirjapur");
//		  Userr user2 = repository.save(user);
//		  System.out.println(user2);
		  
		  //saving the multiple users at once.
		  
//		  Userr user = new Userr();
//		  user.setName("manish");
//		  user.setAbout("a java programmer.");
//		  user.setAddress("Mirjapur");
//
//		  Userr user1 = new Userr();
//		  user1.setName("manish");
//		  user1.setAbout("a java programmer.");
//		  user1.setAddress("Mirjapur");
//
//		  Userr user2 = new Userr();
//		  user2.setName("manish");
//		  user2.setAbout("a java programmer.");
//		  user2.setAddress("Mirjapur");
//
//		  Userr user3 = new Userr();
//		  user3.setName("manish");
//		  user3.setAbout("a java programmer.");
//		  user3.setAddress("Mirjapur");
//
//		  Userr user4 = new Userr();
//		  user4.setName("manish");
//		  user4.setAbout("a java programmer.");
//		  user4.setAddress("Mirjapur");
//
//		  List<Userr> lists = List.of(user,user1,user2,user3,user4);
//		  
//		  Iterable<Userr> saveAll = repository.saveAll(lists);
//		  
//		  saveAll.forEach(u->{
//			  System.out.println(u);
//			  
//		  });

		  // getting all single user at a  time.
		  
//		  Optional<Userr> findById = repository.findById(2);
//		  Userr userr = findById.get();
//		  System.out.println(userr);
		  
		  //updating the user
		  
//		  Optional<Userr> findById = repository.findById(2);
//		  Userr userr = findById.get();
//
//		  userr.setAbout("sa re gama sa re ga ma....");
//		  
//		  Userr save = repository.save(userr);
//		  System.out.println(save);
		  
		  
		  
		  //deleting the user
		  
//		  repository.deleteById(5);
//		  repository.deleteAll();
//		  Iterable<Userr> findAll = repository.findAll();
//		  repository.deleteAll(findAll);
		  
		  
		  
//		  List<Userr> findByName = repository.findByName("Awanish");
//		  
//		  findByName.forEach(u->System.out.println(u));
		  
		  List<Userr> allUserrs = repository.getAllUserr();
		  
		  allUserrs.forEach(u->System.out.println(u));
		  
		  
		  
		  
		  
	}

}
