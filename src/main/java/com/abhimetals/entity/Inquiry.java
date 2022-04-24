package com.abhimetals.entity;

import java.io.File;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name ="Inquiry")
public class Inquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "id of the Inquiry",name="id",required=true,value="id")
    @Column(nullable=false)
	private Integer id;
    @Column(nullable=false)
    @ApiModelProperty(notes = "Title of the Inquiry",name="title",required=true,value="title")
    private String title;
    @Column(nullable=false)
    @ApiModelProperty(notes = "Inquiry Number of the Inquiry",name="inguiryNumber",required=true,value="inguiryNumber")
	private String inguiryNumber;
    @Column(nullable=false)
    @ApiModelProperty(notes = "Inquiry Date of the Inquiry",name="inquiryDate",required=true,value="inguiryDate")
	private Date inquiryDate;
    @ApiModelProperty(notes = "Inquiry Status of the Inquiry",name="status",value="status")
	private Boolean status;
    @ApiModelProperty(notes = "Inquiry Responsible Person of the Inquiry",name="responsiblePerson",value="responsiblePerson")
	private String responsiblePerson;
    @ApiModelProperty(notes = "Inquiry Source of the Inquiry",name="inquirySource",value="inquirySource")
	private String inquirySource;
    @ApiModelProperty(notes = "Inquiry Allachment File of the Inquiry",name="attachment",value="attachment")
	private File attachment;
	
	public Inquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInguiryNumber() {
		return inguiryNumber;
	}

	public void setInguiryNumber(String inguiryNumber) {
		this.inguiryNumber = inguiryNumber;
	}

	public Date getInquiryDate() {
		return inquiryDate;
	}

	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public String getInquirySource() {
		return inquirySource;
	}

	public void setInquirySource(String inquirySource) {
		this.inquirySource = inquirySource;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	@Override
	public String toString() {
		return "Inquiry [id=" + id + ", title=" + title + ", inguiryNumber=" + inguiryNumber + ", inquiryDate="
				+ inquiryDate + ", status=" + status + ", responsiblePerson=" + responsiblePerson + ", inquirySource="
				+ inquirySource + ", attachment=" + attachment + "]";
	}

	public Inquiry(Integer id, String title, String inguiryNumber, Date inquiryDate, Boolean status,
			String responsiblePerson, String inquirySource, File attachment) {
		super();
		this.id = id;
		this.title = title;
		this.inguiryNumber = inguiryNumber;
		this.inquiryDate = inquiryDate;
		this.status = status;
		this.responsiblePerson = responsiblePerson;
		this.inquirySource = inquirySource;
		this.attachment = attachment;
	}

	
	
}
