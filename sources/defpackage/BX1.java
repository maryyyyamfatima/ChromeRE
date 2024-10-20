package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BX1 implements InterfaceC7458ls {
    public final C8385oa2 a;
    public final InterfaceC7697ma2 g;
    public final C12141zX1 h;
    public final C6275iR i;
    public final Callback j;
    public AX1 k;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:            if (J.N.M6bsIDpc("BackGestureRefactorAndroid", "system_back", false) != false) goto L71;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [zX1, org.chromium.base.Callback] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BX1(defpackage.C0649Ez3 r3, defpackage.C6275iR r4, defpackage.C6617jR r5) {
        /*
            r2 = this;
            r2.<init>()
            oa2 r0 = new oa2
            r0.<init>()
            r2.a = r0
            r2.i = r4
            r2.j = r5
            r2.g = r3
            zX1 r4 = new zX1
            r4.<init>()
            r2.h = r4
            r3.m(r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            r5 = 1
            r1 = 0
            if (r3 < r4) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 == 0) goto L34
            nE r3 = defpackage.UN.a
            java.lang.String r3 = "BackGestureRefactorAndroid"
            java.lang.String r4 = "system_back"
            boolean r3 = J.N.M6bsIDpc(r3, r4, r1)
            if (r3 == 0) goto L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 != 0) goto L3c
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.p(r3)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BX1.<init>(Ez3, iR, jR):void");
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        boolean z;
        boolean z2;
        Tab tab;
        C8385oa2 c8385oa2 = (C8385oa2) this.g;
        Object obj = c8385oa2.g;
        if (obj == null || ((AbstractC11276wz3) ((InterfaceC10590uz3) obj)).h() == null) {
            z = true;
            z2 = false;
            tab = null;
        } else {
            tab = ((AbstractC11276wz3) ((InterfaceC10590uz3) c8385oa2.g)).h();
            InterfaceC5451g12 x = tab.x();
            if (x != null) {
                x.s();
            }
            z2 = this.i.a.S0(tab);
            z = !z2 || C1663Mu3.g(tab);
        }
        if (z) {
            EI2.h(z2 ? 2 : 0, 3, "Android.BackPress.MinimizeAppAndCloseTab");
            this.j.onResult(z2 ? tab : null);
            return;
        }
        EI2.h(1, 3, "Android.BackPress.MinimizeAppAndCloseTab");
        WebContents b = tab.b();
        if (b != null) {
            b.s0();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.a;
    }
}
