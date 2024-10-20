package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ny3 */
/* loaded from: classes.dex */
public final class C8185ny3 implements InterfaceC0904Gy3 {
    public final /* synthetic */ C1553Ly3 a;

    @Override // defpackage.InterfaceC0904Gy3
    public final void a(int i) {
        C1553Ly3 c1553Ly3 = this.a;
        int G = c1553Ly3.e.G(i);
        if (G == -1) {
            return;
        }
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        PropertyModel propertyModel = ((C7272lK1) c1813Ny3.get(G)).b;
        LD2 ld2 = AbstractC9627sA3.i;
        boolean j = propertyModel.j(ld2);
        if (j) {
            FI2.a("TabMultiSelect.TabUnselected");
        } else {
            FI2.a("TabMultiSelect.TabSelected");
        }
        ((C7272lK1) c1813Ny3.get(G)).b.k(ld2, !j);
    }

    public C8185ny3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }
}
