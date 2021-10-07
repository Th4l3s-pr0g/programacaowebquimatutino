package aula08;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

public class Contador {

	private static int contagem;
	static ArrayList<String> dts = new ArrayList<>();
	
	
	public static void novoAcesso() {
		contagem += 1;
	}
	
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
	public static Object getDataInicio() {
		return dts.get(0);
		
	}
	
	public static String getDateTime() {
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		dts.add(dateformat.format(date));
		return dateformat.format(date);
	}
	
	public static void main(String [] args) {
		Contador.novoAcesso();
		
	}
}