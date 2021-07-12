package settimana3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import settimana3.Impiegato.Sesso;

public class ListaImpiegati {

	private List<Impiegato> lista = new ArrayList<>();

	public ListaImpiegati() {

	}

	public void add(Impiegato a) {
		lista.add(a);
	}

	public BigDecimal maxMen() {
		return lista.stream().filter(p -> p.getSesso().equals(Sesso.M)).map(Impiegato::getStipendio)
				.max(BigDecimal::compareTo).get();
	}

	public BigDecimal minWomen() {
		return lista.stream().filter(p -> p.getSesso().equals(Sesso.F)).map(Impiegato::getStipendio)
				.min(BigDecimal::compareTo).get();
	}

	public BigDecimal average() {
		return lista.stream().map(Impiegato::getStipendio).reduce((s, next) -> s.add(next))
				.map(s -> s.divide(BigDecimal.valueOf(lista.size()), RoundingMode.HALF_EVEN)).orElse(BigDecimal.ZERO);
	}

	public BigDecimal mode() {
		Map<BigDecimal, Integer> ripetiz = new HashMap<>();
		List<BigDecimal> stipendi = lista.stream().map(i -> i.getStipendio()).collect(Collectors.toList());

		for (BigDecimal bd : stipendi) {
			if (ripetiz.containsKey(bd)) {
				Integer value = ripetiz.get(bd) + 1;
				ripetiz.put(bd, value);
			} else {
				ripetiz.put(bd, 1);
			}
		}

		var mode = ripetiz.entrySet().stream().max((a1, a2) -> a1.getValue() - a2.getValue()).map(a -> a.getKey())
				.get();

		return mode;
	}

	public String getPoveriMenName() {

		String nomi = lista.stream().filter(p -> p.getSesso().equals(Sesso.M)).filter(i -> ListaImpiegati.compareBigDecimal(i.getStipendio(), BigDecimal.valueOf(2000)))
				.map(i -> i.getNome()).collect(Collectors.joining("#"));

		return nomi;
	}

	public BigDecimal mediana() {
		
		Stream<BigDecimal> ordinati = lista.stream().map(x -> x.getStipendio()).sorted((d1,d2) -> d1.compareTo(d2));
		
		BigDecimal mediana = lista.size()%2 == 0 ?
				ordinati.skip(lista.size()/2-1).limit(2).reduce((s, next) -> s.add(next)).map(s -> s.divide(BigDecimal.valueOf(2), RoundingMode.HALF_EVEN)).get():
				ordinati.skip(lista.size()/2).findFirst().get();
				
		return mediana;
	}
	
	private static boolean compareBigDecimal(BigDecimal a, BigDecimal b) {

		if (a.compareTo(b) == -1 || a.compareTo(b) == 0) {
			return true;
		}
		return false;

	}

}
