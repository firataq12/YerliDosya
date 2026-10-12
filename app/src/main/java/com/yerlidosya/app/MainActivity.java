package com.yerlidosya.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(18), dp(20), dp(18));
        root.setBackgroundColor(Color.rgb(11, 13, 16));

        TextView title = new TextView(this);
        title.setText("YerliDosya");
        title.setTextColor(Color.WHITE);
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);

        root.addView(title, new LinearLayout.LayoutParams(
                -1,
                dp(55)
        ));

        TextView subtitle = new TextView(this);
        subtitle.setText("Dosyalar");
        subtitle.setTextColor(Color.rgb(170, 175, 185));
        subtitle.setTextSize(15);

        root.addView(subtitle, new LinearLayout.LayoutParams(
                -1,
                dp(35)
        ));

        TextView empty = new TextView(this);
        empty.setText("YerliDosya hazırlanıyor...");
        empty.setTextColor(Color.WHITE);
        empty.setTextSize(18);
        empty.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams emptyParams =
                new LinearLayout.LayoutParams(-1, 0, 1);

        root.addView(empty, emptyParams);

        setContentView(root);
    }
}
