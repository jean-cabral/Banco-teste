package aplicacao;


import entidade.Conta;


import java.util.Locale;
import java.util.Scanner;

public class Progama {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit =sc.nextDouble();
            conta = new Conta(number,holder,initialDeposit);
        }else {
            conta = new Conta(number,holder);

        }
        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(conta);
        System.out.println("Enter a withdraw value: ");
        double withdrawValue =sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Update account data: " );
        System.out.println(conta);

        sc.close();
    }

}
