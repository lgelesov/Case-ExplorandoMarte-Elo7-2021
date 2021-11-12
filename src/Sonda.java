
public class Sonda {
	
	private char movimentoLeft;
	private char movimentoRight;
	private char movimentoMove;
	private char dir;
	private int coordX;
	private int coordY;

	public Sonda (int x, int y, char dir) {//construtor
		this.coordX = x;
		this.coordY = y;
		this.dir = dir;
	}

	public void movimentoSonda (String instrucao) {
		for(int i = 0; i < instrucao.length(); i++) {//para percorrer uma string ; começa do 0 e para ate que o i seja menor que o tamanho da string, para que seja percorrida ela toda. a cada string o i aumenta em 1
			if(instrucao.charAt(i) == 'L') {
				this.giraEsquerda();
			}
			else if(instrucao.charAt(i) == 'R') {
				this.giraDireita();
				
			}else if(instrucao.charAt(i) == 'M') {
				
			}else {
				System.out.println("Instrução inválida.");
			}
		}
	}
	
	public void giraEsquerda()	{
		if(this.dir == 'N') {//Norte
			this.dir = 'W';//Oeste
		}
		else if(this.dir == 'W') {
			this.dir = 'S';//Sul
		}
		else if(this.dir == 'S') {
			this.dir = 'E';//Leste			
		}
		else {
			this.dir = 'N';
		}
	}
	
	public void giraDireita()	{
		if(this.dir == 'N') {//Norte
			this.dir = 'E';//Leste
		}
		else if(this.dir == 'E') {
			this.dir = 'S';//Sul
		}
		else if(this.dir == 'S') {
			this.dir = 'W';//West			
		}
		else {
			this.dir = 'N';
		}
	}
	
	public void movMovimento() {
		if(this.dir == 'N') {
			this.coordY += 1;//sonda anda para frente no eixo y;			
		}
		else if(this.dir == 'W') {//sonda anda para "tras" no eixo x;
			this.coordX -= 1;			
		}
		else if(this.dir == 'S') {//sonda anda para "tras" no eixo y;
			this.coordY -= 1;
		}
		else if(this.dir == 'E') {//sonda anda para frente no eixo x;
			this.coordX += 1;			
		}
	}
}
