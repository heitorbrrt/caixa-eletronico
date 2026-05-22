public class CaixaEletronico {
    int notas10 = 0; // pra testar o tratamento de erros em relaçao as notas é so mudar esse valor
    double reserved;

    public void sacar(conta conta1, double valorSq) {
        // verifica se o usuario tem saldo maior que o saque e faz o tratamento de erro
        if (valorSq > conta1.getSaldo()) {
            throw new saldoInsuficienteX("Saldo insuficiente para o saque solicitado");
        }else{
            // reserva o valor de saque(obs: eu fiquei na duvida se seria necessário colocar uma variavel pra reservar o valor, só que achei mais seguro com ela)
            reserved = valorSq;
            conta1.setSaldo(conta1.getSaldo() - valorSq);
        }try {
            // verifica se existem notas de 10 e faz o tratamento de erros
            if (notas10 == 0){
                throw new semCedCaixaX("Sem cédulas suficientes para completar o saque");
            }else {
                System.out.println("Saque realizado com sucesso, seu saldo atual é: " + conta1.getSaldo());
            }
        }catch (semCedCaixaX e) { // restitui o saldo do cliente caso o saque seja cancelado
            conta1.setSaldo(conta1.getSaldo() + reserved);
            System.out.println(e.getMessage());
            System.out.println("Saque cancelado, o valor foi restituído ao seu saldo, que atualmente é de:" + conta1.getSaldo());
        }

    }
}
