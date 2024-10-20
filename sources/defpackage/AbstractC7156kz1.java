package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kz1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7156kz1 {
    public static void e(String str, boolean z) {
        SharedPreferences sharedPreferences = T60.a;
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("subscriptions_with_persisted_messages", Collections.emptySet()));
        if (hashSet.contains(str) == z) {
            return;
        }
        if (z) {
            hashSet.add(str);
        } else {
            hashSet.remove(str);
        }
        sharedPreferences.edit().putStringSet("subscriptions_with_persisted_messages", hashSet).apply();
    }

    public static void b(String str) {
        V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).edit().remove(str).apply();
        e(str, false);
    }

    public static String a(String str, String str2) {
        return str.equals("com.google.chrome.fcm.invalidations") ? str.concat("8181035976") : AbstractC7848n0.a(str, str2);
    }

    public static void f(String str, boolean z) {
        boolean d = d(str);
        if (d == z) {
            return;
        }
        if (d) {
            b(str);
        }
        SharedPreferences sharedPreferences = V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet("fcm_lazy_subscriptions", Collections.emptySet()));
        if (d) {
            hashSet.remove(str);
        } else {
            hashSet.add(str);
        }
        sharedPreferences.edit().putStringSet("fcm_lazy_subscriptions", hashSet).apply();
    }

    public static boolean d(String str) {
        C7432ln3 c = C7432ln3.c();
        try {
            boolean contains = new HashSet(V60.a.getSharedPreferences("org.chromium.components.gcm_driver.lazy_subscriptions", 0).getStringSet("fcm_lazy_subscriptions", Collections.emptySet())).contains(str);
            c.close();
            return contains;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static JSONArray c(JSONArray jSONArray, String str) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.optString("collapseKey", null).equals(str)) {
                AbstractC4851eH1.d("LazySubscriptions", "Dropping GCM Message due to collapse key collision. Sender id:" + jSONObject.optString("senderId", null), new Object[0]);
            } else {
                jSONArray2.put(jSONObject);
            }
        }
        return jSONArray2;
    }
}
