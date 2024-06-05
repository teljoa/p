package main.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.json.JsonReader;
import main.java.json.JsonWriter;
import main.java.model.Registro;
import main.java.model.ServiciosClima;

public class AppPrincipal {
	
	private static final String Registros_JSON = "C:\\Users\\Usuario\\Downloads\\registroClima.json";
	
	public static void main(String[] args) {
		try {
			List<Registro> registros = new JsonReader().cargarDocumentoRegistros(Registros_JSON);
			System.out.println("Listado de registros");
			registros.forEach(System.out::println);
			
			System.out.println("");
			System.out.println(ServiciosClima.temperaturaMaxFecha(registros));
			
			System.out.println("");
			System.out.println(ServiciosClima.temperaturaMinFecha(registros));
			
			System.out.println("");
			System.out.println(ServiciosClima.temperaturapromedio(registros));
			
			System.out.println("");
			System.out.println("Dias de lluvia");
			
			System.out.println("");
			ServiciosClima.diasDeLLuvia(registros).forEach(System.out::println);
			
			System.out.println("");
			System.out.println(ServiciosClima.precipitacionMax(registros));
			
			System.out.println("");
			System.out.println(ServiciosClima.periodoSinLluviasMax(registros));
			
			System.out.println("");
			System.out.println("Formato Csv");
			System.out.println(ServiciosClima.toCsv(registros));
			
			JsonReader escritor=new JsonReader();
			escritor.introduccirDatosEnFicheroJson("C:\\Users\\Usuario\\Downloads\\registroClima.csv", registros);
			
		} catch (JsonSyntaxException | JsonIOException | IOException e) {
			e.printStackTrace();
		}
	}

}
