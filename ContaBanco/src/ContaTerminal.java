public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = System.console().readLine();

        System.out.println("Por favor, digite o número da Conta!");
        numero = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, digite seu nome!");
        nome = System.console().readLine();

        System.out.println("Por favor, digite o saldo!");
        saldo = Double.parseDouble(System.console().readLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
