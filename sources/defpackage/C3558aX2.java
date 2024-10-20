package defpackage;

import java.util.Objects;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aX2 */
/* loaded from: classes2.dex */
public final class C3558aX2 extends Fl4 implements InterfaceC3902bX2 {
    public final ZW2 g;
    public final C5276fX2 h;
    public GURL i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3558aX2(defpackage.ZW2 r3, defpackage.C5276fX2 r4) {
        /*
            r2 = this;
            org.chromium.content_public.browser.WebContents r0 = r4.b
            r2.<init>(r0)
            r2.g = r3
            r2.h = r4
            if (r0 == 0) goto L13
            org.chromium.content_public.browser.RenderFrameHost r0 = r0.P0()
            if (r0 == 0) goto L13
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            GV1 r1 = new GV1
            r1.<init>(r4, r0)
            CV1 r3 = (defpackage.CV1) r3
            r3.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3558aX2.<init>(ZW2, fX2):void");
    }

    @Override // defpackage.Fl4
    public final void onWebContentsFocused() {
        C5276fX2 c5276fX2 = this.h;
        int i = c5276fX2.a;
        ((CV1) this.g).d(new GV1(c5276fX2, 0));
    }

    @Override // defpackage.Fl4
    public final void onWebContentsLostFocus() {
        C5276fX2 c5276fX2 = this.h;
        int i = c5276fX2.a;
        ((CV1) this.g).d(new GV1(c5276fX2, 1));
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        int i = this.h.a;
        if ((i == 2 || i == 3) && navigationHandle.a && !navigationHandle.c && navigationHandle.g && !navigationHandle.s) {
            if (i == 3) {
                GURL gurl = this.i;
                if (gurl != null) {
                    GURL gurl2 = navigationHandle.e;
                    if (!(gurl2 != null && Objects.equals(gurl.h(), gurl2.h()) && Objects.equals(gurl.d(), gurl2.d()) && Objects.equals(gurl.g(), gurl2.g()))) {
                        this.i = navigationHandle.e;
                    }
                }
                this.i = navigationHandle.e;
                return;
            }
            destroy();
        }
    }

    @Override // defpackage.Fl4
    public final void destroy() {
        super.destroy();
        C5276fX2 c5276fX2 = this.h;
        int i = c5276fX2.a;
        ((CV1) this.g).d(new GV1(c5276fX2, 2));
    }

    @Override // defpackage.Fl4
    public final void f(WindowAndroid windowAndroid) {
        destroy();
    }
}
