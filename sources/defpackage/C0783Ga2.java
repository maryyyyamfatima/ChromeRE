package defpackage;

import J.N;
import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.download.DownloadInfo;
import org.chromium.chrome.browser.download.DownloadItem;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.OfflineItemSchedule;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;
import org.chromium.components.offline_items_collection.UpdateDelta;
import org.chromium.components.offline_items_collection.VisualsCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ga2 */
/* loaded from: classes.dex */
public final class C0783Ga2 implements InterfaceC3210Ys0, InterfaceC1303Ka2, VisualsCallback {
    public static final OfflineItemVisuals j = new OfflineItemVisuals();
    public final OfflineContentAggregatorBridge a;
    public final C7474lu3 g;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();

    @Override // defpackage.InterfaceC3210Ys0
    public final void g() {
    }

    public C0783Ga2(OfflineContentAggregatorBridge offlineContentAggregatorBridge, C7474lu3 c7474lu3) {
        this.a = offlineContentAggregatorBridge;
        this.g = c7474lu3;
        offlineContentAggregatorBridge.b.a(this);
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void c(C6161i50 c6161i50, OTRProfileID oTRProfileID) {
        OfflineContentAggregatorBridge offlineContentAggregatorBridge = this.a;
        long j2 = offlineContentAggregatorBridge.a;
        if (j2 == 0) {
            return;
        }
        N.Mwk11G0z(j2, offlineContentAggregatorBridge, c6161i50.a, c6161i50.b);
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void b(List list) {
        for (int i = 0; i < list.size(); i++) {
            i((OfflineItem) list.get(i), null);
        }
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void e(C6161i50 c6161i50) {
        this.h.remove(c6161i50);
        this.i.remove(c6161i50);
        this.g.c(c6161i50);
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void d(OfflineItem offlineItem, UpdateDelta updateDelta) {
        i(offlineItem, updateDelta);
    }

    @Override // org.chromium.components.offline_items_collection.VisualsCallback
    public final void f(C6161i50 c6161i50, OfflineItemVisuals offlineItemVisuals) {
        int i;
        OfflineItem offlineItem = (OfflineItem) this.h.remove(c6161i50);
        if (offlineItem == null) {
            return;
        }
        if (offlineItemVisuals == null) {
            offlineItemVisuals = j;
        }
        boolean z = false;
        if (!offlineItem.o && ((i = offlineItem.B) == 0 || i == 1 || i == 2 || i == 4 || i == 6)) {
            z = true;
        }
        if (z) {
            this.i.put(c6161i50, offlineItemVisuals);
        }
        j(offlineItem, offlineItemVisuals);
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void a(C6161i50 c6161i50, OTRProfileID oTRProfileID) {
        this.a.a(c6161i50);
    }

    @Override // defpackage.InterfaceC3210Ys0
    public final void h(C6161i50 c6161i50, DownloadItem downloadItem, boolean z) {
        this.a.c(c6161i50, z);
    }

    public final void j(OfflineItem offlineItem, OfflineItemVisuals offlineItemVisuals) {
        if (offlineItem.k || offlineItem.K != null) {
            return;
        }
        int i = offlineItem.B;
        int i2 = 3;
        C7474lu3 c7474lu3 = this.g;
        if (i == 3) {
            c7474lu3.c(offlineItem.a);
            return;
        }
        Y60.a.getClass();
        Y60.b();
        int i3 = offlineItem.B;
        if (i3 == 2) {
            i2 = 1;
        } else if (i3 == 3) {
            i2 = 2;
        } else if (i3 != 4 && i3 != 5) {
            i2 = 0;
        }
        C0216Br0 c0216Br0 = new C0216Br0();
        C6161i50 c6161i50 = offlineItem.a;
        c0216Br0.z = c6161i50;
        c0216Br0.m = c6161i50.b;
        c0216Br0.e = offlineItem.g;
        c0216Br0.g = offlineItem.v;
        c0216Br0.f = offlineItem.h;
        c0216Br0.B = offlineItem.j;
        c0216Br0.x = offlineItem.t;
        c0216Br0.A = offlineItem.u;
        c0216Br0.c = offlineItem.w;
        c0216Br0.a = offlineItem.x;
        c0216Br0.i = offlineItem.y;
        c0216Br0.c(OTRProfileID.a(offlineItem.A));
        c0216Br0.w = i2;
        c0216Br0.s = offlineItem.B == 6;
        c0216Br0.r = offlineItem.C;
        c0216Br0.j = offlineItem.E;
        c0216Br0.k = offlineItem.p;
        c0216Br0.p = offlineItem.F;
        c0216Br0.q = offlineItem.G;
        c0216Br0.y = offlineItem.H;
        c0216Br0.C = offlineItem.l;
        c0216Br0.D = offlineItemVisuals == null ? null : offlineItemVisuals.a;
        c0216Br0.E = offlineItem.f11537J;
        c0216Br0.F = offlineItem.I;
        c0216Br0.G = offlineItem.m;
        c0216Br0.H = offlineItem.K;
        DownloadInfo downloadInfo = new DownloadInfo(c0216Br0);
        int i4 = offlineItem.B;
        OfflineItemSchedule offlineItemSchedule = downloadInfo.H;
        if (i4 == 0) {
            long j2 = offlineItem.r;
            boolean z = offlineItem.D;
            c7474lu3.getClass();
            if (offlineItemSchedule != null) {
                return;
            }
            C7130ku3 c7130ku3 = new C7130ku3(0, downloadInfo, 1);
            c7130ku3.d = j2;
            c7130ku3.h = z;
            c7474lu3.a(c7130ku3);
            return;
        }
        if (i4 == 1) {
            c7474lu3.getClass();
            if (offlineItemSchedule != null) {
                return;
            }
            c7474lu3.a(new C7130ku3(1, downloadInfo, 0));
            return;
        }
        if (i4 == 2) {
            this.g.e(downloadInfo, -1L, false, offlineItem.u);
            return;
        }
        if (i4 != 4) {
            if (i4 == 5) {
                c7474lu3.d(downloadInfo);
                return;
            } else {
                if (i4 != 6) {
                    return;
                }
                c7474lu3.getClass();
                if (offlineItemSchedule != null) {
                    return;
                }
                c7474lu3.a(new C7130ku3(1, downloadInfo, 0));
                return;
            }
        }
        boolean z2 = !AbstractC8531oz1.b(offlineItem.a);
        int i5 = offlineItem.f11537J;
        c7474lu3.getClass();
        if (offlineItemSchedule != null) {
            return;
        }
        C7130ku3 c7130ku32 = new C7130ku3(4, downloadInfo, 0);
        c7130ku32.i = z2;
        c7130ku32.j = i5;
        c7474lu3.a(c7130ku32);
    }

    public final void i(OfflineItem offlineItem, UpdateDelta updateDelta) {
        int i;
        int i2;
        boolean z = false;
        if ((offlineItem.B != 2 || updateDelta == null || updateDelta.a || updateDelta.b) ? false : true) {
            return;
        }
        HashMap hashMap = this.i;
        if (updateDelta != null && updateDelta.b) {
            hashMap.remove(offlineItem.a);
        }
        boolean z2 = !offlineItem.o && ((i2 = offlineItem.B) == 0 || i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 6);
        HashMap hashMap2 = this.h;
        if (z2) {
            if (!hashMap.containsKey(offlineItem.a)) {
                boolean z3 = !hashMap2.containsKey(offlineItem.a);
                hashMap2.put(offlineItem.a, offlineItem);
                if (z3) {
                    C6161i50 c6161i50 = offlineItem.a;
                    OfflineContentAggregatorBridge offlineContentAggregatorBridge = this.a;
                    N.MwOuZAaJ(offlineContentAggregatorBridge.a, offlineContentAggregatorBridge, c6161i50.a, c6161i50.b, this);
                    return;
                }
                return;
            }
        } else {
            hashMap2.remove(offlineItem.a);
            hashMap.remove(offlineItem.a);
        }
        j(offlineItem, (OfflineItemVisuals) hashMap.get(offlineItem.a));
        if (!offlineItem.o && ((i = offlineItem.B) == 0 || i == 1 || i == 2 || i == 4 || i == 6)) {
            z = true;
        }
        if (z) {
            return;
        }
        hashMap.remove(offlineItem.a);
    }
}
