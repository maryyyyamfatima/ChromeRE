package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9477rl0 extends AbstractC4610db2 {
    public final HashSet i;

    public C9477rl0(C1387Kr1 c1387Kr1) {
        super(c1387Kr1);
        this.i = new HashSet();
        k();
    }

    @Override // defpackage.AbstractC4610db2, defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        super.d(collection);
        Iterator it = ((HashSet) collection).iterator();
        while (it.hasNext()) {
            this.i.remove(((OfflineItem) it.next()).a);
        }
    }

    @Override // defpackage.AbstractC4610db2
    public final boolean j(OfflineItem offlineItem) {
        HashSet hashSet = this.i;
        if (hashSet == null) {
            return false;
        }
        return hashSet.contains(offlineItem.a);
    }
}
