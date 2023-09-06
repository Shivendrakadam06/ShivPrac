package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Product;
import com.boot.model.ProductRepository;

@RestController
@RequestMapping("/Product")
public class ProductController {
@Autowired 
ProductRepository pro;

@GetMapping("/retriveAll")
public List<Product> getAllProduct(){
	
	return pro.findAll();
	
}
@GetMapping("/getById/{id}")
public Product getById(@PathVariable int id) {
	Optional <Product>  p1=pro.findById(id);
	Product prd=null;
	if(p1.isPresent())
	{
		prd=p1.get();
	}
	return prd;
}
@PostMapping("/insertProduct")
public List<Product> insertp(@RequestBody List<Product> p1) {
	pro.saveAll(p1);
	 return p1;
}
@DeleteMapping("/deleteByid/{id}")
public void delete(@PathVariable int id) {
	pro.deleteById(id);
}
@PutMapping("/update")  
public Product updatePro(@RequestBody Product p1) {
	Optional<Product> pupdate=pro.findById(p1.getProductid());
	if (pupdate.isPresent())
	{
		pro.save(p1);
	}
	return p1;
	
}

}
