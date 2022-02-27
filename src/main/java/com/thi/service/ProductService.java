package com.thi.service;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.thi.entity.Product;
import com.thi.repository.IProductRepository;


@Service
public class ProductService implements IProductService {
	
	private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

	@Autowired
	private IProductRepository repository;
	
	@Override
	public Page<Product> getAllProducts(Pageable pageable) {
		// TODO Auto-generated method stub
		return repository.findAll(pageable);
	}

	@Override
	public Product getProductByID(short id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public void createProduct(String name,MultipartFile picture,float price,int category_id) throws IOException {
		// TODO Auto-generated method stub
		Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath).resolve(imagePath).resolve(picture.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(picture.getBytes());
        }
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setCategory_id(category_id);
        product.setPicture(imagePath.resolve(picture.getOriginalFilename()).toString());
        repository.save(product);
	}

	@Override
	public void updateProduct(int id, String name,MultipartFile picture,float price,int category_id) throws IOException {
		// TODO Auto-generated method stub
		Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath).resolve(imagePath).resolve(picture.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(picture.getBytes());
        }
        Product product = new Product();
        product.setId((short) id);
        product.setName(name);
        product.setPrice(price);
        product.setCategory_id(category_id);
        product.setPicture(imagePath.resolve(picture.getOriginalFilename()).toString());
		repository.saveAndFlush(product);
	}

	@Override
	public void deleteProduct(short id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public boolean isProductExistsByID(short id) {
		// TODO Auto-generated method stub
		return repository.existsById(id);
	}

	@Override
	public boolean isProductExistsByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}


}


//Tao 1 function riêng để upload ảnh cho product:
//	get Product by Id
//	setPicture
//	save

