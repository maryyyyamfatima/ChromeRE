package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import org.chromium.chrome.browser.incognito.IncognitoTabLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Th */
/* loaded from: classes2.dex */
public final class C2504Th implements InterfaceC6044hl1 {
    public final /* synthetic */ C2764Vh a;

    @Override // defpackage.InterfaceC6044hl1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void i() {
    }

    public C2504Th(C2764Vh c2764Vh) {
        this.a = c2764Vh;
    }

    @Override // defpackage.InterfaceC6044hl1
    public final void W() {
        final C2764Vh c2764Vh = this.a;
        boolean booleanValue = ((Boolean) c2764Vh.h.get()).booleanValue();
        InterfaceC0079Ap3 interfaceC0079Ap3 = c2764Vh.d;
        if (booleanValue) {
            if (!((Boolean) c2764Vh.i.get()).booleanValue()) {
                c2764Vh.n = SystemClock.elapsedRealtime();
                c2764Vh.l = true;
                View view = (View) interfaceC0079Ap3.get();
                view.getViewTreeObserver().addOnPreDrawListener(new Oc4(view, new InterfaceC0079Ap3() { // from class: Qh
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return Boolean.valueOf(!C2764Vh.this.l);
                    }
                }));
            }
        } else {
            Object obj = C9284rA3.z;
            Q83 q83 = O83.a;
            boolean z = false;
            int f = q83.f(0, "Chrome.AppLaunch.LastKnownActiveTabState");
            boolean z2 = !((Boolean) c2764Vh.g.get()).booleanValue() && q83.e("Chrome.AppLaunch.SearchEngineHadLogo", true);
            InterfaceC0079Ap3 interfaceC0079Ap32 = c2764Vh.e;
            String n = C1761No1.n((Intent) interfaceC0079Ap32.get());
            boolean z3 = (((Boolean) c2764Vh.f.get()).booleanValue() || TextUtils.isEmpty(n)) ? false : true;
            boolean f2 = T34.f(n);
            String b = C10648v91.b();
            boolean z4 = (f == 1 || (f == 0 && !(!TextUtils.isEmpty(b) && !T34.f(b)))) && z2;
            boolean a = IncognitoTabLauncher.a((Intent) interfaceC0079Ap32.get());
            if (z3 && f2) {
                z = !a;
            } else if (!z3 || f2) {
                z = z4;
            }
            if (z) {
                c2764Vh.n = SystemClock.elapsedRealtime();
                c2764Vh.k = true;
                View view2 = (View) interfaceC0079Ap3.get();
                view2.getViewTreeObserver().addOnPreDrawListener(new Oc4(view2, new InterfaceC0079Ap3() { // from class: Rh
                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        return Boolean.valueOf(!C2764Vh.this.k);
                    }
                }));
            }
        }
        if (c2764Vh.j.b()) {
            c2764Vh.m = true;
            View view3 = (View) interfaceC0079Ap3.get();
            view3.getViewTreeObserver().addOnPreDrawListener(new Oc4(view3, new InterfaceC0079Ap3() { // from class: Sh
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Boolean.valueOf(!C2764Vh.this.m);
                }
            }));
        }
    }
}
