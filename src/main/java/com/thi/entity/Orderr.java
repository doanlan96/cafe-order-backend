package com.thi.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name="orderr", catalog ="cafe_order_management")
public class Orderr implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "form", nullable = false)
	private String form;
	
	@Column(name = "time_in", nullable = false)
	private LocalTime time_in;
	
	@Column(name = "time_out", nullable = false)
	private LocalTime time_out;
	
	@Column(name = "day_month_year", nullable = false)
	private String day_month_year;
	
	@Column(name="table_id", nullable = false)
	private int table_id;
	
	@Column(name = "sum", nullable = true)
	private float sum;
	
	@Column(name = "customer_pay", nullable = true)
	private float customer_pay;
	
	@Column(name = "money_returned", nullable = true)
	private float money_returned;
	
	@Column(name = "user_id", nullable = false)
	private int user_id;

	@Column(name = "payment_method", nullable = false)
	private String payment_method;

	@Column(name = "state", nullable = false)
	private String state;
	
	public Orderr() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public LocalTime getTime_in() {
		return time_in;
	}

	public void setTime_in(LocalTime time_in) {
		this.time_in = time_in;
	}

	public LocalTime getTime_out() {
		return time_out;
	}

	public void setTime_out(LocalTime time_out) {
		this.time_out = time_out;
	}

	public String getDay_month_year() {
		return day_month_year;
	}

	public void setDay_month_year(String day_month_year) {
		this.day_month_year = day_month_year;
	}

	public int getTable_id() {
		return table_id;
	}

	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}

	public float getSum() {
		return sum;
	}

	public void setSum(float sum) {
		this.sum = sum;
	}

	public float getCustomer_pay() {
		return customer_pay;
	}

	public void setCustomer_pay(float customer_pay) {
		this.customer_pay = customer_pay;
	}

	public float getMoney_returned() {
		return money_returned;
	}

	public void setMoney_returned(float money_returned) {
		this.money_returned = money_returned;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", time_in=" + time_in + ", time_out=" + time_out + ", date=" + day_month_year + ", table_id="
				+ table_id + ", total=" + sum + ", customer_pay=" + customer_pay + ", change=" + money_returned + ", user_id="
				+ user_id + ", payment_method=" + payment_method + "]";
	}
	
	
}
