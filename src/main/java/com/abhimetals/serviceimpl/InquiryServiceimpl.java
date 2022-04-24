package com.abhimetals.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhimetals.entity.Inquiry;
import com.abhimetals.entity.Product;
import com.abhimetals.repository.InquiryRepository;
import com.abhimetals.service.InquiryService;

@Service
public class InquiryServiceimpl implements InquiryService{

	@Autowired
	private InquiryRepository inquiryRepository;
	
	@Override
	public Inquiry saveInquiry(Inquiry inquiry) {
		return inquiryRepository.save(inquiry);
	}

	@Override
	public List<Inquiry> saveInquirys(List<Inquiry> inquiry) {
		return inquiryRepository.saveAll(inquiry);
	}

	@Override
	public List<Inquiry> getInquirys() {
		return inquiryRepository.findAll();
	}

	@Override
	public Inquiry getInquiryById(Integer id) {
		return inquiryRepository.findById(id).orElse(null);
	}
/*
	@Override
	public Inquiry getInquiryByInguiryNumber(String InguiryNumber) {
		return inquiryRepository.findByInquiryNumber();
	}
*/
	@Override
	public Inquiry updateInquiryById(Inquiry id) {
		Inquiry existingInquiry = inquiryRepository.findById(id.getId()).orElse(null);
		existingInquiry.setId(id.getId());
		existingInquiry.setInguiryNumber(id.getInguiryNumber());
		existingInquiry.setResponsiblePerson(id.getResponsiblePerson());
		existingInquiry.setStatus(id.getStatus());
		existingInquiry.setInquiryDate(id.getInquiryDate());
		existingInquiry.setAttachment(id.getAttachment());
		existingInquiry.setInquirySource(id.getInguiryNumber());
        return inquiryRepository.save(existingInquiry);
	}
/*
	@Override
	public Inquiry updateInquiryByInguiryNumber(Inquiry InguiryNumber) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public String deleteInquiry(Integer id) {
		inquiryRepository.deleteById(id);
		return "Inquiry removed !! " + id;
	}

}
