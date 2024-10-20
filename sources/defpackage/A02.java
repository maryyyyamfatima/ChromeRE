package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A02 extends LinearLayout {
    public boolean[] a;
    public String g;
    public InterfaceC11967z02 h;

    public A02(Context context) {
        super(context);
        setOrientation(1);
    }

    public final void a(C2293Rq3 c2293Rq3, boolean[] zArr) {
        if (zArr != null) {
            this.a = zArr;
        } else {
            C3670aq3 c3670aq3 = c2293Rq3.j;
            if (c3670aq3 == null) {
                c3670aq3 = C3670aq3.k;
            }
            this.a = new boolean[c3670aq3.j.size()];
        }
        C3670aq3 c3670aq32 = c2293Rq3.j;
        if (c3670aq32 == null) {
            c3670aq32 = C3670aq3.k;
        }
        InterfaceC1377Kp1 interfaceC1377Kp1 = c3670aq32.j;
        for (final int i = 0; i < interfaceC1377Kp1.size(); i++) {
            int i2 = ((C3328Zp3) interfaceC1377Kp1.get(i)).j;
            char c = 2;
            char c2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
            if (c2 == 0) {
                c2 = 5;
            }
            if (c2 != 3) {
                boolean z = this.a[i];
                int i3 = ((C3328Zp3) interfaceC1377Kp1.get(i)).j;
                if (i3 == 0) {
                    c = 1;
                } else if (i3 != 1) {
                    c = i3 != 2 ? i3 != 3 ? (char) 0 : (char) 4 : (char) 3;
                }
                String str = (c != 0 ? c : (char) 5) == 4 ? "NoneOfTheAbove" : null;
                String str2 = ((C3328Zp3) interfaceC1377Kp1.get(i)).l;
                LayoutInflater.from(getContext()).inflate(R.layout.f61130_resource_name_obfuscated_res_0x7f0e0295, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i);
                final CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setText(str2);
                checkBox.setContentDescription(str2);
                checkBox.setChecked(z);
                checkBox.setOnCheckedChangeListener(new C11281x02(this, i));
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: v02
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        checkBox.performClick();
                    }
                });
                if (str != null) {
                    checkBox.setTag(str);
                }
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.f61140_resource_name_obfuscated_res_0x7f0e0296, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i);
                final CheckBox checkBox2 = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setContentDescription(getResources().getString(R.string.f87960_resource_name_obfuscated_res_0x7f140abb));
                checkBox2.setChecked(this.a[i]);
                checkBox2.setOnCheckedChangeListener(new C11281x02(this, i));
                checkBox2.setTag("OtherPleaseSpecify");
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                Ec4.m(editText, new I1(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info)));
                final View findViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                findViewById.setOnTouchListener(new View.OnTouchListener() { // from class: t02
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 1) {
                            float x = motionEvent.getX();
                            CheckBox checkBox3 = checkBox2;
                            if (x >= 0.0f && motionEvent.getX() < ((float) checkBox3.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) findViewById.getHeight())) {
                                checkBox3.performClick();
                            } else {
                                EditText editText2 = editText;
                                editText2.requestFocus();
                                int i4 = AbstractC3208Yr3.b;
                                ((InputMethodManager) editText2.getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
                            }
                        }
                        return false;
                    }
                });
                editText.addTextChangedListener(new C10938w02(this, i, checkBox2));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: u02
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        A02 a02 = A02.this;
                        EditText editText2 = editText;
                        if (z2) {
                            a02.a[i] = true;
                            checkBox2.setChecked(true);
                            Context context = a02.getContext();
                            Object obj = Y50.a;
                            editText2.setHintTextColor(context.getColor(R.color.f26450_resource_name_obfuscated_res_0x7f07087f));
                            a02.h.a(new C11624y02(a02.g, a02.a));
                            return;
                        }
                        Context context2 = a02.getContext();
                        Object obj2 = Y50.a;
                        editText2.setHintTextColor(context2.getColor(R.color.f26460_resource_name_obfuscated_res_0x7f070880));
                    }
                });
            }
        }
    }
}
