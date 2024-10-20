package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GT2 extends HT2 implements Iterator {
    public ET2 a;
    public ET2 g;

    public abstract ET2 b(ET2 et2);

    public abstract ET2 c(ET2 et2);

    public GT2(ET2 et2, ET2 et22) {
        this.a = et22;
        this.g = et2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // defpackage.HT2
    public final void a(ET2 et2) {
        ET2 et22 = null;
        if (this.a == et2 && et2 == this.g) {
            this.g = null;
            this.a = null;
        }
        ET2 et23 = this.a;
        if (et23 == et2) {
            this.a = b(et23);
        }
        ET2 et24 = this.g;
        if (et24 == et2) {
            ET2 et25 = this.a;
            if (et24 != et25 && et25 != null) {
                et22 = c(et24);
            }
            this.g = et22;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ET2 et2 = this.g;
        ET2 et22 = this.a;
        this.g = (et2 == et22 || et22 == null) ? null : c(et2);
        return et2;
    }
}
