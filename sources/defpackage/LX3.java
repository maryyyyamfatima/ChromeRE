package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LX3 implements TX3 {
    public final /* synthetic */ String a;
    public final /* synthetic */ UX3 b;
    public final /* synthetic */ VX3 c;

    public LX3(VX3 vx3, String str, UX3 ux3) {
        this.c = vx3;
        this.a = str;
        this.b = ux3;
    }

    @Override // defpackage.TX3
    public final void b(C1193Je2 c1193Je2, ZX3 zx3) {
        Bundle bundle = new Bundle();
        String str = this.a;
        bundle.putString("notificationChannelName", str);
        Bundle b = zx3.b("checkNotificationPermission", bundle, null);
        boolean z = b == null ? false : b.getBoolean("success");
        this.c.c.getClass();
        EI2.b("TrustedWebActivity.ExtraCommandSuccess.".concat("checkNotificationPermission"), z);
        UX3 ux3 = this.b;
        C7688mY3 c7688mY3 = zx3.a;
        if (!z) {
            ux3.b(c7688mY3.b, zx3.a(str) ? 1 : 2);
        } else {
            int i = b.getInt("permissionStatus", 1);
            ux3.b(c7688mY3.b, i != 0 ? i == 2 ? 3 : 2 : 1);
        }
    }

    @Override // defpackage.TX3
    public final void a() {
        this.b.a();
    }
}
