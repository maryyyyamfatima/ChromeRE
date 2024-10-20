package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ly0 */
/* loaded from: classes.dex */
public final class C1550Ly0 extends TZ {
    public C1680My0 i;
    public final String[] j = {"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};
    public final BitSet k = new BitSet(4);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C1680My0) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(4, this.k, this.j);
        return this.i;
    }
}
