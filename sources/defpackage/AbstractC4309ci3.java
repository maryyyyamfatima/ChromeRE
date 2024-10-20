package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ci3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4309ci3 implements Iterator, j$.util.Iterator {
    public String g;
    public final CharSequence h;
    public final WI i;
    public final boolean j;
    public int l;
    public int a = 2;
    public int k = 0;

    public abstract int d(int i);

    public abstract int e(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    /* renamed from: forEachRemaining$com$google$common$base$AbstractIterator, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }

    public AbstractC4309ci3(C4996ei3 c4996ei3, CharSequence charSequence) {
        this.i = c4996ei3.a;
        this.j = c4996ei3.b;
        this.l = c4996ei3.d;
        this.h = charSequence;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        String str;
        int e;
        CharSequence charSequence;
        WI wi;
        int b = AbstractC2373Sg3.b(this.a);
        if (b == 0) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        this.a = 4;
        int i = this.k;
        while (true) {
            int i2 = this.k;
            if (i2 == -1) {
                this.a = 3;
                str = null;
                break;
            }
            e = e(i2);
            charSequence = this.h;
            if (e == -1) {
                e = charSequence.length();
                this.k = -1;
            } else {
                this.k = d(e);
            }
            int i3 = this.k;
            if (i3 == i) {
                int i4 = i3 + 1;
                this.k = i4;
                if (i4 > charSequence.length()) {
                    this.k = -1;
                }
            } else {
                while (true) {
                    wi = this.i;
                    if (i >= e || !wi.b(charSequence.charAt(i))) {
                        break;
                    }
                    i++;
                }
                while (e > i) {
                    int i5 = e - 1;
                    if (!wi.b(charSequence.charAt(i5))) {
                        break;
                    }
                    e = i5;
                }
                if (!this.j || i != e) {
                    break;
                }
                i = this.k;
            }
        }
        int i6 = this.l;
        if (i6 == 1) {
            e = charSequence.length();
            this.k = -1;
            while (e > i) {
                int i7 = e - 1;
                if (!wi.b(charSequence.charAt(i7))) {
                    break;
                }
                e = i7;
            }
        } else {
            this.l = i6 - 1;
        }
        str = charSequence.subSequence(i, e).toString();
        this.g = str;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.g;
        this.g = null;
        return str;
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }
}
