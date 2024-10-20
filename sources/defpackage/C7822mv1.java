package defpackage;

import java.util.HashSet;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7822mv1 implements InterfaceC11609xx3, VD2, InterfaceC0752Fu1 {
    public final PropertyModel a;
    public InterfaceC7134kv1 g;
    public final HashSet h = new HashSet();

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        FD2 fd2 = (FD2) obj;
        PD2 pd2 = AbstractC8166nv1.b;
        PropertyModel propertyModel = this.a;
        if (fd2 != pd2) {
            if (fd2 == AbstractC8166nv1.a) {
                propertyModel.o(pd2, null);
                return;
            }
            return;
        }
        InterfaceC7134kv1 interfaceC7134kv1 = this.g;
        if (interfaceC7134kv1 != null) {
            Integer num = (Integer) propertyModel.i(pd2);
            C2961Wu1 c2961Wu1 = (C2961Wu1) interfaceC7134kv1;
            c2961Wu1.a.k(AbstractC6104hv1.f, num != null);
            InterfaceC0882Gu1 interfaceC0882Gu1 = c2961Wu1.g;
            if (num == null) {
                ((CL1) interfaceC0882Gu1).c1();
                return;
            }
            int intValue = num.intValue();
            CL1 cl1 = (CL1) interfaceC0882Gu1;
            if (cl1.a1()) {
                cl1.n.a.a.m(AbstractC3736b2.b, intValue);
                C0231Bu0 c0231Bu0 = cl1.q;
                if (c0231Bu0 != null && c0231Bu0.a.a()) {
                    cl1.q.a.dismiss();
                }
                boolean Z0 = cl1.Z0(5);
                ND2 nd2 = EL1.c;
                PropertyModel propertyModel2 = cl1.g;
                if (Z0) {
                    propertyModel2.m(nd2, 3);
                } else if (cl1.Z0(13)) {
                    propertyModel2.m(nd2, 11);
                }
            }
        }
    }

    public C7822mv1(PropertyModel propertyModel) {
        this.a = propertyModel;
        propertyModel.a(this);
        propertyModel.o(AbstractC8166nv1.c, this);
    }

    public final C1661Mu1 a() {
        PD2 pd2 = AbstractC8166nv1.b;
        PropertyModel propertyModel = this.a;
        if (propertyModel.i(pd2) == null) {
            return null;
        }
        return (C1661Mu1) ((C5175fD1) propertyModel.i(AbstractC8166nv1.a)).get(((Integer) propertyModel.i(pd2)).intValue());
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        PD2 pd2 = AbstractC8166nv1.b;
        int i = c0249Bx3.e;
        PropertyModel propertyModel = this.a;
        Integer num = null;
        if (i != -1 && i < ((C5175fD1) propertyModel.i(AbstractC8166nv1.a)).size()) {
            num = Integer.valueOf(i);
        }
        propertyModel.o(pd2, num);
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
        PD2 pd2 = AbstractC8166nv1.b;
        PropertyModel propertyModel = this.a;
        if (propertyModel.i(pd2) != null) {
            InterfaceC7134kv1 interfaceC7134kv1 = this.g;
            if (interfaceC7134kv1 != null) {
                ((C2961Wu1) interfaceC7134kv1).b();
                return;
            }
            return;
        }
        int i = c0249Bx3.e;
        Integer num = null;
        if (i != -1 && i < ((C5175fD1) propertyModel.i(AbstractC8166nv1.a)).size()) {
            num = Integer.valueOf(i);
        }
        propertyModel.o(pd2, num);
    }
}
