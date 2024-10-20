package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: On2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887On2 extends AbstractC3790bB0 {
    public final int e;
    public EditText f;
    public final ViewOnClickListenerC1757Nn2 g;

    @Override // defpackage.AbstractC3790bB0
    public final int c() {
        return R.string.f80840_resource_name_obfuscated_res_0x7f1407e0;
    }

    @Override // defpackage.AbstractC3790bB0
    public final boolean k() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Nn2] */
    public C1887On2(ZA0 za0, int i) {
        super(za0);
        this.e = R.drawable.f46020_resource_name_obfuscated_res_0x7f09015a;
        this.g = new View.OnClickListener() { // from class: Nn2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1887On2 c1887On2 = C1887On2.this;
                EditText editText = c1887On2.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = c1887On2.f;
                if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c1887On2.f.setTransformationMethod(null);
                } else {
                    c1887On2.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    c1887On2.f.setSelection(selectionEnd);
                }
                c1887On2.q();
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final void r() {
        EditText editText = this.f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.AbstractC3790bB0
    public final int d() {
        return this.e;
    }

    @Override // defpackage.AbstractC3790bB0
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.AbstractC3790bB0
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.AbstractC3790bB0
    public final void b() {
        q();
    }

    @Override // defpackage.AbstractC3790bB0
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }
}
