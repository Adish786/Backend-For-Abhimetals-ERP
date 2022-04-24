package com.abhimetals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhimetals.entity.Customer;
import com.abhimetals.entity.Inquiry;
import com.abhimetals.service.CustomerService;
import com.abhimetals.service.InquiryService;

@RestController
public class InquiryController {

	   @Autowired
	    private InquiryService service;

	    @RequestMapping(value = "/addInquiry",method = RequestMethod.POST)
	    public Inquiry addInquiry(@RequestBody Inquiry inquiry) {
	        return service.saveInquiry(inquiry);
	    }

	    @RequestMapping(value = "/addInquirys",method = RequestMethod.POST)
	    public List<Inquiry> addInquirys(@RequestBody List<Inquiry> inquirys) {
	        return service.saveInquirys(inquirys);
	    }

	    @RequestMapping(value = "/inquirys",method = RequestMethod.GET)
	    public List<Inquiry> findAllInquirys() {
	        return service.getInquirys();
	    }

	    @RequestMapping(value = "/inquiryById/{id}",method = RequestMethod.GET)
	    public Inquiry findInquiryById(@PathVariable Integer id) {

	        return service.getInquiryById(id);
	    }
	/*
	    @RequestMapping(value = "/inquiry/{InquiryNumber}",method = RequestMethod.GET)
	    public Inquiry findInquiryByInquiryNumber(@PathVariable String InquiryNumber) {
	        return service.getInquiryByInquiryNumber(InquiryNumber);
	    }
	*/
	    @RequestMapping(value = "/inquiryupdate",method = RequestMethod.PUT)
	    public Inquiry updateInquiry(@RequestBody Inquiry id) {

	        return service.updateInquiryById(id);
	    }

	    @RequestMapping(value = "/deleteInquiry/{id}",method = RequestMethod.DELETE)
	    public String deleteInquiry(@PathVariable Integer id) {

	        return service.deleteInquiry(id);
	    }

}

