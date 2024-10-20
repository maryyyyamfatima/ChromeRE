package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class EF0 extends BK0 {
    public EF0(Activity activity, C12075zK0 c12075zK0) {
        super(activity, c12075zK0);
        this.g = 0;
        f();
        ApplicationStatus.e(this, activity);
    }

    @Override // defpackage.BK0
    public final String d() {
        return AbstractC1868Oj3.a.h;
    }

    @Override // defpackage.BK0
    public final void e() {
        AbstractC1868Oj3.a.h = ((C12075zK0) this.a).c();
    }

    @Override // defpackage.BK0
    public final boolean a() {
        int c = ApplicationStatus.c(this.h);
        int i = this.g;
        return ((i == 0 || i == 4) && (c == 2 || c == 3)) && AbstractC8650pL.a("ntp_snippets.list_visible");
    }
}
