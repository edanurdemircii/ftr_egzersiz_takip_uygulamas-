package com.project.designapp.controller;

import java.util.List;
import java.util.Optional;

import com.project.designapp.entities.Hasta;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.designapp.entities.Randevu;
import com.project.designapp.requests.RandevuCreateRequest;
import com.project.designapp.requests.RandevuUpdateRequest;
import com.project.designapp.services.RandevuService;

@RestController
@RequestMapping("/api/v1/randevular")
public class RandevuController {
	RandevuService randevuService;

	public RandevuController(RandevuService randevuService) {
		this.randevuService = randevuService;
	}

	@GetMapping
	public List<Randevu> getAllRandevu(){
		return randevuService.getAllRandevu();
	}
	//Hastanın randevularını getirmek için

	
	//Doktorun randevularını getirmek için

	
	@PostMapping 
	public Randevu createRandevu(@RequestBody RandevuCreateRequest newRandevuRequest) {
		return randevuService.createRandevu2(newRandevuRequest);
	}
	
	 @GetMapping("/{randevuId}")
	public Randevu getOneRandevu(@PathVariable Long randeuvId) {
		return randevuService.getOneRandevu(randeuvId);
	}
	 
	@PutMapping("/{randevuId}")
	public Randevu updateOneFatura(@PathVariable Long randevuId,@RequestBody RandevuUpdateRequest randevuUpdate) {
		 return randevuService.updateOneFatura(randevuId,randevuUpdate);
	}
	   
    @DeleteMapping("/{randevuId}")
    public void deleteOneRandevu(@PathVariable Long randevuId) {
    	randevuService.deleteOneFatura(randevuId);
	}	 
	
	
	
}
