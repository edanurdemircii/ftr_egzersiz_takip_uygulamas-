package com.project.designapp.requests;

import java.util.Date;

import lombok.Data;


@Data
public class RandevuCreateRequest {
	Long id;
	String adi;
	String soyadi;
	String email;
	Date tarih;
	String saat;
    String randevuAciklamasi;
	String doktorBilgi;
	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public String getDoktorBilgi() {
		return doktorBilgi;
	}

	public void setDoktorBilgi(String doktorBilgi) {
		this.doktorBilgi = doktorBilgi;
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




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public String getRandevuAciklamasi() {
		return randevuAciklamasi;
	}
	public void setRandevuAciklamasi(String randevuAciklamasi) {
		this.randevuAciklamasi = randevuAciklamasi;
	}


    
    
    
}
