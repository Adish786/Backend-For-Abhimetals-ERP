package com.abhimetals.entity;

import lombok.*;
import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Table(name ="Product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated product ID",name="id",required=true,value="id")
    @Column(nullable=false)
    private Integer id;
    @ApiModelProperty(notes = "Name of the Product",name="name",required=true,value="name")
    @Column(nullable=false)
    private String name;
    @ApiModelProperty(notes = "Category of the Product",name="name",required=true,value="Category")
    @Column(nullable=false)
    private String category;
    @ApiModelProperty(notes = "description of the Product",name="name",value="description")
    private String description;
    @ApiModelProperty(notes = "attachment of the Product",name="name",value="attachment") 
    private File attachment;
    @Column(nullable=false)
    @ApiModelProperty(notes = "grossRate of the Product",name="name",value="grossRate") 
    private Double grossRate;
    @Column(nullable=false)
    @ApiModelProperty(notes = "netwait of the Product",name="name",value="netwait")
    private Double netwait;
 

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public File getAttachment() {
		return attachment;
	}


	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}


	public Double getGrossRate() {
		return grossRate;
	}


	public void setGrossRate(Double grossRate) {
		this.grossRate = grossRate;
	}


	public Double getNetwait() {
		return netwait;
	}


	public void setNetwait(Double netwait) {
		this.netwait = netwait;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", attachment=" + attachment + ", grossRate=" + grossRate + ", netwait=" + netwait + "]";
	}


	public Product(Integer id, String name, String category, String description, File attachment, Double grossRate,
			Double netwait) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.attachment = attachment;
		this.grossRate = grossRate;
		this.netwait = netwait;
	}




}
