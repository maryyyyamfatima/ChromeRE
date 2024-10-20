package defpackage;

import android.util.Pair;
import org.chromium.base.Callback;
import org.chromium.components.segmentation_platform.SegmentSelectionResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final /* synthetic */ class Q6 implements Callback {
    public final /* synthetic */ Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        SegmentSelectionResult segmentSelectionResult = (SegmentSelectionResult) obj;
        Boolean valueOf = Boolean.valueOf(segmentSelectionResult.a);
        int i = segmentSelectionResult.b;
        if (i != 0) {
            int i2 = i - 1;
            int i3 = 4;
            if (i2 == 4) {
                i3 = 2;
            } else if (i2 == 5) {
                i3 = 3;
            } else if (i2 != 6) {
                i3 = i2 != 18 ? 0 : 6;
            }
            this.a.onResult(new Pair(valueOf, Integer.valueOf(i3)));
            return;
        }
        throw null;
    }
}
