package moonu.com.ehhs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import com.tistory.itmir.example.androidmeallibrary.R;



public class SettingActivity extends PreferenceActivity implements Preference.OnPreferenceClickListener{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
        setContentView(R.layout.setting);

        Preference box = findPreference("lisence");
        box.setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onPreferenceClick (android.preference.Preference preference){

        switch (preference.getKey()) {
            case "lisence":
                AlertDialog.Builder alert = new AlertDialog.Builder(SettingActivity.this);
                alert.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                alert.setTitle("오픈소스 라이선스");
                alert.setMessage(R.string.open_lisence);
                alert.show();
        }
    return false;
    }

}


