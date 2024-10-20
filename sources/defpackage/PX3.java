package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PX3 extends IX3 {
    public final /* synthetic */ ZX3 a;
    public final /* synthetic */ QX3 b;

    public PX3(QX3 qx3, ZX3 zx3) {
        this.b = qx3;
        this.a = zx3;
    }

    @Override // defpackage.IX3
    public final void a(final String str, final Bundle bundle) {
        QF3 qf3 = AbstractC5103f04.c;
        final UX3 ux3 = this.b.a;
        final ZX3 zx3 = this.a;
        PostTask.c(qf3, new Runnable() { // from class: OX3
            @Override // java.lang.Runnable
            public final void run() {
                Bundle bundle2;
                ux3.b(zx3.a.b, (!TextUtils.equals(str, "checkAndroidLocationPermission") || (bundle2 = bundle) == null) ? false : bundle2.getBoolean("locationPermissionResult") ? 1 : 2);
            }
        });
    }
}
