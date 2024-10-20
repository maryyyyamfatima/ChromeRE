package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10735vQ2 {
    public static C10735vQ2 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration a;

    public static synchronized C10735vQ2 a() {
        C10735vQ2 c10735vQ2;
        synchronized (C10735vQ2.class) {
            if (b == null) {
                b = new C10735vQ2();
            }
            c10735vQ2 = b;
        }
        return c10735vQ2;
    }
}
