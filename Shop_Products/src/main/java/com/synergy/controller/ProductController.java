package com.synergy.controller;


import java.util.Iterator;
import java.util.List;



//import com.mongodb.WriteResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.synergy.model.Product;
import com.synergy.repository.ProductRepository;

@RestController
public class ProductController {

@Autowired
ProductRepository productRepository;
@Autowired
MongoTemplate mongo;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(method=RequestMethod.GET, value="/products",produces=MediaType.APPLICATION_JSON_VALUE )
public List<Product> getProduct() {
	

/*	Product pr= new Product(8, "Camera1", "Electronics", "cannon",500, "/camera1.jpeg","3");
	Product pr1= new Product(9, "laptop2", "Electronics", "dell",500, "/laptop.jpeg","4");
	Product pr2= new Product(10, "headphone2", "Electronics", "beat",100, "/headphone.jpeg","2");
	Product pr3= new Product(11, "iphone2", "Electronics", "apple",900, "/iphone.jpeg","3");
	Product pr4= new Product(12, "android2", "Electronics", "samsung",700, "/android.jpeg","3");
	Product pr5= new Product(13, "toyrobo2", "Electronics", "toys",300, "/toyrobo.jpeg","3");
    Product pr6=new Product(14,"lipstic", "Cosmtics", "mac",10,"/lipstic.jpeg","3");
    Product pr7=new Product(15,"lipstic2","Cosmatics","clinique",15,"/lipstic.jpeg","4");
    Product pr8=new Product(15,"mascara","Cosmatics","clinique",15,"/mascara.jpeg","4");
    Product pr9=new Product(15,"perfume","Cosmatics","clinique",15,"/perfume.jpeg","4");
     productRepository.save(pr);
     productRepository.save(pr1);
     productRepository.save(pr2);
     productRepository.save(pr3);
     productRepository.save(pr4);
     productRepository.save(pr5);
     productRepository.save(pr6);
     productRepository.save(pr7);
     productRepository.save(pr8);
     productRepository.save(pr9);*/
	//return productRepository.findByProductName("TV");
	System.out.println("I was called");
	
	
     return productRepository.findAll();
}
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(method=RequestMethod.GET, value="/hello",produces=MediaType.APPLICATION_JSON_VALUE)
public String sayhello() {
	return "hello";
}

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(method=RequestMethod.GET, value="/categories",produces=MediaType.APPLICATION_JSON_VALUE)
public List<String> category(){
	    List<String> cat = mongo.getCollection("products").distinct("category");
	    System.out.println(cat.size());
	    Iterator<String> iterator = cat.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	    
		return cat;
	    
}
//	
//@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping(method=RequestMethod.GET,value="/products", produces=MediaType.APPLICATION_JSON_VALUE)
//public List<Product> getProdctByCategory(){
//	return null;
//	
//}
//

//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping(method=RequestMethod.GET, value="/products",produces=MediaType.APPLICATION_JSON_VALUE )
//public List<Product> getProductByCategory() {
//	String jsonObj = "{\"category\" : \"Phones\"}";
//	Sort sort = new Sort(jsonObj);
//	return productRepository.findAll(sort);
//	}

}


/*@Autowired
private JavaMailSender mailSender;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(method=RequestMethod.GET, value="/categories",produces=MediaType.APPLICATION_JSON_VALUE)
public void sendHTMLMail(HTMLMail mail) throws MessagingException {

    MimeMessage message = mailSender.createMimeMessage();
    MimeMessageHelper helper = new MimeMessageHelper(message, false, "utf-8");

    helper.setTo(mail.getTo());
    helper.setSubject(mail.getSubject());
    message.setContent(mail.getContent(), "text/html");

    mailSender.send(message);
}*/






	
