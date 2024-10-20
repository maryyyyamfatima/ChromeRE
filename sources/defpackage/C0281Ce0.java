package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ce0 */
/* loaded from: classes.dex */
public final class C0281Ce0 {
    public final PC a;
    public final Activity b;
    public final C2468Sz3 c;
    public final C4620dd0 d;
    public final QS3 e;
    public C9707sQ3 f;
    public boolean g;

    public C0281Ce0(PC pc, Activity activity, C4620dd0 c4620dd0, C2468Sz3 c2468Sz3, QS3 qs3) {
        this.a = pc;
        this.b = activity;
        this.d = c4620dd0;
        this.c = c2468Sz3;
        this.e = qs3;
    }

    public static int a(PC pc, boolean z, Tab tab) {
        if (pc.G()) {
            if (pc.j().f()) {
                return 2;
            }
            return tab == null ? 1 : 0;
        }
        In4 F = pc.F();
        if (F != null && F.g == 4) {
            return 1;
        }
        if (tab == null || !z) {
            return pc.j().f() ? 2 : 1;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        int d;
        char c;
        C9707sQ3 c9707sQ3 = this.f;
        if (c9707sQ3 == null) {
            return;
        }
        c9707sQ3.w0 = true;
        Tab tab = this.d.b;
        boolean z = this.g;
        PC pc = this.a;
        int a = a(pc, z, tab);
        Activity activity = this.b;
        if (a == 0) {
            d = this.e.d(tab.k(), tab);
        } else if (a == 1) {
            pc.getClass();
            d = AbstractC11746yN.a(activity, pc instanceof C7062kj1);
        } else if (a != 2) {
            pc.getClass();
            d = AbstractC11746yN.a(activity, pc instanceof C7062kj1);
        } else {
            d = pc.j().d();
        }
        if (a != 0) {
            c = 3;
            if (a == 1) {
                c = pc instanceof C7062kj1 ? (char) 2 : (char) 3;
            } else if (a == 2) {
                c = AbstractC3899bX.g(d);
            }
        } else {
            c = AbstractC5647gc2.a(d, activity, pc instanceof C7062kj1);
        }
        ColorStateList c2 = AbstractC3494aK3.c(activity, c);
        this.f.b(d, false);
        this.f.c(c, c2);
        this.f.w0 = false;
    }
}
