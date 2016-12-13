package com.xuxiaoxiao.android.actiondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActionDemoActivity extends AppCompatActivity {


    private Button mSendAction;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_demo);

        mSendAction = (Button) findViewById(R.id.btn_sendAction);
        mEditText = (EditText) findViewById(R.id.editText);
        mSendAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, mEditText.getText().toString());

                intent = Intent.createChooser(intent, "选择一个软件");
                startActivity(intent);

            }
        });
    }
}
