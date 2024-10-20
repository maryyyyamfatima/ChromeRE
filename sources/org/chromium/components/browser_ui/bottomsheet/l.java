package org.chromium.components.browser_ui.bottomsheet;

import defpackage.AbstractC4472dA0;
import defpackage.OX2;
import defpackage.PB;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class l extends AbstractC4472dA0 {
    public boolean a;
    public final /* synthetic */ PropertyModel g;
    public final /* synthetic */ m h;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void b(PB pb) {
        m mVar = this.h;
        mVar.u();
        if (pb != null) {
            return;
        }
        mVar.g.setVisibility(8);
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i == 0) {
            m mVar = this.h;
            if (mVar.i || !mVar.p.b()) {
                PB pb = mVar.a.u;
                if (pb != null && !mVar.j) {
                    pb.destroy();
                }
                mVar.j = false;
                mVar.i = false;
                mVar.r(true);
                mVar.u();
            }
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void j() {
        m mVar = this.h;
        PB pb = mVar.a.u;
        if (pb == null || !pb.d()) {
            ((OX2) mVar.o.get()).b(this.g);
            this.a = true;
            mVar.u();
        }
    }

    public l(m mVar, PropertyModel propertyModel) {
        this.h = mVar;
        this.g = propertyModel;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        boolean z = this.a;
        m mVar = this.h;
        if (z) {
            ((OX2) mVar.o.get()).a(true);
            this.a = false;
        }
        PB pb = mVar.a.u;
        if (pb != null) {
            pb.n();
            PB pb2 = mVar.a.u;
            PB pb3 = (PB) mVar.h.peek();
            if (pb2 != null && pb3 != null && pb3.a() < pb2.a()) {
                mVar.h.add(pb2);
                mVar.a.t(0, 0, true);
            }
        }
        mVar.u();
    }
}
