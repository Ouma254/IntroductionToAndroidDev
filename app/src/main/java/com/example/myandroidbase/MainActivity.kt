package com.example.myandroidbase

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.myandroidbase.ui.theme.MyAndroidBaseTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAndroidBaseTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Welcoming Page"
                                )
                            },
                            navigationIcon = (
                                    {
                                        IconButton(
                                            onClick = { /*TODO*/ }
                                        ) {
                                            //this arrow icon helps you navigate backwards
                                            Icon(
                                                imageVector = Icons.Default.ArrowBack,
                                                contentDescription = "Moving backward"
                                            )
                                        }
                                    }
                                    )

                        ) 
                    },
                ){
                    val items = listOf(
                        "Item 1",
                        "Item 2",
                        "Item 3",
                        "Item 4",
                        "Item 5",
                        "Item 6",
                        "Item 7",
                        "Item 8",
                        "Item 9",
                        "Item 10",
                        "Item 11",
                        "Item 12",
                        "Item 13",
                        "Item 14",
                        "Item 15",
                        "Item 16",
                        "Item 17",
                        "Item 18",
                        "Item 19",
                        "Item 20",
                        "Item 21",
                        "Item 22",
                        "Item 23"

                    )
                    LazyColumn {
                         item {
                             Text(
                                 text = "Header",
                                 style = MaterialTheme.typography.bodyMedium,
                                 modifier = Modifier.padding(16.dp)
                             )
                         }
                        item {
                            LazyRow(
                                modifier = Modifier
                                    .padding(
                                        start = 16.dp,
                                        end = 16.dp,
                                        top = 8.dp,
                                        bottom = 8.dp
                                    )
                                    .height(100.dp)
                            ) {
                                itemsIndexed(items) {index, item ->
                                Box(
                                    modifier = Modifier
                                        .padding(8.dp)
                                        .background(Color.Gray)
                                        .size(100.dp)
                                ) {
                                    Text(
                                        text = "$item ($index)",
                                        color = Color.Gray,
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }

                                }

                            }
                        }
                        item {
                            Text(
                                text = "FOOTER",
                                style = MaterialTheme.typography.bodyLarge,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                        items((1..100).toList()) {item ->
                            Text(
                                text = "The Item $item",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                            )

                        }
                    }

                }

            }
        }
    }
}



//items((11..20).toList()) { item ->
//    Text(
//        text = "Item $item",
//        style = MaterialTheme.typography.body1,
//        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
//    )
//}
//}


//LazyColumn(modifier = Modifier.fillMaxSize()) {
//    item {
//        Text(
//            text = "Header",
//            style = MaterialTheme.typography.h6,
//            modifier = Modifier.padding(16.dp)
//        )
//    }
//    item {
//        LazyRow(
//            modifier = Modifier
//                .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
//                .height(100.dp)
//        ) {
//            itemsIndexed(items) { index, item ->
//                Box(
//                    modifier = Modifier
//                        .padding(8.dp)
//                        .background(Color.Gray)
//                        .size(100.dp)
//                ) {
//                    Text(
//                        text = "$item ($index)",
//                        color = Color.White,
//                        modifier = Modifier.align(Alignment.Center)
//                    )
//                }
//            }
//        }
//    }
//    item {
//        Text(
//            text = "Footer",
//            style = MaterialTheme.typography.body2,
//            modifier = Modifier.padding(16.dp)
//        )
//    }



//LazyColumn {
//    items(items) { item ->
//        Text(
//            text = item,
//            style = MaterialTheme.typography.body1,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp)
//        )
//        Divider(color = Color.Gray, thickness = 1.dp)
//    }
//}
