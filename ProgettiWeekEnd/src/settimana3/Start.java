package settimana3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import settimana3.Impiegato.Sesso;

public class Start {

	public static void main(String[] args) {
	
		List<Impiegato> lista = new ArrayList<>();
		
		Impiegato a = new Impiegato("Luca", "Binotto", Sesso.M, new BigDecimal(19000));
		Impiegato b = new Impiegato("Ciccio", "Binotto", Sesso.M, new BigDecimal(18000));
		Impiegato c = new Impiegato("Sara", "Binotto", Sesso.F, new BigDecimal(45000));
		Impiegato d = new Impiegato("Albert", "Binotto", Sesso.M, new BigDecimal(60000));
		Impiegato e = new Impiegato("Lucia", "Binotto", Sesso.F, new BigDecimal(18000));
		Impiegato f = new Impiegato("Enza", "Binotto", Sesso.F, new BigDecimal(25000));
		Impiegato g = new Impiegato("Lucio", "Binotto", Sesso.M, new BigDecimal(30000));

		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		lista.add(g);
				
		BigDecimal max = lista.stream().filter(p -> p.getSesso().equals(Sesso.M)).map(Impiegato::getStipendio).max(BigDecimal::compareTo).get();
		BigDecimal min = lista.stream().filter(p -> p.getSesso().equals(Sesso.F)).map(Impiegato::getStipendio).min(BigDecimal::compareTo).get();
		BigDecimal avg = lista.stream().map(Impiegato::getStipendio).reduce((s, next) -> s.add(next)).map(s -> s.divide(BigDecimal.valueOf(lista.size()),RoundingMode.HALF_EVEN)).orElse(BigDecimal.ZERO);
		//BigDecimal moda = lista.stream().map(Impiegato::getStipendio);

		
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);

	}

}
