package com.minhui.networkcapture.Fragments;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.minhui.networkcapture.R;
import com.minhui.networkcapture.RadarView.RadarSettings;

public class PvPFragment
{
    CheckBox playerDot;
    CheckBox playerNickname;
    CheckBox playerHealth;
    CheckBox playerMounted;
    CheckBox playerDistance;
    CheckBox playerSound;
    CheckBox playerGuildName;
    Toolbar toolbar;
    TextView textView;

    public PvPFragment(View view)
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sharedPreferences.edit();
        playerDot = view.findViewById(R.id.playerDot);
        playerNickname = view.findViewById(R.id.playerNickname);
        playerHealth = view.findViewById(R.id.playerHealth);
        playerMounted = view.findViewById(R.id.playerMounted);
        playerDistance = view.findViewById(R.id.playerDistance);
        playerSound = view.findViewById(R.id.playerSound);
        playerGuildName = view.findViewById(R.id.playerGuild);

        playerDot.setChecked(RadarSettings.getInstance().playerDot);
        playerNickname.setChecked(RadarSettings.getInstance().playerNickname);
        playerHealth.setChecked(RadarSettings.getInstance().playerHealth);
        playerMounted.setChecked(RadarSettings.getInstance().playerMounted);
        playerDistance.setChecked(RadarSettings.getInstance().playerDistance);
        playerSound.setChecked(RadarSettings.getInstance().playerSound);
        playerGuildName.setChecked(RadarSettings.getInstance().playerGuildName);

        playerDot.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerDot",isChecked);
            RadarSettings.getInstance().playerDot = isChecked;
            editor.apply();
        });

        playerNickname.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerNickname",isChecked);
            RadarSettings.getInstance().playerNickname = isChecked;
            editor.apply();
        });

        playerMounted.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerMounted",isChecked);
            RadarSettings.getInstance().playerMounted = isChecked;
            editor.apply();
        });

        playerHealth.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerHealth",isChecked);
            RadarSettings.getInstance().playerHealth = isChecked;
            editor.apply();
        });

        playerDistance.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerDistance",isChecked);
            RadarSettings.getInstance().playerDistance = isChecked;
            editor.apply();
        });

        playerSound.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerSound",isChecked);
            RadarSettings.getInstance().playerSound = isChecked;
            editor.apply();
        });

        playerGuildName.setOnCheckedChangeListener((buttonView, isChecked) ->
        {
            editor.putBoolean("playerGuildName",isChecked);
            RadarSettings.getInstance().playerGuildName = isChecked;
            editor.apply();
        });
    }
}