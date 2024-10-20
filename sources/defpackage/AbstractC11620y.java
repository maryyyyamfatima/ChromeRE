package defpackage;

import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11620y extends C14 {
    public int a = 2;
    public Object g;

    public abstract Object a();

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int b = AbstractC2373Sg3.b(this.a);
        if (b == 0) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        this.a = 4;
        this.g = a();
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }
}
