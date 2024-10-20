package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.HashMap;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifier;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EU {
    public final C1582Me2 a;
    public final CU b;
    public final HashMap c;
    public final SparseBooleanArray d;
    public boolean e;

    public EU() {
        C1582Me2 c1582Me2 = new C1582Me2();
        CU cu = new CU();
        this.c = new HashMap();
        this.d = new SparseBooleanArray();
        this.a = c1582Me2;
        this.b = cu;
        C8668pO2.b();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [yU] */
    public final synchronized boolean h(final CustomTabsSessionToken customTabsSessionToken, final int i, final C1193Je2 c1193Je2, final boolean z) {
        final DU du = (DU) this.c.get(customTabsSessionToken);
        if (du != null && !TextUtils.isEmpty(du.k)) {
            final ?? r8 = new InterfaceC1323Ke2() { // from class: yU
                @Override // defpackage.InterfaceC1323Ke2
                public final void a(String str, C1193Je2 c1193Je22, boolean z2, Boolean bool) {
                    Bundle bundle;
                    C4632df0 a = EU.this.a(customTabsSessionToken);
                    if (a != null) {
                        if (!z2 || bool == null) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putBoolean("online", bool.booleanValue());
                        }
                        Uri uri = c1193Je2.a;
                        try {
                            ((C7702mb1) a.a.a).M0(i, uri, z2, bundle);
                        } catch (RemoteException unused) {
                            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                        }
                    }
                    if (z) {
                        du.d.a(str, c1193Je22, z2, bool);
                    }
                }
            };
            C1582Me2 c1582Me2 = this.a;
            String str = du.k;
            c1582Me2.getClass();
            A84 a84 = A84.a;
            du.g = new OriginVerifier(str, i, null, null);
            PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: zU
                @Override // java.lang.Runnable
                public final void run() {
                    DU.this.g.b(r8, c1193Je2);
                }
            });
            if (i == 2) {
                CU cu = this.b;
                String str2 = du.k;
                cu.getClass();
                if (C6056hn1.i(str2, new GURL(c1193Je2.toString()), new C2887Wf2())) {
                    du.f.add(c1193Je2);
                }
            }
            return true;
        }
        return false;
    }

    public final synchronized C3498aL2 c(CustomTabsSessionToken customTabsSessionToken) {
        String b;
        b = b(customTabsSessionToken);
        return TextUtils.isEmpty(b) ? null : new C3498aL2(new Uri.Builder().scheme("android-app").authority(b).build().toString(), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:            if (defpackage.A84.a().contains(r6 + "," + r7 + ",1," + r0) != false) goto L87;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d(androidx.browser.customtabs.CustomTabsSessionToken r6, defpackage.C1193Je2 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L50
            android.content.Context r0 = defpackage.V60.a     // Catch: java.lang.Throwable -> L50
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r0 = defpackage.AbstractC4983eg2.b(r0, r6)     // Catch: java.lang.Throwable -> L50
            r1 = 0
            if (r0 != 0) goto L14
            r0 = 0
            goto L1a
        L14:
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L50
        L1a:
            java.util.Set r2 = defpackage.A84.b     // Catch: java.lang.Throwable -> L50
            r3 = 1
            java.lang.String r4 = defpackage.A84.b(r6, r7, r3)     // Catch: java.lang.Throwable -> L50
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L50
            if (r2 != 0) goto L4d
            java.util.HashSet r2 = defpackage.A84.a()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = ","
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            r4.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = ",1,"
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            r4.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L50
            boolean r6 = r2.contains(r6)     // Catch: java.lang.Throwable -> L50
            if (r6 == 0) goto L4e
        L4d:
            r1 = r3
        L4e:
            monitor-exit(r5)
            return r1
        L50:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EU.d(androidx.browser.customtabs.CustomTabsSessionToken, Je2):boolean");
    }

    public final C4632df0 a(CustomTabsSessionToken customTabsSessionToken) {
        synchronized (this) {
            DU du = (DU) this.c.get(customTabsSessionToken);
            if (du == null) {
                return null;
            }
            return du.b;
        }
    }

    public final String b(CustomTabsSessionToken customTabsSessionToken) {
        synchronized (this) {
            DU du = (DU) this.c.get(customTabsSessionToken);
            if (du == null) {
                return null;
            }
            return du.k;
        }
    }

    public final void e(CustomTabsSessionToken customTabsSessionToken, WebContents webContents) {
        synchronized (this) {
            DU du = (DU) this.c.get(customTabsSessionToken);
            if (du == null) {
                return;
            }
            C0118Ax2 c0118Ax2 = du.d;
            if (webContents != null) {
                c0118Ax2.getClass();
                if (!webContents.isDestroyed()) {
                    if (!webContents.equals(c0118Ax2.c)) {
                        c0118Ax2.c = webContents;
                        if (c0118Ax2.e != null) {
                            new C11951yx2(c0118Ax2, webContents, webContents);
                        }
                    }
                }
            }
            c0118Ax2.b();
        }
    }

    public final void f(CustomTabsSessionToken customTabsSessionToken) {
        synchronized (this) {
            DU du = (DU) this.c.get(customTabsSessionToken);
            if (du == null) {
                return;
            }
            du.s = true;
        }
    }

    public final void g(CustomTabsSessionToken customTabsSessionToken) {
        synchronized (this) {
            DU du = (DU) this.c.get(customTabsSessionToken);
            if (du == null) {
                return;
            }
            du.t = true;
        }
    }
}
