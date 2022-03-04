package com.thi.service;

import java.io.IOException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.thi.entity.Product;


public interface IProductService {
	
	public Page<Product> getAllProducts(Pageable pageable);

	public Product getProductByID(short id);

	public Product getProductByName(String name);

//	public void createProduct(String name,MultipartFile picture,float price,int category_id) throws IOException;
	
	public void createProduct(Product product);

//	public void updateProduct(short id, String newName);
	
	public void updateProduct(Product product);

//	public void updateProduct(int id, String name,MultipartFile picture,float price,int category_id) throws IOException;

	public void deleteProduct(short id);

	public boolean isProductExistsByID(short id);

	public boolean isProductExistsByName(String name);


}
