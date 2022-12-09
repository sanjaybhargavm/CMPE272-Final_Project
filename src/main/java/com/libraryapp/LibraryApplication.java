package com.libraryapp;
import java.time.LocalDate; 
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.libraryapp.entities.Book;
import com.libraryapp.entities.User;
import com.libraryapp.services.BookService;
import com.libraryapp.services.NotificationService;
import com.libraryapp.services.UserService;
import com.libraryapp.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	BookService bookService;
	
	@Autowired
	UserService usService;
	
	@Autowired
	NotificationService notifService;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	@Autowired
	MidnightApplicationRefresh midAppRef;
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
		
			User user1 = new User("admin", pwEncoder.encode("admin"), "vahedshaik@gmail.com", "Vahed", "Shaik", "754 The Alameda", "123456789", "USA");
			user1.setRole("ROLE_ADMIN");
			
			User user2 = new User("employee", pwEncoder.encode("employee"), "sanjaybhargav@gmail.com", "Sanjay", "Madamanchi", "754 The Alameda", "123456789", "USA");
			user2.setRole("ROLE_EMPLOYEE");
			
			User user3 = new User("user1", pwEncoder.encode("user"), "chirudeep@gmail.com", "Chirudeep", "Gorle", "754 The Alameda", "0987654321", "USA");
			user3.setRole("ROLE_USER");	
			User user4 = new User("user2", pwEncoder.encode("user"), "jayanth@gmail.com", "Jayanth", "Godi", "754 The Alameda", "5463546737", "USA");
			user4.setRole("ROLE_USER");
			User user5 = new User("user3", pwEncoder.encode("user"), "saipragna@gmail.com", "Pragna", "Kancheti", "754 The Alameda", "5463546737", "USA");
			user4.setRole("ROLE_USER");
			User user6 = new User("a", pwEncoder.encode("pass"), "a.a@gmail.com", "A", "A", "123 ALAMEDA", "0987654321", "USA");
			User user7 = new User("b", pwEncoder.encode("pass"), "b.b@gmail.com", "B", "B", "123 ALAMEDA", "5463546737", "USA");
			User user8 = new User("c", pwEncoder.encode("pass"), "c.c@gmail.com", "C", "C", "123 ALAMEDA", "5463546737", "USA");
			User user9 = new User("d", pwEncoder.encode("pass"), "d.d@gmail.com", "D", "D", "123 ALAMEDA", "123456789", "USA");
			User user10 = new User("e", pwEncoder.encode("pass"), "e.e@gmail.com", "E", "E", "123 ALAMEDA", "0987654321", "USA");
			
			usService.save(user1);
			usService.save(user2);
			usService.save(user3);
			usService.save(user4);
			usService.save(user5);
			usService.save(user6);
			usService.save(user7);
			usService.save(user8);
			usService.save(user9);
			usService.save(user10);
			
			Book book1 = new Book(" Introduction to Software Engineering", "Ronald J. Leach", 2016, 2);
			Book book2 = new Book("Pattern Recognition and Machine Learning", " Christopher Bishop", 2006, 1);
			Book book3 = new Book("Computer Vision: Algorithms and Applications", "Richard Szeliski", 2010, 3);
			Book book4 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 2017, 8);
			Book book5 = new Book("NAKED STATISTICS: STRIPPING THE DREAD FROM DATA", "CHARLES WHEELAN", 2012, 5);
			Book book6 = new Book("HANDS-ON MACHINE LEARNING WITH SCIKIT-LEARN, KERAS AND TENSORFLOW","AURÉLIEN GÉRON",2017,4);
			Book book7 = new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", 2016, 5);
			Book book8 = new Book("Working Effectively with Legacy Code", "Micheal Feathers", 2015, 1);
			Book book9 = new Book("Design Patterns", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2);
			Book book10 = new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 2018, 3);
			Book book11 = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1);
			Book book12 = new Book("PATTERN RECOGNITION AND MACHINE LEARNING", "CHRISTOPHER M. BISHOP", 2006, 1);
			Book book13 = new Book("Code", "Charles Petzold", 2017, 1);
			Book book14 = new Book("Peopleware", "Tom DeMarco, Tim Lister", 2013, 3);
			Book book15 = new Book("DEEP LEARNING WITH PYTHON", "FRANÇOIS CHOLLET", 2017, 2);
			Book book16 = new Book("Programming Pearls", "Jon Bently", 1998, 1);
			Book book17 = new Book("Patterns of Enterprice Application Architecture", "Martin Fowler", 2020, 2);
			Book book18 = new Book("DATA SCIENCE WITH PYTHON AND DASK", "JESSE DANIEL", 2019, 1);
			Book book19 = new Book("The Art of Computer Programming", "Donald E. Knuth", 2014, 4);
			Book book20 = new Book("Domain-Driven Design", "Eric Evans", 2010, 2);
			Book book21 = new Book("Coders at Work", "Peter Seibel", 2009, 1);
			Book book22 = new Book("Rapid Development", "Steve McConnell", 1995, 6);
			Book book23 = new Book("The Self-Taught Programmer", "Cory Althoff", 2021, 1);
			Book book24 = new Book("Algorithms", "Robert Sedgewick, Kevin Wayne", 2000, 3);
			Book book25 = new Book("Continuous Delivery", "Jez Humble, David Farley", 2003, 1);
			
			bookService.save(book1);
			bookService.save(book2);
			bookService.save(book3);
			bookService.save(book4);
			bookService.save(book5);
			bookService.save(book6);
			bookService.save(book7);
			bookService.save(book8);
			bookService.save(book9);
			bookService.save(book10);
			bookService.save(book11);
			bookService.save(book12);
			bookService.save(book13);
			bookService.save(book14);
			bookService.save(book15);
			bookService.save(book16);
			bookService.save(book17);
			bookService.save(book18);
			bookService.save(book19);
			bookService.save(book20);
			bookService.save(book21);
			bookService.save(book22);
			bookService.save(book23);
			bookService.save(book24);
			bookService.save(book25);
			
			book10.setTheUser(user3);
			book10.setReturnDate(LocalDate.of(2022, 12,01));
			
			book1.setTheUser(user3);
			book1.setReturnDate(LocalDate.of(2022, 11,07));
			
			user3.setBooks(Arrays.asList(book10, book1));
			
			bookService.save(book1);
			bookService.save(book10);
			usService.save(user3);
						
			midAppRef.midnightApplicationRefresher();	
		};
	}
}
