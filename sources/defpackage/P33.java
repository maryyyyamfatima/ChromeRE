package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class P33 extends S33 {
    public static final List a(L33 l33) {
        ArrayList arrayList = new ArrayList();
        Iterator it = l33.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size == 0) {
            return C8939qA0.a;
        }
        if (size != 1) {
            return arrayList;
        }
        List singletonList = Collections.singletonList(arrayList.get(0));
        AbstractC0087Ar1.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
