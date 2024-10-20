package defpackage;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ss3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2433Ss3 extends Property {
    public C2433Ss3() {
        super(Float.class, "thumbPos");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).E);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        SwitchCompat switchCompat = (SwitchCompat) obj;
        switchCompat.E = ((Float) obj2).floatValue();
        switchCompat.invalidate();
    }
}
