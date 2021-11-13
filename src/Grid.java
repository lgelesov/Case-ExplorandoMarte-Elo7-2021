
public class Grid {// possui um atributo que armazena diversas sondas;

	private Sonda coord[][];// recebe int, pois é a dimensão da matriz, mas é uma matriz do tipo Sonda, pois
							// armazena sondas em si;
	private int maximoX;// tamanho do grid
	private int maximoY;// tamanho do grid

	public Grid(int i, int j) {// vetor bidimencional, matriz; construtor
		this.maximoX = i;// setei no construtor o tamanho do grid
		this.maximoY = j;
		this.coord = new Sonda[i + 1][j + 1];//soma 1 pois vai de 0 a 4
	}

	public boolean colisaoSondas(int i, int j) {// verifica se ha colisao numa coordenada Aij
		if (this.coord[i][j] == null) {
			return false;
		} else {
			System.out.println("Ops! Já tem uma sonda alocada aqui");
			return true;
		}
	}

	public boolean coordenadasForaDoLimite(int i, int j) {
		if ((i < 0) || (j < 0) || (i > this.maximoX) || (j > this.maximoY)) {
			System.out.println("Alguma coordenada está fora dos limites do campo :(");
			return true;
		} else {
			return false;
		}
	}

	public boolean alocaSonda(Sonda sonda, int i, int j) {// verifica se pelo menos algum desses metodos é true; se os
															// dois retornarem false, aloca a sonda
		if (!colisaoSondas(i, j) && !coordenadasForaDoLimite(i, j)) {
			this.coord[i][j] = sonda;
			return true;
		} else {
			return false;
		}
	}

}
