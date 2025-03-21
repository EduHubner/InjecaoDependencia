package injecaoDependenciaInterface;

public class NotificacaoSMS implements Notificacao {

	public String enviar() {
		return "SMS eviado com Sucesso";
	}

}
