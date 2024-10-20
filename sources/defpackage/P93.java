package defpackage;

import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P93 implements InterfaceC9395rX {
    public final C11918yr4 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        N93 n93 = (N93) obj;
        InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
        if (a != null) {
            int a2 = M93.a(n93.m);
            if (a2 == 0) {
                a2 = 1;
            }
            char c = a2 == 2 ? (char) 2 : (char) 1;
            String str = n93.k;
            String str2 = n93.l;
            O93 o93 = new O93(this, n93, abstractC9053qX);
            C3835bK0 c3835bK0 = (C3835bK0) a;
            int i = c == 2 ? 10000 : 4000;
            C3491aK0 c3491aK0 = new C3491aK0(o93);
            FeedStream feedStream = c3835bK0.a;
            feedStream.G.add(c3491aK0);
            C12188zf3 a3 = C12188zf3.a(str, c3491aK0, 0, 26);
            a3.d = str2;
            a3.e = null;
            a3.j = i;
            feedStream.h.c(a3);
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("feedActionsHandler not present in CommandEventData"));
    }

    public P93(C11918yr4 c11918yr4) {
        this.a = c11918yr4;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return N93.s;
    }
}
