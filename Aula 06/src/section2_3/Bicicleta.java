package section2_3;

public abstract class Bicicleta {
	// Propriedades genéricas
	private String codigo, tipoDeQuadro, TipoDeRoda;
	private int aro, quantidadeDeMarchas;
	private double velocidadeMedia;

	// Construtores
	public Bicicleta() {
	}

	public Bicicleta(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantidadeDeMarchas,
			double velocidadeMedia) {
		this.codigo = codigo;
		this.tipoDeQuadro = tipoDeQuadro;
		TipoDeRoda = tipoDeRoda;
		this.aro = aro;
		this.quantidadeDeMarchas = quantidadeDeMarchas;
		this.velocidadeMedia = velocidadeMedia;
	}

	// Comportamentos
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoDeQuadro() {
		return tipoDeQuadro;
	}

	public void setTipoDeQuadro(String tipoDeQuadro) {
		this.tipoDeQuadro = tipoDeQuadro;
	}

	public String getTipoDeRoda() {
		return TipoDeRoda;
	}

	public void setTipoDeRoda(String tipoDeRoda) {
		TipoDeRoda = tipoDeRoda;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getQuantidadeDeMarchas() {
		return quantidadeDeMarchas;
	}

	public void setQuantidadeDeMarchas(int quantidadeDeMarchas) {
		this.quantidadeDeMarchas = quantidadeDeMarchas;
	}

	public double getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(double velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	@Override
	public String toString() {
		return "Bicicleta [codigo=" + codigo + ", tipoDeQuadro=" + tipoDeQuadro + ", TipoDeRoda=" + TipoDeRoda
				+ ", aro=" + aro + ", quantidadeDeMarchas=" + quantidadeDeMarchas + ", velocidadeMedia="
				+ velocidadeMedia + ", toString()]";
	}

}
