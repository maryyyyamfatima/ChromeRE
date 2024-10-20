package defpackage;

import org.chromium.base.Callback;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QH2 implements InterfaceC7458ls {
    public final InterfaceC7697ma2 a;
    public final C8385oa2 g = new C8385oa2();
    public final OH2 h;
    public PH2 i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [OH2, org.chromium.base.Callback] */
    public QH2(C0649Ez3 c0649Ez3) {
        this.a = c0649Ez3;
        ?? r0 = new Callback() { // from class: OH2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                QH2 qh2 = QH2.this;
                qh2.getClass();
                qh2.i = new PH2(qh2, (InterfaceC10590uz3) obj);
                ((C8385oa2) qh2.a).n(qh2.h);
            }
        };
        this.h = r0;
        c0649Ez3.m(r0);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) ((InterfaceC10590uz3) ((C8385oa2) this.a).g);
        VH2.a(abstractC11276wz3.h().isIncognito());
        WebContents b = abstractC11276wz3.h().b();
        if (b != null) {
            b.s0();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return this.g;
    }
}
