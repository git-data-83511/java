package com.sunbeam;

import java.util.Objects;

public class Books {

	private String isbn;
	private double prize;
	private String author_name;
	private int qty;
	private Category category;
	
	public Books(String isbn, double prize, String author_name, int qty, Category category) {
		this.isbn = isbn;
		this.prize = prize;
		this.author_name = author_name;
		this.qty = qty;
		this.category = category;
	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrize() {
		return prize;
	}

	public String getAuthor_name() {
		return author_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author_name, category, isbn, prize, qty);
	}


	public int getQty() {
		return qty;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", prize=" + prize + ", author_name=" + author_name + ", qty=" + qty
				+ ", category=" + category + "]";
	}


}
