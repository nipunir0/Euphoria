package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class ExersiseActivity extends AppCompatActivity {

    private String[][] packages =
            {
                    {"Exersise 1: Breathing Exersice", "", "", "", "Each day"},
                    {"Exersise 2: Mindfulness Meditation", "", "", "", "Each day"},
                    {"Exersise 3: Sleep Hygiene", "", "", "", "Each day"},
                    {"Exersise 4: Self-compassion", "", "", "", "Each day"},
                    {"Exersise 5: Gratitude Practice", "", "", "", "Each day"},
                    {"Exersise 6: Cognitive Behavioral Therapy", "", "", "", "Each day"},
                    {"Exersise 7: Socializing", "", "", "", "Each day"},
                    {"Exersise 8: Progressive Muscle Relaxation", "", "", "", "Each day"},
                    {"Exersise 9: Guided Imagery", "", "", "", "Each day"},
                    {"Exersise 10:Mindful Walking:", "", "", "", "Each day"},


            };
    private String[] package_details = {
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",

            "STEP 1 : Find a quiet and comfortable place to sit, free from distractions.\n\n" +
                    "STEP 2 : Sit in an upright position with your spine straight, either on a chair or cushion..\n\n" +
                    "STEP 3 : Close your eyes or keep them softly focused on a fixed point.\n\n" +
                    "STEP 4 : Bring your attention to your breath, noticing the sensation of each inhalation and exhalation.\n\n" +
                    "STEP 5 : Allow your breath to flow naturally, without trying to control it.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",

            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",

            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm..",
            "STEP 1 : Find a comfortable seated position with your feet flat on the ground and your hands resting on your knees or thighs.\n\n" +
                    "STEP 2 : Close your eyes or find a soft gaze on a spot in front of you.\n\n" +
                    "STEP 3 : Take a deep inhale through your nose, filling your lungs completely.\n\n" +
                    "STEP 4 : Hold your breath for a moment at the top of your inhale.\n\n" +
                    "STEP 5 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 6 : Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 7 : Inhale again through your nose, filling your lungs completely.\n\n" +
                    "STEP 8 : Hold your breath at the top of your inhale.\n\n" +
                    "STEP 9 : Slowly exhale through your mouth, emptying your lungs completely.\n\n" +
                    "STEP 10 :Hold your breath for a moment at the bottom of your exhale.\n\n" +
                    "STEP 11 :Continue this pattern of inhaling deeply through your nose, holding your breath, and exhaling slowly through your mouth.\n\n" +
                    "STEP 12 :As you continue, try to make your inhales and exhales last the same amount of time.\n\n" +
                    "STEP 13 :You can count to four or five as you inhale, hold, and exhale.\n\n" +
                    "STEP 14 :Focus on the sensation of your breath moving in and out of your body, the rise and fall of your chest and belly.\n\n" +
                    "STEP 15 :Try to maintain this pattern for a few minutes or as long as you like, then slowly open your eyes and return to your day feeling refreshed and calm.."
    };
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    Button btnback;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exersiseactivity);
        btnback = findViewById(R.id.buttoncartcheckout);
        listView = findViewById(R.id.ListVielabtset);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ExersiseActivity.this, HomeActivity.class));
            }
        });

        list = new ArrayList();
        for (int i = 0; i < packages.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1", packages[i][0]);
            item.put("line2", packages[i][1]);
            item.put("line3", packages[i][2]);
            item.put("line4", packages[i][3]);
            item.put("line5", "Practice : " + packages[i][4]);
            list.add(item);

        }

        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3", "line4", "line5"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );

        listView.setAdapter(sa);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent it = new Intent(ExersiseActivity.this, ExersiseDetails.class);
                it.putExtra("text1", packages[i][0]);
                it.putExtra("text2", package_details[i]);
                it.putExtra("text3", packages[i][4]);
                startActivity(it);
            }
        });
    }
}