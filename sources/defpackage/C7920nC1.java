package defpackage;

import J.N;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nC1 */
/* loaded from: classes.dex */
public final class C7920nC1 implements InterfaceC3484aI3 {
    public final /* synthetic */ C4826eC1 a;

    public C7920nC1(C4826eC1 c4826eC1) {
        this.a = c4826eC1;
    }

    @Override // defpackage.InterfaceC9648sF
    public final void a(Object obj, Object obj2, Object obj3) {
        final String str = (String) obj;
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj3;
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("PreemptiveLinkToTextGeneration")) {
            EI2.h(2, 3, "SharedHighlights.LinkToTextDiagnoseStatus");
        }
        final C5858hC1 c5858hC1 = this.a.a;
        if (c5858hC1.o == 3) {
            return;
        }
        c5858hC1.o = 2;
        int i = !str.isEmpty() ? 1 : 0;
        if (i != 0) {
            AbstractC8264oC1.c(new Callback() { // from class: fC1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj4) {
                    return new ZE(this, obj4);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj4) {
                    String str2 = (String) obj4;
                    C5858hC1 c5858hC12 = C5858hC1.this;
                    c5858hC12.getClass();
                    if (!str2.isEmpty()) {
                        c5858hC12.j = str2;
                    }
                    if (!c5858hC12.h.g) {
                        N.MNJqVjyt(c5858hC12.g.b());
                    } else {
                        N.MwdUorUl(0);
                    }
                    c5858hC12.X0(str);
                    D30 d30 = c5858hC12.k;
                    if (d30 != null) {
                        ((AbstractC6411ip1) d30).close();
                    }
                    c5858hC12.g.w(c5858hC12);
                }
            }, c5858hC1.g);
        } else {
            c5858hC1.V0(num.intValue());
        }
        N.Mb$rtZJa(i, num2.intValue());
    }
}
