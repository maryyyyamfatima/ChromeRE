package defpackage;

import android.widget.EditText;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8873pz0 extends AbstractC9558rz0 {
    public final EditText a;
    public final C2075Pz0 b;

    public C8873pz0(EditText editText) {
        this.a = editText;
        C2075Pz0 c2075Pz0 = new C2075Pz0(editText);
        this.b = c2075Pz0;
        editText.addTextChangedListener(c2075Pz0);
        if (C10930vz0.b == null) {
            synchronized (C10930vz0.a) {
                if (C10930vz0.b == null) {
                    C10930vz0.b = new C10930vz0();
                }
            }
        }
        editText.setEditableFactory(C10930vz0.b);
    }
}
