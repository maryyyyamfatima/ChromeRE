package defpackage;

import android.graphics.Bitmap;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;
import org.chromium.components.offline_items_collection.VisualsCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ML3 {
    public final OfflineContentAggregatorBridge a;
    public final OfflineItem b;
    public final int c;
    public final int d;
    public final VisualsCallback e;

    public ML3(OfflineContentAggregatorBridge offlineContentAggregatorBridge, OfflineItem offlineItem, int i, int i2, C9419rb2 c9419rb2) {
        this.a = offlineContentAggregatorBridge;
        this.b = offlineItem;
        this.c = i;
        this.d = i2;
        this.e = c9419rb2;
    }

    public final String a() {
        return this.b.a.b;
    }

    public final void b(Bitmap bitmap) {
        OfflineItemVisuals offlineItemVisuals;
        if (bitmap != null) {
            offlineItemVisuals = new OfflineItemVisuals();
            offlineItemVisuals.a = bitmap;
        } else {
            offlineItemVisuals = null;
        }
        this.e.f(this.b.a, offlineItemVisuals);
    }
}
