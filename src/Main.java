package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //escolha o exercicio:
        System.out.println("Escolha uma atividade de 1 a 4 digitando o número correspondente:  ");
        int atividade = input.nextInt();
        switch (atividade){
//exercicio 1:
            case 1:
                System.out.println("Digite o codigo do produto para verificar sua classificação: ");
                int cod = input.nextInt();
                switch (cod){
                    case 1:
                        System.out.println("Alimento não-perecivel.");
                        break;
                    case 2: case 3: case 4:
                        System.out.println("Alimento perecivel.");
                        break;
                    case 5: case 6:
                        System.out.println("Vestuário.");
                        break;
                    case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
                        System.out.println("Limpeza e utensilios domésticos;");
                        break;
                    default:
                        System.out.println("Código inválido");
                }
            break;
//exercicio 2:
            case 2:
                //recebendo dados e definindo variaveis.
                System.out.println("Digite uma nota: ");
                float nota1 = input.nextFloat();
                System.out.println("Digite a outra nota: ");
                float nota2 = input.nextFloat();
                float media = (nota1 + nota2) / 2;
                int mediaAr = 0;
                //testando nota:
                if (media > 0 && media < 4){
                    mediaAr = 1;
                }
                if (media > 4 && media < 7){
                    mediaAr = 2;
                }
                if (media > 7 && media < 10){
                    mediaAr = 3;
                }
                //escolhendo mensagem
                switch (mediaAr){
                    case 1:
                        System.out.println("Reprovado!!");
                        break;
                    case 2:
                        System.out.println("Exame!");
                        break;
                    case 3:
                        System.out.println("Aprovado!");
                        break;
                }
            break;
            //exercicio 3:
            case 3:
                //recebendo dados:
                System.out.println("Digite um valor: ");
                float num1 = input.nextFloat();
                System.out.println("Digite outro valor: ");
                float num2 = input.nextFloat();
                //escolhendo operação:
                System.out.println("escolha uma operação, sendo:\n" +
                        "1= media entre os numeros\n" +
                        "2= diferença entre os numeros\n" +
                        "3= produto entre os numeros\n" +
                        "4= divisao do primeiro numero pelo segundo\n");
                int op = input.nextInt();
                //executando operações de acordo com a escolha:
                switch (op){
                    case 1:
                        System.out.println((num1 + num2) / 2);
                        break;
                    case 2:
                        System.out.println(num1 - num2);
                        break;
                    case 3:
                        System.out.println(num1 * num2);
                        break;
                    case 4:
                        System.out.println(num1 / num2);
                        break;
                    default:
                        System.out.println("Opção invalida!");
                }
            break;
//exercicio 4:
            case 4:
                //recebendo dados:
                System.out.println("Qual produto gostaria?");
                int prod = input.nextInt();
                System.out.println("E quantos você gostaria?");
                int quant = input.nextInt();
                float total;
                float vlr = 0;

                switch (prod){
                    case 100:
                        vlr = 1.70f;
                        break;
                    case 101:
                        vlr = 2.30f;
                        break;
                    case 102:
                        vlr = 2.60f;
                        break;
                    case 103:
                        vlr = 2.40f;
                        break;
                    case 104:
                        vlr = 2.50f;
                        break;
                    case 105:
                        vlr = 1.50f;
                        break;
                    default:
                        System.out.println("não temos esse produto no cardapio!");
                }
                total = quant * vlr;
                System.out.printf("o valor total é de: %.2f R$", total);
                break;
//atividade não encontrada:
            default:
                System.out.println("atividade não encontrada!");
            break;
        }
    }
}
