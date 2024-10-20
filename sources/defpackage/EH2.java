package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EH2 {
    public static InputStream a(C1837Od2 c1837Od2) {
        C0220Bs e = c1837Od2.a.e(c1837Od2.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        List list = c1837Od2.c;
        if (!list.isEmpty()) {
            int i = KY1.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            KY1 ky1 = !arrayList2.isEmpty() ? new KY1(e, arrayList2) : null;
            if (ky1 != null) {
                arrayList.add(ky1);
            }
        }
        Iterator it2 = c1837Od2.b.iterator();
        if (it2.hasNext()) {
            X5.a(it2.next());
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
