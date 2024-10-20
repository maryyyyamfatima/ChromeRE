package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1602Mi2 extends AbstractRunnableC1213Ji2 {
    public final InterfaceC0334Co3 p;

    public C1602Mi2(InterfaceC0334Co3 interfaceC0334Co3, int i, C7058ki3 c7058ki3, AbstractC10079tW2 abstractC10079tW2) {
        super(i, c7058ki3, abstractC10079tW2);
        this.p = interfaceC0334Co3;
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
        InterfaceC0334Co3 interfaceC0334Co3 = this.p;
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
                    interfaceC0334Co3.onError(th);
                    this.i.dispose();
                    return;
                }
                Object poll = c7058ki3.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    interfaceC0334Co3.b();
                    this.i.dispose();
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    interfaceC0334Co3.d(poll);
                    j2++;
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
                        interfaceC0334Co3.onError(th2);
                        this.i.dispose();
                        return;
                    } else if (c7058ki3.isEmpty()) {
                        interfaceC0334Co3.b();
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
