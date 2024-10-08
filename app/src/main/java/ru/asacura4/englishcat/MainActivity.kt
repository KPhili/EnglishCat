package ru.asacura4.englishcat

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            title()
        }
    }

    @Composable
    private fun title() {
        Text(
            "English Cat", fontSize = 38.sp, fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(20.dp)
        )
    }

    @Composable
    private fun body() {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            groupCard(groupName = "Первая группа", itemsCount = 3)
            groupCard(groupName = "Вторая группа", itemsCount = 2)
        }
    }

    @Composable
    private fun groupCard(groupName: String, itemsCount: Int) {
        Row {
            Text(groupName)
            Text(itemsCount.toString())
        }
    }

    @Preview
    @Composable
    fun defaultPreview() {
        Column {
            title()
            body()
        }
    }

}
