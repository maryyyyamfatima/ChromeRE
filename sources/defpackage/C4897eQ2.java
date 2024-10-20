package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eQ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4897eQ2 implements InterfaceC7458ls {
    public final C8385oa2 a = new C8385oa2();
    public final InterfaceC0408Dd2 g;
    public final InterfaceC7697ma2 h;
    public final Runnable i;

    public C4897eQ2(C0538Ed2 c0538Ed2, C0649Ez3 c0649Ez3, RunnableC5587gR runnableC5587gR) {
        this.g = c0538Ed2;
        this.h = c0649Ez3;
        this.i = runnableC5587gR;
        a();
        c0649Ez3.m(new Callback() { // from class: aQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4897eQ2 c4897eQ2 = C4897eQ2.this;
                c4897eQ2.a();
                ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).c.b(new C4210cQ2(c4897eQ2));
            }
        });
        c0538Ed2.j(new Callback() { // from class: bQ2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C4897eQ2 c4897eQ2 = C4897eQ2.this;
                c4897eQ2.a();
                ((C9897sy1) ((InterfaceC1422Ky1) obj)).e(new C4554dQ2(c4897eQ2));
            }
        });
    }

    public final void a() {
        boolean z;
        InterfaceC7697ma2 interfaceC7697ma2 = this.h;
        Object obj = ((C8385oa2) interfaceC7697ma2).g;
        C8385oa2 c8385oa2 = this.a;
        if (obj != null) {
            InterfaceC0408Dd2 interfaceC0408Dd2 = this.g;
            if (interfaceC0408Dd2.get() != null) {
                C8385oa2 c8385oa22 = (C8385oa2) interfaceC7697ma2;
                if (((AbstractC11276wz3) ((InterfaceC10590uz3) c8385oa22.g)).h() != null) {
                    Tab h = ((AbstractC11276wz3) ((InterfaceC10590uz3) c8385oa22.g)).h();
                    boolean z2 = false;
                    if (h.getLaunchType() != 12) {
                        C1998Pj3 a = C1998Pj3.a(h);
                        if (!(a == null ? false : a.g)) {
                            z = false;
                            if (z && !((C9897sy1) ((InterfaceC1422Ky1) interfaceC0408Dd2.get())).G(2)) {
                                z2 = true;
                            }
                            c8385oa2.p(Boolean.valueOf(z2));
                            return;
                        }
                    }
                    z = true;
                    if (z) {
                        z2 = true;
                    }
                    c8385oa2.p(Boolean.valueOf(z2));
                    return;
                }
            }
        }
        c8385oa2.p(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        this.i.run();
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a;
    }
}
