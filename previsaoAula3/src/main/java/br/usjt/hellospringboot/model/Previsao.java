package br.usjt.hellospringboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="previsoes")
public class Previsao implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
//	@Column (name = "id" )
//	@Size (max = 2)
	private Long id;
	
	// private String dia;
//	@Column (name = "Min" )
//	@Size (max = 3)
	private Double Min;
	
//	@Column (name = "Max" )
//	@Size (max = 3)
	private Double Max;
	
//	@Column (name = "hum" )
//	@Size (max = 3)
	private Double hum;
	
//	@Column (name = "des" )
//	@Size (max = 3)
	private String des;
	
//	@Column (name = "data" )
//	@Size (max = 3)
	private String data;
	
//	@Column (name = "hora" )
//	@Size (max = 3)
	private Double hora;
	
//	@Column (name = "latitude" )
//	@Size (max = 3)
	private Double latitude;
	
//	@Column (name = "longitude" )
//	@Size (max = 3)
	private Double longitude;



	@OneToOne (optional=false)
	@JoinColumn (name = "id_dia")
	private Dia pDia;
	


	
	
}
