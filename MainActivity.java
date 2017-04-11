package id.ac.umn.loadimagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        Picasso.with(this)
                .load("http://i.imgur.com/yE67dHz.jpg")
                .into(imageView1);
        Picasso.with(this)
                .load("http://i.imgur.com/ooxDEEx.jpg")
                .into(imageView2);
        Picasso.with(this)
                .load("http://i.imgur.com/xqlpTXM.jpg")
                .into(imageView3);
    }
}
