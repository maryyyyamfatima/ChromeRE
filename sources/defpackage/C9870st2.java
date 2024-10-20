package defpackage;

import java.util.NoSuchElementException;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: st2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9870st2 implements InterfaceC0048Aj2 {
    public final C6881kB a;
    public int g;

    @Override // defpackage.InterfaceC0048Aj2
    public final void close() {
    }

    public C9870st2(C6881kB c6881kB) {
        this.a = c6881kB;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.a.j.size() && this.g < 20;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = ThreadUtils.a;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C0775Fz c0775Fz = (C0775Fz) this.a.j.get(this.g);
        this.g++;
        C0178Bj2 c0178Bj2 = new C0178Bj2();
        c0178Bj2.a = c0775Fz.k;
        boolean z = c0775Fz.l;
        c0178Bj2.c = z;
        c0178Bj2.b = c0775Fz.o;
        c0178Bj2.e = c0775Fz.m;
        if (!z) {
            c0178Bj2.d = c0775Fz.n;
        }
        return c0178Bj2;
    }
}
