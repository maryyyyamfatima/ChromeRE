package org.chromium.chrome.browser.browserservices.permissiondelegation;

import android.net.Uri;
import defpackage.C10712vM;
import defpackage.C10862vn1;
import defpackage.C1193Je2;
import defpackage.RX3;
import defpackage.SX3;
import defpackage.VX3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstalledWebappGeolocationBridge {
    public long a;
    public final C1193Je2 b;
    public final VX3 c;
    public final C10862vn1 d = new C10862vn1(this);

    public InstalledWebappGeolocationBridge(long j, C1193Je2 c1193Je2, VX3 vx3) {
        this.a = j;
        this.b = c1193Je2;
        this.c = vx3;
    }

    public static InstalledWebappGeolocationBridge create(long j, String str) {
        C1193Je2 a = C1193Je2.a(Uri.parse(str));
        if (a == null) {
            return null;
        }
        return new InstalledWebappGeolocationBridge(j, a, (VX3) C10712vM.e().k.get());
    }

    public void start(boolean z) {
        VX3 vx3 = this.c;
        vx3.getClass();
        vx3.b(this.b.a, new RX3(vx3, z, this.d));
    }

    public void stopAndDestroy() {
        this.a = 0L;
        VX3 vx3 = this.c;
        vx3.getClass();
        vx3.b(this.b.a, new SX3());
    }
}
