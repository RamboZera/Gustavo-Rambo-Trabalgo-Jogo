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



Classe Jogador

    public class Jogador {
    private String nome;
    private int saude;
    private int armadura;
    private Arma armaPrimaria;
    private Arma armaSecundaria;
    private List<Equipamento> equipamentos;

    public Jogador(String nome) {
        this.nome = nome;
        this.saude = 100;
        this.armadura = 0;
        this.equipamentos = new ArrayList<>();
    }
    public String getNome() { return nome; }
    public int getSaude() { return saude; }
    public void setSaude(int saude) { this.saude = saude; }
    public int getArmadura() { return armadura; }
    public void setArmadura(int armadura) { this.armadura = armadura; }
    public void equiparArmaPrimaria(Arma arma) { this.armaPrimaria = arma; }
    public void equiparArmaSecundaria(Arma arma) { this.armaSecundaria = arma; }
    public void adicionarEquipamento(Equipamento equipamento) { this.equipamentos.add(equipamento); }


Classe Equipe

  public class Equipe {
    private String nome;
    private List<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

Classe Mapa

public class Mapa {
    private String nome;
    private int largura;
    private int altura;
    private ZonaSegura zonaSegura;

    public Mapa(String nome, int largura, int altura) {
        this.nome = nome;
        this.largura = largura;
        this.altura = altura;
        this.zonaSegura = new ZonaSegura(largura / 2, altura / 2, Math.min(largura, altura) / 2);
    }

    public ZonaSegura getZonaSegura() {
        return zonaSegura;
    }

    public void atualizarZonaSegura() {

Classe Arma

public class Arma {
    private String nome;
    private int dano;
    private int municao;

    public Arma(String nome, int dano, int municao) {
        this.nome = nome;
        this.dano = dano;
        this.municao = municao;
    }


Classe Equipamento

public class Equipamento {
    private String nome;
    private String tipo;

    public Equipamento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


Classe Veículo

public class Veículo {
    private String nome;
    private int velocidade;
    private int durabilidade;

    public Veículo(String nome, int velocidade, int durabilidade) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.durabilidade = durabilidade;
    }

Classe ZonaSegura

public class ZonaSegura {
    private int centroX;
    private int centroY;
    private int raio;

    public ZonaSegura(int centroX, int centroY, int raio) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }

    public void diminuirRaio(int quantidade) {
        this.raio -= quantidade;
        if (this.raio < 0) this.raio = 0;
    }
