package defpackage;

import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class B extends C implements RandomAccess {
    public final C a;
    public final int g;
    public final int h;

    public B(C c, int i, int i2) {
        AbstractC0087Ar1.e(c, "list");
        this.a = c;
        this.g = i;
        int a = c.a();
        if (i >= 0 && i2 <= a) {
            if (i <= i2) {
                this.h = i2 - i;
                return;
            }
            throw new IllegalArgumentException(AbstractC0800Ge.a("fromIndex: ", i, " > toIndex: ", i2));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + a);
    }

    @Override // defpackage.C, java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return this.a.get(this.g + i);
        }
        throw new IndexOutOfBoundsException(AbstractC0800Ge.a("index: ", i, ", size: ", i2));
    }

    @Override // defpackage.AbstractC8877q
    public final int a() {
        return this.h;
    }
}
