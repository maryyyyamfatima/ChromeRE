package defpackage;

import android.content.IntentFilter;
import android.os.BatteryManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0765Fx {
    public final C9205qx a;
    public final IntentFilter b;
    public final C0375Cx c;
    public final C0635Ex d;
    public boolean e;

    public C0765Fx(C9205qx c9205qx) {
        C0635Ex c0635Ex = new C0635Ex((BatteryManager) V60.a.getSystemService("batterymanager"));
        this.b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        this.c = new C0375Cx(this);
        this.a = c9205qx;
        this.d = c0635Ex;
    }
}
