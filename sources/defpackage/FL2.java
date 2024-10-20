package defpackage;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FL2 extends U22 implements InterfaceC11522xj {
    public boolean g;

    @Override // defpackage.U22
    public final void a() {
        if (this.g) {
            return;
        }
        ApplicationStatus.i(this);
        this.g = true;
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        if (ApplicationStatus.hasVisibleActivities()) {
            c();
        } else {
            this.a.f();
        }
    }

    @Override // defpackage.U22
    public final void b(a aVar) {
        this.a = aVar;
        ApplicationStatus.d(this);
        n(0);
    }
}
