package defpackage;

import J.N;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.installedapp.PackageHash;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.GURL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hn1 */
/* loaded from: classes2.dex */
public final class C6056hn1 implements InterfaceC2921Wm1 {
    public final BrowserContextHandle a;
    public final RenderFrameHost g;
    public final C2887Wf2 h = new C2887Wf2();
    public final C3051Xm1 i;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final int e(String str) {
        FileInputStream fileInputStream;
        if (PackageHash.a == null) {
            PackageHash.a = new SparseArray();
        }
        SparseArray sparseArray = PackageHash.a;
        BrowserContextHandle browserContextHandle = this.a;
        byte[] bArr = (byte[]) sparseArray.get(browserContextHandle.hashCode());
        try {
            if (bArr == null) {
                try {
                    fileInputStream = new FileInputStream("/dev/urandom");
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = null;
                }
                try {
                    byte[] bArr2 = new byte[20];
                    if (20 != fileInputStream.read(bArr2)) {
                        throw new GeneralSecurityException("Not enough random data available");
                    }
                    fileInputStream.close();
                    PackageHash.a.put(browserContextHandle.hashCode(), bArr2);
                    bArr = bArr2;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                byte[] b = AbstractC9771sd.b(str);
                try {
                    mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
                    byte[] doFinal = mac.doFinal(b);
                    return (((short) ((doFinal[1] & 255) | ((doFinal[0] & 255) << 8))) & 1023) / 100;
                } catch (InvalidKeyException e) {
                    throw new RuntimeException(e);
                }
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IOException | GeneralSecurityException e3) {
            throw new RuntimeException(e3);
        }
    }

    public C6056hn1(Profile profile, RenderFrameHost renderFrameHost, C3051Xm1 c3051Xm1) {
        this.a = profile;
        this.g = renderFrameHost;
        this.i = c3051Xm1;
    }

    @Override // defpackage.InterfaceC2921Wm1
    public final void m1(WL2[] wl2Arr, U24 u24, C7774mn1 c7774mn1) {
        GURL g = this.g.g();
        if (g == null) {
            g = GURL.emptyGURL();
        }
        final GURL gurl = g;
        int min = Math.min(wl2Arr.length, 3);
        final C5712gn1 c5712gn1 = new C5712gn1(this, min, c7774mn1);
        for (final int i = 0; i < min; i++) {
            final WL2 wl2 = wl2Arr[i];
            if (j(wl2)) {
                final int i2 = i;
                PostTask.c(QF3.h, new Runnable() { // from class: Zm1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6056hn1 c6056hn1 = C6056hn1.this;
                        c6056hn1.getClass();
                        WL2 wl22 = wl2;
                        int e = c6056hn1.e(wl22.d);
                        C5712gn1 c5712gn12 = c5712gn1;
                        int i3 = i2;
                        C3051Xm1 c3051Xm1 = c6056hn1.i;
                        if (c3051Xm1 != null) {
                            if (!c3051Xm1.a.c(gurl.i(), "instantapp:holdback".equals(wl22.d), true)) {
                                C6056hn1.k(c5712gn12, null, i3, e);
                                return;
                            }
                        }
                        try {
                            C2887Wf2 c2887Wf2 = c6056hn1.h;
                            String str = wl22.d;
                            c2887Wf2.getClass();
                            wl22.e = V60.a.getPackageManager().getPackageInfo(str, 0).versionName;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        C6056hn1.k(c5712gn12, wl22, i3, e);
                    }
                });
            } else if ((wl2.b.equals("play") && wl2.d != null) ? !j(wl2) : false) {
                final int i3 = i;
                PostTask.c(QF3.h, new Runnable() { // from class: an1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6056hn1 c6056hn1 = C6056hn1.this;
                        c6056hn1.getClass();
                        WL2 wl22 = wl2;
                        int e = c6056hn1.e(wl22.d);
                        String str = wl22.d;
                        GURL gurl2 = gurl;
                        C2887Wf2 c2887Wf2 = c6056hn1.h;
                        boolean i4 = C6056hn1.i(str, gurl2, c2887Wf2);
                        C5712gn1 c5712gn12 = c5712gn1;
                        int i5 = i3;
                        if (!i4) {
                            C6056hn1.k(c5712gn12, null, i5, e);
                            return;
                        }
                        try {
                            String str2 = wl22.d;
                            c2887Wf2.getClass();
                            wl22.e = V60.a.getPackageManager().getPackageInfo(str2, 0).versionName;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        C6056hn1.k(c5712gn12, wl22, i5, e);
                    }
                });
            } else if ((wl2.b.equals("webapp") && wl2.c != null) && wl2.c.equals(u24.b)) {
                PostTask.c(QF3.h, new Runnable() { // from class: bn1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6056hn1.this.f(c5712gn1, i, wl2);
                    }
                });
            } else if (!(wl2.b.equals("webapp") && wl2.c != null)) {
                c5712gn1.a(null, i, 0);
            } else {
                final int e = e(wl2.c);
                final int i4 = i;
                N.MoHbKNbT(this.a, wl2.c, u24.b, new Callback() { // from class: dn1
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        final C6056hn1 c6056hn1 = C6056hn1.this;
                        c6056hn1.getClass();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        final C5712gn1 c5712gn12 = c5712gn1;
                        final int i5 = i4;
                        if (booleanValue) {
                            QF3 qf3 = QF3.h;
                            final WL2 wl22 = wl2;
                            PostTask.c(qf3, new Runnable() { // from class: fn1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C6056hn1.this.f(c5712gn12, i5, wl22);
                                }
                            });
                            return;
                        }
                        c5712gn12.a(null, i5, e);
                    }
                });
            }
        }
    }

    public static void c(C6056hn1 c6056hn1, ArrayList arrayList, int i, final C7774mn1 c7774mn1) {
        final WL2[] wl2Arr;
        if (c6056hn1.g.isIncognito()) {
            wl2Arr = new WL2[0];
        } else {
            wl2Arr = new WL2[arrayList.size()];
            arrayList.toArray(wl2Arr);
        }
        PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: cn1
            @Override // java.lang.Runnable
            public final void run() {
                C7774mn1.this.a(wl2Arr);
            }
        }, i);
    }

    public final void f(C5712gn1 c5712gn1, int i, WL2 wl2) {
        String str;
        int e = e(wl2.c);
        String str2 = wl2.c;
        List<PackageInfo> installedPackages = V60.a.getPackageManager().getInstalledPackages(192);
        int i2 = 0;
        while (true) {
            if (i2 >= installedPackages.size()) {
                str = null;
                break;
            }
            PackageInfo packageInfo = installedPackages.get(i2);
            if (AbstractC3641al4.f(packageInfo, packageInfo.packageName) && TextUtils.equals(packageInfo.applicationInfo.metaData.getString("org.chromium.webapk.shell_apk.webManifestUrl"), str2)) {
                str = packageInfo.packageName;
                break;
            }
            i2++;
        }
        if (!(str != null)) {
            k(c5712gn1, null, i, e);
        } else {
            k(c5712gn1, wl2, i, e);
        }
    }

    public static boolean j(WL2 wl2) {
        String str;
        if (wl2.b.equals("play") && (str = wl2.d) != null) {
            return "instantapp".equals(str) || "instantapp:holdback".equals(wl2.d);
        }
        return false;
    }

    public static boolean i(String str, GURL gurl, C2887Wf2 c2887Wf2) {
        boolean z;
        if (gurl == null) {
            return false;
        }
        try {
            JSONArray h = h(str, c2887Wf2);
            for (int i = 0; i < h.length(); i++) {
                try {
                    GURL gurl2 = null;
                    try {
                        JSONObject jSONObject = h.getJSONObject(i).getJSONObject("target");
                        try {
                            z = jSONObject.getString("namespace").equals("web");
                        } catch (JSONException unused) {
                            z = false;
                        }
                        if (z) {
                            gurl2 = new GURL(jSONObject.getString("site"));
                        }
                    } catch (JSONException unused2) {
                    }
                    if (gurl2 == null) {
                        continue;
                    } else {
                        if (gurl2.h() != null && gurl2.d() != null && gurl2.h().equals(gurl.h()) && gurl2.d().equals(gurl.d()) && gurl2.g().equals(gurl.g())) {
                            return true;
                        }
                    }
                } catch (JSONException unused3) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused4) {
        }
        return false;
    }

    public static JSONArray h(String str, C2887Wf2 c2887Wf2) {
        Bundle bundle;
        c2887Wf2.getClass();
        ApplicationInfo applicationInfo = V60.a.getPackageManager().getApplicationInfo(str, 128);
        if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
            return new JSONArray();
        }
        int i = bundle.getInt("asset_statements");
        if (i == 0) {
            return new JSONArray();
        }
        try {
            try {
                return new JSONArray(V60.a.getPackageManager().getResourcesForApplication(applicationInfo).getString(i));
            } catch (JSONException unused) {
                AbstractC4851eH1.f("InstalledAppProvider", "Android package %s has JSON syntax error in asset statements resource (0x%s).", str, Integer.toHexString(i));
                return new JSONArray();
            }
        } catch (Resources.NotFoundException unused2) {
            AbstractC4851eH1.f("InstalledAppProvider", "Android package %s missing asset statements resource (0x%s).", str, Integer.toHexString(i));
            return new JSONArray();
        }
    }

    public static void k(final C5712gn1 c5712gn1, final WL2 wl2, final int i, final int i2) {
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: en1
            @Override // java.lang.Runnable
            public final void run() {
                C5712gn1.this.a(wl2, i, i2);
            }
        });
    }
}
