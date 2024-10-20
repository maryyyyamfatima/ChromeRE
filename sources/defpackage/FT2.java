package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FT2 extends HT2 implements Iterator {
    public ET2 a;
    public boolean g = true;
    public final /* synthetic */ IT2 h;

    public FT2(IT2 it2) {
        this.h = it2;
    }

    @Override // defpackage.HT2
    public final void a(ET2 et2) {
        ET2 et22 = this.a;
        if (et2 == et22) {
            ET2 et23 = et22.i;
            this.a = et23;
            this.g = et23 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.a != null;
        }
        ET2 et2 = this.a;
        return (et2 == null || et2.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.a = this.h.a;
        } else {
            ET2 et2 = this.a;
            this.a = et2 != null ? et2.h : null;
        }
        return this.a;
    }
}
