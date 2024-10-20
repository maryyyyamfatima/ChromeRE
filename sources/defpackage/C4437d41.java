package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4437d41 {
    public static C4437d41 c;
    public final Context a;
    public volatile String b;

    public C4437d41(Context context) {
        this.a = context.getApplicationContext();
    }

    public static C4437d41 a(Context context) {
        synchronized (C4437d41.class) {
            if (c == null) {
                BinderC10949w21 binderC10949w21 = C21.a;
                synchronized (C21.class) {
                    if (C21.e != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        C21.e = context.getApplicationContext();
                    }
                }
                c = new C4437d41(context);
            }
        }
        return c;
    }

    public static boolean b(PackageInfo packageInfo, boolean z) {
        if (z) {
            if (packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, B21.a) : d(packageInfo, B21.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        boolean z;
        H21 b;
        H21 a;
        ApplicationInfo applicationInfo;
        if (str == null) {
            b = H21.a("null pkg");
        } else if (str.equals(this.b)) {
            b = H21.c;
        } else {
            BinderC10949w21 binderC10949w21 = C21.a;
            StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    C21.a();
                    z = ((C8739pc1) C21.c).f1();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } catch (C0626Ev0 | RemoteException e) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    z = false;
                }
                if (z) {
                    boolean c2 = X31.c(this.a);
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        a = C21.c(str, c2);
                    } finally {
                    }
                } else {
                    try {
                        PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                        boolean c3 = X31.c(this.a);
                        if (packageInfo == null) {
                            a = H21.a("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                a = H21.a("single cert required");
                            } else {
                                BinderC11978z21 binderC11978z21 = new BinderC11978z21(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    H21 b2 = C21.b(str2, binderC11978z21, c3, false);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    if (b2.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            H21 b3 = C21.b(str2, binderC11978z21, false, true);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (b3.a) {
                                                a = H21.a("debuggable release cert app rejected");
                                            }
                                        } finally {
                                        }
                                    }
                                    a = b2;
                                } finally {
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        b = H21.b("no pkg ".concat(str), e2);
                    }
                }
                if (a.a) {
                    this.b = str;
                }
                b = a;
            } finally {
            }
        }
        if (!b.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (b.b != null) {
                b.c();
            } else {
                b.c();
            }
        }
        return b.a;
    }

    public static AbstractBinderC11635y21 d(PackageInfo packageInfo, AbstractBinderC11635y21... abstractBinderC11635y21Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC11978z21 binderC11978z21 = new BinderC11978z21(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC11635y21Arr.length; i++) {
            if (abstractBinderC11635y21Arr[i].equals(binderC11978z21)) {
                return abstractBinderC11635y21Arr[i];
            }
        }
        return null;
    }
}
