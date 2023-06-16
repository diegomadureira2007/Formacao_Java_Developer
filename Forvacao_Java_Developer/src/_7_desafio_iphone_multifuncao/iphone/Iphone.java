package _7_desafio_iphone_multifuncao.iphone;

import _7_desafio_iphone_multifuncao.iphone.internet.Internet;
import _7_desafio_iphone_multifuncao.iphone.musica.Musica;
import _7_desafio_iphone_multifuncao.iphone.telefone.Telefone;

public class Iphone implements Internet,Musica,Telefone{

	public void ligar() {
		System.out.println("Ligando pelo Telefone via Iphone");
	}

	public void atender() {
		System.out.println("Atendendo pelo Telefone via Iphone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz do Telefone via Iphone");
	}

	public void tocar() {
		System.out.println("Tocando Música via Iphone");
	}

	public void pausar() {
		System.out.println("Pausando Música via Iphone");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando Música via Iphone");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo Página da Internet via Iphone");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba da Internet via Iphone");
	}

	public void atualizarPagina() {
		System.out.println("Atulizando Página da Internet via Iphone");
	}

}
