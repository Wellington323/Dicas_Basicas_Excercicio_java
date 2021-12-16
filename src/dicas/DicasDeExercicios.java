package dicas;

import java.util.Locale;

public class DicasDeExercicios {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		
		System.out.println(x);
		
		System.out.println(y);
		
		// DELIMITAR PADROES DA CASA DECIMAIS,SERVE PRA COLOCAR NUMERO  COM VIRGULA 10,35 DE 10.35784 E AREDONDA O NUMERO
		System.out.printf("%.2f%n" ,x);
		
		// SERVE PARA COLOCAR COM QUATRO CAS DECIMAIS SO TROCAR %2% PARA %4%
		System.out.printf("%4f%n", x);
		
		// SEM QUEBRA DE LINHA 
       System.out.print("Olá mundo");
                                                                                                              
       //COM QUEBRA DE LINHA
       System.out.println(" Tudo Bem ?");
       
       // SERVE PARA COLOCAR PONTO NAS CASA DECIMAIS E LOCALIZAR O NOSSO PROGRAMA 
       Locale.setDefault(Locale.US);
       System.out.printf("%4f%n", x);
       
       //PARA CONCATENAR VARIOS ELEMENTO(JUNTAR) EX: System.out.println("RESUTADO=" + X +"METROS);
       System.out.println("RESULTADO = " + x + " METROS");
       
       // SERVE PARA CONCATENAR VARIOS ELEMENTOS COM DUAS CASAS DECIMAIS
       System.out.printf("RESULTADO =  %.2f metros%n ", x);
       
       
       String  nome = "maria";
       Integer idade = 31 ;
       double renda = 4000.0 ;
       
       //SERVE PARA JUNTAR AS FASES E TEXTO E NUMEROS JUNTOS
       System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
       
		
	}

}
