package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lr1 */
/* loaded from: classes.dex */
public final class C1516Lr1 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C1646Mr1 c1646Mr1 = (C1646Mr1) obj;
        InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
        if (a == null) {
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        C2166Qr1 c2166Qr1 = c1646Mr1.k;
        if (c2166Qr1 == null) {
            c2166Qr1 = C2166Qr1.k;
        }
        C14 it = AbstractC1472Li1.o(c2166Qr1.j).iterator();
        while (it.hasNext()) {
            C1776Nr1 c1776Nr1 = (C1776Nr1) it.next();
            int a2 = AbstractC1906Or1.a(c1776Nr1.k);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 1) {
                int a3 = AbstractC1906Or1.a(c1776Nr1.k);
                if (a3 == 0) {
                    a3 = 1;
                }
                int b = AbstractC2373Sg3.b(a3);
                char c = b != 1 ? b != 2 ? (char) 0 : (char) 2 : (char) 1;
                C3835bK0 c3835bK0 = (C3835bK0) a;
                int i = c != 1 ? c != 2 ? 0 : 2 : 1;
                if (i != 0) {
                    FeedStream feedStream = c3835bK0.a;
                    N.Mh3BEDT_(feedStream.d, feedStream, i);
                }
            }
        }
        return C5971hZ.a;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C1646Mr1.n;
    }
}
