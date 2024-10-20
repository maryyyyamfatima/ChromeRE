package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0375Cx extends BroadcastReceiver {
    public final /* synthetic */ C0765Fx a;

    public C0375Cx(C0765Fx c0765Fx) {
        this.a = c0765Fx;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0765Fx c0765Fx = this.a;
        c0765Fx.getClass();
        if (!intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
            AbstractC4851eH1.a("BatteryStatusManager", "Unexpected intent.", new Object[0]);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("present", false);
        int intExtra = intent.getIntExtra("plugged", -1);
        C9205qx c9205qx = c0765Fx.a;
        if (!booleanExtra || intExtra == -1) {
            c9205qx.a(new C0245Bx(0));
            return;
        }
        double intExtra2 = intent.getIntExtra("level", -1) / intent.getIntExtra("scale", -1);
        if (intExtra2 < 0.0d || intExtra2 > 1.0d) {
            intExtra2 = 1.0d;
        }
        boolean z = intExtra != 0;
        double d = (z && (intent.getIntExtra("status", -1) == 5)) ? 0.0d : Double.POSITIVE_INFINITY;
        C0245Bx c0245Bx = new C0245Bx(0);
        c0245Bx.b = z;
        c0245Bx.c = d;
        c0245Bx.d = Double.POSITIVE_INFINITY;
        c0245Bx.e = intExtra2;
        if (c0765Fx.d != null) {
            new C0505Dx(c0765Fx, c0245Bx).c(AbstractC0185Bl.e);
        } else {
            c9205qx.a(c0245Bx);
        }
    }
}
