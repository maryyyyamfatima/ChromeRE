package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8272oE extends AbstractC0185Bl {
    public final /* synthetic */ Q74 h;
    public final /* synthetic */ C8615pE i;

    public C8272oE(C8615pE c8615pE, Q74 q74) {
        this.i = c8615pE;
        this.h = q74;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        EI2.h(this.i.b.get(), 5, "Variations.SafeModeCachedFlags.Cached");
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            C8615pE.a(this.i, this.h);
            return null;
        } catch (Exception e) {
            AbstractC4851eH1.a("Flags", "Exception writing safe values.", e);
            a(true);
            return null;
        }
    }
}
