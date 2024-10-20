package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9931t40 implements L33 {
    public final AtomicReference a;

    public C9931t40(R33 r33) {
        this.a = new AtomicReference(r33);
    }

    @Override // defpackage.L33
    public final Iterator iterator() {
        L33 l33 = (L33) this.a.getAndSet(null);
        if (l33 == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return l33.iterator();
    }
}
