package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OL2 extends AbstractC0562Ei1 {
    public static final OL2 j = new OL2(0, new Object[0]);
    public final transient Object[] h;
    public final transient int i;

    @Override // defpackage.AbstractC11861yi1
    public final int g() {
        return 0;
    }

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return false;
    }

    public OL2(int i, Object[] objArr) {
        this.h = objArr;
        this.i = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // defpackage.AbstractC11861yi1
    public final Object[] d() {
        return this.h;
    }

    @Override // defpackage.AbstractC11861yi1
    public final int f() {
        return this.i;
    }

    @Override // defpackage.AbstractC0562Ei1, defpackage.AbstractC11861yi1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.h;
        int i2 = this.i;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }
}
