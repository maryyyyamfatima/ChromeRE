package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OZ0 extends TZ {
    public QZ0 i;
    public final String[] j = {"image", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources"};
    public final BitSet k = new BitSet(6);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (QZ0) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(6, this.k, this.j);
        return this.i;
    }
}
