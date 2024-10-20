package defpackage;

import android.content.Intent;
import android.os.Bundle;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qk1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9130qk1 {
    public final InterfaceC7697ma2 a;
    public final I5 b;
    public final InterfaceC0079Ap3 c;
    public final InterfaceC0079Ap3 d;
    public final Runnable e;
    public boolean f;
    public final C8444ok1 g;
    public final C8787pk1 h;
    public final C7756mk1 i;
    public final C4496dF j;
    public boolean k;
    public Bundle l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [mk1, org.chromium.base.Callback] */
    public C9130qk1(InterfaceC0408Dd2 interfaceC0408Dd2, InterfaceC7697ma2 interfaceC7697ma2, C10389uQ c10389uQ, C10732vQ c10732vQ, I5 i5, RunnableC1984Ph runnableC1984Ph) {
        C8444ok1 c8444ok1 = new C8444ok1(this);
        this.g = c8444ok1;
        this.h = new C8787pk1(this);
        ?? r1 = new Callback() { // from class: mk1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).c(C9130qk1.this.h);
            }
        };
        this.i = r1;
        C4496dF c4496dF = new C4496dF();
        this.j = c4496dF;
        this.a = interfaceC7697ma2;
        this.c = c10389uQ;
        this.d = c10732vQ;
        this.b = i5;
        this.e = runnableC1984Ph;
        i5.b(c8444ok1);
        interfaceC0408Dd2.j(c4496dF.b(new Callback() { // from class: nk1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9130qk1 c9130qk1 = C9130qk1.this;
                c9130qk1.l = (Bundle) obj;
                if (c9130qk1.b()) {
                    return;
                }
                c9130qk1.f = true;
                c9130qk1.e.run();
            }
        }));
        ((C8385oa2) interfaceC7697ma2).m(r1);
    }

    public final boolean b() {
        boolean z;
        if (!C3166Yj1.b() || AX.e().g("no-restore-state")) {
            return false;
        }
        Bundle bundle = this.l;
        if (bundle == null) {
            return true;
        }
        if (!ZR.a.c(bundle) || !this.l.getBoolean("incognitoReauthPending", false)) {
            return false;
        }
        boolean z2 = this.l.getBoolean("is_incognito_selected", false);
        if (!((Boolean) this.d.get()).booleanValue()) {
            InterfaceC0079Ap3 interfaceC0079Ap3 = this.c;
            if (interfaceC0079Ap3.get() != null && ((Intent) interfaceC0079Ap3.get()).getBooleanExtra("org.chromium.chrome.browser.incognito.invoked_from_launch_new_incognito_tab", false)) {
                z = true;
                if (z2 && !z) {
                    return false;
                }
                InterfaceC7697ma2 interfaceC7697ma2 = this.a;
                return (((C8385oa2) interfaceC7697ma2).g == null && ((AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) interfaceC7697ma2).g)).i && this.k) ? false : true;
            }
        }
        z = false;
        if (z2) {
        }
        InterfaceC7697ma2 interfaceC7697ma22 = this.a;
        if (((C8385oa2) interfaceC7697ma22).g == null) {
            return true;
        }
    }

    public static void a(C9130qk1 c9130qk1) {
        C8385oa2 c8385oa2 = (C8385oa2) c9130qk1.a;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2) && ((AbstractC11276wz3) ((InterfaceC10590uz3) c8385oa2.g)).i && c9130qk1.k && !c9130qk1.f) {
            c9130qk1.f = true;
            c9130qk1.e.run();
        }
    }
}
