package com.appservice.Model;

import lombok.Data;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Data
@ToString
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
}
