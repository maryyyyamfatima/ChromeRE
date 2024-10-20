package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dG0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4502dG0 {
    public static final C4502dG0 b = new C4502dG0();
    public final C3815bG0 a = new C3815bG0();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r11, android.content.Context r12, java.lang.String r13) {
        /*
            r10 = this;
            r0 = r11 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r11 = r11 & 2
            if (r11 == 0) goto Lf
            r11 = r2
            goto L10
        Lf:
            r11 = r1
        L10:
            int r3 = android.os.Binder.getCallingUid()
            android.content.Context r4 = r12.getApplicationContext()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String[] r3 = r4.getPackagesForUid(r3)
            android.content.Context r12 = r12.getApplicationContext()
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            int r4 = r3.length
            r5 = r1
            r6 = r5
        L2b:
            if (r5 >= r4) goto L7c
            r7 = r3[r5]
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 != 0) goto L3c
            boolean r8 = r7.equals(r13)
            if (r8 != 0) goto L3c
            goto L79
        L3c:
            if (r0 == 0) goto L44
            boolean r6 = r10.g(r7)
            if (r6 == 0) goto L77
        L44:
            if (r11 == 0) goto L78
            java.lang.String r6 = "ExternalAuthUtils"
            android.content.pm.ApplicationInfo r8 = r12.getApplicationInfo(r7, r2)     // Catch: java.lang.SecurityException -> L59 android.content.pm.PackageManager.NameNotFoundException -> L67
            int r8 = r8.flags     // Catch: java.lang.SecurityException -> L59 android.content.pm.PackageManager.NameNotFoundException -> L67
            r8 = r8 & r2
            if (r8 == 0) goto L53
            r6 = r2
            goto L75
        L53:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch: java.lang.SecurityException -> L59 android.content.pm.PackageManager.NameNotFoundException -> L67
            r8.<init>()     // Catch: java.lang.SecurityException -> L59 android.content.pm.PackageManager.NameNotFoundException -> L67
            throw r8     // Catch: java.lang.SecurityException -> L59 android.content.pm.PackageManager.NameNotFoundException -> L67
        L59:
            java.lang.String r8 = "Caller with package name "
            java.lang.String r9 = " is not in the system build"
            java.lang.String r7 = defpackage.AbstractC4199cO1.a(r8, r7, r9)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            defpackage.AbstractC4851eH1.a(r6, r7, r8)
            goto L74
        L67:
            java.lang.String r8 = "Package with name "
            java.lang.String r9 = " not found"
            java.lang.String r7 = defpackage.AbstractC4199cO1.a(r8, r7, r9)
            java.lang.Object[] r8 = new java.lang.Object[r1]
            defpackage.AbstractC4851eH1.a(r6, r7, r8)
        L74:
            r6 = r1
        L75:
            if (r6 != 0) goto L78
        L77:
            return r1
        L78:
            r6 = r2
        L79:
            int r5 = r5 + 1
            goto L2b
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4502dG0.e(int, android.content.Context, java.lang.String):boolean");
    }

    public static boolean c(V44 v44) {
        Context context = V60.a;
        int d = d(context);
        boolean z = true;
        if (d == 0) {
            return true;
        }
        Object obj = C8543p11.c;
        boolean z2 = X31.a;
        ConnectionResult.r1(d);
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            z = false;
        }
        if (z) {
            PostTask.d(AbstractC5103f04.a, new RunnableC4158cG0(v44, context, d));
        }
        return false;
    }

    public final boolean f() {
        return g(V60.a.getPackageName());
    }

    public final boolean g(String str) {
        boolean booleanValue;
        C3815bG0 c3815bG0 = this.a;
        c3815bG0.getClass();
        C4437d41 a = C4437d41.a(V60.a);
        synchronized (c3815bG0.a) {
            Boolean bool = (Boolean) c3815bG0.a.get(str);
            if (bool == null) {
                C7432ln3 b2 = C7432ln3.b();
                try {
                    Boolean valueOf = Boolean.valueOf(a.c(str));
                    b2.close();
                    if (valueOf.booleanValue()) {
                        c3815bG0.a.put(str, valueOf);
                    }
                    bool = valueOf;
                } catch (Throwable th) {
                    try {
                        b2.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b() {
        return c(new U44());
    }

    public final boolean a(U44 u44) {
        return c(u44) && f();
    }

    public static int d(Context context) {
        C7432ln3 e = C7432ln3.e();
        try {
            TraceEvent i = TraceEvent.i("checkGooglePlayServicesAvailable", null);
            try {
                int c = C8543p11.d.c(context, 20415000);
                if (i != null) {
                    i.close();
                }
                e.close();
                return c;
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                e.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }
}
