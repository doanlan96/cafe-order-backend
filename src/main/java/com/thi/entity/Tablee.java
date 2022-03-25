package com.thi.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tablee", catalog ="cafe_order_management")
public class Tablee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "table_name", nullable = false)
	private String table_name;
	
	@Column(name="status", nullable = false)
	private String status;
	
	public Tablee() {

	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Table [id=" + id + ", table_name=" + table_name + ", status=" + status  + "]";
	}
	
	
	
}
