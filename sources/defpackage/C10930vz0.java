package defpackage;

import android.text.Editable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vz0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10930vz0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile C10930vz0 b;
    public static Class c;

    public C10930vz0() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C10930vz0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls == null) {
            return super.newEditable(charSequence);
        }
        return new C0814Gg3(cls, charSequence);
    }
}
