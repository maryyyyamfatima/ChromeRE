package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4189cM1 extends AbstractC3846bM1 {
    public static final Map b(C8089ni2... c8089ni2Arr) {
        if (c8089ni2Arr.length <= 0) {
            return C9281rA0.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3846bM1.a(c8089ni2Arr.length));
        for (C8089ni2 c8089ni2 : c8089ni2Arr) {
            linkedHashMap.put(c8089ni2.a, c8089ni2.g);
        }
        return linkedHashMap;
    }

    public static final void d(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8089ni2 c8089ni2 = (C8089ni2) it.next();
            linkedHashMap.put(c8089ni2.a, c8089ni2.g);
        }
    }

    public static final Map c(ArrayList arrayList) {
        C9281rA0 c9281rA0 = C9281rA0.a;
        int size = arrayList.size();
        if (size == 0) {
            return c9281rA0;
        }
        if (size == 1) {
            C8089ni2 c8089ni2 = (C8089ni2) arrayList.get(0);
            AbstractC0087Ar1.e(c8089ni2, "pair");
            Map singletonMap = Collections.singletonMap(c8089ni2.a, c8089ni2.g);
            AbstractC0087Ar1.d(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3846bM1.a(arrayList.size()));
        d(arrayList, linkedHashMap);
        return linkedHashMap;
    }
}
