package defpackage;

import java.util.Date;
import java.util.HashSet;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: du1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4722du1 {
    public final HashSet b = new HashSet();
    public final Date a = new Date(new Date().getTime() - 1800000);

    public C4722du1(C0351Cs0 c0351Cs0) {
    }

    public final boolean a(OfflineItem offlineItem) {
        int i = offlineItem.B;
        boolean z = i == 0 || i == 6 || (i == 4 && offlineItem.C) || new Date(offlineItem.s).after(this.a);
        HashSet hashSet = this.b;
        if (z) {
            hashSet.add(offlineItem.a);
        }
        return hashSet.contains(offlineItem.a);
    }
}
