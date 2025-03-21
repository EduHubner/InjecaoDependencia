package injecaoDependenciaCerto;

public class Main {

	public static void main(String[] args) {
		Notificacao n = new Notificacao();
		
		Alerta a = new Alerta(n);
		System.out.println(a.dispararAlerta());
		
		//Usando Generalização
		n = new NotificacaoSMS();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());


		n = new NotificacaoWhatsApp();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());

		
		n = new NotificacaoEmail();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());

		
	}

}
