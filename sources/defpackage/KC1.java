package defpackage;

import java.util.Date;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KC1 extends JC1 {
    public OfflineItem e;
    public boolean f;
    public boolean g;

    public KC1(OfflineItem offlineItem) {
        super((offlineItem.a.hashCode() << 32) + (offlineItem.r & (-1)), new Date(offlineItem.r));
        this.e = offlineItem;
    }
}
