package Aparelho;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo correio de voz");
    }

    @Override
    public void pesquisar(){
        System.out.println("Realizando pesquisa");
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar(String musica) {

        System.out.println("Tocando " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }
}