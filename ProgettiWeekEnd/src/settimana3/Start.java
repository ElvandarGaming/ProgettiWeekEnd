package settimana3;

import java.math.BigDecimal;

import settimana3.Impiegato.Sesso;

public class Start {

	public static void main(String[] args) {
		
		ListaImpiegati lista = new ListaImpiegati();
		
		Impiegato a = new Impiegato("Luca", "Binotto", Sesso.M, new BigDecimal(2800));
		Impiegato b = new Impiegato("Ciccio", "Binotto", Sesso.M, new BigDecimal(3216.5));
		Impiegato c = new Impiegato("Sara", "Binotto", Sesso.F, new BigDecimal(1999));
		Impiegato d = new Impiegato("Albert", "Binotto", Sesso.M, new BigDecimal(1800));
		Impiegato e = new Impiegato("Lucia", "Binotto", Sesso.F, new BigDecimal(2600));
		Impiegato f = new Impiegato("Enza", "Binotto", Sesso.F, new BigDecimal(4000));
		Impiegato g = new Impiegato("Lucio", "Binotto", Sesso.M, new BigDecimal(1800));
		Impiegato u = new Impiegato("Lorenz", "Farhad", Sesso.M, new BigDecimal(1400));
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		lista.add(g);
		lista.add(u);
		
		BigDecimal max = lista.maxMen();
		BigDecimal min = lista.minWomen();
		BigDecimal avg = lista.average();;
		BigDecimal mode = lista.mode();
		BigDecimal mediana = lista.mediana();
		String poveri = lista.getPoveriMenName();
		
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		System.out.println(mode);
		System.out.println(mediana);
		System.out.println(poveri);
		
		
	}

}
