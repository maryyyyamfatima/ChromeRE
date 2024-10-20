package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tU0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10067tU0 {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();

    public final void a() {
        int indexOf;
        HashMap hashMap = this.e;
        boolean isEmpty = hashMap.isEmpty();
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = this.b;
        if (isEmpty) {
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            return;
        }
        Iterator it = hashMap.values().iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue < j) {
                j = longValue;
            }
        }
        if (j == 0 || (indexOf = arrayList3.indexOf(Long.valueOf(j))) == -1) {
            return;
        }
        arrayList3.subList(0, indexOf).clear();
        arrayList2.subList(0, indexOf).clear();
        arrayList.subList(0, indexOf).clear();
    }
}
