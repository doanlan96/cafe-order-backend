package com.thi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thi.entity.Tablee;
import com.thi.repository.ITableRepository;

@Service
public class TableService implements ITableService {
	@Autowired
	private ITableRepository repository;

	@Override
	public List<Tablee> getAllTables() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Tablee getTableByID(short id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void createTable(Tablee table) {
		// TODO Auto-generated method stub
		repository.save(table);	
	}

	@Override
	public void updateTable(Tablee table) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(table);
	}

	@Override
	public void deleteTable(short id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public boolean isTableExistsByID(short id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTableExistsByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}
