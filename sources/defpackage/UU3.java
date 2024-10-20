package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UU3 {
    public final ArrayList a = new ArrayList();

    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            TU3 tu3 = (TU3) it.next();
            if ((tu3.a.isAssignableFrom(cls) && cls2.isAssignableFrom(tu3.b)) && !arrayList.contains(tu3.b)) {
                arrayList.add(tu3.b);
            }
        }
        return arrayList;
    }
}
