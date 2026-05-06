package primeiroProjetoParaExplicarProsMeusPais;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Para mudar a cor do texto
		String azul = "\u001B[34m";
		String vermelho = "\u001B[31m";
		String verde = "\u001B[32m";
		String roxo = "\u001B[35m";
		String reset = "\u001B[0m";

		// Aqui começa o Questionario
		System.out.print("Qual é o seu nome? ");
		String nome = sc.nextLine();
		System.out.println("Qual é a sua função na casa? por exemplo: Pai, Mãe, filho(a) etc.");
		String funcaoCasa = sc.nextLine();
		System.out.println("Então seu nome é " + azul + nome + reset + " e você é o(a) " + azul + funcaoCasa + reset);

		System.out.println("qual é a sua idade? ");
		int idade = sc.nextInt();
		System.out.println("Qual é o seu peso? ");
		double peso = sc.nextDouble();
		System.out.println("Qual sua altura? " + vermelho + "(em metros) " + reset);
		double altura = sc.nextDouble();
		System.out.println("Você mede " + azul + altura + reset + "metros");
		System.out.println("você tem " + azul + idade + reset + " anos e pesa " + azul + peso + reset + " Kg.");

		System.out.println("Quando você começa a trabalhar" + vermelho + "(HH.mm)? " + reset);
		double inicioTrabalho = sc.nextDouble();
		System.out.println("Quando vc sai do trabalho" + vermelho + "(HH.mm)? " + reset);
		double fimTrabalho = sc.nextDouble();
		double horarioTrabalho;
		if (fimTrabalho >= inicioTrabalho) {
			horarioTrabalho = fimTrabalho - inicioTrabalho;
		} else {
			horarioTrabalho = (24 - inicioTrabalho) + fimTrabalho;
		}
		System.out.println("Você trabalha " + azul + horarioTrabalho + reset + " horas.");

		// validar resposta do IMC
		String resposta;

		System.out.print("\nDeseja calcular seu IMC? " + vermelho + "(sim/nao): " + reset);
		resposta = sc.next();

		while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("nao")) {

			System.out.println("Resposta inválida! Digite apenas 'sim' ou 'nao'.");
			resposta = sc.next();
		}
		double IMC = peso / Math.pow(altura, 2.0);

		if (resposta.equalsIgnoreCase("sim")) {
			System.out.println("Seu IMC é: " + azul + IMC + reset);

			if (IMC < 18.5) {
				System.out.println(azul + "Abaixo do peso" + reset);
			} else if (IMC < 25) {
				System.out.println(azul + "Peso normal" + reset);
			} else if (IMC < 30) {
				System.out.println(azul + "Sobrepeso" + reset);
			} else {
				System.out.println(azul + "Obesidade" + reset);
			}

		} else {
			System.out.println("Tudo bem, não vou calcular o IMC.");
		}
		if (IMC < 18.5 || IMC >= 25) {
		    double pesoMin = 18.5 * Math.pow(altura, 2);
		    double pesoMax = 24.9 * Math.pow(altura, 2);

		    System.out.println("\nPara ficar com IMC normal, seu peso ideal seria:");
		    System.out.printf("Entre " + azul + "%.2f kg e %.2f kg%n" + reset, pesoMin, pesoMax);
		    
		    if (IMC < 18.5) {
		        System.out.printf("Você precisa ganhar aproximadamente " + azul + "%.2f kg%n" + reset, (pesoMin - peso));
		    } else if (IMC >= 25) {
		        System.out.printf("Você precisa perder aproximadamente " + azul + "%.2f kg%n" + reset, (peso - pesoMax));
		    }
		}
		
		System.out.println("\nVou fazer um resumo para você");
		System.out.println("\nSeu nome é: " + azul + nome + reset + ".");
		System.out.println("Você é o(a): " + azul + funcaoCasa + reset + ".");
		System.out.println("Você tem: " + azul + idade + reset + " anos. ");
		System.out.println("Você pesa: " + azul + peso + reset + " Kgs. ");
		System.out.println("Você mede: " + azul + altura + reset + " metros. ");
		System.out.println("Você trabalha: " + azul + horarioTrabalho + reset + " horas. ");

		if (horarioTrabalho == 8) {
			System.out.println(azul + "Você trabalha o recomendado, excelente" + reset);
		} else if (horarioTrabalho < 8) {
			System.out.println(azul + "Pode aumentar a carga se quiser mais renda" + reset);
		} else {
			System.out.println(azul + "Cuidado para não esquecer o descanso" + reset);
		}
		// aqui inicia a calculadora
		String respostaCalc;

		System.out.print("\nDeseja usar a calculadora? "+ vermelho + "(sim/nao): " + reset);
		respostaCalc = sc.next();

		// validar a resposta
		while (!respostaCalc.equalsIgnoreCase("sim") && !respostaCalc.equalsIgnoreCase("nao")) {

			System.out.println("Resposta inválida! Digite apenas 'sim' ou 'nao'.");
			respostaCalc = sc.next();
		}

		while (respostaCalc.equalsIgnoreCase("sim")) {

			System.out.println(vermelho + "\n===== CALCULADORA =====" + reset);
			System.out.println("\nEscolha a Operação");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Potência");

			int opcao = sc.nextInt();

			System.out.print("Digite o primeiro número: ");
			double n1 = sc.nextDouble();

			System.out.print("Digite o segundo número: ");
			double n2 = sc.nextDouble();

			if (opcao == 1) {
				System.out.println("Resultado: " + roxo + (n1 + n2) + reset);
			} else if (opcao == 2) {
				System.out.println("Resultado: " + roxo + (n1 - n2) + reset);
			} else if (opcao == 3) {
				System.out.println("Resultado: " + roxo + (n1 * n2) + reset);
			} else if (opcao == 4) {
				if (n2 != 0) {
					System.out.println("Resultado: " + roxo + (n1 / n2) + reset);
				} else {
					System.out.println(vermelho + "Erro: divisão por zero!" + reset);
				}
			} else if (opcao == 5) {
				System.out.println("Resultado: " + roxo + Math.pow(n1, n2) + reset);
			} else {
				System.out.println(vermelho + "Opção inválida!" + reset);
			}

			System.out.print("\nDeseja usar a calculadora novamente? (sim/nao): ");
			respostaCalc = sc.next();

			// validar a resposta novamente
			while (!respostaCalc.equalsIgnoreCase("sim") && !respostaCalc.equalsIgnoreCase("nao")) {

				System.out.println("Resposta inválida! Digite apenas 'sim' ou 'nao'.");
				respostaCalc = sc.next();
			}
		}

		System.out.println(verde + "Programa encerrado." + reset);

		sc.close();
	}

}
