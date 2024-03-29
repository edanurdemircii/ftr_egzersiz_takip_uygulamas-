package com.project.designapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.designapp.entities.Doktor;
import com.project.designapp.entities.Hasta;
import com.project.designapp.entities.Randevu;
import com.project.designapp.repos.RandevuRepository;
import com.project.designapp.requests.RandevuCreateRequest;
import com.project.designapp.requests.RandevuUpdateRequest;

@Service
public class RandevuService {
	
	RandevuRepository randevuRepository;

	
	
	
	public RandevuService(RandevuRepository randevuRepository) {
		this.randevuRepository = randevuRepository;

	}



	public Randevu createRandevu(RandevuCreateRequest newRandevuRequest) {

		Randevu toSave=new Randevu();
		toSave.setId(newRandevuRequest.getId());
		toSave.setTarih(newRandevuRequest.getTarih());
		toSave.setRandevuAciklamasi(newRandevuRequest.getRandevuAciklamasi());

		return randevuRepository.save(toSave);
	}

	public Randevu createRandevu2(RandevuCreateRequest newRandevuRequest) {

		Randevu toSave=new Randevu();
		toSave.setId(newRandevuRequest.getId());
		toSave.setAdi(newRandevuRequest.getAdi());
		toSave.setSoyadi(newRandevuRequest.getSoyadi());
		toSave.setTarih(newRandevuRequest.getTarih());
		toSave.setSaat(newRandevuRequest.getSaat());
		toSave.setEmail(newRandevuRequest.getEmail());
		toSave.setDoktorBilgi(newRandevuRequest.getDoktorBilgi());
		toSave.setRandevuAciklamasi(newRandevuRequest.getRandevuAciklamasi());

		return randevuRepository.save(toSave);
	}



	public Randevu getOneRandevu(Long randeuvId) {
		return randevuRepository.findById(randeuvId).orElse(null);
	}



	public Randevu updateOneFatura(Long randevuId, RandevuUpdateRequest randevuUpdate) {
		Optional<Randevu> randevu=randevuRepository.findById(randevuId);
		if(randevu.isPresent()) {
			Randevu toUpdate=randevu.get();
			toUpdate.setTarih(randevuUpdate.getTarih());
			toUpdate.setRandevuAciklamasi(randevuUpdate.getRandevuAciklamasi());
			randevuRepository.save(toUpdate);
			return toUpdate;
		}
		return null;
	}

	public void deleteOneFatura(Long randevuId) {
		randevuRepository.deleteById(randevuId);
	}

	public List<Randevu> getAllRandevu() {
		return randevuRepository.findAll();
	}
}
