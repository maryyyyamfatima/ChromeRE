package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Be4 extends Property {
    public Be4() {
        super(Float.class, "translationAlpha");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(De4.a.b((View) obj));
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        De4.a.c((View) obj, floatValue);
    }
}
