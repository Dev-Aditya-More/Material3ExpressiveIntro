package com.example.material3intro

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.LoadingIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun LoadingIndicatorr() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // First Indicator
        var anim1 by remember { mutableStateOf(false) }
        Box(
            modifier = Modifier
                .size(85.dp)
                .clickable { anim1 = !anim1 },
            contentAlignment = Alignment.Center
        ) {
            if (anim1) {
                LoadingIndicator(modifier = Modifier.size(85.dp))
            } else {
                Box(
                    modifier = Modifier
                        .size(85.dp)
                        .background(Color.Gray, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painterResource(R.drawable.play_arrow_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }

        // Second Indicator
        var anim2 by remember { mutableStateOf(false) }
        Box(
            modifier = Modifier
                .size(85.dp)
                .clickable { anim2 = !anim2 },
            contentAlignment = Alignment.Center
        ) {
            if (anim2) {
                LoadingIndicator(
                    modifier = Modifier.size(85.dp),
                    polygons = LoadingIndicatorDefaults.IndeterminateIndicatorPolygons.take(2)
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(85.dp)
                        .background(Color.Gray, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painterResource(R.drawable.play_arrow_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }

        // Third Indicator
        var anim3 by remember { mutableStateOf(false) }
        Box(
            modifier = Modifier
                .size(85.dp)
                .clickable { anim3 = !anim3 },
            contentAlignment = Alignment.Center
        ) {
            if (anim3) {
                ContainedLoadingIndicator(modifier = Modifier.size(85.dp))
            } else {
                Box(
                    modifier = Modifier
                        .size(85.dp)
                        .background(Color.Gray, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painterResource(R.drawable.play_arrow_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }

        // Fourth Indicator
        var anim4 by remember { mutableStateOf(false) }
        Box(
            modifier = Modifier
                .size(85.dp)
                .clickable { anim4 = !anim4 },
            contentAlignment = Alignment.Center
        ) {
            if (anim4) {
                ContainedLoadingIndicator(
                    modifier = Modifier.size(85.dp),
                    containerColor = Color.Cyan
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(85.dp)
                        .background(Color.Gray, shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painterResource(R.drawable.play_arrow_24dp_e3e3e3_fill0_wght400_grad0_opsz24),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}