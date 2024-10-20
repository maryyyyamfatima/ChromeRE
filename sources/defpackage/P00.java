package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P00 extends TZ {
    public S00 i;
    public final String[] j = {"conversionContext", "crashOnTemplateResolutionError", "debuggerClient", "debuggerStatus", "devServerEnabled", "elementSource", "logger", "templatePerformanceLogger", "typeAndProperties"};
    public final BitSet k = new BitSet(9);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (S00) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(9, this.k, this.j);
        return this.i;
    }
}
