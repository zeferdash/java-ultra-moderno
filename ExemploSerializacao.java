import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializacao{
	// Método para serializar os contatos
	private static void serializarContatos(List<Contato> listaContatos) throws IOException {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))) {
		outputStream.writeObject(listaContatos);
		System.out.println("Contatos serializados e salvos com sucesso!");
		}
	}

	// Método para desserializar e exibir os contatos
	@SuppressWarnings("unchecked")
	private static void desserializarContatos() throws IOException, ClassNotFoundException {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))) {
			List<Contato> contatosLidos = (List<Contato>) inputStream.readObject();
			for (Contato contato : contatosLidos ){
				System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
			}
		}
	}

	public static void main(String [] args){
		Contato contato1 = new Contato("João", "123456789");
		Contato contato2 = new Contato("Rafael", "987654321");

		List<Contato> listaContatos = new ArrayList<>();
		listaContatos.add(contato1);
		listaContatos.add(contato2);

		try {
			serializarContatos(listaContatos);
			desserializarContatos();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Erro ao manipular contatos: " + e.getMessage());
		}
	}
}