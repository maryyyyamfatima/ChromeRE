package defpackage;

import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Aa2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003Aa2 extends AbstractC4610db2 {
    public final boolean i;

    public C0003Aa2(boolean z, C5985hb2 c5985hb2) {
        super(c5985hb2);
        this.i = z;
        k();
    }

    @Override // defpackage.AbstractC4610db2
    public final boolean j(OfflineItem offlineItem) {
        if (offlineItem.z) {
            return (this.i && OTRProfileID.a(offlineItem.A).equals(OTRProfileID.b)) ? false : true;
        }
        return false;
    }
}
