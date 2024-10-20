package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Il */
/* loaded from: classes.dex */
public final class C1095Il {
    public LinkedHashMap a;

    public final void a(C1032Hy1 c1032Hy1, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap4 = this.a;
                if (linkedHashMap != null) {
                    linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    if (linkedHashMap4 != null) {
                        linkedHashMap2.keySet().removeAll(linkedHashMap4.keySet());
                    }
                } else {
                    linkedHashMap2 = null;
                }
                LinkedHashMap linkedHashMap5 = this.a;
                if (linkedHashMap5 != null) {
                    linkedHashMap3 = new LinkedHashMap(linkedHashMap5);
                    if (linkedHashMap != null) {
                        linkedHashMap3.keySet().removeAll(linkedHashMap.keySet());
                    }
                } else {
                    linkedHashMap3 = null;
                }
                if (linkedHashMap != null) {
                    this.a = new LinkedHashMap(linkedHashMap);
                } else {
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (linkedHashMap3 != null) {
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                WZ wz = (WZ) entry.getValue();
                C7849n00 c7849n00 = wz.r;
                wz.D();
            }
        }
        if (linkedHashMap2 != null) {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                WZ wz2 = (WZ) entry2.getValue();
                wz2.w(wz2.r);
            }
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.a == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : this.a.entrySet()) {
                arrayList.add((WZ) entry.getValue());
                arrayList2.add((String) entry.getKey());
            }
            this.a.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                WZ wz = (WZ) arrayList.get(i);
                C7849n00 c7849n00 = wz.r;
                wz.D();
            }
        }
    }
}
