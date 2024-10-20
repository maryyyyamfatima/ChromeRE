package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ru2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2312Ru2 {
    private static String a = "com.google.common.flogger.backend.android.c";
    private static String b = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String c = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] d = {"com.google.common.flogger.backend.android.c", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public abstract AbstractC6232iI1 c(String str);

    public abstract AbstractC2182Qu2 e();

    public abstract String g();

    public abstract Z50 i();

    public static int j() {
        return ((QI2) QI2.g.get()).a;
    }

    public static AbstractC6232iI1 b(String str) {
        return AbstractC2052Pu2.a.c(str);
    }

    public static AbstractC2182Qu2 d() {
        return AbstractC2052Pu2.a.e();
    }

    public static String f() {
        return AbstractC2052Pu2.a.g();
    }

    public static Z50 h() {
        return AbstractC2052Pu2.a.i();
    }

    public static long k() {
        return AbstractC2052Pu2.a.l();
    }

    public static boolean o(String str, Level level, boolean z) {
        return h().c(str, level, z);
    }

    public static ME3 n() {
        return h().b();
    }

    public static AbstractC10078tW1 m() {
        return h().a();
    }

    public long l() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
