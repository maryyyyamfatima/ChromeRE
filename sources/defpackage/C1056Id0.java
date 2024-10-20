package defpackage;

import J.N;
import android.app.Activity;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Id0 */
/* loaded from: classes.dex */
public final class C1056Id0 implements V02, InterfaceC0186Bl0 {
    public final Activity a;
    public final C2090Qc0 g;
    public final PC h;
    public C0926Hd0 i;
    public final C11187wk1 j;
    public final C5688gj1 k;

    public C1056Id0(Activity activity, PC pc, C2090Qc0 c2090Qc0, I5 i5, C11187wk1 c11187wk1, C5688gj1 c5688gj1) {
        this.a = activity;
        this.h = pc;
        this.g = c2090Qc0;
        this.j = c11187wk1;
        this.k = c5688gj1;
        i5.b(this);
    }

    @Override // defpackage.V02
    public final void U() {
        PC pc = this.h;
        pc.getClass();
        if (pc instanceof C7062kj1) {
            if (pc.G()) {
                C0926Hd0 c0926Hd0 = new C0926Hd0(this);
                this.i = c0926Hd0;
                this.j.a.add(c0926Hd0);
            }
            if (AX.e().g("enable-incognito-snapshots-in-android-recents")) {
                return;
            }
            this.a.getWindow().addFlags(8192);
        }
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        C0926Hd0 c0926Hd0 = this.i;
        if (c0926Hd0 != null) {
            this.j.a.remove(c0926Hd0);
        }
        C5688gj1 c5688gj1 = this.k;
        if (c5688gj1.a != null) {
            Profile e = Profile.d().e(c5688gj1.a);
            N.MScIZBOB(e.b, e);
            c5688gj1.a = null;
        }
        C5688gj1.g.b(c5688gj1);
    }
}
