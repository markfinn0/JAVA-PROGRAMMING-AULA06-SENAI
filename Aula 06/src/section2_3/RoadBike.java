package section2_3;

public class RoadBike extends Bicicleta {
	// Propriedades específicas
	private String tipoDePedal;

	// Construtores
	public RoadBike() {
	}

	public RoadBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantidadeDeMarchas,
			double velocidadeMedia, String tipoDePedal) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantidadeDeMarchas, velocidadeMedia);
		this.tipoDePedal = tipoDePedal;
	}

	// Comportamentos
	@Override
	public String toString() {
		return "RoadBike [tipoDePedal=" + tipoDePedal + ", getCodigo()=" + getCodigo() + ", getTipoDeQuadro()="
				+ getTipoDeQuadro() + ", getTipoDeRoda()=" + getTipoDeRoda() + ", getAro()=" + getAro()
				+ ", getQuantidadeDeMarchas()=" + getQuantidadeDeMarchas() + ", getVelocidadeMedia()="
				+ getVelocidadeMedia() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public String getTipoDePedal() {
		return tipoDePedal;
	}

	public void setTipoDePedal(String tipoDePedal) {
		this.tipoDePedal = tipoDePedal;
	}

}
