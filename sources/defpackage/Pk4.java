package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Pk4 {
    public static long b(File file) {
        if (file == null) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            long j = 0;
            for (File file2 : listFiles) {
                j += b(file2);
            }
            return j;
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    public static long a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long availableBytes = statFs.getAvailableBytes();
        long totalBytes = statFs.getTotalBytes();
        return (availableBytes - Math.min(Settings.Global.getLong(V60.a.getContentResolver(), "sys_storage_threshold_max_bytes", 524288000L), (totalBytes * Settings.Global.getInt(r0, "sys_storage_threshold_percentage", 10)) / 100)) + 104857600;
    }
}
