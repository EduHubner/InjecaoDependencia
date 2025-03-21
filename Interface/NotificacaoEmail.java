package injecaoDependenciaInterface;

public class NotificacaoEmail implements Notificacao {

	public String enviar() {
		return "EMail eviado com Sucesso";
	}

}
