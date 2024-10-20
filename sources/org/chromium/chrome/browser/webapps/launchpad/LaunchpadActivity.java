package org.chromium.chrome.browser.webapps.launchpad;

import android.os.Bundle;
import defpackage.AbstractActivityC0159Bf3;
import defpackage.AbstractC2196Qx1;
import defpackage.C1676Mx1;
import defpackage.C4998ej;
import defpackage.I53;
import defpackage.InterfaceC0079Ap3;
import defpackage.ZX1;
import org.chromium.chrome.browser.webapps.launchpad.LaunchpadActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LaunchpadActivity extends AbstractActivityC0159Bf3 {
    public C1676Mx1 C;
    public ZX1 D;

    @Override // defpackage.AbstractActivityC0159Bf3, defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = new ZX1(new C4998ej(this));
        C1676Mx1 c1676Mx1 = new C1676Mx1(this, new InterfaceC0079Ap3() { // from class: Jx1
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return LaunchpadActivity.this.D;
            }
        }, new I53(), AbstractC2196Qx1.a(this), true);
        this.C = c1676Mx1;
        setContentView(c1676Mx1.b);
    }

    @Override // defpackage.LM, defpackage.InterfaceC3562aY1
    public final ZX1 N() {
        return this.D;
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        this.C.a();
        this.C = null;
        super.onDestroy();
    }
}
