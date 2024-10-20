package defpackage;

import android.util.Property;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5239fQ0 extends Property {
    public abstract void b(Object obj, float f);

    public AbstractC5239fQ0(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(Object obj, Float f) {
        b(obj, f.floatValue());
    }
}
