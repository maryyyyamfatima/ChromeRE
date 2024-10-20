package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class D71 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:17:0x0043, B:19:0x0046, B:20:0x0053, B:22:0x0059, B:23:0x0068, B:25:0x006e, B:32:0x0060), top: B:16:0x0043, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.AbstractC9095qe2 b(android.content.Context r5) {
        /*
            java.lang.String r0 = android.os.Build.TYPE
            java.lang.String r1 = android.os.Build.TAGS
            java.lang.String r2 = "eng"
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 != 0) goto L15
            java.lang.String r2 = "userdebug"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L26
        L15:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L28
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = r3
            goto L29
        L28:
            r0 = 1
        L29:
            h r1 = defpackage.C5785h.a
            if (r0 != 0) goto L2e
            return r1
        L2e:
            boolean r0 = defpackage.AbstractC6404io0.b()
            if (r0 == 0) goto L3f
            boolean r0 = defpackage.AbstractC5373fo0.a(r5)
            if (r0 == 0) goto L3b
            goto L3f
        L3b:
            android.content.Context r5 = defpackage.AbstractC5717go0.a(r5)
        L3f:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L81
            java.io.File r2 = new java.io.File     // Catch: java.lang.RuntimeException -> L5f java.lang.Throwable -> L81
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r5 = r5.getDir(r4, r3)     // Catch: java.lang.RuntimeException -> L5f java.lang.Throwable -> L81
            java.lang.String r3 = "overrides.txt"
            r2.<init>(r5, r3)     // Catch: java.lang.RuntimeException -> L5f java.lang.Throwable -> L81
            boolean r5 = r2.exists()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L67
            Yy2 r5 = new Yy2     // Catch: java.lang.Throwable -> L81
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L81
            goto L68
        L5f:
            r5 = move-exception
            java.lang.String r2 = "HermeticFileOverrides"
            java.lang.String r3 = "no data dir"
            android.util.Log.e(r2, r3, r5)     // Catch: java.lang.Throwable -> L81
        L67:
            r5 = r1
        L68:
            boolean r2 = r5.c()     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L7d
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L81
            java.io.File r5 = (java.io.File) r5     // Catch: java.lang.Throwable -> L81
            Ej0 r5 = a(r5)     // Catch: java.lang.Throwable -> L81
            Yy2 r1 = new Yy2     // Catch: java.lang.Throwable -> L81
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L81
        L7d:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L81:
            r5 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D71.b(android.content.Context):qe2");
    }

    public static C0566Ej0 a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C1439Lb3 c1439Lb3 = new C1439Lb3();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        String[] split = readLine.split(" ", 3);
                        if (split.length == 3) {
                            String str = new String(split[0]);
                            String decode = Uri.decode(new String(split[1]));
                            String str2 = (String) hashMap.get(split[2]);
                            if (str2 == null) {
                                String str3 = new String(split[2]);
                                str2 = Uri.decode(str3);
                                if (str2.length() < 1024 || str2 == str3) {
                                    hashMap.put(str3, str2);
                                }
                            }
                            if (!c1439Lb3.containsKey(str)) {
                                c1439Lb3.put(str, new C1439Lb3());
                            }
                            ((C1439Lb3) c1439Lb3.get(str)).put(decode, str2);
                        } else {
                            Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                        }
                    } else {
                        Log.i("HermeticFileOverrides", "Parsed " + String.valueOf(file));
                        C0566Ej0 c0566Ej0 = new C0566Ej0(c1439Lb3);
                        bufferedReader.close();
                        return c0566Ej0;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
