package entities;

public class Banc {

        public int numConta;
        public String nome;
        public double balance;
        public String result;



        public Banc(int numConta, String nome, double deposito) {
            this.nome = nome;
            this.numConta = numConta;
            this.balance = deposito;
        }

        public void deposit(double deposito) {
            balance += deposito;
        }

        public void withdraw(double deposito) {
            balance -= deposito + 5.0;
        }

        public double getBalance(){
            return balance;
        }

    public String getAccountInfo() {
        return "Account: " + numConta
                + ", Holder: " + nome
                + ", Balance: $" + balance;
    }

}
