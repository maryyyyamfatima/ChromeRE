package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12169zc2 implements CA1, LF {
    public final AA1 a;
    public final AbstractC11826yc2 b;
    public C0013Ac2 c;
    public final /* synthetic */ C0143Bc2 d;

    public C12169zc2(C0143Bc2 c0143Bc2, AA1 aa1, AbstractC11826yc2 abstractC11826yc2) {
        this.d = c0143Bc2;
        this.a = aa1;
        this.b = abstractC11826yc2;
        aa1.a(this);
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (enumC11340xA1 == EnumC11340xA1.ON_START) {
            this.c = this.d.b(this.b);
            return;
        }
        if (enumC11340xA1 == EnumC11340xA1.ON_STOP) {
            C0013Ac2 c0013Ac2 = this.c;
            if (c0013Ac2 != null) {
                c0013Ac2.cancel();
                return;
            }
            return;
        }
        if (enumC11340xA1 == EnumC11340xA1.ON_DESTROY) {
            cancel();
        }
    }

    @Override // defpackage.LF
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        C0013Ac2 c0013Ac2 = this.c;
        if (c0013Ac2 != null) {
            c0013Ac2.cancel();
            this.c = null;
        }
    }
}
