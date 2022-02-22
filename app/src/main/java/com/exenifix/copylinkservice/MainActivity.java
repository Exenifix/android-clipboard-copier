package com.exenifix.copylinkservice;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        String text = i.getStringExtra(Intent.EXTRA_TEXT);
        clipboard.setPrimaryClip(ClipData.newPlainText(text, text));
        Toast.makeText(this, "Copied text to clipboard!", Toast.LENGTH_SHORT).show();
    }
}
