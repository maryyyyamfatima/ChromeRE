package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SL2 extends AbstractC0562Ei1 {
    public final transient Object[] h;
    public final transient int i;
    public final transient int j;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return true;
    }

    public SL2(int i, int i2, Object[] objArr) {
        this.h = objArr;
        this.i = i;
        this.j = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj = this.h[(i * 2) + this.i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }
}
