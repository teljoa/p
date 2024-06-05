package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiciosClima {
	
	public static String toCsv(List<Registro> registros) {
		StringBuilder sb=new StringBuilder("fecha,tmed,prec,tmin,tmax\n");
		
		for(Registro r:registros) {
			sb.append(r.toCsv()).append("\n");
		}
		
		return sb.toString();
	}
	
	public static String temperaturaMaxFecha(List<Registro> registros) {
		double tmax=0.0;
		String fecha=null;
		
		for(Registro r:registros) {
			if(r.getTmax()>tmax) {
				tmax=r.getTmax();
				fecha=r.getFecha();
			}
		}
		
		return String.format("%sº es la Tª maxima, y ocurrio el %s.",tmax,fecha);
	}
	
	public static String temperaturaMinFecha(List<Registro> registros) {
		double tmin=1.0;
		String fecha=null;
		
		for(Registro r:registros) {
			if(r.getTmin()<tmin) {
				tmin=r.getTmin();
				fecha=r.getFecha();
			}
		}
		
		return String.format("%sº es la Tª minima, y ocurrio el %s.",tmin,fecha);
	}
	
	public static String temperaturapromedio(List<Registro> registros) {
		double promedio=0.0;
		
		for(Registro r:registros) {
			promedio+=r.getTmed();
		}
		
		return String.format("%sº es la Tª promedio.", promedio/registros.size());
	}
	
	public static List<String> diasDeLLuvia(List<Registro> registros){
		List<String> fechas=new ArrayList<>();
		
		for(Registro r:registros) {
			if(r.getPrec()>0.0) {
				fechas.add(r.getFecha());
			}
		}
		
		return fechas;
	}
	
	public static String precipitacionMax(List<Registro> registros) {
		double preMax=0.0;
		String fecha=null;
		
		for(Registro r:registros) {
			if(r.getPrec()>preMax) {
				preMax=r.getPrec();
				fecha=r.getFecha();
			}
		}
		
		return String.format("%s es la pricipitacion maxima alcanzada, el dia %s.", preMax,fecha);
	}
	public static String periodoSinLluviasMax(List<Registro> registros) {
        int contador = 0;
        List<String> fechas = new ArrayList<>();
        Map<List<String>, Integer> periodos = new HashMap<>();
        
        for (Registro r : registros) {
            if (r.getPrec() == 0.0 && contador == 0) {
                fechas.add(r.getFecha());
                contador++;
            } else if (r.getPrec() == 0.0 && contador != 0) {
                contador++;
            } else {
                fechas.add(r.getFecha());
                periodos.put(new ArrayList<>(fechas), contador);
                fechas.clear();
                contador = 0;
            }
        }
        
        List<String> fechasF = Collections.max(periodos.entrySet(), Map.Entry.comparingByValue()).getKey();
        Integer periodoF = periodos.get(fechasF);
        
        return String.format("Desde el %s hasta el %s, es el periodo mas largo sin lluvias, que hace un total de %s días.", fechasF.get(0), fechasF.get(fechasF.size() - 1), periodoF);
    }
}
