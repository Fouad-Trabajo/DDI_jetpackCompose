package com.example.tutorialjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorialjetpackcompose.ui.theme.TutorialJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /*
            Column {
        Row {
            mesage("mundoooo")
            mesage("Adios")
        }
        mesage("Adios")
        mesage("Adios")
    }
             */
            Column {
                tableMultiplicy(5)
                matrixIdentity(5)
                mesage("hola")
            }


        }
    }
}

@Preview
@Composable
fun previewBox() {
    Box(modifier= Modifier.fillMaxSize()){
        Image(
            painterResource(R.drawable.avatar1),
            contentDescription = null,
            modifier = Modifier.size(150.dp).clip(CircleShape))

        Image(
            painterResource(R.drawable.avatar2),
            contentDescription = null,
            modifier = Modifier.size(150.dp).clip(CircleShape).align(Alignment.BottomCenter))

        Icon(painterResource(R.drawable.ic_check),
            contentDescription = null,
            modifier = Modifier.align(Alignment.TopEnd))

    }
}

@Preview
@Composable
fun previewEjercicio12() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painterResource(R.drawable.avatar1), contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )

                Text(text = "MUCHACHO", modifier = Modifier)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ) {
                Image(
                    painterResource(R.drawable.avatar2), contentDescription = null,
                    modifier = Modifier
                        .size(150.dp)
                )
                Text(text = "MUCHACHA", modifier = Modifier)
            }

        }
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(1f)) {
            Image(
                painterResource(R.drawable.avatar3), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
            )
            Text(text = "PERRETE", modifier = Modifier)
        }
    }
}


@Preview
@Composable
fun previewEjercicio09() {
    Column(modifier = Modifier.fillMaxSize(), Arrangement.SpaceEvenly) {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painterResource(R.drawable.avatar1), contentDescription = null,
                modifier = Modifier
            )
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Image(
                painterResource(R.drawable.avatar2), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}


@Preview
@Composable
fun previewEjercicio08() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painterResource(R.drawable.avatar1), contentDescription = null,
                modifier = Modifier
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Image(
                painterResource(R.drawable.avatar2), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}


@Preview
@Composable
fun previewEjercicio07() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxHeight(0.5f)) {
            Image(
                painterResource(R.drawable.avatar1), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
            )
        }
        Row(modifier = Modifier.fillMaxHeight(1f)) {
            Image(
                painterResource(R.drawable.avatar2), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
            )
        }
    }
}

@Preview
@Composable
fun previewEjercicio05() {
    Row(modifier = Modifier.fillMaxSize(), Arrangement.SpaceBetween) {
        Image(
            painterResource(R.drawable.avatar1), contentDescription = null,
            modifier = Modifier
                .size(150.dp),
        )

        Image(
            painterResource(R.drawable.avatar2), contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )
    }
}


@Preview
@Composable
fun previewEjercicio11() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Image(
                painterResource(R.drawable.avatar1), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )

            Image(
                painterResource(R.drawable.avatar2), contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .weight(1f)
                    .align(Alignment.CenterVertically)
            )


        }
        Image(
            painterResource(R.drawable.avatar3), contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .weight(1f)
                .align(Alignment.CenterHorizontally)
        )
    }
}


@Preview
@Composable
fun preview() {
    Column {
        Row {
            tableMultiplicy(5)
            matrixIdentity(5)
        }
        mesage("mundo!")
        Image(
            painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Artist image"
        )
        SimpleText()
    }
}

@Composable
fun tableMultiplicy(table: Int) {
    Column {
        for (x in 1..10) {
            Text(text = "$table * $x = ${table * x}")
        }
    }
}

@Composable
fun SimpleText() {
    Text(
        text = "Hello World ",
        color = Color.Red,
        fontSize = 32.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun matrixIdentity(n: Int) {
    Column {
        for (x in 1..n) {
            Row {
                for (y in 1..n) {
                    if (x == y) {
                        Text(text = "1")
                    } else {
                        Text(text = "0")
                    }
                }
            }
        }
    }
}


@Composable
fun mesage(name: String) {
    Text(
        text = "Hola estoy haciendo scroll horizontal solo del texto $name",
        fontSize = 50.sp,
        //fontFamily = FontFamily(Font(R.font.bhutuka_expanded_one)),
        modifier = Modifier.horizontalScroll(
            rememberScrollState(0)
        )

    )
}


