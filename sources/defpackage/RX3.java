package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RX3 implements TX3 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ IX3 b;
    public final /* synthetic */ VX3 c;

    public RX3(VX3 vx3, boolean z, C10862vn1 c10862vn1) {
        this.c = vx3;
        this.a = z;
        this.b = c10862vn1;
    }

    @Override // defpackage.TX3
    public final void b(C1193Je2 c1193Je2, ZX3 zx3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enableHighAccuracy", this.a);
        IX3 ix3 = this.b;
        Bundle b = zx3.b("startLocation", bundle, ix3);
        if (b == null || !b.getBoolean("success")) {
            VX3.a(this.c, ix3, "Failed to request location updates");
        }
    }

    @Override // defpackage.TX3
    public final void a() {
        VX3.a(this.c, this.b, "NoTwaFound");
    }
}
