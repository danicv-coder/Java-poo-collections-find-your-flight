package org.danicv.aerolinea.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		DateFormat dateform = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		List<Vuelo> registro = new ArrayList<>();
		registro.add(new Vuelo("AAL 933", "New York", "Santiago", dateform.parse("2021-09-7 16:02"), 62));
		registro.add(new Vuelo("LAT 755", "Sao Paulo", "Sao Paulo", dateform.parse("2021-09-6 23:02"), 47));
		registro.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", dateform.parse("2021-09-7 22:02"), 52));
		registro.add(new Vuelo("DAL 147", "Atlanta", "Santiago", dateform.parse("2021-09-5 21:02"), 59));
		registro.add(new Vuelo("AVA 241", "Bogota", "Santiago", dateform.parse("2021-09-5 20:02"), 25));
		registro.add(new Vuelo("AMX 10", "Mexico City", "Santiago", dateform.parse("2021-09-7 16:02"), 29));
		registro.add(new Vuelo("IBE 6833", "Londres", "Santiago", dateform.parse("2021-09-9 18:02"), 55));
		registro.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", dateform.parse("2021-09-7 19:02"), 51));
		registro.add(new Vuelo("SKU 803", "Lima", "Santiago", dateform.parse("2021-09-7 17:02"), 48));
		registro.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", dateform.parse("2021-09-7 15:02"), 59));
		registro.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", dateform.parse("2021-09-7 14:02"), 31));
		registro.add(new Vuelo("CMP 111", "Panama City", "Santiago", new Date(), 29));
		registro.add(new Vuelo("LAT 705", "Madrid", "Santiago", dateform.parse("2021-09-7 4:02"), 47));
		registro.add(new Vuelo("AAL 957", "Miami", "Santiago", dateform.parse("2021-09-7 13:02"), 6));
		registro.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago",dateform.parse("2021-09-7 9:02"), 32));
		registro.add(new Vuelo("LAT 1283", "Cancún", "Santiago", dateform.parse("2021-09-7 6:02"), 35));
		registro.add(new Vuelo("LAT 579", "Barcelona", "Santiago", dateform.parse("2021-09-7 5:02"), 61));
		registro.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", dateform.parse("2021-09-7 14:02"), 58));
		registro.add(new Vuelo("LAT 501", "París", "Santiago", dateform.parse("2021-09-7 4:02"), 49));
		registro.add(new Vuelo("LAT 405", "Montevideo", "Santiago", dateform.parse("2021-09-7 2:02"), 39));

		Collections.sort(registro);
		System.out.println(registro);
		Vuelo ultimoVuelo = registro.get(19);
		System.out.println("\nEl utlimo vuelo en llegar es: " + ultimoVuelo.getNombre() + ", " + ultimoVuelo.getOrigen()
				+ ", " + "Aterriza el: " + ultimoVuelo.getFechaHora());

		System.out.println("");
		registro.sort((a, b) ->(b.getCantPersona()).compareTo(a.getCantPersona()));
		Vuelo cantMenorPasajeros = new LinkedList<>(registro).peekLast();
		System.out.println("EL vuelo con menor numero de pasajeros es: " + cantMenorPasajeros.getNombre() + "," + " "
				+ cantMenorPasajeros.getOrigen() + ", " + " numero de pasajeros: "
				+ cantMenorPasajeros.getCantPersona());

	}

}
