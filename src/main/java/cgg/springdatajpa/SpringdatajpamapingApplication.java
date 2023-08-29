package cgg.springdatajpa;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cgg.springdatajpa.dao.CategoryRepository;
import cgg.springdatajpa.dao.ProductRepository;
import cgg.springdatajpa.entities.Category;
import cgg.springdatajpa.entities.Product;

@SpringBootApplication
public class SpringdatajpamapingApplication implements CommandLineRunner{

	private static final Logger logger = Logger.getLogger(SpringdatajpamapingApplication.class.getName());
	
	@Autowired
	private CategoryRepository categoryRepo;
	@Autowired
	private ProductRepository productRepo;
	//private QuestionRepository questionRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpamapingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	//Create question
//		Question q1 = new Question();
//		q1.setQuestionId(121);
//		q1.setQuestion("What is Java?");
		
	//create Answers
//		Answer a1 = new Answer();
//		a1.setAnswerId(343);
//		a1.setAnswer("Java is a programming language");
//		a1.setQuestion(q1);
		
//		Answer a2 = new Answer();
//		a2.setAnswerId(344);
//		a2.setAnswer("Java is platform independent");
//		a2.setQuestion(q1);
		
//		ArrayList<Answer> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
		
		//q1.setAnswers(list);
		
		
//		q1.setAnswer(a1);
//		a1.setQuestion(q1);
		
//		Question save = questionRepo.save(q1);
//		logger.info("Saved question Id is :"+save.getQuestionId());
		
		//Fetching data
//		
//		Question question = questionRepo.findById(121).get();
//		logger.info("Question: "+question.getQuestion()+" Answer: "+question.getAnswer().getAnswer());
		
		
		//Fetching data
//		Question question = questionRepo.findById(121).get();
//		logger.info("Question Id "+question.getQuestionId());
//		logger.info("Number of answers: "+question.getAnswers().size());
		
		
		//Creating Categories
		Category c1 = new Category();
		c1.setCategoryId(1);
		c1.setCategoryName("Electronics");
		
		Category c2 = new Category();
		c2.setCategoryId(2);
		c2.setCategoryName("Gadgets");
		
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("TV");
		
		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductName("Mobile");
		
		Product p3 = new Product();
		p3.setProductId(3);
		p3.setProductName("Refrigerator");
		
		ArrayList<Category> catlist1 = new ArrayList<>();
		catlist1.add(c1);
		
		ArrayList<Category> catlist2 = new ArrayList<>();
		catlist2.add(c2);
		
		
		ArrayList<Product> list2 = new ArrayList<>();
		list2.add(p1);
		list2.add(p2);
		
		ArrayList<Product> list3 = new ArrayList<>();
		list3.add(p3);
		list3.add(p2);
		
		c1.setProducts(list2);
		c2.setProducts(list3);
		
//		p1.setCategories(catlist1);
//		p2.setCategories(catlist2);
		
//		Category save = categoryRepo.save(c1);
//		logger.info("Category id: "+save.getCategoryId());
//		Category save2 = categoryRepo.save(c2);
//		logger.info("Category2 id: "+save2.getCategoryId());
//		Product save3 = productRepo.save(p1);
//		logger.info("Product id: "+save3.getProductId());
//		Product save4 = productRepo.save(p2);
//		logger.info("Product id: "+save4.getProductId());
		
		Category category = categoryRepo.findById(1).get();
		logger.info("size of products: "+category.getProducts().size());
		logger.info("Size of Category: "+category.getProducts().get(1).getProductName());
		
		
		
		
		

	}
	
	

}
