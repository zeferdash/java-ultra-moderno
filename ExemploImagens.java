import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;

public class ExemploImagens extends Application {
	public static void main (String [] args) {
		launch(args);
	}

	@Override
	public void start(Stage palco) {
		// Caminho absoluto para a imagem
		Image imagem = new Image("file:///C:/Users/akira/OneDrive/Imagens/A1.png");

		ImageView imageView = new ImageView(imagem);

		// Configuração para ajustar o tamanho da imagem
		imageView.setFitWidth(613); // Largura desejada
		imageView.setFitHeight(640); // Altura desejada
		imageView.setPreserveRatio(true); // Mantém a proporção original da imagem

		VBox layout = new VBox(imageView);

		Scene cena = new Scene(layout, 700, 700);
		palco.setScene(cena);
		palco.show();
	}
}