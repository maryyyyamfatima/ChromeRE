package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KK0 extends DK2 {
    public final /* synthetic */ SK0 a;

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        Iterator it = this.a.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6999kY2) c11814ya2.next()).b(i);
            }
        }
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        SK0 sk0 = this.a;
        InterfaceC2498Tf3 interfaceC2498Tf3 = sk0.h;
        if (interfaceC2498Tf3 != null) {
            ((C3018Xf3) interfaceC2498Tf3).a();
        }
        Iterator it = sk0.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC6999kY2) c11814ya2.next()).a(i2);
            }
        }
    }

    public KK0(SK0 sk0) {
        this.a = sk0;
    }
}
