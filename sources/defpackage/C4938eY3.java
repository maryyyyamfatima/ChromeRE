package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eY3 */
/* loaded from: classes.dex */
public final class C4938eY3 extends AbstractC1501Lo0 {
    public final QC i;
    public final C10776vY3 j;
    public final FU k;

    @Override // defpackage.AbstractC1501Lo0
    public final void b() {
        this.j.getClass();
        FI2.a("TrustedWebActivity.DisclosureAccepted");
        this.i.a.b("trusted_web_activity_disclosure_accepted_packages", this.k.a);
        this.a.m(C6314iY3.c, 2);
    }

    @Override // defpackage.AbstractC1501Lo0
    public final void d() {
        this.j.getClass();
        FI2.a("TrustedWebActivity.DisclosureShown");
        this.i.a.b("Chrome.TrustedWebActivities.DisclosureAcceptedPackages", this.k.a);
        super.d();
    }

    public C4938eY3(QC qc, C6314iY3 c6314iY3, I5 i5, C9766sc0 c9766sc0, C10776vY3 c10776vY3, FU fu) {
        super(c6314iY3, i5, c9766sc0, fu.a);
        this.i = qc;
        this.j = c10776vY3;
        this.k = fu;
    }

    @Override // defpackage.AbstractC1501Lo0
    public final boolean a() {
        return !this.i.a.j("Chrome.TrustedWebActivities.DisclosureAcceptedPackages").contains(this.k.a);
    }

    @Override // defpackage.AbstractC1501Lo0
    public final boolean h() {
        return !this.i.a.j("trusted_web_activity_disclosure_accepted_packages").contains(this.k.a);
    }
}
