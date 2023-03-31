package funcionario;

public class Funcionario {

	private String nome;
	private int horasTrabalhadas;
	private double valorHoraTrabalhada;

	public Funcionario(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = validaHorasTrabalhadas(horasTrabalhadas);
		this.valorHoraTrabalhada = validaValorHoraTrabalhada(valorHoraTrabalhada);
	}

	private int validaHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 40) {
			throw new IllegalArgumentException(
					"O número de horas trabalhadas por funcionários próprios deve ser menor ou igual a 40.");
		}
		return horasTrabalhadas;
	}

	private double validaValorHoraTrabalhada(double valorHoraTrabalhada) {
		double valorMinimo = 1320.0 * 0.04;
		double valorMaximo = 1320.0 * 0.1;
		if (valorHoraTrabalhada < valorMinimo || valorHoraTrabalhada > valorMaximo) {
			throw new IllegalArgumentException(
					String.format("Valor hora trabalhada deve estar entre %.2f e %.2f.", valorMinimo, valorMaximo));
		}
		return valorHoraTrabalhada;

	}

	public String getNome() {
		return this.nome;
	}

	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}

	public double getValorHoraTrabalhada() {
		return this.valorHoraTrabalhada;
	}

}
