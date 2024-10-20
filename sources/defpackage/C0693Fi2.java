package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693Fi2 extends AtomicReference implements QQ0 {
    public final AbstractC0823Gi2 a;
    public final int g;
    public final int h;
    public long i;
    public volatile C7058ki3 j;

    public C0693Fi2(AbstractC0823Gi2 abstractC0823Gi2, int i) {
        this.a = abstractC0823Gi2;
        this.g = i;
        this.h = i - (i >> 2);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        long j = this.g;
        if (EnumC0854Go3.c(this, interfaceC0724Fo3)) {
            interfaceC0724Fo3.a(j);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void d(Object obj) {
        this.a.g(this, obj);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        this.a.f(th);
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        this.a.e();
    }

    public final void e() {
        long j = this.i + 1;
        if (j == this.h) {
            this.i = 0L;
            ((InterfaceC0724Fo3) get()).a(j);
        } else {
            this.i = j;
        }
    }

    public final InterfaceC3258Zb3 a() {
        C7058ki3 c7058ki3 = this.j;
        if (c7058ki3 != null) {
            return c7058ki3;
        }
        C7058ki3 c7058ki32 = new C7058ki3(this.g);
        this.j = c7058ki32;
        return c7058ki32;
    }
}
