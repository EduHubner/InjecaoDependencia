package injecaoDependencia;

public class notificacaoEmail extends notificacao {

	public notificacaoEmail(String texto) {
		this.setLocalNotificacao("Email");
		this.setTexto(texto);
	}
}
