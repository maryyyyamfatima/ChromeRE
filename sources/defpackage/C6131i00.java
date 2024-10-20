package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i00 */
/* loaded from: classes.dex */
public final class C6131i00 implements CA1 {
    public final /* synthetic */ AbstractActivityC6817k00 a;

    public C6131i00(VS0 vs0) {
        this.a = vs0;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        AbstractActivityC6817k00 abstractActivityC6817k00 = this.a;
        if (abstractActivityC6817k00.k == null) {
            C6473j00 c6473j00 = (C6473j00) abstractActivityC6817k00.getLastNonConfigurationInstance();
            if (c6473j00 != null) {
                abstractActivityC6817k00.k = c6473j00.a;
            }
            if (abstractActivityC6817k00.k == null) {
                abstractActivityC6817k00.k = new C11834yd4();
            }
        }
        abstractActivityC6817k00.Z().b(this);
    }
}
