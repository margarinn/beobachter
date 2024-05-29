package com.sateumami;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

@Document(collection = "products")
public class Products {
	
	@Id
	private ObjectId Id;
	
	private String nama;
	
	private String harga;
	
	private String gambar;

	public ObjectId getId() {
		return Id;
	}

	public void setId(ObjectId id) {
		Id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}
	
}
