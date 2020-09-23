package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "signos")
public class Signos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_paciente"))
	private Paciente paciente;
	
	@Column(name ="fecha", nullable = false)
	private LocalDateTime fecha;
	
	@Column(name ="temperatura", nullable = false)
	private double temperatura;
	
	@Column(name = "ritmo_respiratorio", nullable = true)
	private double ritmoRespiratorio;
	
	@Column(name = "pulso", nullable = true)
	private String pulso;
	
	

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public Integer getIdSigno() {
		return idSigno;
	}

	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getRitmoRespiratorio() {
		return ritmoRespiratorio;
	}

	public void setRitmoRespiratorio(double ritmoRespiratorio) {
		this.ritmoRespiratorio = ritmoRespiratorio;
	}
	
	
	

}
