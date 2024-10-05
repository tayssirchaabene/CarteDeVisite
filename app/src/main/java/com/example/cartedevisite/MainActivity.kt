import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.R

@Composable
fun MyBusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoSection()
        Spacer(modifier = Modifier.height(300.dp))
        ContactSection()
    }
}

@Composable
fun LogoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "Logo Android",
            modifier = Modifier.size(200.dp)
        )
        Text("Tayssir Chabaane ", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Android Developer", fontSize = 18.sp)
    }
}

@Composable
fun ContactSection() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.telephone_handle_silhouette),
                contentDescription = "Téléphone",
                tint = Color(0xFF3DDC84) ,
                modifier = Modifier.size(50.dp),
            )
            Text("+216 0123 456 789", modifier = Modifier.padding(start = 8.dp),textAlign = TextAlign.Center)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.mail),
                contentDescription = "Email",
                tint = Color(0xFF3DDC84),

                modifier = Modifier.size(50.dp),

            )
            Text("tayssirchabaane@yahoo.com", modifier = Modifier.padding(start = 10.dp),textAlign = TextAlign.Center)


        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ){
            Icon(painter = painterResource(R.drawable.mail),
                contentDescription = "Email",
                tint = Color(0xFF3DDC84),

                modifier = Modifier.size(50.dp),
                )
            Text("nourchabaane@yahoo.com", modifier = Modifier.padding(start = 10.dp),textAlign = TextAlign.Center)
        }
    }
}

@Composable
@Preview
fun PreviewMyBusinessCard() {
    MaterialTheme {
        Surface(color = Color.White) {
            MyBusinessCard()
        }
    }
}
