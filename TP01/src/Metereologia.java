import java.util.Scanner; //leitura de dados

public class Metereologia {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcoesMenu, mes, ano;
		
		do{
	        System.out.print("_____________________________________\n");
	        System.out.print("   Sistema de dados de temperatura \n");
	        System.out.print("_____________________________________\n");
	        System.out.print("*Menu(opcoes): \n");
	        System.out.print("");
	        System.out.print("   (1) Entrada das temperaturas; \n");
	        System.out.print("   (2) Calculo  da  temperatura  media; \n");
	        System.out.print("   (3) Calculo  da  temperatura  minima; \n");
	        System.out.print("   (4) Calculo  da  temperatura  maxima; \n");
	        System.out.print("   (5) Relatorio meteorologicos; \n");
	        System.out.print("   (6) Finalizar programa. \n");
	        System.out.print("\n");
	        System.out.print("*Digite o numero escolhido: ");
	        
	        
	        opcoesMenu = input.nextInt();

	        while((opcoesMenu < 1) || (opcoesMenu > 6)){
	        	System.out.print("Por favor, escolha uma das opcoes(1 a 6).\n");
	        	System.out.print("*Digite o numero escolhido: ");
	        	opcoesMenu = input.nextInt();
	        }

	        switch(opcoesMenu){
	        case 1 : //___________________________________________ Opcao 1 do Menu
	        	System.out.print("__________________________________\n");
	        	System.out.print("   (1) Entrada das temperaturas; \n");
	        	System.out.print("__________________________________\n");
	        	System.out.print("\n");
	        	cadastrarTemperatura();
	            break;
	        case 2: //___________________________________________ Opcao 2 do Menu
	        	System.out.print("_________________________________________\n");
	        	System.out.print("   (2) Calculo  da  temperatura  media; \n");
	        	System.out.print("_________________________________________\n");
	        	System.out.print("\n");
	        	
	        	System.out.print("Digite o mes ( 1 - 12 ) : ");
		    	mes = input.nextInt();
		    	System.out.print("Insira o ano (2011-2020): ");
		    	ano = input.nextInt();
	        	temperaturaMedia(mes, ano);
	            break;
	        case 3 : //___________________________________________ Opcao 3 do Menu
	        	System.out.print("__________________________________________\n");
	        	System.out.print("   (3) Calculo  da  temperatura  minima; \n");
	        	System.out.print("__________________________________________\n");
	        	System.out.print("\n");
	        	
	        	System.out.print("Digite o mes ( 1 - 12 ) : ");
		    	mes = input.nextInt();
		    	System.out.print("Insira o ano (2011-2020): ");
		    	ano = input.nextInt();
	        	temperaturaMin(mes, ano);
	            break;
	        case 4 : //___________________________________________ Opcao 4 do Menu
	        	System.out.print("__________________________________________\n");
	        	System.out.print("   (4) Calculo  da  temperatura  maxima; \n");
	        	System.out.print("__________________________________________\n");
	        	System.out.print("\n");
	        	
	        	System.out.print("Digite o mes ( 1 - 12 ) : ");
		    	mes = input.nextInt();
		    	System.out.print("Insira o ano (2011-2020): ");
		    	ano = input.nextInt();
	        	temperaturaMax(mes, ano);
	            break;
	        case 5 : //___________________________________________ Opcao 5 do Menu
	        	System.out.print("_________________________________\n");
	        	System.out.print("   (5) Relatorio meteorologico; \n");
	        	System.out.print("_________________________________\n");
	        	System.out.print("\n");
	        	
	        	System.out.print("Digite o mes ( 1 - 12 ) : ");
		    	mes = input.nextInt();
		    	System.out.print("Insira o ano (2011-2020): ");
		    	ano = input.nextInt();
	        	relatorio(mes, ano);
	            break;
	        case 6 : //___________________________________________ Opcao 6 do Menu
	        	System.out.print("_____________________________\n");
	        	System.out.print("   (6) Finalizar programa. \n");
	        	System.out.print("_____________________________\n");
	        	System.out.print("Programa terminado. \n");
	        	System.out.print("Obrigado por utiliza-lo. :D \n");
	        	System.out.print("\n");
	        	System.out.print("________________________________________\n");
	        	System.out.print("|            Copyright 2021            |\n");
	        	System.out.print("|      by Jose Luis Ramos Teixeira     |\n");
	        	System.out.print("________________________________________\n");
	        	System.out.print("\n");
	            break;
	       
	        }
	        
	    }while(opcoesMenu != 6);


	}


public static void cadastrarTemperatura() {                 //___________________________________________ Opcao 1 do Menu
	
	
} 
public static void temperaturaMedia(int mes, int ano) {     //___________________________________________ Opcao 2 do Menu
	
	
}
public static void temperaturaMin(int mes, int ano) {       //___________________________________________ Opcao 3 do Menu
	
	
}
public static void temperaturaMax(int mes, int ano) {       //___________________________________________ Opcao 4 do Menu
	
	
}
public static void relatorio(int mes, int ano) {            //___________________________________________ Opcao 5 do Menu
	
	
}

}

