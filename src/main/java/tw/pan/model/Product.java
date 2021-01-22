package tw.pan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name="product")
@Data
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id @Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	
	@Column(name="p_name")
	@NotNull
	private String p_name;
	
	@Column(name="p_main")
	@NotNull
	private String p_main;
	
	@Column(name="p_detail")
	private String p_detail;
	
	@Column(name="price")
	@NotNull
	private int price;
	
	@Column(name="invantory")
	@NotNull
	private int invantory;
	
	@Column(name="description")
	private String description;
	
	@Column(name="s_description")
	private String s_description;
	
	@Column(name="p_img")
	@NotNull
	private String p_img;
	
	@Column(name="user_acc")
	@NotNull
	private String user_acc;
}
