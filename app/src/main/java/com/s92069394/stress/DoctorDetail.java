package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetail extends AppCompatActivity {

    private String[][] doctor_details1 =
            {
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name: MR N.M.S. HETTIGEDERA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) NOOR Z IQBAL", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR RANIL JAYAWARDANA", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MRS HARSHANI MEEGASWATTE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor Name: Dr W M HILARY COORAY", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 900", "Expirience:1 Year"},
                    {"Doctor Name: DR ASANKA DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 900", "Expirience:1 Year"},
                    {"Doctor Name: DR . FARIS", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1200"},
                    {"Doctor Name: DR ROSHAN GOVINNAGE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 900", "Expirience:1 Year"},
                    {"Doctor Name: DR KANCHANA KAPUGAMA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 900", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},

            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name: B AATHAVAN", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: K. ALAGARATNAM", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: ANIL P AMBAWATTA", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1200"},
                    {"Doctor Name: DR M.RIZAN BADURDEENE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: DR MIHIRA BANDARA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
            };


    private String[][] doctor_details5 =
            {
                    {"Doctor Name: DR STANLEY AMARASEKARA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) DR K. ARULNITHY", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: DR GODVIN CONSTANTINE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR S.N.B DOLAPIHILLA", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) DR MERVYN FERNANDO", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 2900", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: MS MAHESHANI WIMALATHUNGA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1200", "Expirience:1 Year"},
                    {"Doctor Name: DR SAMANTHA ANANDA", "Hospital Address: Healthy Care", "Mobile No: 011 5 714714", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR NIROSHANI DE SILVA", "Hospital Address: Nawaloka Hospital-Negombo", "Mobile No: 011 5 7189614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR(MRS) S. JAYASINGHE", "Hospital Address: CCC - Kandy", "Mobile No: 011 5 714715", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR LALANTHA SENARATHNE", "Hospital Address: Nawaloka Medical Center-Mt. Lavinia", "Mobile No: 011 5 9889614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
                    {"Doctor Name: DR TUSH WICKRAMANAYAKA", "Hospital Address: Hemas Hospital - Wattala", "Mobile No: 011 5 98998614", "Consultant Fee: 1000", "Expirience:1 Year"},
            };

    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList List;
    SimpleAdapter sa;

    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctordetail);

        tv = findViewById(R.id.ldpackagename);
        btn = findViewById(R.id.DDbackbtn);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physician") == 0)
            doctor_details = doctor_details1;
        else if (title.compareTo("psychologist") == 0)
            doctor_details = doctor_details2;
        else if (title.compareTo("therapist") == 0)
            doctor_details = doctor_details3;
        else if (title.compareTo("yoga instructor") == 0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetail.this, FinddoctorActivity.class));
            }
        });

        List = new ArrayList();
        for (int i = 0; i < doctor_details.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", doctor_details[i][4] + "/-");
            List.add(item);
        }
        sa = new SimpleAdapter(this,List,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        ListView lst=findViewById(R.id.ListViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it= new Intent (DoctorDetail.this, AlldoctorDetails.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][2]);
                it.putExtra("text5",doctor_details[i][3]);
                startActivity(it);

            }
        });

    }
}
