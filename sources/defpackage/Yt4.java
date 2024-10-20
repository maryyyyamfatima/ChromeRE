package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Yt4 {
    public final C3701av4 a;
    public final Context b;
    public final Ut4 c;
    public PackageInfo d;

    public Yt4(Context context, C3701av4 c3701av4) {
        Ut4 ut4 = new Ut4();
        this.a = c3701av4;
        this.b = context;
        this.c = ut4;
    }

    public final boolean a(File[] fileArr) {
        PackageInfo packageInfo;
        String absolutePath;
        String sb;
        X509Certificate x509Certificate;
        Context context = this.b;
        ArrayList<X509Certificate> arrayList = null;
        if (this.d == null) {
            try {
                this.d = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = this.d;
        if (packageInfo != null && packageInfo.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] a = Xv4.a(absolutePath);
                    if (a == null || a.length == 0 || a[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        sb = "No certificates found for app.";
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        for (X509Certificate[] x509CertificateArr : a) {
                            int i = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i + 1;
                        }
                        Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                    }
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                    sb2.append("Downloaded split ");
                    sb2.append(absolutePath);
                    sb2.append(" is not signed.");
                    Log.e("SplitCompat", sb2.toString(), e2);
                }
            } catch (Exception e3) {
                Log.e("SplitCompat", "Split verification error.", e3);
                return false;
            }
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
        sb3.append("Downloaded split ");
        sb3.append(absolutePath);
        sb3.append(" is not signed.");
        sb = sb3.toString();
        Log.e("SplitCompat", sb);
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:            if (r7.a.getName().equals("manifest") == false) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:            r6 = r7.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");        r7 = r7.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:            if (r6 == null) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:            r6 = java.lang.Integer.parseInt(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:            if (r7 != null) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:            r6 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:            r6 = (java.lang.Integer.parseInt(r7) << 32) | (r6 & 4294967295L);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:            r14 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", r14.getMessage()));     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cf, code lost:            r14 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e3, code lost:            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", r14.getMessage()));     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:            throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.io.File[] r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Yt4.b(java.io.File[]):boolean");
    }
}
