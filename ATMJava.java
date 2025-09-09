import java.util.Scanner;

public class ATM{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double saldo = 1000.0; //saldo inicial
    int opcao;

    do{
      System.out.println("\n===== ATM - Caixa Eletronico ======");
      System.out.println("1. Consultar saldo");
      System.out.println("2. Depositar");
      System.out.println("3. Sacar");
      System.out.println("4. Sair");
      System.out.println("Escolha uma opcao");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
        System.out.println(" Seu saldo atual e: R$ " + saldo);
        break;

        case 2:
        System.out.println("Digite o valor para deposito: R$ ");
        double deposito = scanner.nextDouble();
        if (deposito > 0){
          saldo += deposito;
          System.out.println("Deposito realizado com sucesso!");
        } else{
          System.out.println("Erro! Valor invalido");
        } 
        break;

        case 3:
        System.out.println("Digite o valor para saque: R$");
        double saque = scanner.nextDouble();
        if (saque > 0 && saque <= saldo){
          saldo -= saque;
          System.out.println("Saque realizado com sucesso! ");
        } else {
          System.out.println("Saque invalido! Por favor cheque seu saldo");
        }
        break;

        case 4: 
        System.out.println("Obrigada por usar o ATM service! Ate logo.");
        break;

        default: 
        System.out.println("Opcao invalida, tente novamente mais tarde");
      }

    } while (opcao != 4);

  scanner.close();
  
  }
}

/* exemplo de saida:
===== ATM - Caixa Eletronico ======
1. Consultar saldo
2. Depositar
3. Sacar
4. Sair
Escolha uma opcao
1
 Seu saldo atual e: R$ 1000.0

===== ATM - Caixa Eletronico ======
1. Consultar saldo
2. Depositar
3. Sacar
4. Sair
Escolha uma opcao
2
Digite o valor para deposito: R$ 
2000
Deposito realizado com sucesso!
  */
