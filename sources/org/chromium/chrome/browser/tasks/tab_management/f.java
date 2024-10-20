package org.chromium.chrome.browser.tasks.tab_management;

import J.N;
import android.os.SystemClock;
import android.view.View;
import defpackage.C7928nE;
import defpackage.UN;
import defpackage.ViewOnLayoutChangeListenerC10125te4;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class f extends ViewOnLayoutChangeListenerC10125te4 {
    public long m;
    public final /* synthetic */ TabListRecyclerView n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabListRecyclerView tabListRecyclerView, View view) {
        super(view, false);
        this.n = tabListRecyclerView;
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4
    public final boolean g() {
        boolean g = super.g();
        if (g) {
            this.n.W0 = SystemClock.elapsedRealtime();
        }
        if (SystemClock.elapsedRealtime() < this.m) {
            return false;
        }
        return g;
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4
    public final void h() {
        float f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.h();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 == 0) {
            elapsedRealtime2 = 1;
        }
        int i = TabListRecyclerView.b1;
        this.n.getClass();
        C7928nE c7928nE = UN.a;
        try {
            f = Float.valueOf(N.MMltG$kc("TabGridLayoutAndroid", "max-duty-cycle")).floatValue();
        } catch (NumberFormatException unused) {
            f = 0.2f;
        }
        C7928nE c7928nE2 = UN.a;
        try {
            Float.valueOf(N.MMltG$kc("TabGridLayoutAndroid", "max-duty-cycle")).floatValue();
        } catch (NumberFormatException unused2) {
        }
        this.m = SystemClock.elapsedRealtime() + Math.min(((1.0f - f) * ((float) elapsedRealtime2)) / f, 300L);
    }
}
