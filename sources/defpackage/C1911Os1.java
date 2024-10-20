package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Os1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911Os1 extends C14 {
    public final /* synthetic */ Iterator a;

    public C1911Os1(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return this.a.next();
    }
}
