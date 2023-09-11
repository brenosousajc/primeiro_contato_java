package exercicioaula00;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);

//Crie um programa que leia o nome do usuário e imprima uma saudação personalizada: 
//"Olá, [nome do usuário]! Bem-vindo ao nosso programa!".

System.out.println("Escreva o seu nome: ");
String nome = scan.nextLine();
System.out.println("Olá, " + nome + "! Bem-vindo ao nosso programa");

//Crie um programa que leia o preço de dois produtos e imprima o valor total da compra.
	
double preco_1 = 25.90;
double preco_2 = 14.80;
System.out.println("A soma dos preços é: " + (preco_1 + preco_2));
		
//Crie um programa que leia a distância percorrida por um carro (em km) e o tempo gasto (em horas) e imprima a velocidade média do carro.

System.out.println("Digite a distância percorrida em Km: ");
double distancia = scan.nextDouble();
System.out.println("Digite o tempo gasto em horas: ");
double tempo = scan.nextDouble();
double velocidade_media = distancia / tempo;
System.out.println("Sua velocidade média foi de: " + velocidade_media + " Km/h");

//Crie um programa que leia o número de horas trabalhadas por um funcionário e o valor da hora de trabalho e imprima o salário bruto desse funcionário.
	
System.out.println(" Digite a quantidade de horas trabalhadas no mês: ");
double horas_trabalhadas = scan.nextDouble();
System.out.println(" Digite o valor por hora trabalhada: ");
double valor_hora = scan.nextDouble();
System.out.println("Seu salário bruto será de: R$ " + (horas_trabalhadas * valor_hora));

//Crie um programa que leia o valor de um empréstimo, a taxa de juros mensal e o número de meses e imprima o valor da parcela mensal do empréstimo.

System.out.println("Digite o valor do empréstimo: ");
double valor_emprestimo = scan.nextDouble();
double taxa_juros = 1.03; // 3% AO MÊS
System.out.println("Digite a quantidade de meses");
double n_meses = scan.nextDouble();
double valor_parcela = (valor_emprestimo / n_meses)*taxa_juros;
System.out.println("O valor da parcela será de: R$ " + (valor_parcela));

//Crie um programa que leia a quantidade de litros de água consumidos por uma residência em um mês e imprima o valor da conta de água (considerando que cada litro de água custa R$0,02).

System.out.println("Digite a quantidade de água utilizada no mês em Litros: ");
double consumo = scan.nextDouble();
double valor_litro = 0.02;
double valor_conta = consumo * valor_litro;
System.out.println("O valor da sua conta será de R$: " + valor_conta);

//Crie um programa que leia o peso de uma encomenda (em kg) e imprima o valor do frete (considerando que cada kg custa R$5,00).

System.out.println("Digite o peso da encomenda em Kg: ");
double peso_encomenda = scan.nextDouble();
double valor_kg = 5.00;
double valor_frete = peso_encomenda * valor_kg;
System.out.println("O valor do frete será de: R$ " + valor_frete);

//Crie um programa que leia a cotação do dólar e um valor em reais e imprima o valor convertido em dólares.

System.out.println("Digite o valor em reais: ");
double valor_real = scan.nextDouble();
System.out.println("Digite o valor da cotação do dólar: ");
double cotacao_dolar = scan.nextDouble();
System.out.println("O valor em dólar é de: $ " + (valor_real / cotacao_dolar));

// Crie um programa que leia a altura e largura de uma parede (em metros) e imprima a área da parede e a quantidade de tinta necessária para pintá-la (considerando que cada litro de tinta pinta 2m²).
	
System.out.println("Digite a largura da parede em metros: ");
double largura = scan.nextDouble();
System.out.println("Digite a altura da parede em metros: ");
double altura = scan.nextDouble();
double area = largura * altura;
int rendimento_tinta = 2;
System.out.println("A quantidade necessária de tinta será de: " + (area / rendimento_tinta) + " litros");

//Crie um programa que leia o preço à vista de um produto e o número de parcelas e imprima o valor de cada parcela (considerando juros de 2% ao mês).
	
System.out.println("Digite o preço do produto à vista: ");
double preco_avista = scan.nextDouble();
System.out.println("Digite a quantidade de parcelas: ");
int num_parcelas = scan.nextInt();
double taxa = 1.02;
System.out.println("O valor das parcelas será de: R$ " + (preco_avista / num_parcelas * taxa));



	}

}
