package defpackage;

import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8037nZ3 extends AbstractC4610db2 {
    public int i;

    public C8037nZ3(C6134i03 c6134i03) {
        super(c6134i03);
        this.i = 0;
        k();
    }

    @Override // defpackage.AbstractC4610db2
    public final boolean j(OfflineItem offlineItem) {
        int i;
        int intValue = HN0.a(offlineItem).intValue();
        return (intValue == 7 || (i = this.i) == 7) ? intValue != this.i : (i == 0 || i == intValue) ? false : true;
    }
}
