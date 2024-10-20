package defpackage;

import android.os.Handler;
import com.android.chrome.R;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xo2 */
/* loaded from: classes.dex */
public final class C3062Xo2 extends Fl4 {
    public final PropertyModel g;
    public Handler h;
    public final WebContents i;
    public final InterfaceC2932Wo2 j;

    public C3062Xo2(PropertyModel propertyModel, WebContents webContents, InterfaceC2932Wo2 interfaceC2932Wo2) {
        super(webContents);
        this.i = webContents;
        this.g = propertyModel;
        this.j = interfaceC2932Wo2;
    }

    @Override // defpackage.Fl4
    public final void c(C8880q01 c8880q01, GURL gurl, boolean z, boolean z2, int i) {
        if (i != 1) {
            return;
        }
        Handler handler = new Handler();
        this.h = handler;
        handler.postDelayed(new Runnable() { // from class: Vo2
            @Override // java.lang.Runnable
            public final void run() {
                LD2 ld2 = AbstractC3192Yo2.d;
                C3062Xo2 c3062Xo2 = C3062Xo2.this;
                c3062Xo2.g.k(ld2, false);
                c3062Xo2.h = null;
            }
        }, 64L);
    }

    @Override // defpackage.Fl4
    public final void didFailLoad(boolean z, int i, GURL gurl, int i2) {
        if (i2 != 1) {
            return;
        }
        this.g.k(AbstractC3192Yo2.d, false);
    }

    @Override // defpackage.Fl4
    public final void titleWasSet(String str) {
        this.g.o(AbstractC3192Yo2.b, str);
    }

    @Override // defpackage.Fl4
    public final void loadProgressChanged(float f) {
        if (f == 1.0d) {
            return;
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.h = null;
        }
        LD2 ld2 = AbstractC3192Yo2.d;
        PropertyModel propertyModel = this.g;
        propertyModel.k(ld2, true);
        propertyModel.l(AbstractC3192Yo2.c, Math.max(f, 0.05f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:            if (r1 != 6) goto L70;     */
    @Override // defpackage.Fl4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void didChangeVisibleSecurityState() {
        /*
            r6 = this;
            Wo2 r0 = r6.j
            r1 = r0
            Uo2 r1 = (defpackage.C2672Uo2) r1
            org.chromium.content_public.browser.WebContents r1 = r1.a
            int r1 = defpackage.AbstractC6832k23.a(r1)
            Uo2 r0 = (defpackage.C2672Uo2) r0
            boolean r2 = r0.c
            r3 = 0
            int r2 = defpackage.AbstractC7176l23.a(r2, r1, r3, r3)
            ND2 r4 = defpackage.AbstractC3192Yo2.e
            org.chromium.ui.modelutil.PropertyModel r5 = r6.g
            r5.m(r4, r2)
            if (r1 == 0) goto L32
            r2 = 3
            if (r1 == r2) goto L2e
            r2 = 4
            if (r1 == r2) goto L2e
            r2 = 5
            if (r1 == r2) goto L2a
            r2 = 6
            if (r1 == r2) goto L32
            goto L35
        L2a:
            r3 = 2132017502(0x7f14015e, float:1.9673284E38)
            goto L35
        L2e:
            r3 = 2132017503(0x7f14015f, float:1.9673286E38)
            goto L35
        L32:
            r3 = 2132017504(0x7f140160, float:1.9673288E38)
        L35:
            android.app.Activity r0 = r0.b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r3)
            PD2 r1 = defpackage.AbstractC3192Yo2.f
            r5.o(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3062Xo2.didChangeVisibleSecurityState():void");
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationNoop(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.Fl4
    public final void didStartNavigationInPrimaryMainFrame(NavigationHandle navigationHandle) {
        if (navigationHandle.c) {
            return;
        }
        C2672Uo2 c2672Uo2 = (C2672Uo2) this.j;
        int a = AbstractC7176l23.a(c2672Uo2.c, 0, false, false);
        ND2 nd2 = AbstractC3192Yo2.e;
        PropertyModel propertyModel = this.g;
        propertyModel.m(nd2, a);
        propertyModel.o(AbstractC3192Yo2.f, c2672Uo2.b.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f140160));
    }

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a) {
            PD2 pd2 = AbstractC3192Yo2.a;
            GURL u = this.i.u();
            PropertyModel propertyModel = this.g;
            propertyModel.o(pd2, u);
            propertyModel.k(AbstractC3192Yo2.d, false);
        }
    }
}
