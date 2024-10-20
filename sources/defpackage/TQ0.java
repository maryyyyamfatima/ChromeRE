package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TQ0 implements Iterable {
    public final /* synthetic */ Iterable[] a;

    public TQ0(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2431Ss1(new SQ0(this, this.a.length));
    }

    public final String toString() {
        return AbstractC1781Ns1.c(this);
    }
}
