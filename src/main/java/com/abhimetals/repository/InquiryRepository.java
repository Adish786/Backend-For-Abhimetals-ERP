package com.abhimetals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhimetals.entity.Inquiry;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {

//	Inquiry findByInquiryNumber(String inguiryNumber);

}
