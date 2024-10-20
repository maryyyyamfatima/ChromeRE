package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ca2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4260ca2 extends AtomicReference implements InterfaceC11128wa2, InterfaceC6416iq0 {
    public static final Y92[] j = new Y92[0];
    public static final Y92[] k = new Y92[0];
    public final InterfaceC3573aa2 a;
    public boolean g;
    public final AtomicReference h = new AtomicReference(j);
    public final AtomicBoolean i = new AtomicBoolean();

    public C4260ca2(InterfaceC3573aa2 interfaceC3573aa2) {
        this.a = interfaceC3573aa2;
    }

    public final boolean a() {
        return this.h.get() == k;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        this.h.set(k);
        EnumC7791mq0.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Y92 y92) {
        boolean z;
        Y92[] y92Arr;
        do {
            AtomicReference atomicReference = this.h;
            Y92[] y92Arr2 = (Y92[]) atomicReference.get();
            int length = y92Arr2.length;
            if (length == 0) {
                return;
            }
            z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (y92Arr2[i].equals(y92)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                y92Arr = j;
            } else {
                Y92[] y92Arr3 = new Y92[length - 1];
                System.arraycopy(y92Arr2, 0, y92Arr3, 0, i);
                System.arraycopy(y92Arr2, i + 1, y92Arr3, i, (length - i) - 1);
                y92Arr = y92Arr3;
            }
            while (true) {
                if (atomicReference.compareAndSet(y92Arr2, y92Arr)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != y92Arr2) {
                    break;
                }
            }
        } while (!z);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void c(InterfaceC6416iq0 interfaceC6416iq0) {
        if (EnumC7791mq0.f(this, interfaceC6416iq0)) {
            f();
        }
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void d(Object obj) {
        if (this.g) {
            return;
        }
        this.a.b(obj);
        f();
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void onError(Throwable th) {
        if (!this.g) {
            this.g = true;
            InterfaceC3573aa2 interfaceC3573aa2 = this.a;
            interfaceC3573aa2.f(th);
            for (Y92 y92 : (Y92[]) this.h.getAndSet(k)) {
                interfaceC3573aa2.d(y92);
            }
            return;
        }
        MR2.b(th);
    }

    @Override // defpackage.InterfaceC11128wa2
    public final void b() {
        if (this.g) {
            return;
        }
        this.g = true;
        InterfaceC3573aa2 interfaceC3573aa2 = this.a;
        interfaceC3573aa2.a();
        for (Y92 y92 : (Y92[]) this.h.getAndSet(k)) {
            interfaceC3573aa2.d(y92);
        }
    }

    public final void f() {
        for (Y92 y92 : (Y92[]) this.h.get()) {
            this.a.d(y92);
        }
    }
}
