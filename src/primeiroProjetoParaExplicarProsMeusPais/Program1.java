package primeiroProjetoParaExplicarProsMeusPais;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Para mudar a cor do texto
		String azul = "\u001B[34m";
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
		System.out.println("Qual sua altura? (em metros) ");
		double altura = sc.nextDouble();
		System.out.println("Você mede " + azul + altura + reset + "metros");
		System.out.println("você tem " + azul + idade + reset + " anos e pesa " + azul + peso + reset + " Kg.");

		System.out.println("Quando você começa a trabalhar(HH.mm)? ");
		double inicioTrabalho = sc.nextInt();
		System.out.println("Quando vc sai do trabalho(HH.mm)? ");
		double fimTrabalho = sc.nextInt();
		double horarioTrabalho;
		if (fimTrabalho >= inicioTrabalho) {
			horarioTrabalho = fimTrabalho - inicioTrabalho;
		} else {
			horarioTrabalho = (24 - inicioTrabalho) + fimTrabalho;
		}
		System.out.println("Você trabalha " + azul + horarioTrabalho + reset + " horas.");

		// validar resposta do IMC
		String resposta;

		System.out.print("\nDeseja calcular seu IMC? (sim/nao): ");
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

		    System.out.println("Para ficar com IMC normal, seu peso ideal seria:");
		    System.out.printf("Entre %.2f kg e %.2f kg%n", pesoMin, pesoMax);
		    
		    if (IMC < 18.5) {
		        System.out.printf("Você precisa ganhar aproximadamente %.2f kg%n", (pesoMin - peso));
		    } else if (IMC >= 25) {
		        System.out.printf("Você precisa perder aproximadamente %.2f kg%n", (peso - pesoMax));
		    }
		}
		
		System.out.println("Vou fazer um resumo para você");
		System.out.println("Seu nome é: " + azul + nome + reset + ".");
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

		System.out.print("\nDeseja usar a calculadora? (sim/nao): ");
		respostaCalc = sc.next();

		// validar a resposta
		while (!respostaCalc.equalsIgnoreCase("sim") && !respostaCalc.equalsIgnoreCase("nao")) {

			System.out.println("Resposta inválida! Digite apenas 'sim' ou 'nao'.");
			respostaCalc = sc.next();
		}

		while (respostaCalc.equalsIgnoreCase("sim")) {

			System.out.println("\n===== CALCULADORA =====");
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
				System.out.println("Resultado: " + (n1 + n2));
			} else if (opcao == 2) {
				System.out.println("Resultado: " + (n1 - n2));
			} else if (opcao == 3) {
				System.out.println("Resultado: " + (n1 * n2));
			} else if (opcao == 4) {
				if (n2 != 0) {
					System.out.println("Resultado: " + (n1 / n2));
				} else {
					System.out.println("Erro: divisão por zero!");
				}
			} else if (opcao == 5) {
				System.out.println("Resultado: " + Math.pow(n1, n2));
			} else {
				System.out.println("Opção inválida!");
			}

			System.out.print("\nDeseja usar a calculadora novamente? (sim/nao): ");
			respostaCalc = sc.next();

			// validar a resposta novamente
			while (!respostaCalc.equalsIgnoreCase("sim") && !respostaCalc.equalsIgnoreCase("nao")) {

				System.out.println("Resposta inválida! Digite apenas 'sim' ou 'nao'.");
				respostaCalc = sc.next();
			}
		}

		System.out.println("Programa encerrado.");

		sc.close();
	}

}
