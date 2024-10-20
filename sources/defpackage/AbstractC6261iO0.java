package defpackage;

import android.os.Process;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6261iO0 {
    public static final Object a = new Object();
    public static final C4317ck b = new C4317ck();

    public static void a() {
        String str;
        BufferedReader a2;
        synchronized (a) {
            X5.a(b.get("[DEFAULT]"));
            if (AbstractC5171fC2.a == null) {
                if (AbstractC5171fC2.b == 0) {
                    AbstractC5171fC2.b = Process.myPid();
                }
                int i = AbstractC5171fC2.b;
                String str2 = null;
                String str3 = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        a2 = AbstractC5171fC2.a("/proc/" + i + "/cmdline");
                    } catch (IOException unused) {
                        str = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        str3 = a2.readLine().trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = a2;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    String str4 = str3;
                    bufferedReader = a2;
                    str = str4;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    }
                    str2 = str;
                }
                AbstractC5171fC2.a = str2;
            }
            throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC5171fC2.a + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
        }
    }
}
