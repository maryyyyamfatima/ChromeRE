package defpackage;

import android.os.Bundle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QX3 implements TX3 {
    public final /* synthetic */ UX3 a;

    public QX3(C11027wG1 c11027wG1) {
        this.a = c11027wG1;
    }

    @Override // defpackage.TX3
    public final void b(C1193Je2 c1193Je2, ZX3 zx3) {
        Bundle b = zx3.b("checkAndroidLocationPermission", Bundle.EMPTY, new PX3(this, zx3));
        if (b == null || !b.getBoolean("success")) {
            this.a.b(zx3.a.b, 2);
        }
    }

    @Override // defpackage.TX3
    public final void a() {
        this.a.a();
    }
}
