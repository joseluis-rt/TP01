import java.util.Scanner; //leitura de dados

public class Metereologia {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcoesMenu;
		
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

	        while((opcoesMenu < 1) || (opcoesMenu > 7)){
	        	System.out.print("Por favor, escolha uma das opcoes(1 a 7).\n");
	        	System.out.print("*Digite o numero escolhido: ");
	        	opcoesMenu = input.nextInt();
	        }

	        switch(opcoesMenu){
	        case 1 : //___________________________________________ Opcao 1 do Menu
	        	System.out.print("______________________________\n");
	        	System.out.print("   (1) Entrada das temperaturas; \n");
	        	System.out.print("______________________________\n");
	        	System.out.print("\n");
	            break;
	        case 2: //___________________________________________ Opcao 2 do Menu
	        	System.out.print("_______________________________\n");
	        	System.out.print("   (2) Calculo  da  temperatura  media; \n");
	        	System.out.print("_______________________________\n");
	        	System.out.print("\n");
	            break;
	        case 3 : //___________________________________________ Opcao 3 do Menu
	        	System.out.print("____________________________\n");
	        	System.out.print("   (3) Calculo  da  temperatura  minima; \n");
	        	System.out.print("____________________________\n");
	        	System.out.print("\n");
	            break;
	        case 4 : //___________________________________________ Opcao 4 do Menu
	        	System.out.print("___________________________________________\n");
	        	System.out.print("   (4) Calculo  da  temperatura  maxima; \n");
	        	System.out.print("___________________________________________\n");
	        	System.out.print("\n");
	            break;
	        case 5 : //___________________________________________ Opcao 5 do Menu
	        	System.out.print("_______________________________\n");
	        	System.out.print("   (5) Relatorio meteorologico; \n");
	        	System.out.print("_______________________________\n");
	        	System.out.print("\n");
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

}
