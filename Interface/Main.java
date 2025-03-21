package injecaoDependenciaInterface;

public class Main {

	public static void main(String[] args) {
		
		
		//Usando Inteface
		Notificacao n = new NotificacaoSMS();
		Alerta a = new Alerta(n);
		System.out.println(a.dispararAlerta());


		n = new NotificacaoWhatsApp();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());

		
		n = new NotificacaoEmail();
		a = new Alerta(n);
		System.out.println(a.dispararAlerta());

		
	}

}
