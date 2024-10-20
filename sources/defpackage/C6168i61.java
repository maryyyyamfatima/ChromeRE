package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6168i61 extends A0 implements Serializable {
    public final Map g;
    public final InterfaceC0209Bp3 h;
    public transient C3972bj3 i;

    public static C6168i61 f() {
        return new C6168i61(new LinkedHashMap(), new C5824h61());
    }

    public C6168i61(LinkedHashMap linkedHashMap, C5824h61 c5824h61) {
        this.g = linkedHashMap;
        this.h = c5824h61;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L20
            if (r4 == 0) goto L20
            bj3 r1 = r2.d()
            java.lang.Object r3 = defpackage.AbstractC3502aM1.b(r1, r3)
            java.util.Map r3 = (java.util.Map) r3
            r1 = 1
            if (r3 == 0) goto L1c
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r3 = r0
        L18:
            if (r3 == 0) goto L1c
            r3 = r1
            goto L1d
        L1c:
            r3 = r0
        L1d:
            if (r3 == 0) goto L20
            r0 = r1
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6168i61.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final Object g(Integer num, Object obj) {
        Map map;
        if (num == null || obj == null || (map = (Map) AbstractC3502aM1.b(d(), num)) == null) {
            return null;
        }
        return AbstractC3502aM1.b(map, obj);
    }

    @Override // defpackage.A0
    public final C11964z0 a() {
        C11964z0 c11964z0 = this.a;
        if (c11964z0 != null) {
            return c11964z0;
        }
        C11964z0 c11964z02 = new C11964z0(this);
        this.a = c11964z02;
        return c11964z02;
    }

    @Override // defpackage.A0
    public final Object b(Object obj, Object obj2, Object obj3) {
        Map map = this.g;
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            map2 = (Map) this.h.get();
            map.put(obj, map2);
        }
        return map2.put(obj2, obj3);
    }

    @Override // defpackage.A0
    public final C3972bj3 d() {
        C3972bj3 c3972bj3 = this.i;
        if (c3972bj3 != null) {
            return c3972bj3;
        }
        C3972bj3 c3972bj32 = new C3972bj3(this);
        this.i = c3972bj32;
        return c3972bj32;
    }
}
