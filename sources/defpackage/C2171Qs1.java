package defpackage;

import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qs1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2171Qs1 extends C14 {
    public boolean a;
    public final /* synthetic */ Object g;

    public C2171Qs1(Object obj) {
        this.g = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.g;
    }
}
