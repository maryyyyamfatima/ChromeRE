package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0823Gi2 extends AtomicInteger implements InterfaceC0724Fo3 {
    public final InterfaceC0334Co3 a;
    public final C0693Fi2[] g;
    public volatile boolean j;
    public final C0965Hl h = new C0965Hl();
    public final AtomicLong i = new AtomicLong();
    public final AtomicInteger k = new AtomicInteger();

    public abstract void d();

    public abstract void e();

    public abstract void f(Throwable th);

    public abstract void g(C0693Fi2 c0693Fi2, Object obj);

    public AbstractC0823Gi2(InterfaceC0334Co3 interfaceC0334Co3, int i, int i2) {
        this.a = interfaceC0334Co3;
        C0693Fi2[] c0693Fi2Arr = new C0693Fi2[i];
        for (int i3 = 0; i3 < i; i3++) {
            c0693Fi2Arr[i3] = new C0693Fi2(this, i2);
        }
        this.g = c0693Fi2Arr;
        this.k.lazySet(i);
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        if (EnumC0854Go3.d(j)) {
            AbstractC0355Ct.a(this.i, j);
            d();
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        if (this.j) {
            return;
        }
        this.j = true;
        b();
        if (getAndIncrement() == 0) {
            c();
        }
    }

    public final void b() {
        for (C0693Fi2 c0693Fi2 : this.g) {
            c0693Fi2.getClass();
            EnumC0854Go3.b(c0693Fi2);
        }
    }

    public final void c() {
        for (C0693Fi2 c0693Fi2 : this.g) {
            c0693Fi2.j = null;
        }
    }
}
