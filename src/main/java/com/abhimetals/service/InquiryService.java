package com.abhimetals.service;

import java.util.List;

import com.abhimetals.entity.Inquiry;

public interface InquiryService {

    Inquiry saveInquiry(Inquiry inquiry);

    List<Inquiry> saveInquirys(List<Inquiry> inquiry);

    List<Inquiry> getInquirys();

    Inquiry getInquiryById(Integer id);

 //   Inquiry getInquiryByInguiryNumber(String InguiryNumber);

    Inquiry updateInquiryById(Inquiry id);

 //   Inquiry updateInquiryByInguiryNumber(Inquiry InguiryNumber);

    String deleteInquiry(Integer id);
}
