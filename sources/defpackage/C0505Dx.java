package defpackage;

import android.os.BatteryManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0505Dx extends AbstractC0185Bl {
    public final /* synthetic */ C0245Bx h;
    public final /* synthetic */ C0765Fx i;

    public C0505Dx(C0765Fx c0765Fx, C0245Bx c0245Bx) {
        this.i = c0765Fx;
        this.h = c0245Bx;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.i.a.a((C0245Bx) obj);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        double intProperty = r1.a.getIntProperty(4) / 100.0d;
        BatteryManager batteryManager = this.i.d.a;
        double intProperty2 = batteryManager.getIntProperty(1);
        double intProperty3 = batteryManager.getIntProperty(3);
        C0245Bx c0245Bx = this.h;
        if (c0245Bx.b) {
            if (c0245Bx.c == Double.POSITIVE_INFINITY && intProperty3 > 0.0d) {
                c0245Bx.c = Math.ceil((1.0d - intProperty) * (intProperty2 / intProperty3) * 3600.0d);
            }
        } else if (intProperty3 < 0.0d) {
            c0245Bx.d = Math.floor((intProperty2 / (-intProperty3)) * intProperty * 3600.0d);
        }
        return c0245Bx;
    }
}
