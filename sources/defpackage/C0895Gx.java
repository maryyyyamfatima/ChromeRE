package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895Gx implements InterfaceC6416iq0, InterfaceC7152ky2 {
    public final InterfaceC11128wa2 a;
    public final C1025Hx g;
    public boolean h;
    public boolean i;
    public C7748mj j;
    public boolean k;
    public volatile boolean l;
    public long m;

    public C0895Gx(InterfaceC11128wa2 interfaceC11128wa2, C1025Hx c1025Hx) {
        this.a = interfaceC11128wa2;
        this.g = c1025Hx;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.g.l(this);
    }

    public final void a(long j, Object obj) {
        if (this.l) {
            return;
        }
        if (!this.k) {
            synchronized (this) {
                if (this.l) {
                    return;
                }
                if (this.m == j) {
                    return;
                }
                if (this.i) {
                    C7748mj c7748mj = this.j;
                    if (c7748mj == null) {
                        c7748mj = new C7748mj();
                        this.j = c7748mj;
                    }
                    c7748mj.a(obj);
                    return;
                }
                this.h = true;
                this.k = true;
            }
        }
        test(obj);
    }

    @Override // defpackage.InterfaceC7152ky2
    public final boolean test(Object obj) {
        return this.l || X62.a(this.a, obj);
    }
}
