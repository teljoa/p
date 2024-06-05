package main.java.json;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.model.Registro;
import main.java.model.ServiciosClima;

public class JsonReader {
	
	public List<Registro> cargarDocumentoRegistros(String path ) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			List<Registro> result = new ArrayList<>();
			result.addAll(Arrays.asList(gson.fromJson(new FileReader(new File(path)), Registro[].class)));
			
			return result;
	}
	
	public void introduccirDatosEnFicheroJson(String ruta,List<Registro> registros) throws IOException {
		File fichero=new File(ruta);
		fichero.createNewFile();
		FileWriter fw=new FileWriter(fichero);
		
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(ServiciosClima.toCsv(registros));
		fw.close();
	}
}
