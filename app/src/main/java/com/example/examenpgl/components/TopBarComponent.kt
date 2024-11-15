package com.example.examenpgl.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(name: String){
    Text(text = name, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
}