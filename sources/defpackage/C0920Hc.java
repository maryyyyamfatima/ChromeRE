package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920Hc extends Property {
    public C0920Hc() {
        super(Integer.class, "alpha");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return 0;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
