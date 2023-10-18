package com.example.layoutcomposable


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutcomposable.ui.theme.LayoutComposableTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainAPK()
                }
            }
        }
    }
}

@Composable
fun MainAPK(){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
        .padding(20.dp)
    )
    {
        Text(text = "Raynanda Aqiyas Pramardhika", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        KetCuaca()
        KetSuhu()
        KetDesc()
    }

}

@Composable
fun KetCuaca(){
    val birumuda = Color(0xFFBAE1FF)
    val image = painterResource(id = R.drawable.background)
    Box(modifier = Modifier
        .clip(shape = RoundedCornerShape(23.dp))
        .fillMaxWidth()
        .background(color = birumuda)
        .padding(16.dp)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()

        ){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(180.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                text = "Rain",
                modifier = Modifier.align(Alignment.CenterHorizontally) // Mengatur teks di tengah secara horizontal
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun KetSuhu(){
    val lokasi = painterResource(id = R.drawable.lokasi)
    Box(
     modifier = Modifier
         .clip(shape = RoundedCornerShape(23.dp))
         .fillMaxWidth()
         .background(Color.White)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 80.sp,
                text = "24°C"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Image(
                    modifier = Modifier.size(50.dp),
                    painter = lokasi,
                    contentDescription ="")
                
                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    text = "Yogyakarta"
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                text = "Kasihan, Kabupaten Bantul,\nDaerah Istimewa Yogyakarta")

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun KetDesc(){
    val birumuda = Color(0xFFBAE1FF)
    Box (
        modifier = Modifier
            .clip(shape = RoundedCornerShape(23.dp))
            .fillMaxWidth()
            .background(color = birumuda)
            .padding(16.dp)
            .height(200.dp)
    ){
    Column(modifier = Modifier
        .padding(horizontal = 16.dp, vertical = 13.dp)

    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Box(modifier = Modifier){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Humidity",
                        fontSize = 18.sp
                    )
                    Text(
                        text = "79%",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }
            Box(modifier = Modifier){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "UV Index",
                        fontSize = 18.sp )
                    Text(
                        text = "9/10",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }
        }
        Spacer(modifier = Modifier.height(27.dp))
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Box(modifier = Modifier){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Humidity",
                        fontSize = 18.sp
                    )
                    Text(
                        text = "5.00 AM",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }
            Box(modifier = Modifier){
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Sunset",
                        fontSize = 18.sp )
                    Text(
                        text = "5.40 PM",
                        fontSize = 23.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }
            }
        }
    }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LayoutComposableTheme {
        MainAPK()
    }
}