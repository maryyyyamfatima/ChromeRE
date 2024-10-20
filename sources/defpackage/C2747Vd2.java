package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vd2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747Vd2 extends LinearLayout {
    public InterfaceC2617Ud2 a;

    public C2747Vd2(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.f61150_resource_name_obfuscated_res_0x7f0e0297, (ViewGroup) this, true);
    }

    public final void a(C2423Sq3 c2423Sq3) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        Ec4.m(editText, new I1(editText, (TextView) findViewById(R.id.survey_open_text_personal_info)));
        editText.setSingleLine(false);
        if (!c2423Sq3.j.isEmpty()) {
            editText.setHint(c2423Sq3.j);
        }
        if (!AbstractC3208Yr3.m(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new C2487Td2(this));
    }
}
