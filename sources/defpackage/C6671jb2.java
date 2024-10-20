package defpackage;

import android.os.Handler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6671jb2 implements InterfaceC4953eb2 {
    public final Handler a = new Handler();
    public final boolean g;
    public final InterfaceC5297fb2 h;

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void b(Collection collection) {
    }

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void d(Collection collection) {
    }

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
    }

    public C6671jb2(C0351Cs0 c0351Cs0, C1387Kr1 c1387Kr1) {
        OTRProfileID oTRProfileID = OTRProfileID.b;
        this.g = !(c0351Cs0.a != null);
        this.h = c1387Kr1;
        c1387Kr1.a(this);
        if (c1387Kr1.f()) {
            c();
        }
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void c() {
        this.h.g(this);
        this.a.post(new Runnable() { // from class: ib2
            @Override // java.lang.Runnable
            public final void run() {
                C6671jb2 c6671jb2 = C6671jb2.this;
                if (c6671jb2.g) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    for (int i = 0; i < 8; i++) {
                        hashMap.put(Integer.valueOf(i), 0);
                        hashMap2.put(Integer.valueOf(i), 0);
                    }
                    InterfaceC5297fb2 interfaceC5297fb2 = c6671jb2.h;
                    for (OfflineItem offlineItem : interfaceC5297fb2.h()) {
                        int intValue = HN0.a(offlineItem).intValue();
                        hashMap.put(Integer.valueOf(intValue), Integer.valueOf(((Integer) hashMap.get(Integer.valueOf(intValue))).intValue() + 1));
                        if (offlineItem.t > offlineItem.s) {
                            hashMap2.put(Integer.valueOf(intValue), Integer.valueOf(((Integer) hashMap2.get(Integer.valueOf(intValue))).intValue() + 1));
                        }
                    }
                    EI2.e(interfaceC5297fb2.h().size(), "Android.DownloadManager.InitialCount.Total");
                    for (Map.Entry entry : hashMap.entrySet()) {
                        EI2.e(((Integer) entry.getValue()).intValue(), "Android.DownloadManager.InitialCount.".concat(A04.a(((Integer) entry.getKey()).intValue())));
                    }
                    for (Map.Entry entry2 : hashMap2.entrySet()) {
                        EI2.e(((Integer) entry2.getValue()).intValue(), "Android.DownloadManager.InitialCount.Viewed.".concat(A04.a(((Integer) entry2.getKey()).intValue())));
                    }
                }
            }
        });
    }
}
