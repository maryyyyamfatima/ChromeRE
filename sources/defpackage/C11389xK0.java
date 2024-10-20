package defpackage;

import org.chromium.chrome.browser.feed.sections.SectionHeaderView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xK0 */
/* loaded from: classes.dex */
public final class C11389xK0 implements FY2 {
    public final /* synthetic */ C12075zK0 a;

    @Override // defpackage.FY2
    public final int a(SectionHeaderView sectionHeaderView) {
        int[] iArr = new int[2];
        Ge4.d(this.a.o, sectionHeaderView, iArr);
        return iArr[1];
    }

    @Override // defpackage.FY2
    public final int b() {
        return this.a.f.i();
    }

    @Override // defpackage.FY2
    public final void c(InterfaceC6999kY2 interfaceC6999kY2) {
        C12075zK0 c12075zK0 = this.a;
        if (c12075zK0.A == null) {
            return;
        }
        c12075zK0.f.o.d(interfaceC6999kY2);
    }

    @Override // defpackage.FY2
    public final int d() {
        return this.a.o.getHeight();
    }

    @Override // defpackage.FY2
    public final void e(InterfaceC6999kY2 interfaceC6999kY2) {
        C12075zK0 c12075zK0 = this.a;
        if (c12075zK0.A == null) {
            return;
        }
        c12075zK0.f.o.a(interfaceC6999kY2);
    }

    public C11389xK0(C12075zK0 c12075zK0) {
        this.a = c12075zK0;
    }
}
