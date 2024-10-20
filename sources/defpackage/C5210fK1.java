package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5210fK1 {
    public final int a;
    public final C5554gK1 b;
    public final UG1 c;
    public int d;
    public int e;
    public int f;

    public Object a(Object obj) {
        AbstractC0087Ar1.e(obj, "key");
        return null;
    }

    public int e(Object obj, Object obj2) {
        AbstractC0087Ar1.e(obj, "key");
        AbstractC0087Ar1.e(obj2, "value");
        return 1;
    }

    public C5210fK1(int i) {
        this.a = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.b = new C5554gK1();
        this.c = new UG1();
    }

    public final Object b(Object obj) {
        Object a;
        AbstractC0087Ar1.e(obj, "key");
        synchronized (this.c) {
            C5554gK1 c5554gK1 = this.b;
            c5554gK1.getClass();
            Object obj2 = c5554gK1.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a2 = a(obj);
            if (a2 == null) {
                return null;
            }
            synchronized (this.c) {
                a = this.b.a(obj, a2);
                if (a != null) {
                    this.b.a(obj, a);
                } else {
                    this.d += d(obj, a2);
                }
            }
            if (a != null) {
                return a;
            }
            f(this.a);
            return a2;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object a;
        AbstractC0087Ar1.e(obj, "key");
        AbstractC0087Ar1.e(obj2, "value");
        synchronized (this.c) {
            this.d += d(obj, obj2);
            a = this.b.a(obj, obj2);
            if (a != null) {
                this.d -= d(obj, a);
            }
        }
        f(this.a);
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:            throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0012, B:12:0x001b, B:14:0x001f, B:16:0x002a, B:18:0x003b, B:22:0x0059, B:24:0x005f, B:31:0x0044, B:32:0x0049, B:34:0x0055, B:41:0x0089, B:42:0x0094), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r6) {
        /*
            r5 = this;
        L0:
            UG1 r0 = r5.c
            monitor-enter(r0)
            int r1 = r5.d     // Catch: java.lang.Throwable -> L95
            r2 = 0
            if (r1 < 0) goto L18
            gK1 r1 = r5.b     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L95
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L16
            int r1 = r5.d     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L18
        L16:
            r1 = 1
            goto L19
        L18:
            r1 = r2
        L19:
            if (r1 == 0) goto L89
            int r1 = r5.d     // Catch: java.lang.Throwable -> L95
            if (r1 <= r6) goto L87
            gK1 r1 = r5.b     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L95
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L2a
            goto L87
        L2a:
            gK1 r1 = r5.b     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L95
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "map.entries"
            defpackage.AbstractC0087Ar1.d(r1, r3)     // Catch: java.lang.Throwable -> L95
            boolean r3 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L49
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L95
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L44
            goto L53
        L44:
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L95
            goto L59
        L49:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r2 != 0) goto L55
        L53:
            r1 = 0
            goto L59
        L55:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L95
        L59:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L95
            if (r1 != 0) goto L5f
            monitor-exit(r0)
            return
        L5f:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L95
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L95
            gK1 r3 = r5.b     // Catch: java.lang.Throwable -> L95
            r3.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.String r4 = "key"
            defpackage.AbstractC0087Ar1.e(r2, r4)     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap r3 = r3.a     // Catch: java.lang.Throwable -> L95
            r3.remove(r2)     // Catch: java.lang.Throwable -> L95
            int r3 = r5.d     // Catch: java.lang.Throwable -> L95
            int r2 = r5.d(r2, r1)     // Catch: java.lang.Throwable -> L95
            int r3 = r3 - r2
            r5.d = r3     // Catch: java.lang.Throwable -> L95
            monitor-exit(r0)
            java.lang.String r0 = "oldValue"
            defpackage.AbstractC0087Ar1.e(r1, r0)
            goto L0
        L87:
            monitor-exit(r0)
            return
        L89:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L95
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L95
            throw r1     // Catch: java.lang.Throwable -> L95
        L95:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5210fK1.f(int):void");
    }

    public final int d(Object obj, Object obj2) {
        int e = e(obj, obj2);
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            int i = this.e;
            int i2 = this.f + i;
            str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
