package defpackage;

import java.util.Collection;
import java.util.Locale;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class V04 {
    public static String a(Collection collection) {
        return collection.size() == 1 ? ((OfflineItem) collection.iterator().next()).g : String.format(Locale.getDefault(), "%d", Integer.valueOf(collection.size()));
    }
}
