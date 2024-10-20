package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jg3 */
/* loaded from: classes2.dex */
public final class C1204Jg3 implements UJ {
    public final /* synthetic */ C1464Lg3 a;

    @Override // defpackage.UJ
    public final void a(VJ vj) {
        C1464Lg3 c1464Lg3 = this.a;
        UJ uj = c1464Lg3.d;
        if (uj != null) {
            uj.a(vj);
        }
        if (c1464Lg3.b != null) {
            c1464Lg3.b = null;
            c1464Lg3.c = false;
        }
    }

    @Override // defpackage.UJ
    public final void c() {
        C1464Lg3 c1464Lg3 = this.a;
        c1464Lg3.c = true;
        UJ uj = c1464Lg3.d;
        if (uj != null) {
            uj.c();
            c1464Lg3.b = null;
            c1464Lg3.c = false;
        }
    }

    public C1204Jg3(C1464Lg3 c1464Lg3) {
        this.a = c1464Lg3;
    }

    @Override // defpackage.UJ
    public final void b(VJ vj) {
        AbstractC4851eH1.f("SpareChildConn", "Failed to warm up the spare sandbox service", new Object[0]);
        C1464Lg3 c1464Lg3 = this.a;
        UJ uj = c1464Lg3.d;
        if (uj != null) {
            uj.b(vj);
        }
        c1464Lg3.b = null;
        c1464Lg3.c = false;
    }
}
