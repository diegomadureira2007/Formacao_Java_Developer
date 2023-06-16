package _7_desafio_iphone_multifuncao.cliente;

import _7_desafio_iphone_multifuncao.iphone.Iphone;
import _7_desafio_iphone_multifuncao.iphone.internet.Internet;
import _7_desafio_iphone_multifuncao.iphone.musica.Musica;
import _7_desafio_iphone_multifuncao.iphone.telefone.Telefone;

public class Cliente {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		Internet internet = iphone;
		Musica musica = iphone;
		Telefone telefone = iphone;
		
		internet.exibirPagina();
		internet.adicionarNovaAba();
		internet.atualizarPagina();
		
		musica.selecionarMusica();
		musica.pausar();
		musica.tocar();
		
		telefone.atender();
		telefone.ligar();
		telefone.iniciarCorreioVoz();
		
	}

}
