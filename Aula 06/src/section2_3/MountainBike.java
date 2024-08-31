package section2_3;

public class MountainBike extends Bicicleta {
	// Propriedades específicas
	private String tipoDeAmortecedor;

	// Construtores
	public MountainBike(String tipoDeAmortecedor) {
		super();
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}

	public MountainBike() {
	}

	public MountainBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantidadeDeMarchas,
			double velocidadeMedia, String tipoDeAmortecedor) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantidadeDeMarchas, velocidadeMedia);
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}

	// Comportamentos
	@Override
	public String toString() {
		return "MountainBike [tipoDeAmortecedor=" + tipoDeAmortecedor + ", getCodigo()=" + getCodigo()
				+ ", getTipoDeQuadro()=" + getTipoDeQuadro() + ", getTipoDeRoda()=" + getTipoDeRoda() + ", getAro()="
				+ getAro() + ", getQuantidadeDeMarchas()=" + getQuantidadeDeMarchas() + ", getVelocidadeMedia()="
				+ getVelocidadeMedia() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public String getTipoDeAmortecedor() {
		return tipoDeAmortecedor;
	}

	public void setTipoDeAmortecedor(String tipoDeAmortecedor) {
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}
}
