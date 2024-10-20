package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TO2 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<SO2> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (SO2 so2 : list) {
                    if ((so2.a.isAssignableFrom(cls) && cls2.isAssignableFrom(so2.b)) && !arrayList.contains(so2.b)) {
                        arrayList.add(so2.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List a(String str) {
        List list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.b.put(str, list);
        }
        return list;
    }
}
