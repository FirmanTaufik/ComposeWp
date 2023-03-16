package com.app.composetest

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.composetest.ui.theme.ComposeTestTheme
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    showTest()
                }
            }
        }
    }
}


@Composable
fun showTest() {
    Column(
        Modifier.fillMaxSize()
    ) {
        header()
        topContent()
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "bbbb")
            Text(text = "bbbb")

        }
        Text(text = "aaaaaa")
        Text(text = "aaaaaa")

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        topContent()
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun topContent() {
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp / 2
    val height = configuration.screenWidthDp / 2 + 15
    Column(Modifier.fillMaxWidth()) {
        Text(
            "Best of Month",
            style = TextStyle(fontWeight = FontWeight.Bold ),
            fontSize = 20.sp
        )
      /*  GlideImage(
            model = "https://cdn.dribbble.com/users/3020341/screenshots/14808564/media/8bbd042843457e6c8db2b161aff9a846.png?compress=1&resize=768x576&vertical=top",
            contentDescription = null,
            Modifier
                .clip(RoundedCornerShape(10.dp))
                .width(width.dp)
                .height(height.dp),
            contentScale = ContentScale.Crop
        )*/
    }
}

@Composable
fun header() {
    Row(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(value = "", onValueChange = {

        }, label = {
            Text("Find Walpaper", style = TextStyle(color = Color.Gray))
        },
            shape = RoundedCornerShape(12.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

