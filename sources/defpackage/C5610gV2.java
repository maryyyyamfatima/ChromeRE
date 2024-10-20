package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gV2 */
/* loaded from: classes.dex */
public final class C5610gV2 implements CA1 {
    public final C8016nV2 a;

    public C5610gV2(C8016nV2 c8016nV2) {
        this.a = c8016nV2;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (!(enumC11340xA1 == EnumC11340xA1.ON_CREATE)) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC11340xA1).toString());
        }
        ja1.Z().b(this);
        C8016nV2 c8016nV2 = this.a;
        if (c8016nV2.b) {
            return;
        }
        c8016nV2.c = c8016nV2.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        c8016nV2.b = true;
    }
}
