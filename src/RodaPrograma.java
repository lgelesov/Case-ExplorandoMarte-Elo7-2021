import java.util.Scanner;

public class RodaPrograma {
	
	public static void main(String[] args) {
		
		Grid marte;
		
		Scanner reader = new Scanner(System.in);
		
		String coordenadas = reader.nextLine();//esperando um input do usuario, sera alocado na variavel "coordenadas" LE A ENTRADA DE DADOS

		
		String[] strs = coordenadas.trim().split(" ");// separa a string em duas strings diferentes

		int i = Integer.parseInt(strs[0]);//aloca o que era string em int(vetor), metodo da classe integer

		int j = Integer.parseInt(strs[1]);//mesma coisa de cima ; segundo elemento do vetor
		
		marte = new Grid(i,j);//instanciei o grid; criei o campo
		
		while(true) {
			
			String dadoSonda = reader.nextLine();
			String[] strs2 = dadoSonda.trim().split(" "); //trim verifica se a string começa ou termina com espaço, tira
			
			int x = Integer.parseInt(strs[0]);
			int y = Integer.parseInt(strs[1]);
			
			char dir = strs[2].charAt(0); //metodo da classe string, so pega um elemento da classe string
			
			Sonda sonda = new Sonda(x, y, dir);
			
			String instrucaoSonda = reader.nextLine();
			
			sonda.movimentoSonda(instrucaoSonda);
			
			
		}
		

		
	}

}
