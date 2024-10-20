package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NU1 {
    public final QU1 a;
    public final ArrayList b = new ArrayList();

    public NU1(Context context, C5172fC3 c5172fC3, C5516gC3 c5516gC3) {
        this.a = new QU1(context, c5172fC3, c5516gC3);
    }

    public final void b(KV1 kv1) {
        this.b.add(kv1);
        kv1.a(this.a);
    }

    public final ArrayList a() {
        LinkedHashMap linkedHashMap;
        QU1 qu1 = this.a;
        LinkedHashMap linkedHashMap2 = qu1.c;
        Iterator it = linkedHashMap2.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = qu1.d;
            if (!hasNext) {
                break;
            }
            int intValue = ((Integer) it.next()).intValue();
            if (!linkedHashMap.containsKey(Integer.valueOf(intValue))) {
                List list = (List) linkedHashMap2.get(Integer.valueOf(intValue));
                linkedHashMap.put(Integer.valueOf(intValue), (PU1) list.remove(0));
                if (list.size() == 0) {
                    it.remove();
                }
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((PU1) it2.next()).b.k(WU1.s, ((Boolean) qu1.b.get()).booleanValue());
        }
        return new ArrayList(linkedHashMap.values());
    }
}
