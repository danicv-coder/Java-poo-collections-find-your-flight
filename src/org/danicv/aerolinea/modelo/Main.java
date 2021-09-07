package org.danicv.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vuelo> registro = new ArrayList<>();
		registro.add(new Vuelo("AAL 933", "New York", "Santiago", new Date(), 62));
		registro.add(new Vuelo("LAT 755", "Sao Paulo", "Sao Paulo", new Date(), 47));
		registro.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", new Date(), 52));
		registro.add(new Vuelo("DAL 147", "Atlanta", "Santiago", new Date(), 59));
		registro.add(new Vuelo("AVA 241", "Bogota", "Santiago", new Date(), 25));
		registro.add(new Vuelo("AMX 10", "Mexico City", "Santiago", new Date(), 29));
		registro.add(new Vuelo("IBE 6833", "Londres", "Santiago", new Date(), 55));
		registro.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", new Date(), 51));
		registro.add(new Vuelo("SKU 803", "Lima", "Santiago", new Date(), 48));
		registro.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", new Date(), 59));
		registro.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", new Date(), 31));
		registro.add(new Vuelo("CMP 111", "Panama City", "Santiago", new Date(), 29));
		registro.add(new Vuelo("LAT 705", "Madrid", "Santiago", new Date(), 47));
		registro.add(new Vuelo("AAL 957", "Miami", "Santiago", new Date(), 6));
		registro.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", new Date(), 32));
		registro.add(new Vuelo("LAT 1283", "Cancún", "Santiago", new Date(), 35));
		registro.add(new Vuelo("LAT 579", "Barcelona", "Santiago", new Date(), 61));
		registro.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", new Date(), 58));
		registro.add(new Vuelo("LAT 501", "París", "Santiago", new Date(), 49));
		registro.add(new Vuelo("LAT 405", "Montevideo", "Santiago", new Date(), 39));
		System.out.println(registro);

	}

}
