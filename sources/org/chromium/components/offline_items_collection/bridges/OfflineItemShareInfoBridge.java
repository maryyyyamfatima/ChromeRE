package org.chromium.components.offline_items_collection.bridges;

import android.net.Uri;
import android.text.TextUtils;
import org.chromium.components.offline_items_collection.OfflineItemShareInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OfflineItemShareInfoBridge {
    public static OfflineItemShareInfo createOfflineItemShareInfo(String str) {
        OfflineItemShareInfo offlineItemShareInfo = new OfflineItemShareInfo();
        if (!TextUtils.isEmpty(str)) {
            offlineItemShareInfo.a = Uri.parse(str);
        }
        return offlineItemShareInfo;
    }
}
