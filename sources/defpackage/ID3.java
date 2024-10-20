package defpackage;

import android.app.Activity;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ID3 implements InterfaceC11941yv3 {
    public final Activity a;
    public final IC b;
    public final InterfaceC0079Ap3 c;
    public final InterfaceC0079Ap3 d;
    public final Runnable e;
    public final QB f;
    public final InterfaceC7968nM g;
    public final JC h;
    public final ZU0 i;
    public final InterfaceC10912vv3 j;
    public final InterfaceC0079Ap3 k;
    public final InterfaceC0079Ap3 l;
    public final InterfaceC0079Ap3 m;
    public final InterfaceC0079Ap3 n;
    public final CC o;
    public final InterfaceC0079Ap3 p;
    public final I5 q;
    public final WindowAndroid r;
    public final InterfaceC0079Ap3 s;
    public final InterfaceC7913nB t;
    public final InterfaceC6092ht1 u;
    public final InterfaceC0079Ap3 v;
    public final C4270cc0 w;
    public C8201o12 x;

    public ID3(Activity activity, G10 g10, K63 k63, InterfaceC0079Ap3 interfaceC0079Ap3, RunnableC8680pR runnableC8680pR, m mVar, InterfaceC7968nM interfaceC7968nM, CC cc, XU0 xu0, InterfaceC10912vv3 interfaceC10912vv3, C0649Ez3 c0649Ez3, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C4212cR c4212cR, CC cc2, C6166i6 c6166i6, I5 i5, C10285u6 c10285u6, C9023qR c9023qR, C9365rR c9365rR, C6434it1 c6434it1, C7993nR c7993nR, C4270cc0 c4270cc0) {
        this.a = activity;
        this.b = g10;
        this.c = k63;
        this.d = interfaceC0079Ap3;
        this.e = runnableC8680pR;
        this.f = mVar;
        this.g = interfaceC7968nM;
        this.h = cc;
        this.i = xu0;
        this.j = interfaceC10912vv3;
        this.k = c0649Ez3;
        this.l = c8385oa2;
        this.m = c8385oa22;
        this.n = c4212cR;
        this.o = cc2;
        this.p = c6166i6;
        this.q = i5;
        this.r = c10285u6;
        this.s = c9023qR;
        this.t = c9365rR;
        this.u = c6434it1;
        this.v = c7993nR;
        this.w = c4270cc0;
    }

    @Override // defpackage.InterfaceC11941yv3
    public final AbstractC10328uD3 e(Tab tab) {
        return new C9599s6(tab, this.a, this.g, false, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.InterfaceC11941yv3
    public final C12055zG0 d(TabImpl tabImpl) {
        return new C12055zG0(new C5877hG0(tabImpl));
    }

    @Override // defpackage.InterfaceC11941yv3
    public final ContextMenuPopulatorFactory b(Tab tab) {
        return new HN(new C7136kv3(tab, (InterfaceC10590uz3) this.k.get(), this.d, this.e, this.n), this.c, 0, C4502dG0.b);
    }

    @Override // defpackage.InterfaceC11941yv3
    public final IC c(TabImpl tabImpl) {
        return new G10(new MA3(tabImpl), this.b);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x005e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x020d  */
    /* JADX WARN: Type inference failed for: r6v4, types: [k12] */
    @Override // defpackage.InterfaceC11941yv3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC5451g12 a(java.lang.String r30, defpackage.InterfaceC5451g12 r31, final org.chromium.chrome.browser.tab.Tab r32) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ID3.a(java.lang.String, g12, org.chromium.chrome.browser.tab.Tab):g12");
    }
}
