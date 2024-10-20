package org.chromium.chrome.browser.offlinepages;

import J.N;
import android.text.TextUtils;
import defpackage.AbstractC10791vb2;
import defpackage.AbstractC8192o0;
import defpackage.C0649Ez3;
import defpackage.C11477xb2;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.InterfaceC0263Ca2;
import defpackage.PL3;
import defpackage.V60;
import defpackage.WL3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class OfflinePageBridge {
    public long a;
    public boolean b;
    public final C12157za2 c = new C12157za2();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface SavePageCallback {
        void onSavePageDone(int i, String str, long j);
    }

    public static OfflinePageBridge a(Profile profile) {
        Object obj = ThreadUtils.a;
        if (profile == null) {
            return null;
        }
        return (OfflinePageBridge) N.MspGcmXb(profile.g());
    }

    public OfflinePageBridge(long j) {
        this.a = j;
    }

    public static OfflinePageBridge create(long j) {
        return new OfflinePageBridge(j);
    }

    public static String getEncodedOriginApp(Tab tab) {
        return new C11477xb2(V60.a, tab).a();
    }

    public final void b(WebContents webContents, ClientId clientId, SavePageCallback savePageCallback) {
        C11477xb2 c11477xb2;
        Tab v = C0649Ez3.v(webContents.Q0());
        if (v != null) {
            c11477xb2 = new C11477xb2(V60.a, v);
        } else {
            c11477xb2 = new C11477xb2();
        }
        N.MD7l7nn$(this.a, this, savePageCallback, webContents, clientId.a, clientId.b, c11477xb2.a());
    }

    public void offlinePageModelLoaded() {
        this.b = true;
        Iterator it = this.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((WL3) ((AbstractC10791vb2) c11814ya2.next())).b();
            }
        }
    }

    public void offlinePageAdded(OfflinePageItem offlinePageItem) {
        Iterator it = this.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((WL3) ((AbstractC10791vb2) c11814ya2.next())).b();
            }
        }
    }

    public void offlinePageBridgeDestroyed() {
        Object obj = ThreadUtils.a;
        this.b = false;
        this.a = 0L;
        this.c.clear();
    }

    public void offlinePageDeleted(DeletedPageInfo deletedPageInfo) {
        Iterator it = this.c.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            WL3 wl3 = (WL3) ((AbstractC10791vb2) c11814ya2.next());
            Iterator it2 = wl3.a().iterator();
            while (it2.hasNext()) {
                InterfaceC0263Ca2 interfaceC0263Ca2 = (InterfaceC0263Ca2) it2.next();
                interfaceC0263Ca2.getClass();
                Long l = ((PL3) interfaceC0263Ca2).g;
                if (l != null && l.longValue() == deletedPageInfo.a) {
                    wl3.c(interfaceC0263Ca2, null);
                }
            }
        }
    }

    public static void createOfflinePageAndAddToList(List list, String str, long j, String str2, String str3, String str4, String str5, long j2, long j3, int i, long j4, String str6) {
        list.add(createOfflinePageItem(str, j, str2, str3, str4, str5, j2, j3, i, j4, str6));
    }

    public static OfflinePageItem createOfflinePageItem(String str, long j, String str2, String str3, String str4, String str5, long j2, long j3, int i, long j4, String str6) {
        return new OfflinePageItem(str, j, str2, str3, str4, str5, j2, j3, i, j4, str6);
    }

    public static ClientId createClientId(String str, String str2) {
        return new ClientId(str, str2);
    }

    public static DeletedPageInfo createDeletedPageInfo(long j, String str, String str2, String str3) {
        return new DeletedPageInfo(j);
    }

    public static LoadUrlParams createLoadUrlParams(String str, String str2, String str3) {
        LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            loadUrlParams.f = hashMap;
            loadUrlParams.g = AbstractC8192o0.a(str2, ":", str3);
        }
        return loadUrlParams;
    }
}
