package pbru_ice.pramrudeevajasen.ice_59;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //explicit
    private Button AboutmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
        buttoncontroller();
    }

    private void buttoncontroller() {
        AboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/oil.dii.5"))
            }
        });
    }

    private void bindWidget() {
        AboutmeButton = (Button) findViewById(R.id.button);
    }
    //bindwidget



}//method
