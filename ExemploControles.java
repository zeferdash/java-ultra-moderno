import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ExemploControles extends Application {
	@Override
	public void start(Stage palco) {
		Label label = new Label("Olá mundo, sou uma etiqueta LABEL");
		label.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 28px; -fx-font-style: italic; -fx-font-weight: bold;");

		Button botao = new Button("Clique aqui");
		botao.setStyle("-fx-font-family: 'Verdana'; -fx-font-size: 24px;");

		TextField campoTexto = new TextField();
		campoTexto.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 16px;");

		VBox layout = new VBox(label, botao, campoTexto);

		Scene cena = new Scene(layout, 300, 200);

		palco.setScene(cena);
		palco.show();
	}

	public static void main(String [] args) {

	launch(args);
	}
}