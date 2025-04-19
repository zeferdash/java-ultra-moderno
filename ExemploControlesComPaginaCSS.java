import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ExemploControlesComPaginaCSS extends Application {
	@Override
	public void start(Stage palco) {
		Label label = new Label("Olá mundo, sou uma etiqueta LABEL");
		label.getStyleClass().add("label");

		Button botao = new Button("Clique aqui");
		botao.getStyleClass().add("button");

		TextField campoTexto = new TextField();
		campoTexto.getStyleClass().add("textField");

		VBox layout = new VBox(label, botao, campoTexto);

		Scene cena = new Scene(layout, 300, 200);
		cena.getStylesheets().add("file:///C:/Curso/styles.css");

		palco.setScene(cena);
		palco.show();
	}

	public static void main(String [] args) {

	launch(args);
	}
}