package org.danicv.aerolinea.modelo;

import java.util.Date;

public class Vuelo {
	private String nombre;
	private String origen;
	private String destino;
	private Date fechaHora;
	private Integer cantPersona;

	public Vuelo(String nombre, String origen, String destino, Date fechaHora, Integer cantPersona) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.fechaHora = fechaHora;
		this.cantPersona = cantPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Integer getCantPersona() {
		return cantPersona;
	}

	public void setCantPersona(Integer cantPersona) {
		this.cantPersona = cantPersona;
	}

	@Override
	public String toString() {
		return "\nVuelo = " + nombre + ", origen = " + origen + ", destino = " + destino + ", fechaHora = " + fechaHora
				+ ", Num pasajeros = " + cantPersona;
	}

}
