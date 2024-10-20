package defpackage;

import J.N;
import java.lang.ref.WeakReference;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.password_manager.PasswordStoreBridge;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VT2 implements InterfaceC3295Zj0 {
    public final /* synthetic */ WT2 a;

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void d(JA1 ja1) {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void onCreate() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final /* synthetic */ void onPause() {
    }

    @Override // defpackage.InterfaceC3295Zj0
    public final void onResume() {
        WT2 wt2 = this.a;
        if (wt2.a.l0) {
            wt2.c.i();
            return;
        }
        C10069tU2 c10069tU2 = wt2.c;
        c10069tU2.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c10069tU2.q.g(0L, "Chrome.SafetyCheck.LastRunTimestamp");
        ND2 nd2 = AbstractC10412uU2.a;
        ND2 nd22 = AbstractC10412uU2.d;
        ND2 nd23 = AbstractC10412uU2.c;
        if (currentTimeMillis < 600000) {
            c10069tU2.e = true;
            c10069tU2.a.m(nd23, 1);
            c10069tU2.a.m(nd22, 1);
            RunnableC5261fU2 runnableC5261fU2 = new RunnableC5261fU2(c10069tU2);
            Runnable runnable = c10069tU2.m;
            if (runnable != null) {
                c10069tU2.k.removeCallbacks(runnable);
            }
            c10069tU2.m = runnableC5261fU2;
            c10069tU2.k.postDelayed(runnableC5261fU2, c10069tU2.f());
            C11441xU2 c11441xU2 = c10069tU2.b;
            WeakReference weakReference = new WeakReference(c10069tU2.r);
            c11441xU2.getClass();
            PostTask.c(QF3.i, new RunnableC10755vU2(c11441xU2, weakReference));
        } else {
            c10069tU2.e = false;
            c10069tU2.a.m(nd23, 0);
            c10069tU2.a.m(nd22, 0);
            if (AbstractC0193Bm2.a()) {
                AbstractC9583s31.a().getClass();
                if (!AbstractC4676dm2.a()) {
                    c10069tU2.j = 1;
                    c10069tU2.a.m(nd2, 0);
                    return;
                }
            }
        }
        c10069tU2.a.m(nd2, 1);
        c10069tU2.j = 2;
        if (!N.M$fImY7r(Profile.d())) {
            c10069tU2.j = 1;
            c10069tU2.a.m(nd2, 6);
            EI2.h(5, 10, "Settings.SafetyCheck.PasswordsResult");
            c10069tU2.k();
        }
        c10069tU2.h = false;
        c10069tU2.g = false;
        if (AbstractC0193Bm2.a()) {
            PasswordStoreBridge passwordStoreBridge = c10069tU2.f;
            passwordStoreBridge.b.a(c10069tU2);
            if (passwordStoreBridge.c != -1) {
                c10069tU2.h();
            }
            final WeakReference weakReference2 = new WeakReference(c10069tU2);
            AbstractC0193Bm2.b(C10069tU2.g(), new Callback() { // from class: pU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Integer num = (Integer) obj;
                    C10069tU2 c10069tU22 = (C10069tU2) weakReference2.get();
                    if (c10069tU22 == null || c10069tU22.a == null) {
                        return;
                    }
                    c10069tU22.p = num;
                    c10069tU22.h = true;
                    if (c10069tU22.g) {
                        c10069tU22.e();
                    }
                }
            }, new Callback() { // from class: qU2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Exception exc = (Exception) obj;
                    C10069tU2 c10069tU22 = (C10069tU2) weakReference2.get();
                    if (c10069tU22 == null || c10069tU22.a == null) {
                        return;
                    }
                    c10069tU22.j(new RunnableC6635jU2(c10069tU22, exc));
                }
            });
        } else {
            ((C2392Sk2) AbstractC1872Ok2.b(c10069tU2.c)).a(c10069tU2, true);
        }
        if (c10069tU2.g && c10069tU2.h) {
            c10069tU2.e();
        }
    }

    public VT2(WT2 wt2) {
        this.a = wt2;
    }
}
