package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S30 {
    public static final Object b = new Object();
    public static volatile S30 c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public static S30 c() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new S30();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r8, android.content.Context r9, android.content.Intent r10, android.content.ServiceConnection r11, java.lang.String r12, java.util.concurrent.Executor r13) {
        /*
            r7 = this;
            android.content.ComponentName r0 = r10.getComponent()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L9
            goto L23
        L9:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r3 = "com.google.android.gms"
            r3.equals(r0)
            Yf2 r3 = defpackage.C4021br4.a(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.pm.ApplicationInfo r0 = r3.a(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            int r0 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r3 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r1
        L24:
            java.lang.String r3 = "ConnectionTracker"
            if (r0 == 0) goto L2e
            java.lang.String r8 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r3, r8)
            goto L89
        L2e:
            boolean r0 = r11 instanceof defpackage.B01
            r0 = r0 ^ r2
            r4 = 29
            if (r0 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap r0 = r7.a
            java.lang.Object r5 = r0.putIfAbsent(r11, r11)
            android.content.ServiceConnection r5 = (android.content.ServiceConnection) r5
            if (r5 == 0) goto L58
            if (r11 == r5) goto L58
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r11
            r5[r2] = r12
            r12 = 2
            java.lang.String r6 = r10.getAction()
            r5[r12] = r6
            java.lang.String r12 = "Duplicate binding with the same ServiceConnection: %s, %s, %s."
            java.lang.String r12 = java.lang.String.format(r12, r5)
            android.util.Log.w(r3, r12)
        L58:
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L66
            if (r12 < r4) goto L5d
            r1 = r2
        L5d:
            if (r1 == 0) goto L68
            if (r13 == 0) goto L68
            boolean r8 = defpackage.R30.a(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L66
            goto L6c
        L66:
            r8 = move-exception
            goto L72
        L68:
            boolean r8 = r9.bindService(r10, r11, r8)     // Catch: java.lang.Throwable -> L66
        L6c:
            if (r8 != 0) goto L88
            r0.remove(r11, r11)
            goto L88
        L72:
            r0.remove(r11, r11)
            throw r8
        L76:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r4) goto L7b
            r1 = r2
        L7b:
            if (r1 == 0) goto L84
            if (r13 == 0) goto L84
            boolean r8 = defpackage.R30.a(r8, r9, r10, r11, r13)
            goto L88
        L84:
            boolean r8 = r9.bindService(r10, r11, r8)
        L88:
            r1 = r8
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S30.a(int, android.content.Context, android.content.Intent, android.content.ServiceConnection, java.lang.String, java.util.concurrent.Executor):boolean");
    }

    public final boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(i, context, intent, serviceConnection, context.getClass().getName(), null);
    }

    public final void d(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof B01)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }
}
