import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploVideoStreaming extends Application {
	@Override	
	public void start (Stage palco) {
	
		WebView webView = new WebView();
		String urlDoVideo = "https://www.youtube.com/watch?v=z_zAsKmUIsE";

		webView.getEngine().load(urlDoVideo);
		
		Scene cena = new Scene(webView, 1280, 720);
		
		palco.setTitle("Exemplo vídeo streaming");
		palco.setScene(cena);
		palco.show();
	}

	public static void main (String [] args) {
		launch(args);
	}
}