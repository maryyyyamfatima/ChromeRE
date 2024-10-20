package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.dom_distiller.content.DistillablePageUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zv3 */
/* loaded from: classes.dex */
public final class C12284zv3 extends BA0 implements DistillablePageUtils.PageDistillableDelegate, J44 {
    public final C12157za2 a = new C12157za2();
    public Tab g;
    public WebContents h;
    public boolean i;
    public boolean j;
    public boolean k;

    public C12284zv3(TabImpl tabImpl) {
        this.g = tabImpl;
        V0();
        this.g.v(this);
    }

    public final void V0() {
        this.i = false;
        this.j = false;
        this.k = false;
        Tab tab = this.g;
        if (tab == null || tab.b() == null || this.g.b() == this.h) {
            return;
        }
        WebContents b = this.g.b();
        this.h = b;
        N.MFtP575Y(b, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:            if ((!defpackage.R44.a(org.chromium.chrome.browser.profiles.Profile.b(r7.b.b())).a("dom_distiller.reader_for_accessibility") && defpackage.AbstractC2160Qq0.a() == 2) == false) goto L138;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // org.chromium.components.dom_distiller.content.DistillablePageUtils.PageDistillableDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r5.i = r6
            r5.j = r7
            r5.k = r8
            za2 r6 = r5.a
            java.util.Iterator r6 = r6.iterator()
        Lc:
            r7 = r6
            ya2 r7 = (defpackage.C11814ya2) r7
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r7 = r7.next()
            KH2 r7 = (defpackage.KH2) r7
            org.chromium.chrome.browser.tab.Tab r8 = r5.g
            boolean r0 = r5.i
            boolean r1 = r5.j
            boolean r2 = r5.k
            NH2 r3 = r7.a
            r3.getClass()
            org.chromium.url.GURL r8 = r8.getUrl()
            org.chromium.url.GURL r4 = r3.k
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L35
            goto Lc
        L35:
            r8 = 0
            r4 = 1
            if (r0 == 0) goto L63
            if (r2 == 0) goto L5d
            org.chromium.chrome.browser.tab.Tab r7 = r7.b
            org.chromium.content_public.browser.WebContents r7 = r7.b()
            org.chromium.chrome.browser.profiles.Profile r7 = org.chromium.chrome.browser.profiles.Profile.b(r7)
            org.chromium.components.prefs.PrefService r7 = defpackage.R44.a(r7)
            java.lang.String r0 = "dom_distiller.reader_for_accessibility"
            boolean r7 = r7.a(r0)
            if (r7 != 0) goto L5a
            int r7 = defpackage.AbstractC2160Qq0.a()
            r0 = 2
            if (r7 != r0) goto L5a
            r7 = r4
            goto L5b
        L5a:
            r7 = r8
        L5b:
            if (r7 != 0) goto L63
        L5d:
            r3.i = r8
            r3.Y0()
            goto L65
        L63:
            r3.i = r4
        L65:
            boolean r7 = r3.g
            if (r7 != 0) goto Lc
            int r7 = r3.i
            if (r7 == 0) goto L6f
            if (r1 == 0) goto Lc
        L6f:
            r3.g = r4
            if (r7 != 0) goto L74
            r8 = r4
        L74:
            java.lang.String r7 = "DomDistiller.PageDistillable"
            defpackage.EI2.b(r7, r8)
            goto Lc
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12284zv3.b0(boolean, boolean, boolean):void");
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        V0();
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            return;
        }
        V0();
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.clear();
        this.g.w(this);
        this.g = null;
        this.h = null;
        V0();
    }
}
