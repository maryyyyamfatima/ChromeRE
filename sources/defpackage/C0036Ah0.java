package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ah0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036Ah0 implements InterfaceC4953eb2 {
    public final C4722du1 a;
    public final PC1 g;
    public InterfaceC11007wC1 h;
    public final ArrayList i = new ArrayList();

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void c() {
    }

    public C0036Ah0(C8037nZ3 c8037nZ3, PC1 pc1, C4722du1 c4722du1) {
        this.g = pc1;
        this.a = c4722du1;
        c8037nZ3.a(this);
        b(c8037nZ3.g);
    }

    public final void a() {
        InterfaceC11007wC1 interfaceC11007wC1 = this.h;
        if (interfaceC11007wC1 == null) {
            return;
        }
        interfaceC11007wC1.b(this.i);
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.i.add(new KC1((OfflineItem) it.next()));
        }
        a();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i < arrayList.size()) {
                    if (offlineItem.a.equals(((KC1) arrayList.get(i)).e.a)) {
                        arrayList.remove(i);
                    }
                    i++;
                }
            }
        }
        a();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
        long j = offlineItem.r;
        long j2 = offlineItem2.r;
        PC1 pc1 = this.g;
        if (j == j2 && offlineItem.i == offlineItem2.i) {
            C4722du1 c4722du1 = this.a;
            if (c4722du1.a(offlineItem) == c4722du1.a(offlineItem2)) {
                OfflineItemSchedule offlineItemSchedule = offlineItem2.K;
                int i = 0;
                if (!((offlineItemSchedule == null && offlineItem.K != null) || (offlineItemSchedule != null && offlineItem.K == null))) {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = this.i;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        if (offlineItem2.a.equals(((KC1) arrayList.get(i2)).e.a)) {
                            arrayList.set(i2, new KC1(offlineItem2));
                        }
                        i2++;
                    }
                    while (true) {
                        if (i >= pc1.size()) {
                            break;
                        }
                        OC1 oc1 = (OC1) pc1.get(i);
                        if (oc1 instanceof KC1) {
                            KC1 kc1 = (KC1) oc1;
                            if (offlineItem2.a.equals(kc1.e.a)) {
                                kc1.e = offlineItem2;
                                pc1.B(i, kc1);
                                break;
                            }
                        }
                        i++;
                    }
                    pc1.h.e();
                }
            }
        }
        d(Collections.singletonList(offlineItem));
        b(Collections.singletonList(offlineItem2));
        pc1.h.e();
    }
}
