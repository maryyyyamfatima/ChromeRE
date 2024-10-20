package defpackage;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bg2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3953bg2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.UUID] */
    public static void a() {
        UUID uuid;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Context context = V60.a;
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
        C3609ag2 c3609ag2 = null;
        if (storageManager == null || storageStatsManager == null) {
            AbstractC4851eH1.a("PackageMetrics", "StorageManager or StorageStatsManager is not found", new Object[0]);
        } else {
            String packageName = context.getPackageName();
            C3609ag2 c3609ag22 = new C3609ag2();
            for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                if ("mounted".equals(storageVolume.getState())) {
                    String uuid2 = storageVolume.getUuid();
                    if (uuid2 == 0) {
                        try {
                            uuid2 = StorageManager.UUID_DEFAULT;
                            uuid = uuid2;
                        } catch (IllegalArgumentException e) {
                            AbstractC4851eH1.a("PackageMetrics", AbstractC4809e90.a("Could not parse UUID ", uuid2), e);
                            uuid = null;
                        }
                    } else {
                        uuid = UUID.fromString(uuid2);
                    }
                    if (uuid != null) {
                        try {
                            StorageStats queryStatsForPackage = storageStatsManager.queryStatsForPackage(uuid, packageName, Process.myUserHandle());
                            c3609ag22.a += queryStatsForPackage.getAppBytes();
                            c3609ag22.b = (queryStatsForPackage.getDataBytes() - queryStatsForPackage.getCacheBytes()) + c3609ag22.b;
                            c3609ag22.c += queryStatsForPackage.getCacheBytes();
                        } catch (PackageManager.NameNotFoundException | IOException | SecurityException e2) {
                            AbstractC4851eH1.a("PackageMetrics", "Error calling into queryStatsForPackage", e2);
                        }
                    }
                }
            }
            c3609ag2 = c3609ag22;
        }
        if (c3609ag2 != null) {
            EI2.f((int) (c3609ag2.b / 1048576), 1, 10000, 50, "Android.PackageStats.DataSize");
            EI2.f((int) (c3609ag2.c / 1048576), 1, 10000, 50, "Android.PackageStats.CacheSize");
            EI2.m((int) (c3609ag2.a / 1048576), "Android.PackageStats.CodeSize");
        }
    }
}
