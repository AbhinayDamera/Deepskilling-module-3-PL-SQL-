package com.think.db_demo;

import com.think.db_demo.entity.StoreInformation;
import com.think.db_demo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {

	@Autowired
	private StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		StoreInformation store1 = new StoreInformation(
				"Amazon",
				"All types of bags are available here",
				"xxxxx"
		);

		StoreInformation store2 = new StoreInformation(
				"Flipkart",
				"All types of books are available here",
				"yyyyy"
		);

		StoreInformation store3 = new StoreInformation(
				"Meesho",
				"All fashion items are available here",
				"zzzzz"
		);

		StoreInformation store4 = new StoreInformation(
				"Myntra",
				"All fashion items are available here",
				"aaaaa"
		);

		// Save all stores
		storeInformationRepository.save(store1);
		storeInformationRepository.save(store2);
		storeInformationRepository.save(store3);
		storeInformationRepository.save(store4);

		// Fetch and print Amazon
		System.out.println("Amazon:");
		storeInformationRepository.findByStoreName("Amazon")
				.forEach(System.out::println);

		// Fetch and print Flipkart
		System.out.println("Flipkart:");
		storeInformationRepository.findByStoreName("Flipkart")
				.forEach(System.out::println);

		// Fetch and print Meesho
		System.out.println("Meesho:");
		storeInformationRepository.findByStoreName("Meesho")
				.forEach(System.out::println);

		// Fetch and print Myntra
		System.out.println("Myntra:");
		storeInformationRepository.findByStoreName("Myntra")
				.forEach(System.out::println);

		//storeInformationRepository.deleteById(1);

		System.out.println(storeInformationRepository.count());

	}
}