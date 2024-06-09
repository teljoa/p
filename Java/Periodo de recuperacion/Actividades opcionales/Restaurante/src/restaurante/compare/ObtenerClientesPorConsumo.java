package restaurante.compare;

import java.util.Comparator;

import restaurante.model.Cliente;

public class ObtenerClientesPorConsumo implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		return Double.compare(o1 != null ? o1.calcularImporteConsumo() : 0, o2 != null ? o2.calcularImporteConsumo() : 0);
	}

}
