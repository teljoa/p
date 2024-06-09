package restaurante.compare;

import java.util.Comparator;

import restaurante.model.Alergeno;
import restaurante.model.Cliente;

public class ObtenerClientesPorAlergiasYedad implements Comparator<Cliente>{
	
	@Override
    public int compare(Cliente c1, Cliente c2) {
		int result = 0;

	    if (c1 == null && c2 == null) {
	        result = 0; 
	    } else if (c1 == null) {
	        result = 1; 
	    } else if (c2 == null) {
	        result = -1;
	    } else {
	        Alergeno alergenoC1 = c1.getAlergeno();
	        Alergeno alergenoC2 = c2.getAlergeno();

	        if (alergenoC1 == null && alergenoC2 == null) {
	            result = 0; 
	        } else if (alergenoC1 == null) {
	            result = 1; 
	        } else if (alergenoC2 == null) {
	            result = -1;
	        } else {
	            int alergenoComparison = alergenoC1.compareTo(alergenoC2);
	            result = (alergenoComparison != 0) ? alergenoComparison : Integer.compare(c1.getEdadActual(), c2.getEdadActual());
	        }
	    }

	    return result;
    }
}
