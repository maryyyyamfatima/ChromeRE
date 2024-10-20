package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QE0 extends TZ {
    public SE0 i;
    public final String[] j = {"collapsedCommandFuture", "commandResolver", "conversionContext", "drawableRequester", "expandableTextType", "expandedCommandFuture", "logger", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet k = new BitSet(9);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (SE0) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(9, this.k, this.j);
        return this.i;
    }
}
