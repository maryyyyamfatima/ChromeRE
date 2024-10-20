package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xv */
/* loaded from: classes.dex */
public final class C11594xv implements InterfaceC9536rv {
    public final /* synthetic */ AbstractC11937yv a;

    public C11594xv(AbstractC11937yv abstractC11937yv) {
        this.a = abstractC11937yv;
    }

    @Override // defpackage.InterfaceC9536rv
    public final void a() {
        AbstractC11937yv abstractC11937yv = this.a;
        boolean z = abstractC11937yv.p.l() == 1.0f;
        if (z != abstractC11937yv.v) {
            abstractC11937yv.v = z;
            abstractC11937yv.m.invalidateSelf();
        }
    }
}
