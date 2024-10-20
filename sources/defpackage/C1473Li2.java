package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Li2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473Li2 extends AbstractRunnableC1213Ji2 {
    public final AbstractC3359Zw p;

    public C1473Li2(AbstractC3359Zw abstractC3359Zw, int i, C7058ki3 c7058ki3, AbstractC10079tW2 abstractC10079tW2) {
        super(i, c7058ki3, abstractC10079tW2);
        this.p = abstractC3359Zw;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.j, interfaceC0724Fo3)) {
            this.j = interfaceC0724Fo3;
            this.p.c(this);
            interfaceC0724Fo3.a(this.a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        int i = this.o;
        C7058ki3 c7058ki3 = this.h;
        AbstractC3359Zw abstractC3359Zw = this.p;
        int i2 = this.g;
        int i3 = 1;
        while (true) {
            long j = this.m.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.n) {
                    c7058ki3.clear();
                    return;
                }
                boolean z = this.k;
                if (z && (th = this.l) != null) {
                    c7058ki3.clear();
                    abstractC3359Zw.onError(th);
                    this.i.dispose();
                    return;
                }
                Object poll = c7058ki3.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    abstractC3359Zw.b();
                    this.i.dispose();
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    if (abstractC3359Zw.f(poll)) {
                        j2++;
                    }
                    i++;
                    if (i == i2) {
                        this.j.a(i);
                        i = 0;
                    }
                }
            }
            if (j2 == j) {
                if (this.n) {
                    c7058ki3.clear();
                    return;
                }
                if (this.k) {
                    Throwable th2 = this.l;
                    if (th2 != null) {
                        c7058ki3.clear();
                        abstractC3359Zw.onError(th2);
                        this.i.dispose();
                        return;
                    } else if (c7058ki3.isEmpty()) {
                        abstractC3359Zw.b();
                        this.i.dispose();
                        return;
                    }
                }
            }
            if (j2 != 0 && j != Long.MAX_VALUE) {
                this.m.addAndGet(-j2);
            }
            int i4 = get();
            if (i4 == i3) {
                this.o = i;
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                i3 = i4;
            }
        }
    }
}
