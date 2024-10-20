package defpackage;

import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11281x02 implements CompoundButton.OnCheckedChangeListener {
    public final int a;
    public final /* synthetic */ A02 g;

    public C11281x02(A02 a02, int i) {
        this.g = a02;
        this.a = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CheckBox checkBox;
        boolean equals = "NoneOfTheAbove".equals(compoundButton.getTag());
        int i = 0;
        int i2 = this.a;
        A02 a02 = this.g;
        if (equals) {
            a02.a[i2] = z;
            if (z) {
                if (a02.getChildCount() != a02.a.length + 1) {
                    Log.e("SurveyMultipleSelectView", "Number of children (checkboxes) contained in the answers container was not equal to the number of possible responses including \"None of the Above\". Note this is not expected to happen in prod.");
                }
                for (int i3 = 0; i3 < a02.getChildCount(); i3++) {
                    CheckBox checkBox2 = (CheckBox) a02.getChildAt(i3).findViewById(R.id.survey_multiple_select_checkbox);
                    if (!"NoneOfTheAbove".equals(checkBox2.getTag())) {
                        checkBox2.setChecked(false);
                    }
                }
            }
        } else if ("OtherPleaseSpecify".equals(compoundButton.getTag())) {
            a02.a[i2] = z;
            if (z) {
                while (true) {
                    if (i >= a02.getChildCount()) {
                        break;
                    }
                    EditText editText = (EditText) a02.getChildAt(i).findViewById(R.id.survey_other_option);
                    if (editText != null) {
                        editText.requestFocus();
                        break;
                    }
                    i++;
                }
            }
        } else {
            a02.a[i2] = z;
            if (z && (checkBox = (CheckBox) a02.findViewWithTag("NoneOfTheAbove")) != null) {
                checkBox.setChecked(false);
            }
        }
        a02.h.a(new C11624y02(a02.g, a02.a));
    }
}
