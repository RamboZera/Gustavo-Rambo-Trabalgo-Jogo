Análise de Requisitos do Warzone:
Jogabilidade:
Sobrevivência: Os jogadores devem lutar para serem os últimos sobreviventes em um mapa que diminui continuamente de tamanho.


Combate: Os jogadores devem ser capazes de atirar, se movimentar, se esconder, se curar e usar uma variedade de armas e equipamentos.
Equipe: Os jogadores podem formar equipes de até três pessoas para jogar juntos.


Veículos: O jogo inclui uma variedade de veículos terrestres, aéreos e aquáticos que os jogadores podem usar para se deslocar pelo mapa.


Interface do Usuário:
HUD (Heads-Up Display): Exibe informações importantes, como saúde, munição, mapa, jogadores restantes, etc.


Menu de Inventário: Permite aos jogadores gerenciar seu inventário, equipar armas e itens, e visualizar estatísticas.


Ambiente:
Mapa: O jogo se passa em um grande mapa com uma variedade de locais, como cidades, áreas rurais, aeroportos, etc.


Zona de Gás: Uma zona de gás tóxico encolhe continuamente o mapa, forçando os jogadores a se moverem para áreas seguras..



class Jogador {
    String nome;
    int saude;
    int municoes;
}
class Equipe {
    Jogador[] membros;
}

class Veiculo {
    String tipo;
    int velocidade;
}
class Carro extends Veiculo {
}

class Helicoptero extends Veiculo {
}
class Arma {
    String nome;
    int dano;
}

class Item {
    String nome;
}


class Mapa {
    String[] locais;
    
}


class HUD {
    Jogador jogador;
    String[] informacoes;
}

class MenuInventario {
    Jogador jogador;
    Arma[] armas;
    Item[] itens;
}
