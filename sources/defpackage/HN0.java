package defpackage;

import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class HN0 {
    public static String b(int i) {
        return i == 0 ? "chrome-native://downloads/" : AbstractC9076qb1.a("chrome-native://downloads/filter/", i);
    }

    public static Integer a(OfflineItem offlineItem) {
        if (offlineItem.k) {
            return 7;
        }
        int i = offlineItem.i;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        return 6;
    }
}
