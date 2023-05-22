package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        name = "Billy Bob",
                        title = "UX Designer",
                        phone = "555-555-5555",
                        email = "DoubleBUX@gmail.com",
                        website = "www.DoubleBUX.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    title: String,
    phone: String,
    email: String,
    website: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo",
            modifier = Modifier.size(100.dp)
        )

        Text(
            text = name,
            fontSize = 36.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = title,
            modifier = Modifier
                .padding(top = 16.dp),
            fontSize = 24.sp
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = phone,
                modifier = Modifier
                    .padding(top = 16.dp),
                fontSize = 20.sp
            )

            Text(
                text = email,
                modifier = Modifier
                    .padding(top = 16.dp),
                fontSize = 20.sp
            )

            Text(
                text = website,
                modifier = Modifier
                    .padding(top = 16.dp),
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            name = "Tim Porter",
            title = "UX Designer",
            phone = "555-555-5555",
            email = "Portim@gmail.com",
            website = "www.PorTimDesign.com"
        )
    }
}
