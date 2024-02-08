package com.vivek;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.vivek.Entity.Book;
import com.vivek.Repo.BookRepo;

@SpringBootApplication
public class SbJpaPaggingShortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbJpaPaggingShortingApplication.class, args);
		BookRepo bean = run.getBean(BookRepo.class);
//		Book bk = new Book(3,"Spring",5000.0);
//		Book bk1 = new Book(4,"Django",4500.0);
//		Book bk2 = new Book(5,"Git",4400.0);
//		Book bk3= new Book(6,"Maven",2500.0);
//		Book bk4 = new Book(7,"JIra",5500.0);
//		Book bk5 = new Book(8,"JDBC",6500.0);
//		
//		List<Book> list = bean.saveAll(Arrays.asList(bk,bk1,bk2,bk3,bk4,bk5));
		
//		+++++++++++++++++Sorting+++++++++++++++++++++++++++++++
//		Sort by = Sort.by("bookPrice").descending();
//		List<Book> all = bean.findAll(by);
//		all.forEach(System.out::println);
		
//++++++++++++++++++++++++Pagination+++++++++++++++++++++++++++++		
//		int pageNo=1;
//		
//		PageRequest of = PageRequest.of(pageNo-1,3);
//		Page<Book> findAll = bean.findAll(of);
//		findAll.forEach(System.out::println);
		
		
//		PageRequest of = PageRequest.of(pageNo-1, 3, by);
//		Page<Book> all = bean.findAll(of);
//		all.forEach(System.out::println);
		
		Book bk = new Book();
		bk.setBookName("java");
		
		Example<Book> of = Example.of(bk);
		List<Book> list = bean.findAll(of);
		list.forEach(System.out::println);
		
		}
		
	}


