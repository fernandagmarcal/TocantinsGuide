import java.util.ArrayList;

public class Principal {
    static int menorDistancia = Integer.MAX_VALUE;
    static String menorCaminho = "";


    // ADICIONANDO CORES NO TERMINAL
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE


    public static void main(String[] args) {
        
        No BrejinhoDeNazare = new No();
        BrejinhoDeNazare.conteudo = "Brejinho de Nazaré";
        
        No Gurupi = new No();
        Gurupi.conteudo = "Gurupi";
        
        No Palmas = new No();
        Palmas.conteudo = "Palmas";
        
        No ParaisoDoTocantins = new No();
        ParaisoDoTocantins.conteudo = "Paraíso do Tocantins";
        
        No PortoNacional = new No();
        PortoNacional.conteudo = "Porto Nacional";
        

        Palmas.adicionaVizinho(PortoNacional, 60);
        Palmas.adicionaVizinho(ParaisoDoTocantins, 68);

        ParaisoDoTocantins.adicionaVizinho(Gurupi, 177);

        PortoNacional.adicionaVizinho(Gurupi, 158);

        BrejinhoDeNazare.adicionaVizinho(Gurupi, 113);
        BrejinhoDeNazare.adicionaVizinho(PortoNacional, 45);

        mostraCaminho(Palmas, Gurupi);
    }

    static void mostraCaminho(No saida, No destino) {
        ArrayList<No> currentPath = new ArrayList<>();
        currentPath.add(saida);
        percorre(saida, destino, 0, saida.conteudo, currentPath);

        System.out.println(CYAN + "\n" + //
                        "\r\n" + //
                        "        _______      \r\n" + //
                        "       //  ||\\ \\         _____                     _   _              ____       _     _      \r\n" + //
                        " _____//___||_\\ \\___    |_   _|__   ___ __ _ _ __ | |_(_)_ __  ___   / ___|_   _(_) __| | ___ \r\n" + //
                        " )  _          _    \\     | |/ _ \\ / __/ _` | '_ \\| __| | '_ \\/ __| | |  _| | | | |/ _` |/ _ \\\r\n" + //
                        " |_/ \\________/ \\___|     | | (_) | (_| (_| | | | | |_| | | | \\__ \\ | |_| | |_| | | (_| |  __/\r\n" + //
                        "___\\_/________\\_/_________|_|\\___/ \\___\\__,_|_| |_|\\__|_|_| |_|___/  \\____|\\__,_|_|\\__,_|\\___|_______\r\n" + //
                        "_____   _____   ______   ______   ______   ______   ______   ______   _____   ______   _______   ____\r\n" + //
                        "_____________________________________________________________________________________________________\r\n" + //
                        "\r\n" + //
                        PURPLE + "*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.by Fernanda and Julia Couto.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\r\n" + //
                        ">> Versão 1.0");
        System.out.println(GREEN + "\nAqui está a menor trajetória em terra firme para ser feita\nsaindo de " + saida.conteudo + " para chegar em " + destino.conteudo + "!" + "\n\n" + menorCaminho);
        System.out.println(YELLOW + "\nDistância total a percorrer em quilômetros: " + menorDistancia + "km" + "\n");
    }

    static void percorre(No atual, No destino, int distanciaTotal, String caminho, ArrayList<No> currentPath) {
        if (atual == destino) {
            if (distanciaTotal < menorDistancia) {
                menorDistancia = distanciaTotal;
                menorCaminho = caminho;
            }
            return;
        }

        for (int i = 0; i < atual.vizinhos.size(); i++) {
            No vizinho = atual.vizinhos.get(i);
            int distancia = atual.distancias.get(i);

            if (!currentPath.contains(vizinho)) {
                currentPath.add(vizinho);
                percorre(vizinho, destino, distanciaTotal + distancia, caminho + " -> " + vizinho.conteudo, currentPath);
                currentPath.remove(vizinho);
            }
        }
    }
}
