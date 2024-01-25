package com.project.designapp.entities;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="randevular")


public class Randevu {
	@Id
	Long id;

	String adi;
	String soyadi;
	String email;
	Date tarih;
	String saat;
	String randevuAciklamasi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public String getRandevuAciklamasi() {
		return randevuAciklamasi;
	}

	public void setRandevuAciklamasi(String randevuAciklamasi) {
		this.randevuAciklamasi = randevuAciklamasi;
	}

	public String getDoktorBilgi() {
		return doktorBilgi;
	}

	public void setDoktorBilgi(String doktorBilgi) {
		this.doktorBilgi = doktorBilgi;
	}

	String doktorBilgi;




    
    
    
}
