package org.chromium.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import defpackage.AX;
import defpackage.EI2;
import defpackage.V60;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SysUtils {
    public static Boolean a;
    public static Integer b;
    public static Boolean c;

    public static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) V60.a.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static int a() {
        FileReader fileReader;
        Pattern compile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                fileReader = new FileReader("/proc/meminfo");
            } catch (Exception e) {
                Log.w("SysUtils", "Cannot get total physical size from /proc/meminfo", e);
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            Log.w("SysUtils", "/proc/meminfo lacks a MemTotal entry?");
                            break;
                        }
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            int parseInt = Integer.parseInt(matcher.group(1));
                            if (parseInt > 1024) {
                                return parseInt;
                            }
                            Log.w("SysUtils", "Invalid /proc/meminfo total size in kB: " + matcher.group(1));
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return 0;
            } finally {
                fileReader.close();
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static boolean isLowEndDevice() {
        if (a == null) {
            if (!AX.e().g("enable-low-end-device-mode")) {
                if (AX.e().g("disable-low-end-device-mode")) {
                    r1 = false;
                } else {
                    Integer valueOf = Integer.valueOf(a());
                    b = valueOf;
                    boolean z = valueOf.intValue() > 0 && (Build.VERSION.SDK_INT < 26 ? b.intValue() / 1024 <= 512 : b.intValue() / 1024 <= 1024);
                    Context context = V60.a;
                    EI2.b("Android.SysUtilsLowEndMatches", z == (context != null ? ((ActivityManager) context.getSystemService("activity")).isLowRamDevice() : false));
                    r1 = z;
                }
            }
            a = Boolean.valueOf(r1);
        }
        return a.booleanValue();
    }

    public static int amountOfPhysicalMemoryKB() {
        if (b == null) {
            b = Integer.valueOf(a());
        }
        return b.intValue();
    }
}
