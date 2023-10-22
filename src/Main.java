import Aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("40028922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar("Voice of Return");
        iphone.pausar();
        iphone.selecionarMusica();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
        
