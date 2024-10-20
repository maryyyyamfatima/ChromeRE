package defpackage;

import java.net.URISyntaxException;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategory;
import org.chromium.chrome.browser.explore_sites.b;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.Parsed;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yF0 */
/* loaded from: classes.dex */
public final class C11707yF0 extends AbstractC5426fx {
    public final Tab l;
    public b m;
    public final C0044Ai3 n;
    public final String o;
    public final PropertyModel p;
    public final I60 q;
    public int r;
    public boolean s;
    public final int t;
    public static final int u = Math.max(Math.max(10, 9), 8);
    public static final ND2 v = new ND2();
    public static final ND2 w = new ND2();
    public static final JD2 x = new JD2();
    public static final ID2 y = new ID2();
    public static final ID2 z = new ID2();
    public static final ID2 A = new ID2();

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "explore";
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void n(String str) {
        int e;
        this.k = str;
        this.r = -1;
        try {
            NZ3 nz3 = new NZ3(str);
            Parsed parsed = nz3.c;
            this.r = Integer.parseInt(nz3.c(parsed.o, parsed.p));
        } catch (NumberFormatException | URISyntaxException unused) {
        }
        ND2 nd2 = v;
        PropertyModel propertyModel = this.p;
        if (propertyModel.h(nd2) != 2 || (e = e()) == -1) {
            return;
        }
        propertyModel.m(w, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11707yF0(android.app.Activity r24, defpackage.C7857n12 r25, org.chromium.chrome.browser.tab.Tab r26, defpackage.InterfaceC10590uz3 r27) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11707yF0.<init>(android.app.Activity, n12, org.chromium.chrome.browser.tab.Tab, uz3):void");
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.o;
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        b bVar = this.m;
        Tab tab = this.l;
        if (bVar != null) {
            tab.w(bVar);
        }
        tab.m().A.d(this.q);
        super.destroy();
    }

    public final int e() {
        if (this.r != -1) {
            C5175fD1 c5175fD1 = (C5175fD1) this.p.i(x);
            for (int i = 0; i < c5175fD1.size(); i++) {
                if (((ExploreSitesCategory) c5175fD1.get(i)).a == this.r) {
                    return i;
                }
            }
        }
        return -1;
    }
}
