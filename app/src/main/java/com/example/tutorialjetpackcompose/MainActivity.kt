package com.example.tutorialjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun previewBox() {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text("WhatsApp")
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Rounded.Home,
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Rounded.Menu,
                    contentDescription = null
                )
            }
        }
    )


    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Songs", "Artists", "Playlists")
    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Star)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.FavoriteBorder, Icons.Outlined.Star)

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
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


