package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kh3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7052kh3 {
    public final HashMap a = new HashMap();

    public static void a() {
        SharedPreferences sharedPreferences = T60.a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(sharedPreferences.getStringSet("key_modules_requested_previously", new HashSet()));
        hashSet.addAll(sharedPreferences.getStringSet("key_modules_deferred_requested_previously", new HashSet()));
        Set<String> b = AbstractC2378Sh3.a(V60.a).b();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            EI2.h(b.contains(str) ? 1 : 0, 3, "Android.FeatureModules.AvailabilityStatus." + str);
        }
        for (String str2 : b) {
            if (!hashSet.contains(str2)) {
                EI2.h(2, 3, "Android.FeatureModules.AvailabilityStatus." + str2);
            }
        }
    }

    public static boolean c(String str, String str2) {
        SharedPreferences sharedPreferences = T60.a;
        Set<String> stringSet = sharedPreferences.getStringSet(str2, new HashSet());
        HashSet hashSet = new HashSet(stringSet);
        hashSet.add(str);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(str2, hashSet);
        edit.apply();
        return stringSet.contains(str);
    }

    public final void b(int i, String str, int i2, String str2) {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(str)) {
            C6708jh3 c6708jh3 = (C6708jh3) hashMap.get(str);
            long j = c6708jh3.b.get(i);
            long j2 = c6708jh3.b.get(i2);
            if (j == 0 || j2 == 0) {
                return;
            }
            EI2.j(j2 - j, String.format("Android.FeatureModules.%sAwakeInstallDuration%s.%s", c6708jh3.a ? "Cached" : "Uncached", str2, str));
        }
    }
}
