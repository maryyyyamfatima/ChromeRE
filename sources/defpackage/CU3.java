package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CU3 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        DU3 du3 = (DU3) obj;
        final InterfaceC3486aJ0 a = L44.a(abstractC9053qX);
        if (a == null) {
            return new C6315iZ(new IllegalArgumentException("actionsHandler not present in CommandEventData"));
        }
        final GU3 gu3 = du3.k;
        if (gu3 == null) {
            gu3 = GU3.o;
        }
        int a2 = AbstractC2266Rl1.a(gu3.k);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = EU3.a(gu3.l);
        if (a3 == 0) {
            a3 = 1;
        }
        int b = AbstractC2373Sg3.b(a3);
        final int b2 = AbstractC2373Sg3.b(a2);
        if (b == 0) {
            FeedStream feedStream = ((C3835bK0) a).a;
            N.MtFh8a9I(feedStream.d, feedStream, b2);
        } else if (b == 1) {
            C3835bK0 c3835bK0 = (C3835bK0) a;
            FeedStream feedStream2 = c3835bK0.a;
            N.MdeRaZqh(feedStream2.d, feedStream2, b2);
            c3835bK0.a(((C2924Wn) abstractC9053qX).a, (4 & gu3.j) != 0 ? gu3.m : 0.66f, new Runnable() { // from class: BU3
                @Override // java.lang.Runnable
                public final void run() {
                    CU3.this.getClass();
                    GU3 gu32 = gu3;
                    int i = (gu32.j & 8) != 0 ? gu32.n : 300;
                    FeedStream feedStream3 = ((C3835bK0) a).a;
                    N.MP1gHvWn(feedStream3.d, feedStream3, b2, i);
                }
            });
        } else if (b == 2) {
            FeedStream feedStream3 = ((C3835bK0) a).a;
            N.MK59FOHj(feedStream3.d, feedStream3, b2);
        } else if (b == 3) {
            FeedStream feedStream4 = ((C3835bK0) a).a;
            N.MemZevsN(feedStream4.d, feedStream4, b2);
        } else if (b == 4) {
            int i = (gu3.j & 8) != 0 ? gu3.n : 300;
            FeedStream feedStream5 = ((C3835bK0) a).a;
            N.MP1gHvWn(feedStream5.d, feedStream5, b2, i);
        }
        return C5971hZ.a;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return DU3.n;
    }
}
