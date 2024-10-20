package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2495Tf0 {
    public final MI a;

    public C2495Tf0(MI mi) {
        this.a = mi;
    }

    public static ArrayList a(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            NJ2 nj2 = (NJ2) it.next();
            int i3 = i2 + 1;
            if (i2 == i) {
                break;
            }
            arrayList.add(nj2.a);
            i2 = i3;
        }
        return arrayList;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C11198wm0) it.next()).a);
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C11198wm0) it.next()).b);
        }
        return arrayList;
    }
}
