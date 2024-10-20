package defpackage;

import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9216qz0 extends AbstractC9901sz0 {
    public final EditText a;
    public final C2205Qz0 b;

    public C9216qz0(EditText editText) {
        this.a = editText;
        C2205Qz0 c2205Qz0 = new C2205Qz0(editText);
        this.b = c2205Qz0;
        editText.addTextChangedListener(c2205Qz0);
        if (C11273wz0.b == null) {
            synchronized (C11273wz0.a) {
                if (C11273wz0.b == null) {
                    C11273wz0.b = new C11273wz0();
                }
            }
        }
        editText.setEditableFactory(C11273wz0.b);
    }
}
