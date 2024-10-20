package org.chromium.chrome.browser.webapps;

import J.N;
import android.content.SharedPreferences;
import android.util.Pair;
import defpackage.AbstractC5103f04;
import defpackage.C11548xn1;
import defpackage.C1193Je2;
import defpackage.C12237zn4;
import defpackage.C7432ln3;
import defpackage.V60;
import defpackage.Wn4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.browsing_data.UrlFilterBridge;
import org.chromium.chrome.browser.webapps.WebappRegistry;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebappRegistry {
    public boolean a;
    public final HashMap b;
    public final SharedPreferences c;
    public final C11548xn1 d;

    public static void clearWebappHistoryForUrls(UrlFilterBridge urlFilterBridge) {
        for (C12237zn4 c12237zn4 : Wn4.a.b.values()) {
            if (N.MrY8rM_K(urlFilterBridge.a, urlFilterBridge, c12237zn4.b.getString("url", ""))) {
                c12237zn4.a();
                SharedPreferences.Editor edit = c12237zn4.b.edit();
                edit.remove("last_used");
                edit.remove("url");
                edit.remove("scope");
                edit.remove("last_check_web_manifest_update_time");
                edit.remove("last_update_request_complete_time");
                edit.remove("did_last_update_request_succeed");
                edit.remove("last_update_hash_accepted");
                edit.remove("relax_updates");
                edit.remove("show_disclosure");
                edit.remove("launch_count");
                edit.remove("webapk_uninstall_timestamp");
                edit.apply();
            }
        }
        N.MBBog0Dv(urlFilterBridge.a, urlFilterBridge);
        urlFilterBridge.a = 0L;
    }

    public static void unregisterWebappsForUrls(UrlFilterBridge urlFilterBridge) {
        WebappRegistry webappRegistry = Wn4.a;
        HashMap hashMap = webappRegistry.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            C12237zn4 c12237zn4 = (C12237zn4) ((Map.Entry) it.next()).getValue();
            if (N.MrY8rM_K(urlFilterBridge.a, urlFilterBridge, c12237zn4.b.getString("url", ""))) {
                c12237zn4.a();
                c12237zn4.b.edit().clear().apply();
                it.remove();
            }
        }
        boolean isEmpty = hashMap.isEmpty();
        SharedPreferences sharedPreferences = webappRegistry.c;
        if (isEmpty) {
            sharedPreferences.edit().clear().apply();
        } else {
            sharedPreferences.edit().putStringSet("webapp_set", hashMap.keySet()).apply();
        }
        N.MBBog0Dv(urlFilterBridge.a, urlFilterBridge);
        urlFilterBridge.a = 0L;
    }

    public WebappRegistry() {
        C7432ln3 c = C7432ln3.c();
        try {
            SharedPreferences sharedPreferences = V60.a.getSharedPreferences("webapp_registry", 0);
            c.close();
            this.c = sharedPreferences;
            this.b = new HashMap();
            this.d = new C11548xn1();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final C12237zn4 c(String str) {
        return (C12237zn4) this.b.get(str);
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        for (C12237zn4 c12237zn4 : this.b.values()) {
            String string = c12237zn4.a.startsWith("webapk-") ? c12237zn4.b.getString("scope", "") : "";
            if (!string.isEmpty()) {
                hashSet.add(C1193Je2.b(string).toString());
            }
        }
        return hashSet;
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(b());
        hashSet.addAll(this.d.g());
        return hashSet;
    }

    public final void d(String str) {
        Set<String> stringSet = this.c.getStringSet("webapp_set", Collections.emptySet());
        final boolean z = false;
        boolean z2 = str == null || str.isEmpty();
        if (z2 && !this.a) {
            z = true;
        }
        if (z2 && !this.a) {
            this.d.g();
            this.a = true;
        }
        final ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.b;
        if (z2) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    next = "";
                }
                if (!hashMap.containsKey(next)) {
                    arrayList.add(Pair.create(next, new C12237zn4(next)));
                }
            }
        } else if (stringSet.contains(str) && !hashMap.containsKey(str)) {
            arrayList.add(Pair.create(str, new C12237zn4(str)));
        }
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: Tn4
            @Override // java.lang.Runnable
            public final void run() {
                WebappRegistry webappRegistry = WebappRegistry.this;
                webappRegistry.getClass();
                Object obj = ThreadUtils.a;
                for (Pair pair : arrayList) {
                    HashMap hashMap2 = webappRegistry.b;
                    if (!hashMap2.containsKey(pair.first)) {
                        hashMap2.put((String) pair.first, (C12237zn4) pair.second);
                    }
                }
                if (z) {
                    EI2.d(webappRegistry.b().size(), "WebApk.WebappRegistry.NumberOfOrigins");
                }
            }
        });
    }
}
