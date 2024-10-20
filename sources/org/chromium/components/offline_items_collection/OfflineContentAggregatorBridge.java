package org.chromium.components.offline_items_collection;

import J.N;
import android.os.Handler;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C6161i50;
import defpackage.InterfaceC1303Ka2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OfflineContentAggregatorBridge {
    public long a;
    public final C12157za2 b;

    public OfflineContentAggregatorBridge(long j) {
        new Handler();
        this.a = j;
        this.b = new C12157za2();
    }

    public final void b(C6161i50 c6161i50) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MGbhWq61(j, this, c6161i50.a, c6161i50.b);
    }

    public final void a(C6161i50 c6161i50) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MBvrmOCy(j, this, c6161i50.a, c6161i50.b);
    }

    public final void c(C6161i50 c6161i50, boolean z) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MSy1v2e$(j, this, c6161i50.a, c6161i50.b, z);
    }

    public final void onItemsAdded(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1303Ka2) c11814ya2.next()).b(arrayList);
            }
        }
    }

    public final void onItemRemoved(String str, String str2) {
        C6161i50 c6161i50 = new C6161i50(str, str2);
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1303Ka2) c11814ya2.next()).e(c6161i50);
            }
        }
    }

    public final void onItemUpdated(OfflineItem offlineItem, UpdateDelta updateDelta) {
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1303Ka2) c11814ya2.next()).d(offlineItem, updateDelta);
            }
        }
    }

    public static void onVisualsAvailable(VisualsCallback visualsCallback, String str, String str2, OfflineItemVisuals offlineItemVisuals) {
        visualsCallback.f(new C6161i50(str, str2), offlineItemVisuals);
    }

    public static void onShareInfoAvailable(ShareCallback shareCallback, String str, String str2, OfflineItemShareInfo offlineItemShareInfo) {
        shareCallback.a(offlineItemShareInfo);
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }

    public static OfflineContentAggregatorBridge create(long j) {
        return new OfflineContentAggregatorBridge(j);
    }
}
