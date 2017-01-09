package com.example.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.product.Product;
import com.example.repository.product.ProductRepository;


@RestController
@RequestMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	@Autowired
	public ProductRepository productRepo;

	// REST APi to create user/save user in database
	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public Product createUser() {
		Product product=new Product();
		product.setName("test");
		product.setPrice(12);
		return productRepo.save(product);
	}


	// REST API to get all users
	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Product> getAllUsers() {

		return productRepo.findAll();

	}
}
