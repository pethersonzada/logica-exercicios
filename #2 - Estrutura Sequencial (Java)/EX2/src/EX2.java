
public class EX2 {
    public static void main(String[] args) {

        System.out.printf("Exercício %n %n");

        /* 
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos. 
        */
       
        byte num1 = 10, num2 = 30, soma1 = (byte) (num1 + num2);

        System.out.printf("O Resultado da soma dos números %d e %d é: %d %n", num1, num2, soma1);

        //

        byte num3 = -30, num4 = 10, soma2 = (byte) (num3 + num4);

        System.out.printf("O Resultado da soma dos números %d e %d é: %d %n", num3, num4, soma2);

        // 

        byte num5 = 0, num6 = 0, soma3 = (byte) (num5 + num6);

        System.out.printf("O Resultado da soma dos números %d e %d é: %d %n %n", num5, num6, soma3);

        /* 
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159 
        */

        double num7 = 2, pi = 3.14159, area = pi * (Math.pow(num7, 2));
        
        System.out.printf("O resultado da área do círculo é: %.7s %n", area);

        //

        double num8 = 100.64;
        area = pi * (Math.pow(num8, 2));
        
        System.out.printf("O resultado da área do círculo é: %.10s %n", area);        

        //

        double num9 = 150.00;
        area = pi * (Math.pow(num9, 2));
        
        System.out.printf("O resultado da área do círculo é: %.11s %n %n", area); 
        
        /* 
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D) 
        */

        int a1 = 5, b1 = 6, c1 = 7, d1 = 8;
        byte calc1 = (byte) (a1 * b1 - c1 * d1);

        System.out.printf("A diferença do produto de A e B pelo produto de C e D é de: %s %n", calc1);
        
        //

        int a2 = 5, b2 = 6, c2 = -7, d2 = 8;
        byte calc2 = (byte) (a2 * b2 - c2 * d2);

        System.out.printf("A diferença do produto de A e B pelo produto de C e D é de: %s %n %n", calc2);

        /* 
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais. 
        */

        byte funcId1 = 25;
        double valorHoraTrab1 = 5.5, horaTrab1 = 100, salario1 = horaTrab1 * valorHoraTrab1;

        System.out.printf("O funcionário com ID %s, trabalhou %s horas, com cada hora valendo %s, e hoje recebe um salário de: R$%s %n", funcId1, horaTrab1, valorHoraTrab1, salario1);

        //

        byte funcId2 = 1;
        double valorHoraTrab2 = 20.50, horaTrab2 = 200, salario2 = horaTrab2 * valorHoraTrab2;

        System.out.printf("O funcionário com ID %s, trabalhou %s horas, com cada hora valendo %s, e hoje recebe um salário de: R$%s %n", funcId2, horaTrab2, valorHoraTrab2, salario2);

        //

        byte funcId3 = 6;
        double valorHoraTrab3 = 15.55, horaTrab3 = 145, salario3 = horaTrab3 * valorHoraTrab3;

        System.out.printf("O funcionário com ID %s, trabalhou %s horas, com cada hora valendo %s, e hoje recebe um salário de: R$%s %n %n", funcId3, horaTrab3, valorHoraTrab3, salario3);

        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
        */

        double codPeca1 = 12, codPeca2 = 16, numPeca1 = 1, numPeca2 = 2, valorPeca1 = 5.30, valorPeca2 = 5.10, valorTotal1;
        valorTotal1 = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("O cliente comprou %.0f peça de código %.0f e %.0f peças de código %.0f; %nValor total da compra: R$%.2f %n %n", numPeca1, codPeca1, numPeca2, codPeca2, valorTotal1);
        
        //

        double codPeca3 = 13, codPeca4 = 161, numPeca3 = 2, numPeca4 = 4, valorPeca3 = 15.30, valorPeca4 = 5.20, valorTotal2;
        valorTotal2 = (numPeca3 * valorPeca3) + (numPeca4 * valorPeca4);

        System.out.printf("O cliente comprou %.0f peças de código %.0f e %.0f peças de código %.0f; %nValor total da compra: R$%.2f %n %n", numPeca3, codPeca3, numPeca4, codPeca4, valorTotal2);

        //

        double codPeca5 = 1, codPeca6 = 2, numPeca5 = 1, numPeca6 = 1, valorPeca5 = 15.10, valorPeca6 = 15.10, valorTotal3;
        valorTotal3 = (numPeca5 * valorPeca6) + (numPeca6 * valorPeca5);

        System.out.printf("O cliente comprou %.0f peça de código %.0f e %.0f peça de código %.0f; %nValor total da compra: R$%.2f %n %n", numPeca5, codPeca5, numPeca6, codPeca6, valorTotal3);
        
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        double A1 = 3.0, B1 = 4.0, C1 = 5.2; // A variável com o valor de PI já foi declarada na linha 35 !!
        double resultA_, resultB_, resultC_, resultD_, resultE_;

        resultA_ = (A1 * C1) / 2;
        resultB_ = pi * Math.pow(C1, 2);
        resultC_ = ((A1 + B1)* C1) / 2;
        resultD_ = Math.pow(B1, 2);
        resultE_ = A1 * B1;

        System.out.printf(" a = %f %n b = %f %n c = %f %n d = %f %n e = %f %n %n", resultA_, resultB_, resultC_, resultD_, resultE_);

        //

        double A2 = 12.7, B2 = 10.4, C2 = 15.2; // A variável com o valor de PI já foi declarada na linha 35 !!
        double resultA__, resultB__, resultC__, resultD__, resultE__;

        resultA__ = (A2 * C2) / 2;
        resultB__ = pi * Math.pow(C2, 2);
        resultC__ = ((A2 + B2)* C2) / 2;
        resultD__ = Math.pow(B2, 2);
        resultE__ = A2 * B2;

        System.out.printf(" a = %f %n b = %f %n c = %f %n d = %f %n e = %f %n", resultA__, resultB__, resultC__, resultD__, resultE__);
    }
}