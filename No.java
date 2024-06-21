import java.util.ArrayList;

public class No {
	String conteudo;
	ArrayList<No> vizinhos  = new ArrayList<No>();
	ArrayList<Integer> distancias  = new ArrayList<>();


	void adicionaVizinho(No novoVizinho, int distancia) {
		vizinhos.add(novoVizinho);
		distancias.add(distancia);
	}
}
