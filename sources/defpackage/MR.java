package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MR extends ThreadPoolExecutor {
    public static final int a;
    public static final int g;
    public static final KR h;
    public static final ArrayBlockingQueue i;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = Math.max(2, Math.min(availableProcessors - 1, 4));
        g = (availableProcessors * 2) + 1;
        h = new KR();
        i = new ArrayBlockingQueue(128);
    }

    public MR() {
        super(a, g, 30L, TimeUnit.SECONDS, i, h);
        allowCoreThreadTimeOut(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r11) {
        /*
            r10 = this;
            super.execute(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L4
            return
        L4:
            r11 = move-exception
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.BlockingQueue r1 = r10.getQueue()
            r2 = 0
            java.lang.Runnable[] r3 = new java.lang.Runnable[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.Runnable[] r1 = (java.lang.Runnable[]) r1
            int r3 = r1.length
            r4 = r2
        L19:
            if (r4 >= r3) goto L6b
            r5 = r1[r4]
            java.lang.Class r6 = r5.getClass()
            r7 = 1
            java.lang.Class<zl> r8 = defpackage.C12220zl.class
            if (r6 != r8) goto L30
            zl r5 = (defpackage.C12220zl) r5     // Catch: java.lang.Throwable -> L4a
            Bl r5 = r5.a     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L4a
        L2e:
            r6 = r5
            goto L4a
        L30:
            java.lang.Class r8 = r6.getEnclosingClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<android.os.AsyncTask> r9 = android.os.AsyncTask.class
            if (r8 != r9) goto L4a
            java.lang.String r8 = "this$0"
            java.lang.reflect.Field r8 = r6.getDeclaredField(r8)     // Catch: java.lang.Throwable -> L4a
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r8.get(r5)     // Catch: java.lang.Throwable -> L4a
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L4a
            goto L2e
        L4a:
            java.lang.String r5 = r6.getName()
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r0.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L60
        L5f:
            r6 = r2
        L60:
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.put(r5, r6)
            int r4 = r4 + 1
            goto L19
        L6b:
            java.util.concurrent.RejectedExecutionException r1 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Prominent classes in AsyncTask: "
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L81:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 32
            if (r5 <= r6) goto L81
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            r3.append(r6)
            goto L81
        La8:
            int r0 = r3.length()
            if (r0 != 0) goto Lb1
            java.lang.String r0 = "NO CLASSES FOUND"
            goto Lb5
        Lb1:
            java.lang.String r0 = r3.toString()
        Lb5:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MR.execute(java.lang.Runnable):void");
    }
}
