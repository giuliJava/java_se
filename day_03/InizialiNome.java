package day_03;
/*
 *  Scrivere le iniziali del proprio nome
 *  
 * Scrivere un programma che visualizzi sullo schermo del terminale le vostre iniziali grandi e centrate composta da molti caratteri uguali. 
 */

public class InizialiNome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String inizialeNome = "G";
        //String inizialeCognome = "V";
        
        //-------------------------------------------------- LETTERA COGNOME
        //prima riga 
        for(int i = 0; i < 7; i++) {
        	System.out.print(inizialeNome);	//GGGGGGG
        }	
        
        //seconda riga
        System.out.println();//vado a capo
        System.out.print(inizialeNome);//G
        System.out.println();//vado a capo
        
        //terza riga
        System.out.print(inizialeNome);//G
        for(int i = 0; i < 4; i++) {
        	System.out.print(" ");//stampo 4 spazi
        }
        System.out.print(inizialeNome);	//G
        System.out.print(inizialeNome);	//G
        
        //quarta riga
        System.out.println();//vado a capo
        System.out.print(inizialeNome);	//Stampo G all'inizio della riga
        for(int i = 0; i < 5; i++) {
        	System.out.print(" ");//5 
        }
        System.out.print(inizialeNome);	//G
        
        //quinta riga
        System.out.println();//vado a capo
        for(int i = 0; i < 7; i++) {
        	System.out.print(inizialeNome);	
        }
          
        
	}

}
