package org.chromium.device.vibration;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import defpackage.AbstractC4851eH1;
import defpackage.C3439a94;
import defpackage.C4126c94;
import defpackage.C4813e94;
import defpackage.C5953hV1;
import defpackage.HY1;
import defpackage.S84;
import defpackage.V60;
import defpackage.Y84;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class VibrationManagerImpl implements S84 {
    public static long i = -1;
    public static boolean j;
    public final AudioManager a;
    public final Vibrator g;
    public final boolean h;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public VibrationManagerImpl() {
        Context context = V60.a;
        this.a = (AudioManager) context.getSystemService("audio");
        this.g = (Vibrator) context.getSystemService("vibrator");
        boolean z = context.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        this.h = z;
        if (z) {
            return;
        }
        AbstractC4851eH1.f("VibrationManagerImpl", "Failed to use vibrate API, requires VIBRATE permission.", new Object[0]);
    }

    @Override // defpackage.S84
    public final void f1(long j2, C4813e94 c4813e94) {
        long max = Math.max(1L, Math.min(j2, 10000L));
        if (this.a.getRingerMode() != 0 && this.h) {
            this.g.vibrate(max);
        }
        i = max;
        c4813e94.b.A(new C4126c94().c(c4813e94.a, new C5953hV1(0, 2, c4813e94.c)));
    }

    @Override // defpackage.S84
    public final void K0(C3439a94 c3439a94) {
        if (this.h) {
            this.g.cancel();
        }
        j = true;
        c3439a94.b.A(new Y84().c(c3439a94.a, new C5953hV1(1, 2, c3439a94.c)));
    }

    public static long getVibrateMilliSecondsForTesting() {
        return i;
    }

    public static boolean getVibrateCancelledForTesting() {
        return j;
    }
}
