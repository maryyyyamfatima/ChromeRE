package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h00 */
/* loaded from: classes.dex */
public final class C5787h00 implements CA1 {
    public final /* synthetic */ AbstractActivityC6817k00 a;

    public C5787h00(VS0 vs0) {
        this.a = vs0;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (enumC11340xA1 == EnumC11340xA1.ON_DESTROY) {
            this.a.g.b = null;
            if (this.a.isChangingConfigurations()) {
                return;
            }
            this.a.w().a();
        }
    }
}
