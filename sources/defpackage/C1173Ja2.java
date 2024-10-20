package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.UpdateDelta;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ja2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173Ja2 implements InterfaceC1303Ka2 {
    public static C1173Ja2 h;
    public final HashSet a = new HashSet();
    public final HashSet g = new HashSet();

    @Override // defpackage.InterfaceC1303Ka2
    public final void d(OfflineItem offlineItem, UpdateDelta updateDelta) {
    }

    public final void c() {
        Q83 q83 = O83.a;
        q83.p("Chrome.NTPExploreOfflineCard.HasExploreOfflineContent", !this.a.isEmpty());
        q83.p("Chrome.OfflineIndicatorV2.HasPersistentOfflineContent", !this.g.isEmpty());
    }

    public static C1173Ja2 a() {
        if (h == null) {
            h = new C1173Ja2();
            OfflineContentAggregatorBridge a = AbstractC0653Fa2.a();
            a.b.a(h);
            final C1173Ja2 c1173Ja2 = h;
            Objects.requireNonNull(c1173Ja2);
            Callback callback = new Callback() { // from class: Ia2
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C1173Ja2.this.b((ArrayList) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            };
            long j = a.a;
            if (j != 0) {
                N.MWgZa2II(j, a, callback);
            }
        }
        return h;
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineItem offlineItem = (OfflineItem) it.next();
            if (offlineItem.k) {
                this.a.add(offlineItem.a);
            }
            if (!offlineItem.j) {
                this.g.add(offlineItem.a);
            }
        }
        c();
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void e(C6161i50 c6161i50) {
        boolean remove = this.a.remove(c6161i50);
        boolean remove2 = this.g.remove(c6161i50);
        if (remove || remove2) {
            c();
        }
    }
}
