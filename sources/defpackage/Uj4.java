package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.library_loader.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Uj4 implements InterfaceC11179wj, InterfaceC6044hl1, InterfaceC3657ao2 {
    public final Activity a;
    public final PC g;
    public final C5334fh3 h;
    public final InterfaceC3241Yy1 i;
    public final InterfaceC0079Ap3 j;
    public long k;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
    }

    public Uj4(Activity activity, PC pc, C5334fh3 c5334fh3, final I5 i5, Dn4 dn4, InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC0079Ap3 interfaceC0079Ap3) {
        this.a = activity;
        this.g = pc;
        this.h = c5334fh3;
        this.i = interfaceC3241Yy1;
        this.j = interfaceC0079Ap3;
        i5.b(this);
        ApplicationStatus.e(this, activity);
        dn4.d.add(0, new Cn4() { // from class: Tj4
            @Override // defpackage.Cn4
            public final void a(C12237zn4 c12237zn4, boolean z) {
                Uj4 uj4 = Uj4.this;
                uj4.getClass();
                if (i5.a()) {
                    return;
                }
                Xj4 E = uj4.g.E();
                int i = E.d;
                int i2 = E.i;
                EI2.m(i, "WebApk.ShellApkVersion2.".concat(i2 != 0 ? i2 != 1 ? "Other" : "DevicePolicy" : "Browser"));
            }
        });
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 3) {
            this.k = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        Xj4 E = this.g.E();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        int i = E.i;
        EI2.j(elapsedRealtime, "WebApk.Session.TotalDuration2.".concat(i != 0 ? i != 1 ? "Other" : "DevicePolicy" : "Browser"));
        N.ME5y4AG$(E.e, E.i, E.n, elapsedRealtime);
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void i() {
        if (b.n.f()) {
            return;
        }
        C8571p6 c8571p6 = (C8571p6) this.i.get();
        c8571p6.c = ".WebApk";
        c8571p6.g = true;
        if (this.j.get() == null) {
            Intent intent = this.a.getIntent();
            this.h.v.a(new Nk4(intent.getLongExtra("org.chromium.chrome.browser.webapk_launch_time", -1L), intent.getLongExtra("org.chromium.webapk.new_style_splash_shown_time", -1L)));
        }
    }
}
