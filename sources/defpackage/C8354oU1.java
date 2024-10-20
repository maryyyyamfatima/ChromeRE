package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oU1 */
/* loaded from: classes.dex */
public final class C8354oU1 extends Kn4 {
    public final Kn4 c;
    public boolean d;
    public boolean e;

    public C8354oU1(Kn4 kn4, Mn4 mn4) {
        super(mn4);
        this.c = kn4;
    }

    @Override // defpackage.Kn4
    public final String n() {
        if (this.d) {
            return this.c.f().e;
        }
        return super.n();
    }

    @Override // defpackage.Kn4
    public final String p() {
        if (this.d) {
            return this.c.f().f;
        }
        return super.p();
    }

    @Override // defpackage.Kn4
    public final Jn4 g() {
        if (this.e) {
            return this.c.f().d;
        }
        return super.g();
    }

    @Override // defpackage.Kn4
    public final boolean k() {
        if (this.e) {
            return this.c.f().m;
        }
        return super.k();
    }

    @Override // defpackage.Kn4
    public final boolean l() {
        if (this.e) {
            return this.c.f().l;
        }
        return super.l();
    }

    @Override // defpackage.Kn4
    public final Map h() {
        if (this.e) {
            return this.c.e().j;
        }
        return super.h();
    }

    @Override // defpackage.Kn4
    public final String a() {
        return this.c.a();
    }
}
