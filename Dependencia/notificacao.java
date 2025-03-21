package injecaoDependencia;

public class notificacao {

	private String localNotificacao;
	private String texto;
	
	public notificacao() {
		
	}

	public String getLocalNotificacao() {
		return localNotificacao;
	}

	public void setLocalNotificacao(String localNotificacao) {
		this.localNotificacao = localNotificacao;
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void Alerta() {
		System.out.println("Notificação enviada por " + localNotificacao);
		System.out.println("Mensagem: " + texto);
	}
}
