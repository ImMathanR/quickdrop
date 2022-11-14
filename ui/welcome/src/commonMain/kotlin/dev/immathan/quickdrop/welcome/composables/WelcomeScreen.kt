import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.immathan.quickdrop.common.network.getPlatform

@Composable
fun WelcomeScreen() {
    Text("Hello world: ${getPlatform().name}")
}