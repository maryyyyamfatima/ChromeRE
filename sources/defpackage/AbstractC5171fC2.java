package defpackage;

import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fC2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5171fC2 {
    public static String a;
    public static int b;

    public static BufferedReader a(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
