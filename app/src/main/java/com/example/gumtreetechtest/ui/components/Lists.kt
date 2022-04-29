package com.example.gumtreetechtest.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.example.gumtreetechtest.R
import com.example.gumtreetechtest.ui.models.Car

@Composable
fun ScrollingList(items: List<Car>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.standard_padding))
    ) {
        items(items) { item ->
            HeaderText("${item.make}")
        }
    }
}

@Composable
fun SearchListItem(text:String){
        Row(modifier = Modifier
            .background(Color.LightGray)
            .border(
                dimensionResource(id = R.dimen.standard_border_thickness), Color.DarkGray
            )
            .padding(
                dimensionResource(id = R.dimen.medium_padding)
            )
            .fillMaxWidth()
            .wrapContentHeight(),
            horizontalArrangement = Arrangement.Center
        ){
            DescriptionText(
                text = text
            )
        }

}