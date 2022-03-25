package com.thi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thi.entity.Tablee;
import com.thi.service.ITableService;

@RestController
@RequestMapping(value = "api/v1/tables")
public class TableController {
	
	@Autowired
	private ITableService service;

	@GetMapping()
	public List<Tablee> getAllTables() {
		return service.getAllTables();
	}
	
	@GetMapping(value = "/{id}")
	public Tablee getTableByID(@PathVariable(name = "id") short id) {
		return service.getTableByID(id);
	}
	
	@PostMapping()
	public String createTable(@RequestBody Tablee table) {
		service.createTable(table);
		return "{ \"message\":"+"\"Create Successfully\"" + "}";
	}

	@PutMapping(value = "/{id}")
	public void updateTable(@PathVariable(name = "id") short id, @RequestBody Tablee table) {
		table.setId(id);
		service.updateTable(table);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteTable(@PathVariable(name = "id") short id) {
		service.deleteTable(id);
	}
}
