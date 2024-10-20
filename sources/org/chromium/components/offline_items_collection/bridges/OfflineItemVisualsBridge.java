package org.chromium.components.offline_items_collection.bridges;

import android.graphics.Bitmap;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OfflineItemVisualsBridge {
    public static OfflineItemVisuals createOfflineItemVisuals(Bitmap bitmap) {
        OfflineItemVisuals offlineItemVisuals = new OfflineItemVisuals();
        offlineItemVisuals.a = bitmap;
        return offlineItemVisuals;
    }
}
