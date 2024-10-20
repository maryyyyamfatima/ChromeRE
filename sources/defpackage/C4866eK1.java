package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4866eK1 {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public C4866eK1(long j) {
        this.b = j;
    }

    public final synchronized Object a(Object obj) {
        C4523dK1 c4523dK1;
        c4523dK1 = (C4523dK1) this.a.get(obj);
        return c4523dK1 != null ? c4523dK1.a : null;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int b = b(obj2);
        long j = b;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        C4523dK1 c4523dK1 = (C4523dK1) this.a.put(obj, obj2 == null ? null : new C4523dK1(b, obj2));
        if (c4523dK1 != null) {
            this.c -= c4523dK1.b;
            if (!c4523dK1.a.equals(obj2)) {
                c(obj, c4523dK1.a);
            }
        }
        e(this.b);
        return c4523dK1 != null ? c4523dK1.a : null;
    }

    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C4523dK1 c4523dK1 = (C4523dK1) entry.getValue();
            this.c -= c4523dK1.b;
            Object key = entry.getKey();
            it.remove();
            c(key, c4523dK1.a);
        }
    }
}
