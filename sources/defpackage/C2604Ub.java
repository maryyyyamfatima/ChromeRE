package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ub */
/* loaded from: classes.dex */
public final class C2604Ub extends TZ {
    public C2734Vb i;
    public final String[] j = {"commandResolver", "conversionContext", "logger", "onFrameCompleteCommandFuture", "onProgressCompleteCommandFuture", "type"};
    public final BitSet k = new BitSet(6);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (C2734Vb) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(6, this.k, this.j);
        return this.i;
    }
}
