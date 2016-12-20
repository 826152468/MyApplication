package app.myapplication;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  CheckBox chek1,check2,check3,check4;
    private String num1,num2,num3,num4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "by 莫晓彬", Toast.LENGTH_SHORT).show();
        CheckBox chek1=(CheckBox)findViewById(R.id.chek1);
        CheckBox check2=(CheckBox)findViewById(R.id.check2);
        CheckBox check3=(CheckBox)findViewById(R.id.check3);
        CheckBox check4=(CheckBox)findViewById(R.id.check4);
        chek1.setOnClickListener(new MyListener1());
        check2.setOnClickListener(new MyListener1());
        check3.setOnClickListener(new MyListener1());
        check4.setOnClickListener(new MyListener1());
        num1="假";
        num2="假";
        num3="假";
        num4="假";
    }
    private class MyListener1 implements View.OnClickListener{
        public void onClick(View view) {
           // AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
            // Toast.makeText(MainActivity.this, "你选中了选择一", Toast.LENGTH_SHORT).show();
            CheckBox chek1=(CheckBox)findViewById(R.id.chek1);
            CheckBox check2=(CheckBox)findViewById(R.id.check2);
            CheckBox check3=(CheckBox)findViewById(R.id.check3);
            CheckBox check4=(CheckBox)findViewById(R.id.check4);
           if (chek1.isChecked()==true)
           {
               num1="真";
               Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();

           }else
           {
               num1="假";
             //  Toast.makeText(MainActivity.this, "选择框1:"+num1+"\n"+"选择框2:"+num2+"\n"+"选择框3:"+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();

           }
        if(check2.isChecked()==true)
        {
            num2="真";
            Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
          }else{
            num2="假";
          //  Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
        }
            if(check3.isChecked()==true)
            {
                num3="真";
                Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
            }else{
                num3="假";
            //    Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
            }
            if(check4.isChecked()==true)
            {
                num4="真";
                Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
            }else{
                num4="假";
               // Toast.makeText(MainActivity.this, "选择框1："+num1+"\n"+"选择框2："+num2+"\n"+"选择框3："+num3+"\n"+"选择框4："+num4, Toast.LENGTH_SHORT).show();
            }

        }
                 }

        }








