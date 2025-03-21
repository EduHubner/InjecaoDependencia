package injecaoDependencia;

public class Main {

	public static void main(String[] args) {
		notificacao zap = new notificacaoZap("aaaaaaaa");
		notificacao email = new notificacaoEmail("bbbbbb");
		zap.Alerta();
		email.Alerta();
		
		
		
		notificacao not = new notificacao();
		not.Alerta();
		
		

	}

}
