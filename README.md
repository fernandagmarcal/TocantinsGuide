# TocantinsGuide
#### PORTUGUÊS/PORTUGUESE
### Tocantins Guide v1: Implementação em Java de um Grafo Direcionado para Planejamento de Rotas

#### Descrição do Repositório

Bem-vindo ao *Tocantins Guide v1*, um projeto em Java que demonstra a implementação de um grafo direcionado para planejamento de rotas utilizando cidades do estado de Tocantins, Brasil, como nós e estradas como arestas. Este repositório oferece ferramentas para calcular o caminho mais curto entre cidades com base na distância, visualizar o caminho encontrado e expandir o grafo adicionando mais cidades e conexões.

#### Características

- **Representação de Cidades**: As cidades de Tocantins são representadas como nós (classe `No`), cada uma armazenando seu nome (`conteudo`).
- **Representação de Conexões**: As estradas entre cidades são representadas como arestas com distâncias associadas.
- **Cálculo do Caminho Mais Curto**: Utiliza um algoritmo de busca em profundidade (DFS) para encontrar o caminho mais curto entre duas cidades.
- **Visualização Criativa**: Apresenta o caminho mais curto encontrado de forma visualmente atraente usando arte ASCII, juntamente com informações detalhadas de distância.
- **Expansibilidade**: Fácil expansão do grafo adicionando mais cidades e suas conexões.

#### Como Funciona

1. **Inicialização**: As cidades são inicializadas como nós, e as conexões (estradas) com suas respectivas distâncias são estabelecidas.
2. **Busca de Caminho**: O algoritmo calcula o caminho mais curto entre a cidade de origem e o destino usando DFS com rastreamento do caminho.
3. **Saída**: Exibe o caminho mais curto encontrado e a distância total de maneira amigável usando arte ASCII.

![Diagrama GRAFO JAVA drawio (1)](https://github.com/fernandagmarcal/TocantinsGuide/assets/144964380/b1d54e90-ed80-4e28-8c4d-18b06b5f949c)


#### Exemplo de Saída

```
        _______      
       //  ||\\ \\         _____                     _   _              ____       _     _      
 _____//___||_\\ \\___    |_   _|__   ___ __ _ _ __ | |_(_)_ __  ___   / ___|_   _(_) __| | ___ 
 )  _          _    \\     | |/ _ \\ / __/ _` | '_ \\| __| | '_ \\/ __| | |  _| | | | |/ _` |/ _ \
 |_/ \\________/ \\___|     | | (_) | (_| (_| | | | | |_| | | | \\__ \\ | |_| | |_| | | (_| |  __/
___\\_/________\\_/_________|_|\\___/ \\___\\__,_|_| |_|\\__|_|_| |_|___/  \\____|\\__,_|_|\\__,_|\\___|_______
_____   _____   ______   ______   ______   ______   ______   ______   _____   ______   _______   ____
_____________________________________________________________________________________________________

*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.por Fernanda Galvao e Julia Couto.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*

Aqui está o caminho mais curto em terra firme a ser feito
saindo de Palmas para chegar a Gurupi!

Palmas -> Porto Nacional -> Gurupi

Distância total a percorrer em quilômetros: 218km
```

#### Futuras Atualizações

Estamos trabalhando para lançar futuras versões deste projeto com novos recursos e melhorias. Fique atento para atualizações!

*Coming soon...*

#### INGLÊS/ENGLISH
### Tocantins Guide v1: Java Implementation of a Directed Graph for Route Planning

#### Repository Description

Welcome to *Tocantins Guide v1*, a Java project demonstrating the implementation of a directed graph for route planning using cities from the state of Tocantins, Brazil, as nodes and roads as edges. This repository provides tools to calculate the shortest path between cities based on distance, visualize the found path, and expand the graph by adding more cities and connections.

#### Features

- **City Representation**: Cities in Tocantins are represented as nodes (`No` class), each storing its name (`conteudo`).
- **Connection Representation**: Roads between cities are represented as edges with associated distances.
- **Shortest Path Calculation**: Uses a Depth-First Search (DFS) algorithm to find the shortest path between two cities.
- **Creative Visualization**: Presents the shortest path found in a visually appealing manner using ASCII art, along with detailed distance information.
- **Expandability**: Easily expand the graph by adding more cities and their connections.

#### How It Works

1. **Initialization**: Cities are initialized as nodes, and connections (roads) with their respective distances are established.
2. **Pathfinding**: The algorithm calculates the shortest path between the source and destination cities using DFS with path tracking.
3. **Output**: Displays the shortest path found and the total distance in a user-friendly format using ASCII art.

![Diagrama GRAFO JAVA drawio (1)](https://github.com/fernandagmarcal/TocantinsGuide/assets/144964380/b1d54e90-ed80-4e28-8c4d-18b06b5f949c)


#### Example Output

```
        _______      
       //  ||\\ \\         _____                     _   _              ____       _     _      
 _____//___||_\\ \\___    |_   _|__   ___ __ _ _ __ | |_(_)_ __  ___   / ___|_   _(_) __| | ___ 
 )  _          _    \\     | |/ _ \\ / __/ _` | '_ \\| __| | '_ \\/ __| | |  _| | | | |/ _` |/ _ \
 |_/ \\________/ \\___|     | | (_) | (_| (_| | | | | |_| | | | \\__ \\ | |_| | |_| | | (_| |  __/
___\\_/________\\_/_________|_|\\___/ \\___\\__,_|_| |_|\\__|_|_| |_|___/  \\____|\\__,_|_|\\__,_|\\___|_______
_____   _____   ______   ______   ______   ______   ______   ______   _____   ______   _______   ____
_____________________________________________________________________________________________________

*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.by Fernanda Galvao and Julia Couto.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*

Here is the shortest overland route
from Palmas to Gurupi!

Palmas -> Porto Nacional -> Gurupi

Total distance to travel in kilometers: 218km
```

#### Future Updates

We are working to release future versions of this project with new features and improvements. Stay tuned for updates!

*Coming soon...*
