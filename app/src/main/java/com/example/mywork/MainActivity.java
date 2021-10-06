package com.example.mywork;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Fragment weixin0fragment=new weixinfragment();
    private Fragment weixin1fragment=new weixinfragment1();
    private Fragment weixin2fragment=new weixinfragment2();
    private Fragment weixin3fragment=new weixinfragment3();
    private LinearLayout linearLayout1,linearLayout2,linearLayout3,linearLayout4;
    private ImageView imageView1,imageView2,imageView3,imageView4;

    private FragmentManager fragmentMananger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout1=findViewById(R.id.linearLayout1);
        linearLayout2=findViewById(R.id.linearLayout2);
        linearLayout3=findViewById(R.id.linearLayout3);
        linearLayout4=findViewById(R.id.linearLayout4);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);



        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
        initfragment();
        showfragment(0);
        imageView1.setImageResource(R.drawable.p5);


    }

    private void initfragment(){
        fragmentMananger=getFragmentManager();
        FragmentTransaction transaction= fragmentMananger.beginTransaction();
        transaction.add(R.id.content, weixin0fragment);
        transaction.add(R.id.content, weixin1fragment);
        transaction.add(R.id.content, weixin2fragment);
        transaction.add(R.id.content, weixin3fragment);
        transaction.commit();
    }
    private void hidefragment(FragmentTransaction transaction){
        transaction.hide( weixin0fragment);
        transaction.hide( weixin1fragment);
        transaction.hide( weixin2fragment);
        transaction.hide( weixin3fragment);

    }

    public void onClick(View v){
        hidebot();
        switch (v.getId()){
            case R.id.linearLayout1:imageView1.setImageResource(R.drawable.p5);showfragment(0);break;
            case R.id.linearLayout2:imageView2.setImageResource(R.drawable.p6);showfragment(1);break;
            case R.id.linearLayout3:imageView3.setImageResource(R.drawable.p7);showfragment(2);break;
            case R.id.linearLayout4:imageView4.setImageResource(R.drawable.p8);showfragment(3);break;
            default:break;
        }
    }

    private void showfragment(int i) {
        FragmentTransaction transaction=fragmentMananger.beginTransaction();
        hidefragment(transaction);
        switch(i){
            case 0:transaction.show(weixin0fragment);break;
            case 1:transaction.show(weixin1fragment);break;
            case 2:transaction.show(weixin2fragment);break;
            case 3:transaction.show(weixin3fragment);break;
            default:break;
        }transaction.commit();

    }
    private void hidebot(){
        imageView1.setImageResource(R.drawable.a1);
        imageView2.setImageResource(R.drawable.a2);
        imageView3.setImageResource(R.drawable.a3);
        imageView4.setImageResource(R.drawable.a4);

    }
}