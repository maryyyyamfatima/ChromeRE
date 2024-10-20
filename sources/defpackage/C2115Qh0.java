package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qh0 */
/* loaded from: classes.dex */
public final class C2115Qh0 implements InterfaceC11007wC1 {
    public InterfaceC11007wC1 a;
    public final HashMap b = new HashMap();

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.a = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        InterfaceC11007wC1 interfaceC11007wC1 = this.a;
        if (interfaceC11007wC1 == null) {
            return;
        }
        HashMap hashMap = this.b;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OC1 oc1 = (OC1) it.next();
            if (PD1.a(oc1)) {
                OfflineItem offlineItem = ((KC1) oc1).e;
                int i = AbstractC7853n04.a;
                String b = AbstractC10615v34.b(1, offlineItem.x);
                hashMap.put(b, Long.valueOf(Math.max(hashMap.containsKey(b) ? ((Long) hashMap.get(b)).longValue() : 0L, offlineItem.r)));
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: Ph0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                OC1 oc12 = (OC1) obj;
                OC1 oc13 = (OC1) obj2;
                C2115Qh0 c2115Qh0 = C2115Qh0.this;
                c2115Qh0.getClass();
                OfflineItem offlineItem2 = ((KC1) oc12).e;
                OfflineItem offlineItem3 = ((KC1) oc13).e;
                int compare = Long.compare(c2115Qh0.d(oc13), c2115Qh0.d(oc12));
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Long.compare(offlineItem3.r, offlineItem2.r);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo = offlineItem2.a.a.compareTo(offlineItem3.a.a);
                return compareTo != 0 ? compareTo : offlineItem2.a.b.compareTo(offlineItem3.a.b);
            }
        });
        interfaceC11007wC1.b(arrayList);
    }

    public final long d(OC1 oc1) {
        OfflineItem offlineItem = ((KC1) oc1).e;
        if (PD1.a(oc1)) {
            int i = AbstractC7853n04.a;
            return ((Long) this.b.get(AbstractC10615v34.b(1, offlineItem.x))).longValue();
        }
        return offlineItem.r;
    }
}
