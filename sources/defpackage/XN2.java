package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XN2 {
    public final Context a;
    public final C4502dG0 b;

    public XN2(Context context, C4502dG0 c4502dG0) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        J53 j53 = new J53(applicationContext);
        synchronized (AbstractC8203o14.a) {
            HashMap hashMap = AbstractC8203o14.b;
            if (!hashMap.containsKey("SETTINGS_SECURE_ANDROID_ID")) {
                hashMap.put("SETTINGS_SECURE_ANDROID_ID", j53);
            }
        }
        this.b = c4502dG0;
    }

    public static String b() {
        return AbstractC10864vn3.a(AbstractC6547jD.a.a) + ";" + AbstractC10864vn3.a(Build.BRAND) + ";" + AbstractC10864vn3.a(Build.MODEL);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0146 A[Catch: IOException -> 0x01cd, TryCatch #1 {IOException -> 0x01cd, blocks: (B:3:0x0023, B:6:0x009b, B:7:0x00d3, B:10:0x0102, B:12:0x0111, B:15:0x012a, B:17:0x0146, B:18:0x0167, B:20:0x0181, B:21:0x01bd, B:26:0x0195, B:27:0x014b, B:31:0x00a7, B:33:0x00b0, B:36:0x00b6, B:37:0x00c0), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181 A[Catch: IOException -> 0x01cd, TryCatch #1 {IOException -> 0x01cd, blocks: (B:3:0x0023, B:6:0x009b, B:7:0x00d3, B:10:0x0102, B:12:0x0111, B:15:0x012a, B:17:0x0146, B:18:0x0167, B:20:0x0181, B:21:0x01bd, B:26:0x0195, B:27:0x014b, B:31:0x00a7, B:33:0x00b0, B:36:0x00b6, B:37:0x00c0), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0195 A[Catch: IOException -> 0x01cd, TryCatch #1 {IOException -> 0x01cd, blocks: (B:3:0x0023, B:6:0x009b, B:7:0x00d3, B:10:0x0102, B:12:0x0111, B:15:0x012a, B:17:0x0146, B:18:0x0167, B:20:0x0181, B:21:0x01bd, B:26:0x0195, B:27:0x014b, B:31:0x00a7, B:33:0x00b0, B:36:0x00b6, B:37:0x00c0), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014b A[Catch: IOException -> 0x01cd, TryCatch #1 {IOException -> 0x01cd, blocks: (B:3:0x0023, B:6:0x009b, B:7:0x00d3, B:10:0x0102, B:12:0x0111, B:15:0x012a, B:17:0x0146, B:18:0x0167, B:20:0x0181, B:21:0x01bd, B:26:0x0195, B:27:0x014b, B:31:0x00a7, B:33:0x00b0, B:36:0x00b6, B:37:0x00c0), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r21, java.lang.String r22, long r23, int r25, defpackage.ON2 r26) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XN2.a(java.lang.String, java.lang.String, long, int, ON2):java.lang.String");
    }
}
