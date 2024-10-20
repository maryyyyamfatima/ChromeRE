package defpackage;

import com.google.common.util.concurrent.s;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC8534p extends s implements Runnable {
    public static final /* synthetic */ int m = 0;
    public RD1 j;
    public Class k;
    public Object l;

    public abstract Object y(Object obj, Throwable th);

    public abstract void z(Object obj);

    public AbstractRunnableC8534p(RD1 rd1, Class cls, Object obj) {
        this.j = rd1;
        this.k = cls;
        this.l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            RD1 r0 = r8.j
            java.lang.Class r1 = r8.k
            java.lang.Object r2 = r8.l
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La4
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L22
            goto La4
        L22:
            r3 = 0
            r8.j = r3
            boolean r4 = r0 instanceof defpackage.AbstractC8823pq1     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            if (r4 == 0) goto L31
            r4 = r0
            pq1 r4 = (defpackage.AbstractC8823pq1) r4     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            java.lang.Throwable r4 = r4.a()     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L6d
            java.lang.Object r5 = defpackage.AbstractC5957hW0.b(r0)     // Catch: java.lang.Error -> L39 java.lang.RuntimeException -> L3b java.util.concurrent.ExecutionException -> L3d
            goto L6e
        L39:
            r4 = move-exception
            goto L6d
        L3b:
            r4 = move-exception
            goto L6d
        L3d:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6c
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6c:
            r4 = r5
        L6d:
            r5 = r3
        L6e:
            if (r4 != 0) goto L74
            r8.t(r5)
            return
        L74:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L7e
            r8.v(r0)
            return
        L7e:
            java.lang.Object r0 = r8.y(r2, r4)     // Catch: java.lang.Throwable -> L8a
            r8.k = r3
            r8.l = r3
            r8.z(r0)
            return
        L8a:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L96
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            r1.interrupt()     // Catch: java.lang.Throwable -> L9e
        L96:
            r8.u(r0)     // Catch: java.lang.Throwable -> L9e
            r8.k = r3
            r8.l = r3
            return
        L9e:
            r0 = move-exception
            r8.k = r3
            r8.l = r3
            throw r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractRunnableC8534p.run():void");
    }

    @Override // com.google.common.util.concurrent.n
    public final String r() {
        String str;
        RD1 rd1 = this.j;
        Class cls = this.k;
        Object obj = this.l;
        String r = super.r();
        if (rd1 != null) {
            str = "inputFuture=[" + rd1 + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (r != null) {
                return AbstractC7848n0.a(str, r);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // com.google.common.util.concurrent.n
    public final void k() {
        q(this.j);
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
