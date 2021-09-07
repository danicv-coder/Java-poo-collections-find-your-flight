package org.danicv.aerolinea.modelo;

import java.util.Date;

public class Vuelo implements Comparable<Vuelo> {
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

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public Integer getCantPersona() {
		return cantPersona;
	}

	@Override
	public String toString() {
		return "\nVuelo = " + nombre + ", origen = " + origen + ", destino = " + destino + ", fechaHora = " + fechaHora
				+ ", Num pasajeros = " + cantPersona;
	}

	@Override
	public int compareTo(Vuelo o) {

		return this.fechaHora.compareTo(o.fechaHora);
	}

}
