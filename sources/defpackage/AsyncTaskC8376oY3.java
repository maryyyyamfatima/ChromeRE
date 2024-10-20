package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oY3 */
/* loaded from: classes.dex */
public final class AsyncTaskC8376oY3 extends AsyncTask {
    public final Context a;
    public final Intent b;
    public final H30 c;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        H30 h30 = this.c;
        Context context = this.a;
        try {
            if (context.bindService(this.b, h30, 4097)) {
                return null;
            }
            context.unbindService(h30);
            return new IllegalStateException("Could not bind to the service");
        } catch (SecurityException e) {
            Log.w("TWAConnectionPool", "SecurityException while binding.", e);
            return e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:            if (r5 != false) goto L120;     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPostExecute(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Exception r11 = (java.lang.Exception) r11
            if (r11 == 0) goto L53
            H30 r0 = r10.c
            java.util.ArrayList r1 = r0.j
            java.util.Iterator r2 = r1.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r2.next()
            iF r3 = (defpackage.C6215iF) r3
            r4 = 1
            r3.d = r4
            mF r5 = r3.b
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L3c
            lF r5 = r5.g
            r5.getClass()
            s0 r8 = new s0
            r8.<init>(r11)
            p0 r9 = defpackage.AbstractC11278x0.j
            boolean r8 = r9.b(r5, r6, r8)
            if (r8 == 0) goto L38
            defpackage.AbstractC11278x0.b(r5)
            r5 = r4
            goto L39
        L38:
            r5 = r7
        L39:
            if (r5 == 0) goto L3c
            goto L3d
        L3c:
            r4 = r7
        L3d:
            if (r4 == 0) goto Lc
            r3.a = r6
            r3.b = r6
            r3.c = r6
            goto Lc
        L46:
            r1.clear()
            java.lang.Runnable r1 = r0.a
            r1.run()
            r1 = 3
            r0.h = r1
            r0.k = r11
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AsyncTaskC8376oY3.onPostExecute(java.lang.Object):void");
    }

    public AsyncTaskC8376oY3(Context context, Intent intent, H30 h30) {
        this.a = context.getApplicationContext();
        this.b = intent;
        this.c = h30;
    }
}
