package br.usjt.hellospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table (name="previsoes")
@ToString @Getter @Setter
public class Dia {
	@Id
	@GeneratedValue
	
//	@Column (name = "i" )
//	@Size (max = 2)
	private Long id;
	
//	@Column(name = "DIA")
//	@Size (max = 3)
	private String dia;

//	
	@OneToOne 
	@JoinColumn (name="pDia_FK")
	private Previsao pDia;

}
