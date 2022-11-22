public class cajero {
    //Atributos
    String titular;
    String numeroCuenta;
    double saldo;
    //Metodo constructor con parametros
    public cajero(String titular, String numeroCuenta, double saldo){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //metodo para depositar dinero
    //condicional que no permite ingresar valores negativos
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("\n\t*** Se ha realizado un deposito de saldo exitoso***");
            System.out.println("\t*** Valor depositado: " + valor);
            System.out.println("\t*** Saldo disponible: " + this.saldo);
        } else {
            System.out.println("\n\t*** Cantidad ingresada incorrecta ***");
        }
    }
    //metodo para retirar dinero
    //condicional para que no se pueda retirar mas dinero del disponible en la cuenta
    public void retirar(double valor){
        if (valor < this.saldo){
            this.saldo -= valor;
            System.out.println("\n\t*** Se ha realizado un retiro de saldo exitoso ***");
            System.out.println("\t*** Valor retirado: " + valor);
            System.out.println("\t*** Saldo disponible: " + this.saldo);
        } else {
            System.out.println("\n\t*** Saldo insuficiente para realizar la transaccion ***");
        }
    }
    //Getter para obtener los valores de titular, numero de cuenta y saldo disponible en la cuenta
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}
