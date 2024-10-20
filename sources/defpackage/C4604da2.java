package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: da2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4604da2 implements InterfaceC7353la2 {
    public final AtomicReference a;
    public final X92 g;

    public C4604da2(AtomicReference atomicReference, X92 x92) {
        this.a = atomicReference;
        this.g = x92;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7353la2
    public final void a(InterfaceC11128wa2 interfaceC11128wa2) {
        C4260ca2 c4260ca2;
        boolean z;
        boolean z2;
        while (true) {
            c4260ca2 = (C4260ca2) this.a.get();
            if (c4260ca2 != null) {
                break;
            }
            C4260ca2 c4260ca22 = new C4260ca2(this.g.call());
            AtomicReference atomicReference = this.a;
            while (true) {
                if (atomicReference.compareAndSet(null, c4260ca22)) {
                    z2 = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                c4260ca2 = c4260ca22;
                break;
            }
        }
        Y92 y92 = new Y92(c4260ca2, interfaceC11128wa2);
        interfaceC11128wa2.c(y92);
        do {
            AtomicReference atomicReference2 = c4260ca2.h;
            Y92[] y92Arr = (Y92[]) atomicReference2.get();
            if (y92Arr == C4260ca2.k) {
                break;
            }
            int length = y92Arr.length;
            Y92[] y92Arr2 = new Y92[length + 1];
            System.arraycopy(y92Arr, 0, y92Arr2, 0, length);
            y92Arr2[length] = y92;
            while (true) {
                if (atomicReference2.compareAndSet(y92Arr, y92Arr2)) {
                    z = true;
                    break;
                } else if (atomicReference2.get() != y92Arr) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        if (y92.i) {
            c4260ca2.e(y92);
        } else {
            c4260ca2.a.d(y92);
        }
    }
}
