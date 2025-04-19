import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class ExemploVideos extends Application {
	@Override
	public void start ( Stage palcoPrincipal ) {

	Media media = new Media("file:///C:/Users/akira/Downloads/001.mp4");
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	MediaView mediaView = new MediaView(mediaPlayer);

	HBox hbox = new HBox();
	hbox.getChildren().add(mediaView);

	Scene cena = new Scene(hbox, 1280, 720);
	
	palcoPrincipal.setTitle("Teste do exemplo Videos");
	palcoPrincipal.setScene(cena);
	palcoPrincipal.show();

	mediaPlayer.play();
	}

	public static void main ( String [] args ) {
		launch(args);
	}
}

	