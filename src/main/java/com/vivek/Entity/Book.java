package com.vivek.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book_Details")
public class Book {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	@CreationTimestamp
	@Column(name="creae_date" ,updatable = false)
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name="update_date",insertable = false)
	private LocalDateTime updateDate;

}
