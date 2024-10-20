package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WA0 {
    public final /* synthetic */ ZA0 a;

    public WA0(ZA0 za0) {
        this.a = za0;
    }

    public final void a(TextInputLayout textInputLayout) {
        ZA0 za0 = this.a;
        EditText editText = za0.v;
        if (editText == textInputLayout.i) {
            return;
        }
        VA0 va0 = za0.y;
        if (editText != null) {
            editText.removeTextChangedListener(va0);
            if (za0.v.getOnFocusChangeListener() == za0.b().e()) {
                za0.v.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.i;
        za0.v = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(va0);
        }
        za0.b().m(za0.v);
        za0.h(za0.b());
    }
}
