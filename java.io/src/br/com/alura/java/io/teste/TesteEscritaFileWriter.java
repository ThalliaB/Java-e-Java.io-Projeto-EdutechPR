package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException{
		
		//Fluxo de Entrada com Arquivo
//	    OutputStream fos = new FileOutputStream("lorem2.txt");
//	    Writer osw = new OutputStreamWriter(fos);
//	    BufferedWriter bw = new BufferedWriter(osw);
	    
		FileWriter fw = new FileWriter("lorem2.txt");		
	    fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	    fw.write(System.lineSeparator());
	    fw.write(System.lineSeparator());
	    fw.write("id est laborum.");
	    
	    
	    fw.close();
	    
	}
	
}
