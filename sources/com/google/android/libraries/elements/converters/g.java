package com.google.android.libraries.elements.converters;

import com.google.android.libraries.elements.interfaces.CollectionDataSource;
import com.google.android.libraries.elements.interfaces.DataSourceListener;
import com.youtube.android.libraries.elements.StatusOr;
import defpackage.A00;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC6726jk3;
import defpackage.AbstractC8888q13;
import defpackage.AbstractC9896sy0;
import defpackage.C0381Cy0;
import defpackage.C0793Gc2;
import defpackage.C0923Hc2;
import defpackage.C10049tQ2;
import defpackage.C11622y00;
import defpackage.C1975Pf0;
import defpackage.C2105Qf0;
import defpackage.C2885Wf0;
import defpackage.C3390a13;
import defpackage.C5427fx0;
import defpackage.C5612gW;
import defpackage.C6206iD0;
import defpackage.C6383ik3;
import defpackage.C7632mN2;
import defpackage.EK;
import defpackage.EnumC11068wO2;
import defpackage.EnumC11438xU;
import defpackage.H10;
import defpackage.InterfaceC4449d61;
import defpackage.InterfaceC6115hx0;
import defpackage.InterfaceC6894kD2;
import defpackage.InterfaceC8520ox0;
import defpackage.SY;
import defpackage.U80;
import defpackage.Y03;
import io.grpc.Status;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class g extends Y03 {
    public static final /* synthetic */ int z = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    CollectionDataSource r;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C5612gW s;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    H10 t;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 u;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC6115hx0 v;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC8520ox0 w;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 x;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C0381Cy0 y;

    public g() {
        super("DataDrivenCollectionSection");
    }

    @Override // defpackage.Y03
    public final AbstractC6726jk3 m() {
        return new f();
    }

    @Override // defpackage.Y03
    /* renamed from: p */
    public final boolean a(Y03 y03) {
        if (this == y03) {
            return true;
        }
        if (y03 == null || g.class != y03.getClass()) {
            return false;
        }
        g gVar = (g) y03;
        CollectionDataSource collectionDataSource = this.r;
        if (collectionDataSource == null ? gVar.r != null : !collectionDataSource.equals(gVar.r)) {
            return false;
        }
        C5612gW c5612gW = this.s;
        if (c5612gW == null ? gVar.s != null : !c5612gW.equals(gVar.s)) {
            return false;
        }
        H10 h10 = this.t;
        if (h10 == null ? gVar.t != null : !h10.equals(gVar.t)) {
            return false;
        }
        U80 u80 = this.u;
        if (u80 == null ? gVar.u != null : !u80.equals(gVar.u)) {
            return false;
        }
        InterfaceC6115hx0 interfaceC6115hx0 = this.v;
        if (interfaceC6115hx0 == null ? gVar.v != null : !interfaceC6115hx0.equals(gVar.v)) {
            return false;
        }
        InterfaceC8520ox0 interfaceC8520ox0 = this.w;
        if (interfaceC8520ox0 == null ? gVar.w != null : !interfaceC8520ox0.equals(gVar.w)) {
            return false;
        }
        AbstractC9896sy0 abstractC9896sy0 = this.x;
        if (abstractC9896sy0 == null ? gVar.x != null : !abstractC9896sy0.equals(gVar.x)) {
            return false;
        }
        C0381Cy0 c0381Cy0 = this.y;
        C0381Cy0 c0381Cy02 = gVar.y;
        return c0381Cy0 == null ? c0381Cy02 == null : c0381Cy0.equals(c0381Cy02);
    }

    @Override // defpackage.Y03
    public final Y03 q(boolean z2) {
        g gVar = (g) super.q(z2);
        if (!z2) {
            gVar.k = new f();
        }
        return gVar;
    }

    @Override // defpackage.AbstractC8888q13
    public final void k(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        f fVar = (f) abstractC6726jk3;
        f fVar2 = (f) abstractC6726jk32;
        fVar2.a = fVar.a;
        fVar2.b = fVar.b;
    }

    @Override // defpackage.AbstractC8888q13
    public final Object f(C6206iD0 c6206iD0, Object obj) {
        int i = c6206iD0.g;
        Object[] objArr = c6206iD0.h;
        if (i == 851046848) {
            C0793Gc2 c0793Gc2 = (C0793Gc2) obj;
            InterfaceC4449d61 interfaceC4449d61 = c6206iD0.a;
            return Boolean.TRUE;
        }
        if (i == 947264300) {
            C0923Hc2 c0923Hc2 = (C0923Hc2) obj;
            InterfaceC4449d61 interfaceC4449d612 = c6206iD0.a;
            return Boolean.valueOf(((String) c0923Hc2.a).equals((String) c0923Hc2.b));
        }
        if (i != 1463818325) {
            return null;
        }
        InterfaceC4449d61 interfaceC4449d613 = c6206iD0.a;
        C3390a13 c3390a13 = (C3390a13) objArr[0];
        int i2 = ((C7632mN2) obj).a;
        g gVar = (g) interfaceC4449d613;
        U80 u80 = gVar.u;
        AbstractC9896sy0 abstractC9896sy0 = gVar.x;
        InterfaceC8520ox0 interfaceC8520ox0 = gVar.w;
        InterfaceC6115hx0 interfaceC6115hx0 = gVar.v;
        H10 h10 = gVar.t;
        StatusOr elementAtIndex = gVar.r.elementAtIndex(i2);
        boolean a = elementAtIndex.a();
        EnumC11438xU enumC11438xU = EnumC11438xU.A;
        if (!a) {
            abstractC9896sy0.d(enumC11438xU, "Error getting Element bytes from CollectionDataSource", u80, elementAtIndex.b().asException());
            return A00.r();
        }
        byte[] bArr = (byte[]) elementAtIndex.c();
        if (bArr != null) {
            C11622y00 c11622y00 = new C11622y00();
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            C5427fx0 c5427fx0 = new C5427fx0();
            C5427fx0.j(wrap, c5427fx0);
            c11622y00.b = ((C10049tQ2) interfaceC8520ox0).e(c3390a13, u80, c5427fx0, interfaceC6115hx0, h10);
            return new A00(c11622y00);
        }
        abstractC9896sy0.d(enumC11438xU, "Null Element bytes from CollectionDataSource", u80, null);
        return A00.r();
    }

    @Override // defpackage.AbstractC8888q13
    public final void e(final C3390a13 c3390a13) {
        final CollectionDataSource collectionDataSource = this.r;
        C0381Cy0 c0381Cy0 = this.y;
        final U80 u80 = this.u;
        final AbstractC9896sy0 abstractC9896sy0 = this.x;
        Boolean bool = Boolean.FALSE;
        AbstractC0562Ei1 o = AbstractC0562Ei1.o(collectionDataSource.identifiers());
        collectionDataSource.addListener(new DataSourceListener() { // from class: com.google.android.libraries.elements.converters.DataDrivenCollectionSectionSpec$1
            @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
            public void onDataChanged() {
                C3390a13 c3390a132 = C3390a13.this;
                CollectionDataSource collectionDataSource2 = collectionDataSource;
                int i = g.z;
                if (c3390a132.q() == null) {
                    return;
                }
                c3390a132.m(new C6383ik3(0, collectionDataSource2), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
            }

            @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
            public void onError(Status status) {
                abstractC9896sy0.d(EnumC11438xU.A, "Error loading data from CollectionDataSource", u80, status.asException());
            }
        });
        if (c0381Cy0 != null) {
            c0381Cy0.H.h.add(new C2885Wf0(c3390a13));
        }
        f fVar = (f) this.k;
        fVar.b = bool;
        fVar.a = o;
    }

    @Override // defpackage.AbstractC8888q13
    public final EK d(C3390a13 c3390a13) {
        f fVar = (f) this.k;
        Boolean bool = fVar.b;
        AbstractC0562Ei1 abstractC0562Ei1 = fVar.a;
        EK ek = new EK();
        C1975Pf0 c1975Pf0 = new C1975Pf0();
        C2105Qf0 c2105Qf0 = new C2105Qf0();
        c3390a13.getClass();
        c1975Pf0.a = c2105Qf0;
        c1975Pf0.c.clear();
        c1975Pf0.d(bool);
        c1975Pf0.c(abstractC0562Ei1);
        c1975Pf0.a.v = AbstractC8888q13.i(c3390a13, 1463818325, new Object[]{c3390a13});
        c1975Pf0.a.u = AbstractC8888q13.i(c3390a13, 947264300, new Object[]{c3390a13});
        c1975Pf0.a.t = AbstractC8888q13.i(c3390a13, 851046848, new Object[]{c3390a13});
        ek.a.add(c1975Pf0.b());
        return ek;
    }
}
