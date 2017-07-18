import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.layout.VBox
import scalafx.scene.text.Text

/**
  * Created by aokabi on 2017/07/19.
  */
object HelloWorld extends JFXApp {
  stage = new PrimaryStage {
    title = "ScalaFX Hello World"
    scene = new Scene {
      root = new VBox {
        children = new Text {
            text = "Hello"
          
        }
      }
    }
  }
}
