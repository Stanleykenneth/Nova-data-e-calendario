package date.newapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {

		String dataNasc = "10/05/1982 10:35:23";

		LocalDateTime ldt = LocalDateTime.parse(dataNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")); // Mostra a data e hora de nascimento.
		LocalDateTime now = LocalDateTime.now(); // Mostra a data e a hora atual.
		
		Duration d = Duration.between(ldt, now); // Calcula dura��o de tempo. Between Calcula o intervalo entre os dois valores.
		System.out.println("HORAS: " + d.toHours() );	// Ir� mostrar quantas horas est� vivo.
		System.out.println("Dias: " + d.toDays()); // Ir� mostrar quanto dias a pessoa est� viva.
		
		// A Classe DURATION  mostra a rela��o intervalar curta. EX. Data e horas.
		
		Period p = Period.between(ldt.toLocalDate(), now.toLocalDate());
		System.out.println("MESES: " + p.toTotalMonths()); // Ir� imprimir a quantidasde de meses vivos.
		
		//Calcula semanas		
		System.out.println("SEMANAS: " + ChronoUnit.WEEKS.between(ldt, now)); // Ir� imprimir quantas semanas a pessoa est� viva.
		//Calcula Anos
		System.out.println("ANOS: " + ChronoUnit.YEARS.between(ldt, now)); // Ir� mostrar a idade.
		
	    // Mostrar apenas m�s e ano!		
		YearMonth am = YearMonth.of(2025, 05);
		System.out.println(am); // Essa classe pode ser usada para validar cart�o de credito.
		
		// Mostrar o nome do m�s.
		Month mes = Month.of(5);
		System.out.println(mes);
		
		LocalDate ld = LocalDate.now();
		ld = ld.plusMonths(1); // Soma m�s.
		System.out.println(ld);
	}

}
