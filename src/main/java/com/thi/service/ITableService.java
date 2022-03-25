package com.thi.service;


import java.util.List;

import com.thi.entity.Tablee;

public interface ITableService {

	public List<Tablee> getAllTables();

	public Tablee getTableByID(short id);
	
	public void createTable(Tablee table);
	
	public void updateTable(Tablee table);

	public void deleteTable(short id);

	public boolean isTableExistsByID(short id);

	public boolean isTableExistsByName(String name);
	
}
