package cgg.springdatajpa.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jpa_product")
public class Product {

	@Id
	private int productId;
	private String productName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cat_prod")
	private List<Category> categories;
}
