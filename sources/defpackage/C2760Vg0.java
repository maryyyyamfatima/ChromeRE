package defpackage;

import java.util.ArrayList;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2760Vg0 implements InterfaceC11007wC1 {
    public final C4722du1 a;
    public InterfaceC11007wC1 b;

    public C2760Vg0(C4722du1 c4722du1) {
        this.a = c4722du1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.b = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        InterfaceC11007wC1 interfaceC11007wC1 = this.b;
        if (interfaceC11007wC1 == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        OfflineItem offlineItem = null;
        for (int i = 0; i < arrayList.size(); i++) {
            OC1 oc1 = (OC1) arrayList.get(i);
            if (oc1 instanceof KC1) {
                OfflineItem offlineItem2 = ((KC1) oc1).e;
                int d = d(offlineItem2);
                if (d != d(offlineItem)) {
                    arrayList2.add(new MC1(d(offlineItem2), WE.a(offlineItem2.r).getTime().getTime()));
                } else if (d == 0) {
                    if (!WE.a(offlineItem2.r).getTime().equals(offlineItem == null ? null : WE.a(offlineItem.r).getTime())) {
                        arrayList2.add(new MC1(d(offlineItem2), WE.a(offlineItem2.r).getTime().getTime()));
                    }
                }
                arrayList2.add(oc1);
                offlineItem = offlineItem2;
            }
        }
        interfaceC11007wC1.b(arrayList2);
    }

    public final int d(OfflineItem offlineItem) {
        if (offlineItem == null) {
            return -1;
        }
        if (offlineItem.K != null) {
            return 2;
        }
        C4722du1 c4722du1 = this.a;
        return c4722du1 != null && c4722du1.a(offlineItem) ? 1 : 0;
    }
}
