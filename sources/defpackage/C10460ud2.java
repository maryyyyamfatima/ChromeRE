package defpackage;

import com.google.common.util.concurrent.n;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ud2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10460ud2 extends n {
    public C11146wd2 j;
    public final int k;

    public C10460ud2(C11146wd2 c11146wd2, int i) {
        this.j = c11146wd2;
        this.k = i;
    }

    @Override // com.google.common.util.concurrent.n
    public final boolean v(RD1 rd1) {
        return super.v(rd1);
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        InterfaceC2909Wk interfaceC2909Wk;
        C11146wd2 c11146wd2 = this.j;
        if (c11146wd2 == null || (interfaceC2909Wk = c11146wd2.a.a) == null) {
            return null;
        }
        String a = AbstractC4199cO1.a("callable=[", String.valueOf(interfaceC2909Wk), "]");
        C10803vd2 c10803vd2 = (C10803vd2) this.j.c.get();
        if (c10803vd2 == null) {
            return a;
        }
        return a + ", trial=[" + String.valueOf(c10803vd2) + "]";
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        C11146wd2 c11146wd2 = this.j;
        this.j = null;
        if (c11146wd2 == null) {
            return;
        }
        do {
            atomicLong = c11146wd2.b;
            j = atomicLong.get();
            i = (int) j;
            i2 = (int) (j >>> 32);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(Pd4.a("Refcount is: ", j));
            }
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, ((i - 1) & 4294967295L) | (i2 << 32)));
        if (!z) {
            return;
        }
        do {
            AtomicReference atomicReference = c11146wd2.c;
            C10803vd2 c10803vd2 = (C10803vd2) atomicReference.get();
            if (c10803vd2 == null) {
                return;
            }
            if (c10803vd2.j > this.k) {
                return;
            }
            c10803vd2.cancel(true);
            while (true) {
                if (atomicReference.compareAndSet(c10803vd2, null)) {
                    z2 = true;
                    break;
                } else if (atomicReference.get() != c10803vd2) {
                    z2 = false;
                    break;
                }
            }
        } while (!z2);
    }
}
