package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class UK2 {
    public final int a;
    public final boolean b;
    public boolean c = true;
    public boolean d;
    public boolean e;
    public final long f;
    public boolean g;
    public final SK2 h;

    public UK2(VK2 vk2, int i, boolean z) {
        vk2.getClass();
        this.f = SystemClock.elapsedRealtime();
        this.a = i;
        this.b = z;
        this.h = null;
    }

    public UK2(VK2 vk2, boolean z, SK2 sk2) {
        vk2.getClass();
        this.f = SystemClock.elapsedRealtime();
        this.b = z;
        this.h = sk2;
        this.a = 0;
    }
}
