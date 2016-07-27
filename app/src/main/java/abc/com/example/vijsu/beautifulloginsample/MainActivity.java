package abc.com.example.vijsu.beautifulloginsample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.background);

        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.run);

        Bitmap blurredBitmap = BlurBuilder.blur(this, originalBitmap );

        view.setBackgroundDrawable( new BitmapDrawable( getResources(), blurredBitmap ) );
    }
}
