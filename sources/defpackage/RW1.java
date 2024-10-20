package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RW1 extends SW1 {
    public final Map b;

    public RW1(AbstractC10078tW1 abstractC10078tW1, AbstractC10078tW1 abstractC10078tW12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, abstractC10078tW1);
        d(linkedHashMap, abstractC10078tW12);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((GW1) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, AbstractC10078tW1 abstractC10078tW1) {
        for (int i = 0; i < abstractC10078tW1.d(); i++) {
            GW1 b = abstractC10078tW1.b(i);
            Object obj = linkedHashMap.get(b);
            boolean z = b.c;
            Class cls = b.b;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(b, list);
                }
                list.add(cls.cast(abstractC10078tW1.c(i)));
            } else {
                linkedHashMap.put(b, cls.cast(abstractC10078tW1.c(i)));
            }
        }
    }

    @Override // defpackage.SW1
    public final void c(BW1 bw1, C0102Au1 c0102Au1) {
        for (Map.Entry entry : this.b.entrySet()) {
            GW1 gw1 = (GW1) entry.getKey();
            Object value = entry.getValue();
            if (gw1.c) {
                bw1.b(gw1, ((List) value).iterator(), c0102Au1);
            } else {
                bw1.a(gw1, value, c0102Au1);
            }
        }
    }

    @Override // defpackage.SW1
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.SW1
    public final Set b() {
        return this.b.keySet();
    }
}
