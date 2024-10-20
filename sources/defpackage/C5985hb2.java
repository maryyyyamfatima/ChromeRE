package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.UpdateDelta;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5985hb2 implements InterfaceC5297fb2, InterfaceC1303Ka2 {
    public final OfflineContentAggregatorBridge a;
    public final HashMap g = new HashMap();
    public final C12157za2 h = new C12157za2();
    public boolean i;
    public boolean j;

    public C5985hb2(OfflineContentAggregatorBridge offlineContentAggregatorBridge) {
        this.a = offlineContentAggregatorBridge;
        offlineContentAggregatorBridge.b.a(this);
        Callback callback = new Callback() { // from class: gb2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                C5985hb2 c5985hb2 = C5985hb2.this;
                if (c5985hb2.j) {
                    return;
                }
                c5985hb2.i = true;
                Iterator it = c5985hb2.h.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        c5985hb2.b(arrayList);
                        return;
                    }
                    ((InterfaceC4953eb2) c11814ya2.next()).c();
                }
            }
        };
        long j = offlineContentAggregatorBridge.a;
        if (j == 0) {
            return;
        }
        N.MWgZa2II(j, offlineContentAggregatorBridge, callback);
    }

    @Override // defpackage.InterfaceC5297fb2
    public final Collection h() {
        return this.g.values();
    }

    @Override // defpackage.InterfaceC5297fb2
    public final boolean f() {
        return this.i;
    }

    @Override // defpackage.InterfaceC5297fb2
    public final void a(InterfaceC4953eb2 interfaceC4953eb2) {
        this.h.a(interfaceC4953eb2);
    }

    @Override // defpackage.InterfaceC5297fb2
    public final void g(InterfaceC4953eb2 interfaceC4953eb2) {
        this.h.d(interfaceC4953eb2);
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            HashMap hashMap = this.g;
            if (hashMap.containsKey(offlineItem.a)) {
                d(offlineItem, null);
            } else {
                hashMap.put(offlineItem.a, offlineItem);
                hashSet.add(offlineItem);
            }
        }
        if (hashSet.size() <= 0) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it2;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).b(hashSet);
            }
        }
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void e(C6161i50 c6161i50) {
        OfflineItem offlineItem = (OfflineItem) this.g.remove(c6161i50);
        if (offlineItem == null) {
            return;
        }
        HashSet d = AbstractC9048qW.d(offlineItem);
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).d(d);
            }
        }
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void d(OfflineItem offlineItem, UpdateDelta updateDelta) {
        HashMap hashMap = this.g;
        OfflineItem offlineItem2 = (OfflineItem) hashMap.get(offlineItem.a);
        if (offlineItem2 == null) {
            b(Collections.singletonList(offlineItem));
            return;
        }
        hashMap.put(offlineItem.a, offlineItem);
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC4953eb2) c11814ya2.next()).e(offlineItem2, offlineItem);
            }
        }
    }
}
