package org.chromium.chrome.browser.explore_sites;

import J.N;
import android.content.Context;
import defpackage.AbstractC7808mt;
import defpackage.BF3;
import defpackage.C1226Jl0;
import defpackage.EI2;
import defpackage.GF3;
import defpackage.HF3;
import defpackage.InterfaceC2559Ts;
import defpackage.KF3;
import defpackage.N02;
import defpackage.S02;
import defpackage.V60;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.explore_sites.ExploreSitesBackgroundTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.background_task_scheduler.TaskInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ExploreSitesBackgroundTask extends S02 {
    public InterfaceC2559Ts f;
    public Profile g;

    @Override // defpackage.S02
    public final boolean f() {
        return false;
    }

    @Override // defpackage.S02
    public final boolean g(KF3 kf3) {
        return false;
    }

    public static void j(boolean z) {
        AbstractC7808mt.b().a(V60.a, 100);
        GF3 gf3 = new GF3();
        gf3.a = 90000000L;
        gf3.b = 7200000L;
        gf3.c = true;
        HF3 hf3 = new HF3(gf3);
        BF3 bf3 = new BF3(101);
        bf3.g = hf3;
        bf3.c = 1;
        bf3.e = true;
        bf3.f = z;
        AbstractC7808mt.b().b(V60.a, new TaskInfo(bf3));
    }

    @Override // defpackage.S02
    public final int d(Context context, KF3 kf3, N02 n02) {
        return C1226Jl0.b(context) == 6 ? 1 : 0;
    }

    @Override // defpackage.InterfaceC2689Us
    public final void a() {
        j(true);
    }

    @Override // defpackage.S02
    public final void e(Context context, KF3 kf3, InterfaceC2559Ts interfaceC2559Ts) {
        if (N.MwBQ$0Eq() == 0) {
            this.f = interfaceC2559Ts;
            if (this.g == null) {
                this.g = Profile.d();
            }
            N.MYfYpI3c(this.g, false, new Callback() { // from class: nF0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    ExploreSitesBackgroundTask.this.f.a(false);
                }
            });
            EI2.h(2, 3, "ExploreSites.CatalogUpdateRequestSource");
            return;
        }
        AbstractC7808mt.b().a(V60.a, 101);
    }
}
