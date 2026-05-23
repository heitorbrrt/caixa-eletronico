//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        conta conta = new conta(100.0);

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        caixaEletronico.sacar(conta, 100);

    }
}