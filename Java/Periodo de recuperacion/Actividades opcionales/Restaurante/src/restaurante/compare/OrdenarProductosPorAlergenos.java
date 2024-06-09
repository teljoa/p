package restaurante.compare;

import java.util.Comparator;

import restaurante.model.Alergeno;
import restaurante.model.Producto;

public class OrdenarProductosPorAlergenos implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		int result = 0;

	    Alergeno alergenoO1 = (o1 != null) ? o1.getAlergeno() : null;
	    Alergeno alergenoO2 = (o2 != null) ? o2.getAlergeno() : null;

	    if (alergenoO1 == null && alergenoO2 == null) {
	        result = 0;
	    } else if (alergenoO1 == null) {
	        result = 1;
	    } else if (alergenoO2 == null) {
	        result = -1;
	    } else {
	        result = alergenoO1.compareTo(alergenoO2);
	    }

	    return result;
	}

}
