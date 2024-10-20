package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QE2 extends AbstractC0204Bo3 {
    public static final PE2[] h = new PE2[0];
    public static final PE2[] i = new PE2[0];
    public final AtomicReference a = new AtomicReference(i);
    public Throwable g;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        boolean z;
        PE2 pe2 = new PE2(interfaceC11128wa2, this);
        interfaceC11128wa2.c(pe2);
        while (true) {
            AtomicReference atomicReference = this.a;
            PE2[] pe2Arr = (PE2[]) atomicReference.get();
            z = false;
            if (pe2Arr == h) {
                break;
            }
            int length = pe2Arr.length;
            PE2[] pe2Arr2 = new PE2[length + 1];
            System.arraycopy(pe2Arr, 0, pe2Arr2, 0, length);
            pe2Arr2[length] = pe2;
            while (true) {
                if (atomicReference.compareAndSet(pe2Arr, pe2Arr2)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != pe2Arr) {
                    break;
                }
            }
            if (z) {
                z = true;
                break;
            }
        }
        if (!z) {
            Throwable th = this.g;
            if (th != null) {
                interfaceC11128wa2.onError(th);
                return;
            } else {
                interfaceC11128wa2.b();
                return;
            }
        }
        if (pe2.get()) {
            j(pe2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(PE2 pe2) {
        PE2[] pe2Arr;
        boolean z;
        do {
            AtomicReference atomicReference = this.a;
            PE2[] pe2Arr2 = (PE2[]) atomicReference.get();
            if (pe2Arr2 == h || pe2Arr2 == (pe2Arr = i)) {
                return;
            }
            int length = pe2Arr2.length;
            z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (pe2Arr2[i2] == pe2) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length != 1) {
                pe2Arr = new PE2[length - 1];
                System.arraycopy(pe2Arr2, 0, pe2Arr, 0, i2);
                System.arraycopy(pe2Arr2, i2 + 1, pe2Arr, i2, (length - i2) - 1);
            }
            while (true) {
                if (atomicReference.compareAndSet(pe2Arr2, pe2Arr)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != pe2Arr2) {
                    break;
                }
            }
        } while (!z);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (this.a.get() == h) {
            interfaceC6416iq0.dispose();
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        for (PE2 pe2 : (PE2[]) this.a.get()) {
            if (!pe2.get()) {
                pe2.a.d(obj);
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (th == null) {
            throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = h;
        if (obj == obj2) {
            MR2.b(th);
            return;
        }
        this.g = th;
        PE2[] pe2Arr = (PE2[]) atomicReference.getAndSet(obj2);
        for (PE2 pe2 : pe2Arr) {
            if (pe2.get()) {
                MR2.b(th);
            } else {
                pe2.a.onError(th);
            }
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = h;
        if (obj == obj2) {
            return;
        }
        PE2[] pe2Arr = (PE2[]) atomicReference.getAndSet(obj2);
        for (PE2 pe2 : pe2Arr) {
            if (!pe2.get()) {
                pe2.a.b();
            }
        }
    }
}
