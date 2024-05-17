package phongtaph31865.poly.lab3

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

class Bai5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetLayout()
        }
    }

    @Preview
    @Composable
    fun GetLayout(title: String = "Thanh Toán") {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.DarkGray),

        ) {
            GetTextTitle(title = title)
            Row (
                modifier = Modifier.fillMaxWidth().height(3.dp)
                    .background(color = Color.Black)
                    .padding(20.dp)
            ){
            }
            GetDC(text = "Địa chỉ nhận hàng")
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp),
                horizontalArrangement = Arrangement.Start,

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
                Column(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    GetTTin(text = "Tri | 22222")
                    GetTTin(text = "Lang Trung Hau Doai")
                    GetTTin(text = "Tien Phong - Me Linh - Ha Noi")
                }
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(top = 20.dp, bottom = 20.dp)
            ) {
                GetTTin(text = "Vui lòng chọn các phương thức sau: ")
            }

            GetRowItem(
                color = Color.Yellow,
                "https://upload.wikimedia.org/wikipedia/commons/2/20/FPT_Polytechnic.png",
                "PayPal"
            )
            GetRowItem(
                color = Color.Cyan,
                "https://gcs.tripi.vn/public-tripi/tripi-feed/img/475223TdJ/anh-mo-ta.png",
                "Momo"
            )
            GetRowItem(
                color = Color.Magenta,
                "https://images2.thanhnien.vn/528068263637045248/2023/2/15/bong-da-sv-2aa-16764457958392020821477.jpg",
                "Zalo Pay"
            )
            GetRowItem(
                color = Color.White,
                "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2023/3/20/1159566/Bong-Da-Phui.jpg",
                "VN Pay"
            )
        }
    }

    @Composable
    fun GetDC(text: String) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,

        )
    }

    @Composable
    fun GetTTin(text: String) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp
        )
    }

    @Composable
    fun GetRowItem(color: Color, linkImg: String, nd: String) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(5.dp)
                .background(color = color, shape = RoundedCornerShape(15.dp))
                .height(70.dp)
                .fillMaxWidth()
        ) {
            AsyncImage(
                model = linkImg,
                modifier = Modifier
                    .width(60.dp)
                    .height(5.dp)
                    .padding(start = 20.dp),
                contentDescription = null
            )
            Text(
                text = nd,
                modifier = Modifier
                    .weight(1f)
                    .padding(10.dp),
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
            RadioButton(selected = false, onClick = { /*TODO*/ })
        }
    }

    @Composable
    fun GetTextTitle(title: String) {
        Text(
            text = title,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            fontSize = 30.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}