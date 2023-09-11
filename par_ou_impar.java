package treinamento04092023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//DESCOBIR SE É PAR OU ÍMPAR
		
Scanner scan = new Scanner(System.in);
	
System.out.println("Digite o valor: ");
int valor = scan.nextInt();
if(valor %2==0) {	
System.out.println("Esse número é Par");	
}else {
System.out.println("Esse número é Ímpar");
	}	
//DESCOBRIR SE PODE VOTAR

System.out.println("Digite a idade do eleitor: ");
int idade = scan.nextInt();

if(idade < 16)	{
System.out.println("Não pode votar");
}else if (idade < 18 && idade >= 16 || idade >= 65 ) {
System.out.println("Voto Facultativo");
}else {
System.out.println("Deve votar!");
}


	}
	
}
	