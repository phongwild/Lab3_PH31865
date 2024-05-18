package phongtaph31865.poly.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
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
import androidx.core.graphics.toColorInt
import coil.compose.AsyncImage

private data class ItemThanhToan (var color: Color, var idRes: Int, var title: String)
class Bai5 : ComponentActivity() {
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
                .background(color = Color("#262221".toColorInt())),

        ) {
            GetTextTitle(title = title)
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
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
                color = Color("#fa8500".toColorInt()),
                R.drawable.ic_paypal,
                "PayPal"
            )
            GetRowItem(
                color = Color("#ec1287".toColorInt()),
                R.drawable.ic_momo,
                "Momo"
            )
            GetRowItem(
                color = Color("#01c2fe".toColorInt()),
                R.drawable.ic_zalo_pay,
                "Zalo Pay"
            )
            GetRowItem(
                color = Color.White,
                R.drawable.ic_visa,
                "Visa"
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
    fun GetRowItem(color: Color, linkImg: Int, nd: String) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 7.dp, bottom = 5.dp)
                .background(color = color, shape = RoundedCornerShape(10.dp))
                .height(70.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = linkImg),
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .padding(start = 20.dp),
                contentDescription = null
            )
            Text(
                text = nd,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 30.dp),
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