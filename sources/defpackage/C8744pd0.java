package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pd0 */
/* loaded from: classes.dex */
public final class C8744pd0 extends IC {
    public final InterfaceC3241Yy1 i;
    public int j = 3;

    @Override // defpackage.IC, defpackage.C8385oa2
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Integer) obj);
    }

    public C8744pd0(InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.i = interfaceC3241Yy1;
        ((CC) ((JC) interfaceC3241Yy1.get())).g.m(new Callback() { // from class: od0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C8744pd0.this.s();
            }
        });
        s();
    }

    public final void s() {
        int i;
        int intValue = ((Integer) ((CC) ((JC) this.i.get())).g.g).intValue();
        if (intValue == 2 || (i = this.j) == 2) {
            intValue = 2;
        } else if (i != 3) {
            intValue = i;
        }
        p(Integer.valueOf(intValue));
    }
}
