package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g51 */
/* loaded from: classes.dex */
public final class C5474g51 implements InterfaceC11007wC1 {
    public InterfaceC11007wC1 a;
    public final C11711yG b;
    public long c;

    public C5474g51(C11711yG c11711yG) {
        this.b = c11711yG;
    }

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
        this.c = 200000L;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        OC1 oc1 = null;
        while (it.hasNext()) {
            OC1 oc12 = (OC1) it.next();
            boolean z = false;
            if (oc12 instanceof KC1) {
                ((KC1) oc12).g = false;
            }
            if (PD1.a(oc12) && PD1.a(oc1) && f(oc12).equals(f(oc1))) {
                z = true;
            }
            if (z) {
                arrayList3.add(oc12);
            } else {
                e(arrayList3, arrayList2);
                arrayList3.clear();
                if (PD1.a(oc12)) {
                    arrayList3.add(oc12);
                } else {
                    arrayList2.add(oc12);
                }
            }
            oc1 = oc12;
        }
        e(arrayList3, arrayList2);
        interfaceC11007wC1.b(arrayList2);
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        C11711yG c11711yG = this.b;
        c11711yG.getClass();
        if (size < 3) {
            arrayList2.addAll(arrayList);
            return;
        }
        Pair f = f((OC1) arrayList.get(0));
        String i = ((KC1) arrayList.get(0)).e.x.i();
        HashMap hashMap = c11711yG.a;
        if (!hashMap.containsKey(f)) {
            hashMap.put(f, 1);
        }
        arrayList2.add(d(1));
        arrayList2.add(new IC1(f, i));
        int intValue = (hashMap.containsKey(f) ? ((Integer) hashMap.get(f)).intValue() : 1) * 3;
        int min = Math.min(intValue, arrayList.size());
        for (int i2 = 0; i2 < min; i2++) {
            KC1 kc1 = (KC1) arrayList.get(i2);
            kc1.g = true;
            arrayList2.add(kc1);
            if (i2 < min - 1) {
                arrayList2.add(d(2));
            }
        }
        if (arrayList.size() > intValue) {
            arrayList2.add(d(2));
            arrayList2.add(new HC1(f));
        }
        arrayList2.add(d(3));
    }

    public final GC1 d(int i) {
        long j = this.c;
        this.c = 1 + j;
        return new GC1(j, i);
    }

    public static Pair f(OC1 oc1) {
        OfflineItem offlineItem = ((KC1) oc1).e;
        Date time = WE.a(offlineItem.r).getTime();
        int i = AbstractC7853n04.a;
        return Pair.create(time, AbstractC10615v34.b(1, offlineItem.x));
    }
}
