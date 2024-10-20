package defpackage;

import android.os.Build;
import android.os.UserManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: io0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6404io0 {
    public static UserManager a;
    public static volatile boolean b = !b();

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:            if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = defpackage.AbstractC6404io0.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<io0> r0 = defpackage.AbstractC6404io0.class
            monitor-enter(r0)
            boolean r2 = defpackage.AbstractC6404io0.b     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r1
        Lf:
            r2 = r1
        L10:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L46
            android.os.UserManager r3 = defpackage.AbstractC6404io0.a     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L23
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L51
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L51
            defpackage.AbstractC6404io0.a = r3     // Catch: java.lang.Throwable -> L51
        L23:
            android.os.UserManager r3 = defpackage.AbstractC6404io0.a     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L28
            goto L4b
        L28:
            boolean r6 = defpackage.AbstractC6061ho0.a(r3)     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L51
            if (r6 != 0) goto L47
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L51
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L39 java.lang.Throwable -> L51
            if (r7 != 0) goto L46
            goto L47
        L39:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L51
            defpackage.AbstractC6404io0.a = r4     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + 1
            goto L10
        L46:
            r1 = r5
        L47:
            if (r1 == 0) goto L4b
            defpackage.AbstractC6404io0.a = r4     // Catch: java.lang.Throwable -> L51
        L4b:
            if (r1 == 0) goto L4f
            defpackage.AbstractC6404io0.b = r1     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            return r1
        L51:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6404io0.a(android.content.Context):boolean");
    }
}
