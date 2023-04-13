package funcionarioterceirizado;

import funcionario.Funcionario;

public class FuncionarioTerceirizado extends Funcionario {
    private double despesaAdicional;

    public FuncionarioTerceirizado(String nome, int horasTrabalhadas, double valorHoraTrabalhada, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHoraTrabalhada);
        if (despesaAdicional > 1000.0) {
            throw new IllegalArgumentException("Despesa adicional não pode ultrapassar 1000.");
        }
        this.despesaAdicional = despesaAdicional;
    }

    public void setDespesaAdicional(double despesaAdicional) {
        if (despesaAdicional < 0 || despesaAdicional > 1000) {
            throw new IllegalArgumentException("Despesa adicional inválida");
        }
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double calcularPagamento() {
        double pagamento = super.calcularPagamento() + (despesaAdicional * 1.1);
        if (pagamento < 1320) {
            return 0;
        }
        return pagamento;
    }

    public double getDespesaAdicional() {
        return despesaAdicional;
    }
}
