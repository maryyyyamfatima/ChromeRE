package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y13, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11631y13 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static C11631y13 a(C11631y13 c11631y13) {
        c11631y13.getClass();
        C11631y13 c11631y132 = new C11631y13();
        HashMap hashMap = c11631y13.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                c11631y132.a.put(str, new ArrayList((Collection) hashMap.get(str)));
            }
            HashMap hashMap2 = c11631y13.b;
            for (String str2 : hashMap2.keySet()) {
                c11631y132.b.put(str2, new ArrayList((Collection) hashMap2.get(str2)));
            }
        }
        return c11631y132;
    }

    public static void b(C11631y13 c11631y13, C11631y13 c11631y132) {
        c11631y13.getClass();
        HashMap hashMap = c11631y132.a;
        if (hashMap.isEmpty()) {
            return;
        }
        for (String str : hashMap.keySet()) {
            HashMap hashMap2 = c11631y13.a;
            if (!hashMap2.containsKey(str)) {
                return;
            }
            c(hashMap2, hashMap, str);
            c(c11631y13.b, c11631y132.b, str);
        }
    }

    public static void c(HashMap hashMap, HashMap hashMap2, String str) {
        List list = (List) hashMap2.get(str);
        List list2 = (List) hashMap.remove(str);
        if (list != null && list2 != null) {
            list2.removeAll(list);
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        hashMap.put(str, list2);
    }
}
