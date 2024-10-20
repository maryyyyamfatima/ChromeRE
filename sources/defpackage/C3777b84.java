package defpackage;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b84, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3777b84 {
    public static final Object b;
    public static C3777b84 c;
    public final KH a = new KH();

    public static void f(boolean z, boolean z2) {
        if (z && z2) {
            EI2.h(0, 4, "Variations.FirstRun.DeltaCompression");
            return;
        }
        if (z && !z2) {
            EI2.h(1, 4, "Variations.FirstRun.DeltaCompression");
        } else if (z || !z2) {
            EI2.h(3, 4, "Variations.FirstRun.DeltaCompression");
        } else {
            EI2.h(2, 4, "Variations.FirstRun.DeltaCompression");
        }
    }

    static {
        new C5463g32("chrome_variations_android");
        b = new Object();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (AX.e().g("enable-finch-seed-delta-compression")) {
            arrayList.add("x-bm");
        }
        arrayList.add("gzip");
        return arrayList;
    }

    public static HttpURLConnection d(String str, String str2, String str3) {
        String f = AX.e().f("variations-server-url");
        if (TextUtils.isEmpty(f)) {
            f = "https://clientservices.googleapis.com/chrome-variations/seed";
        }
        String a = AbstractC7848n0.a(AbstractC7848n0.a(f, "?osname="), "android");
        if (str != null && !str.isEmpty()) {
            a = AbstractC8192o0.a(a, "&restrict=", str);
        }
        if (str2 != null && !str2.isEmpty()) {
            a = AbstractC8192o0.a(a, "&milestone=", str2);
        }
        String f2 = AX.e().f("fake-variations-channel");
        if (f2 != null) {
            str3 = f2;
        }
        if (str3 != null && !str3.isEmpty()) {
            a = AbstractC8192o0.a(a, "&channel=", str3);
        }
        return (HttpURLConnection) new URL(a).openConnection();
    }

    public static void e(int i) {
        EI2.m(i, "Variations.FirstRun.SeedFetchResult");
    }

    public static void g(long j) {
        AbstractC4851eH1.d("VariationsSeedFetch", "Fetched first run seed in " + j + " ms", new Object[0]);
        EI2.n(j, "Variations.FirstRun.SeedFetchTime");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013f, code lost:            if (r3 == null) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:            if (r3 == null) goto L70;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.Z74 a(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3777b84.a(java.lang.String, java.lang.String, java.lang.String):Z74");
    }

    public static byte[] c(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
