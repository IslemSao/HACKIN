package com.example.sttuter

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import android.content.Intent

//let make a composable that display an image then a button
@Composable
fun home(context: Context) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFF5F5F5))
            .padding(32.dp)
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Welcome to\nour mobile\napp!",
            style = TextStyle(
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.montserrat)),
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.doctor),
            contentDescription = "image description",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(323.dp)
                .height(320.dp)
        )
        Text(
            text = "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. ",
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 27.03.sp,
                fontFamily = FontFamily(Font(R.font.roboto)),
                fontWeight = FontWeight(100),
                color = Color(0xFF747474),
                textAlign = TextAlign.Center,
            )
        )
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    val intent = Intent(context, SignUp::class.java)
                    startActivity(context, intent, null)
                }
                .width(233.dp)
                .height(60.dp)
                .background(color = Color(0xFF20B2AA), shape = RoundedCornerShape(size = 20.dp))
                .padding(start = 50.dp, top = 16.dp, end = 50.dp, bottom = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.rocketlaunch),
                contentDescription = "image description",
                contentScale = ContentScale.None,
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp)
            )
            Text(
                text = "Register now",
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )
            )
        }

    }
}


@Composable
fun SingUp(context: Context) {

    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0x1A000000),
                shape = RoundedCornerShape(size = 24.dp)
            )
            .width(380.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 24.dp))
            .padding(bottom = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign Up",
            style = TextStyle(
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(400),
                color = Color(0xFF0A0A0A),
                textAlign = TextAlign.Center,
            )
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {
            block(text = "First Name:")
            block(text = "Last Name:")
        }

        Spacer(modifier = Modifier.height(10.dp))
        block(270, "Email address:")
        Spacer(modifier = Modifier.height(15.dp))
        block(270, "Phone number:")
        Spacer(modifier = Modifier.height(15.dp))
        block(270, "Password:")
        Spacer(modifier = Modifier.height(15.dp))
        block(270, "Confirm password:")
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    val intent = Intent(context, profile::class.java)
                    startActivity(context, intent, null)
                }
                .width(300.dp)
                .height(42.dp)
                .background(color = Color(0xFF20B2AA), shape = RoundedCornerShape(size = 8.dp))
                .padding(start = 14.dp, top = 5.5.dp, end = 13.dp, bottom = 6.5.dp)
        ) {
            Text(
                text = "create an account",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )
            )
        }
        Spacer(
            modifier = Modifier.height(5.dp)
        )
        Text(
            modifier = Modifier.clickable {
                val intent = Intent(context, signIn::class.java)
                startActivity(context, intent, null)
            },
            text = "Already have an account?",
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(300),
                color = Color(0xFF161616),
                textAlign = TextAlign.Center,
            )

        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun SingUpPreview() {
//    SingUp()
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun block(width: Int = 129, text: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically),
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(100),
                color = Color(0xFF000000),
            )
        )
        val text = remember { mutableStateOf("") }
        SearchBar(
            searchText = text,
            onSearchTextChange = { text.value = it },
            onSearchClear = {},
            modifier = Modifier
                .width(width.dp)
                .height(45.dp)
        )

    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun SearchBar(
    focus: Boolean = true,
    searchText: MutableState<String>,
    onSearchTextChange: (String) -> Unit,
    onSearchClear: () -> Unit,
    modifier: Modifier = Modifier,
    cornerRadius: CornerSize = CornerSize(30.dp)
) {


    TextField(
        value = searchText.value,
        onValueChange = {
            onSearchTextChange(it)
        },
        textStyle = TextStyle.Default.copy(fontSize = 10.sp),
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color(0xFFFAFAFA),
            textColor = Color(0xFF1A1F96),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        shape = RoundedCornerShape(corner = cornerRadius),
        keyboardActions = KeyboardActions(
            onSearch = {
                // Handle search action if needed
            }
        ),
        modifier = modifier
            .padding(0.dp)
            .border(
                width = 0.6.dp,
                color = Color(0xFFCCCCCC),
                shape = RoundedCornerShape(size = 15.dp)
            )
    )
}


//@Preview(showBackground = true)
//@Composable
//fun blockPreview() {
//    block()
//}


//@Composable
//fun header() {
//    Row(
//        modifier = Modifier
//            .width(390.dp)
//            .height(100.dp)
//            .background(color = Color(0xFFFFFFFF))
//            .padding(20.dp),
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceBetween
//    ) {
//        Image(
//            modifier = Modifier
//                .padding(1.dp),
//            painter = painterResource(id = R.drawable.vector),
//            contentDescription = "image description",
//        )
//        Image(
//            modifier = Modifier
//                .padding(1.dp)
//                .width(104.65823.dp)
//                .height(31.87952.dp),
//            painter = painterResource(id = R.drawable.layer1),
//            contentDescription = "image description",
//            contentScale = ContentScale.Fit
//        )
//    }
////    Box(modifier = Modifier.offset(x = 110.dp, y = 10.dp)) {
////        popUp()
////    }
//}

@Composable
fun header(context: Context) {
    Row(
        modifier = Modifier
            .width(390.dp)
            .height(100.dp)
            .background(color = Color(0xFFFFFFFF))
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
//        Image(
//            modifier = Modifier
//                .padding(1.dp),
//            painter = painterResource(id = R.drawable.vector),
//            contentDescription = "image description",
//        )
        Text(
            modifier = Modifier.clickable {
                val intent = Intent(context, profile::class.java)
                startActivity(context, intent, null)
            },
            text = "Profile",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(300),
                color = Color(0xFF9E9E9E),
            ),
            textAlign = TextAlign.Center

        )
        Text(
            modifier = Modifier.clickable {
                val intent = Intent(context, doctors::class.java)
                startActivity(context, intent, null)
            },
            text = "Doctors",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(300),
                color = Color(0xFF9E9E9E),
            ),
            textAlign = TextAlign.Center
        )
        Text(
            modifier = Modifier.clickable {
                val intent = Intent(context, levels::class.java)
                startActivity(context, intent, null)
            },
            text = "levels",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(300),
                color = Color(0xFF9E9E9E),
            ),
            textAlign = TextAlign.Center
        )
        Image(
            modifier = Modifier
                .padding(1.dp)
                .width(104.65823.dp)
                .height(31.87952.dp),
            painter = painterResource(id = R.drawable.layer1),
            contentDescription = "image description",
            contentScale = ContentScale.Fit
        )
    }

//    Box(modifier = Modifier.offset(x = 110.dp, y = 10.dp)) {
//        popUp()
//    }
}

@Composable
fun singUpPage(context: Context) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        header(context)
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(20.dp)
        ) {
            SingUp(context)
        }
    }
}


@Composable
fun ReplySearchBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White, CircleShape),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "search",
            modifier = Modifier.padding(start = 16.dp),
            tint = MaterialTheme.colorScheme.outline
        )
        Text(
            text = "Rechercher dans l’historique",
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0x1A000000),
            ),
            modifier = Modifier
                .weight(1f)
                .padding(16.dp),
        )
    }
}

//@Preview()
//@Composable
//fun ReplySearchBarPreview() {
//    ReplySearchBar()
//}

@Composable
fun Doctor() {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFDEDCDC),
                shape = RoundedCornerShape(size = 15.dp)
            )
            .width(340.dp)
            .height(189.dp)
            .background(color = Color(0xFFF4F4F4), shape = RoundedCornerShape(size = 15.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
        ) {
            docProfile()
            docProfileList()
        }

    }
}
//
//@Preview()
//@Composable
//fun DoctorPreview() {
//    Doctor()
//}

@Composable
fun docProfile() {
    Column(
        modifier = Modifier
            .border(
                width = 4.dp,
                color = Color(0xFF20B2AA),
                shape = RoundedCornerShape(size = 15.dp)
            )
            .width(113.dp)
            .height(160.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 15.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically)
    ) {
        Image(
            modifier = Modifier
                .width(45.dp)
                .height(45.dp)
                .clip(CircleShape), // Clip to a circular shape,
            painter = painterResource(id = R.drawable.cover),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = "Alex Rose",
            style = TextStyle(
                fontSize = 12.sp,
                lineHeight = 24.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
                textAlign = TextAlign.Center,
            )
        )
        Text(
            text = "4 commits",
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 24.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
        ) {
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                painter = painterResource(id = R.drawable.star),
                contentDescription = "image description",
                contentScale = ContentScale.Fit
            )
            Text(
                text = "4.5",
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

//@Preview()
//@Composable
//fun docProfilePreview() {
//    docProfile()
//}

@Composable
fun docProfileList() {
    Column(
        modifier = Modifier
            .shadow(
                elevation = 4.dp,
                spotColor = Color(0x40000000),
                ambientColor = Color(0x40000000)
            )
            .width(181.dp)
            .height(153.dp)
            .background(color = Color(0xFFF5F5F5), shape = RoundedCornerShape(size = 15.dp))
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Age:   43 years old",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0xFF303031),
            )
        )
        Text(
            text = "years of experience : 15 years ",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0xFF303031),
            )
        )
        Text(
            text = "phone.num     0666.66.66.66",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(600),
                color = Color(0xFF303031),
            )
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(color = Color(0xFFFFFF), shape = RoundedCornerShape(size = 15.dp))
        ) {
            Row(
                modifier = Modifier
                    .width(66.dp)
                    .height(25.dp)
                    .background(
                        color = Color(0xFF20B2AA),
                        shape = RoundedCornerShape(size = 15.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Send a message ",
                    style = TextStyle(
                        fontSize = 5.5.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF2B2B2B),
                    )
                )
            }

            Row(
                modifier = Modifier
                    .width(66.dp)
                    .height(25.dp)
                    .background(
                        color = Color(0xFF20B2AA),
                        shape = RoundedCornerShape(size = 15.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "take an \n" +
                            "appointement",
                    style = TextStyle(
                        fontSize = 5.5.sp,
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF2B2B2B),
                    ),
                    textAlign = TextAlign.Center

                )
            }


        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

//@Preview()
//@Composable
//fun docProfileListPreview() {
//    docProfileList()
//}

@Composable
fun docScreen(context: Context) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        header(context)
        Spacer(modifier = Modifier.height(20.dp))
        ReplySearchBar()
        Spacer(modifier = Modifier.height(20.dp))
        for (i in 0..2) {
            Doctor()
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}


@Composable
fun profilePage(context: Context) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        header(context)
        Spacer(modifier = Modifier.height(40.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp),
                painter = painterResource(id = R.drawable.rectangle),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds
            )
            Text(
                text = "Arya Muller ",
                style = TextStyle(
                    fontSize = 24.77.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(700),
                    color = Color(0xFF000000),
                )
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.recall), contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .border(
                            width = 0.dp,
                            color = Color(0x80F0F2F5),
                            shape = RoundedCornerShape(size = 24.77119.dp)
                        )
                        .padding(0.dp)
                        .width(156.6368.dp)
                        .height(62.55468.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.recall1),
                    contentDescription = "",
                    modifier = Modifier
                        .border(
                            width = 0.dp,
                            color = Color(0x80F0F2F5),
                            shape = RoundedCornerShape(size = 24.77119.dp)
                        )
                        .padding(0.dp)
                        .width(156.6368.dp)
                        .height(62.55468.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 24.77119.dp)
                        )
                )

            }
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.recall2), contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .border(
                            width = 0.dp,
                            color = Color(0x80F0F2F5),
                            shape = RoundedCornerShape(size = 24.77119.dp)
                        )
                        .padding(0.dp)
                        .width(156.6368.dp)
                        .height(62.55468.dp)

                )
                Image(
                    painter = painterResource(id = R.drawable.recall3),
                    contentDescription = "",
                    modifier = Modifier
                        .border(
                            width = 0.dp,
                            color = Color(0x80F0F2F5),
                            shape = RoundedCornerShape(size = 24.77119.dp)
                        )
                        .padding(0.dp)
                        .width(156.6368.dp)
                        .height(62.55468.dp)

                )

            }
        }

        Spacer(modifier = Modifier.height(40.dp))
        progress()
    }
}


@Composable
fun progressBar(progress: Int = 61) {
    Box(
        modifier = Modifier
            .width(160.88696.dp)
            .height(10.74063.dp)
    ) {
        Box(
            modifier = Modifier
                .alpha(0.2f)
                .width(160.88696.dp)
                .clip(RoundedCornerShape(4.dp))
                .height(10.74063.dp)
                .background(color = Color(0xFF98005F))
        ) {
        }
        Box(
            modifier = Modifier
                .width(progress.dp)
                .height(10.74063.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(color = Color(0xFF98005F)),
        ) {
        }

    }
}

@Composable
fun left() {
    Column {
        Column {
            Text(
                text = "Food Safety",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    letterSpacing = 0.02.sp,
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            progressBar(40)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column {
            Text(
                text = "Compliance Protocols",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    letterSpacing = 0.02.sp,
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            progressBar(55)
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column {
            Text(
                text = "Social Media Policies",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                    letterSpacing = 0.02.sp,
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            progressBar(70)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun leftPreview() {
//    left()
//}

@Composable
fun right() {
    Column(modifier = Modifier.padding(top = 50.dp)) {
        Column {
            Text(
                text = "28%",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xB2000000),
                    textAlign = TextAlign.Right,
                    letterSpacing = 0.02.sp,
                )
            )

            Text(
                text = "Correct",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0x4D000000),
                    letterSpacing = 0.02.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column {
            Text(
                text = "35%",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xB2000000),
                    textAlign = TextAlign.Right,
                    letterSpacing = 0.02.sp,
                )
            )

            Text(
                text = "Correct",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0x4D000000),
                    letterSpacing = 0.02.sp,
                )
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Column {
            Text(
                text = "40%",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0xB2000000),
                    textAlign = TextAlign.Right,
                    letterSpacing = 0.02.sp,
                )
            )

            Text(
                text = "Correct",
                style = TextStyle(
                    fontSize = 14.86.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(600),
                    color = Color(0x4D000000),
                    letterSpacing = 0.02.sp,
                )
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun rightPreview() {
//    right()
//}

@Composable
fun progress() {
    Row(
        modifier = Modifier
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 15.dp))
            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
    ) {
        left()
        right()
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun progressPreview() {
//    progress()
//}

@Composable
fun loginBox(context: Context) {
    Column(
        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.CenterVertically),
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color(0xFFBEBEBE),
                shape = RoundedCornerShape(size = 15.dp)
            )
            .width(352.dp)
            .height(537.dp)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 15.dp))
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Log in ",
            style = TextStyle(
                fontSize = 25.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(700),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .padding(0.dp)
                .width(319.00156.dp)
                .height(1.dp)
                .background(color = Color(0xFF627E94))
        ) {}
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "username",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xB2000000),
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        val username = remember { mutableStateOf("") }
        SearchBar(
            searchText = username,
            onSearchTextChange = { username.value = it },
            onSearchClear = {},
            modifier = Modifier
                .width(319.00156.dp)
                .height(40.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth()) {

            Text(
                text = "password",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xB2000000),
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        val password = remember { mutableStateOf("") }
        SearchBar(
            searchText = password,
            onSearchTextChange = { password.value = it },
            onSearchClear = {},
            modifier = Modifier
                .width(319.00156.dp)
                .height(40.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "forget password ?",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF0A0A0A),
                )
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    val intent = Intent(context, profile::class.java)
                    startActivity(context, intent, null)
                }
                .width(213.dp)
                .height(42.dp)
                .background(color = Color(0xFF20B2AA), shape = RoundedCornerShape(size = 8.dp))
                .padding(start = 14.dp, top = 5.5.dp, end = 13.dp, bottom = 6.5.dp)
        ) {
            Text(
                text = "Log in",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun loginBoxPreview() {
//    loginBox()
//}

@Composable
fun loginPage(context: Context) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(90.dp))
        Image(
            modifier = Modifier
                .padding(1.dp)
                .width(155.dp)
                .height(58.dp),
            painter = painterResource(id = R.drawable.layer2),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Spacer(modifier = Modifier.height(70.dp))
        loginBox(context)
        Spacer(modifier = Modifier.height(20.dp))
    }
}


@Composable
fun element(image: Int, text: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.poppins)),
                fontWeight = FontWeight(400),
                color = Color(0xFF98005F),
                textAlign = TextAlign.Center,
            )
        )
        Image(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 149.dp)
                )
                .width(145.dp)
                .height(149.dp),
            painter = painterResource(id = image),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds
        )
        Box(
            modifier = Modifier
                .offset(x = 50.dp, y = -10.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 24.dp)
                )
                .width(54.dp)
                .height(27.dp)
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 24.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "test",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF98005F),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}

@Composable
fun levelPage(context: Context) {
    Column(
        modifier = Modifier
            .background(Color(0xFFF5F5F5)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically)
    ) {
        header(context)
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            element(R.drawable.ellipse4, "Level 1")
            element(R.drawable.ellipse5, "Level 2")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            element(R.drawable.ellipse6, "Level 3")
            element(R.drawable.ellipse7, "Level 4")
        }
        element(image = R.drawable.ellipse8, text = "Level 5")

    }
}


@Composable
fun popUp() {
    Box() {
        Column(
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    spotColor = Color(0x40000000),
                    ambientColor = Color(0x40000000)
                )
                .width(150.dp)
                .height(150.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF000000),
                    shape = RoundedCornerShape(size = 15.dp)
                )
                .background(color = Color(0xFFEBE7E7), shape = RoundedCornerShape(size = 15.dp))
                .padding(10.dp)
        ) {
            Text(
                text = "Profile",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Doctors",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Levels",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.poppins)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun popUpPreview() {
//    popUp()
//}