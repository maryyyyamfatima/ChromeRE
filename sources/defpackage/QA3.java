package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class QA3 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:            if (r5.g.intValue() >= 19) goto L47;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.IA3 c(java.io.FileInputStream r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QA3.c(java.io.FileInputStream, boolean):IA3");
    }

    public static void e(File file, IA3 ia3, boolean z) {
        FileOutputStream fileOutputStream;
        if (ia3.a == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer asReadOnlyBuffer = ia3.a.a.asReadOnlyBuffer();
        int limit = asReadOnlyBuffer.limit();
        byte[] bArr = new byte[limit];
        asReadOnlyBuffer.rewind();
        asReadOnlyBuffer.get(bArr);
        DataOutputStream dataOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                fileOutputStream = null;
            } catch (IOException unused2) {
                fileOutputStream = null;
            } catch (Throwable th) {
                th = th;
                AbstractC2663Um3.a(null);
                AbstractC2663Um3.a(null);
                throw th;
            }
            try {
                if (z) {
                    Cipher a = ZR.a.a(1);
                    if (a != null) {
                        dataOutputStream = new DataOutputStream(new BufferedOutputStream(new CipherOutputStream(fileOutputStream, a)));
                    } else {
                        AbstractC2663Um3.a(fileOutputStream);
                        return;
                    }
                } else {
                    dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                }
                if (z) {
                    dataOutputStream.writeLong(0L);
                }
                dataOutputStream.writeLong(ia3.d);
                dataOutputStream.writeInt(limit);
                dataOutputStream.write(bArr);
                dataOutputStream.writeInt(ia3.b);
                String str = ia3.e;
                if (str == null) {
                    str = "";
                }
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeInt(ia3.a.b);
                dataOutputStream.writeLong(-1L);
                dataOutputStream.writeBoolean(false);
                dataOutputStream.writeInt(ia3.f);
                Integer num = ia3.g;
                dataOutputStream.writeInt(num != null ? num.intValue() : -1);
                dataOutputStream.writeInt(ia3.c);
                dataOutputStream.writeInt(ia3.i);
                EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Tabs.TabState.SaveTime");
            } catch (FileNotFoundException unused3) {
                AbstractC4851eH1.f("TabState", "FileNotFoundException while attempting to save TabState.", new Object[0]);
                AbstractC2663Um3.a(dataOutputStream);
                AbstractC2663Um3.a(fileOutputStream);
            } catch (IOException unused4) {
                AbstractC4851eH1.f("TabState", "IOException while attempting to save TabState.", new Object[0]);
                AbstractC2663Um3.a(dataOutputStream);
                AbstractC2663Um3.a(fileOutputStream);
            }
            AbstractC2663Um3.a(dataOutputStream);
            AbstractC2663Um3.a(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            AbstractC2663Um3.a(null);
            AbstractC2663Um3.a(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.IA3 d(java.io.File r8, int r9) {
        /*
            java.io.File r0 = new java.io.File
            r1 = 0
            java.lang.String r2 = a(r9, r1)
            r0.<init>(r8, r2)
            boolean r2 = r0.exists()
            r3 = 1
            if (r2 != 0) goto L1c
            java.io.File r0 = new java.io.File
            java.lang.String r9 = a(r9, r3)
            r0.<init>(r8, r9)
            r8 = r3
            goto L1d
        L1c:
            r8 = r1
        L1d:
            boolean r9 = r0.exists()
            r2 = 0
            if (r9 != 0) goto L25
            return r2
        L25:
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r9 = "TabState"
            java.lang.String r6 = "Failed to restore tab state for tab: "
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L4a
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e java.io.FileNotFoundException -> L4a
            IA3 r2 = c(r7, r8)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a java.io.FileNotFoundException -> L4b
            goto L5c
        L37:
            r8 = move-exception
            r2 = r7
            goto L6c
        L3a:
            r8 = move-exception
            goto L40
        L3c:
            r8 = move-exception
            goto L6c
        L3e:
            r8 = move-exception
            r7 = r2
        L40:
            java.lang.String r0 = "Failed to restore tab state."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
            r3[r1] = r8     // Catch: java.lang.Throwable -> L37
            defpackage.AbstractC4851eH1.a(r9, r0, r3)     // Catch: java.lang.Throwable -> L37
            goto L5c
        L4a:
            r7 = r2
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r8.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L37
            defpackage.AbstractC4851eH1.a(r9, r8, r0)     // Catch: java.lang.Throwable -> L37
        L5c:
            defpackage.AbstractC2663Um3.a(r7)
            if (r2 == 0) goto L6b
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r4
            java.lang.String r0 = "Tabs.TabState.LoadTime"
            defpackage.EI2.n(r8, r0)
        L6b:
            return r2
        L6c:
            defpackage.AbstractC2663Um3.a(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QA3.d(java.io.File, int):IA3");
    }

    public static String a(int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "cryptonito" : "tab");
        sb.append(i);
        return sb.toString();
    }

    public static Pair b(String str) {
        try {
            if (str.startsWith("cryptonito")) {
                return Pair.create(Integer.valueOf(Integer.parseInt(str.substring(10))), Boolean.TRUE);
            }
            if (str.startsWith("tab")) {
                return Pair.create(Integer.valueOf(Integer.parseInt(str.substring(3))), Boolean.FALSE);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
