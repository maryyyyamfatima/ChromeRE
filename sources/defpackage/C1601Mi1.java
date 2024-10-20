package defpackage;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601Mi1 extends AbstractC1082Ii1 {
    public final void b(Integer num, Object... objArr) {
        List asList = Arrays.asList(objArr);
        if (num == null) {
            throw new NullPointerException("null key in entry: null=" + AbstractC1781Ns1.c(asList));
        }
        OY oy = this.a;
        Collection collection = (Collection) oy.get(num);
        if (collection != null) {
            for (Object obj : asList) {
                RV.a(num, obj);
                collection.add(obj);
            }
            return;
        }
        Iterator it = asList.iterator();
        if (it.hasNext()) {
            QY qy = new QY();
            while (it.hasNext()) {
                Object next = it.next();
                RV.a(num, next);
                qy.add(next);
            }
            oy.put(num, qy);
        }
    }

    public final C1731Ni1 a() {
        Collection entrySet = this.a.entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            return C7909nA0.h;
        }
        JY jy = (JY) entrySet;
        C0822Gi1 c0822Gi1 = new C0822Gi1(jy.size());
        Iterator it = jy.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            AbstractC1472Li1 o = AbstractC1472Li1.o((Collection) entry.getValue());
            if (!o.isEmpty()) {
                c0822Gi1.b(key, o);
                i += o.size();
            }
        }
        return new C1731Ni1(c0822Gi1.a(true), i);
    }
}
