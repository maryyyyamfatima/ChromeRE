package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3359Zw implements CG2, QQ0 {
    public final AbstractC3359Zw a;
    public InterfaceC0724Fo3 g;
    public CG2 h;
    public boolean i;
    public int j;

    public abstract boolean f(Object obj);

    public AbstractC3359Zw(AbstractC3359Zw abstractC3359Zw) {
        this.a = abstractC3359Zw;
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void c(InterfaceC0724Fo3 interfaceC0724Fo3) {
        if (EnumC0854Go3.e(this.g, interfaceC0724Fo3)) {
            this.g = interfaceC0724Fo3;
            if (interfaceC0724Fo3 instanceof CG2) {
                this.h = (CG2) interfaceC0724Fo3;
            }
            this.a.c(this);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void onError(Throwable th) {
        if (this.i) {
            MR2.b(th);
        } else {
            this.i = true;
            this.a.onError(th);
        }
    }

    @Override // defpackage.InterfaceC0334Co3
    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.a.b();
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        this.g.a(j);
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        this.g.cancel();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        return this.h.isEmpty();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.h.clear();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
