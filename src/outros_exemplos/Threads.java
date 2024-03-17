package outros_exemplos;

class MinhaThread extends Thread {
	public void run() {
		// Código a ser executado pela thread
		for (int i = 5; i >= 0; i--) {
			System.out.println("Contagem regressiva: " + i);
			try {
				Thread.sleep(2000); // Aguarda 1 segundo
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida");
			}
		}
	}
}

public class Threads {
	public static void main(String[] args) {
		System.out.println("Iniciando o programa");

		// Criando uma instância da nossa classe de thread
		MinhaThread thread = new MinhaThread();

		// Iniciando a execução da thread
		thread.start();

		System.out.println("Programa principal continua executando enquanto a thread está rodando");

		try {
			// Aguarda a thread terminar sua execução
			thread.join();
		} catch (InterruptedException e) {
			System.out.println("Thread principal interrompida ... ");
		}

		System.out.println("Programa finalizado!!");
	}
}
