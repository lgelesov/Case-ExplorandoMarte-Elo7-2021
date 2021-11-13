import java.util.Scanner;

public class RodaPrograma {
	
	public static void main(String[] args) {
		
		Grid marte;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Digite a coordenada do ponto superior-direito da malha do planalto: ");
		
		String coordenadas = reader.nextLine();//esperando um input do usuario, sera alocado na variavel "coordenadas" .LÊ A ENTRADA DE DADOS
		
		String[] strs = coordenadas.trim().split(" ");// separa a string em duas strings diferentes

		int i = Integer.parseInt(strs[0]);//aloca o que era string em int(vetor), metodo da classe integer
		int j = Integer.parseInt(strs[1]);//mesma coisa de cima ; segundo elemento do vetor
		
		marte = new Grid(i,j);//instanciei o grid; criei o campo
		
		while(true) {//loop
			
			System.out.println("Indique a posição inicial da sonda e sua direção: ");
			
			String dadoSonda = reader.nextLine();
			String[] strs2 = dadoSonda.trim().split(" "); //trim verifica se a string começa ou termina com espaço, tira
			//split é um metodo da classe string que separa a string de acordo com o separados, nesse caso, o espaço
			
			int x = Integer.parseInt(strs2[0]);
			int y = Integer.parseInt(strs2[1]);
			char dir = strs2[2].charAt(0); //metodo da classe string, so pega um elemento da classe string; transoforma em char
			//charAt é um metodo da classe string
			
			Sonda sonda = new Sonda(x, y, dir);
			
			System.out.println("Digite a sequencia de instruções de sua escolha: ");
			
			String instrucaoSonda = reader.nextLine();
			
			sonda.movimentoSonda(instrucaoSonda, marte);
			System.out.println(sonda.getCoordenadaX() + " " +  sonda.getCoordenadaY() + " " + sonda.getDirecao());
			
			
		}
		

		
	}

}
