package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wu1 */
/* loaded from: classes.dex */
public final class C2961Wu1 implements VD2, InterfaceC9646sE2, InterfaceC7134kv1 {
    public final PropertyModel a;
    public final InterfaceC0882Gu1 g;
    public final InterfaceC0752Fu1 h;

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        C1661Mu1 a;
        FD2 fd2 = (FD2) obj;
        LD2 ld2 = AbstractC6104hv1.b;
        InterfaceC0752Fu1 interfaceC0752Fu1 = this.h;
        PropertyModel propertyModel = this.a;
        if (fd2 == ld2) {
            propertyModel.k(AbstractC6104hv1.k, false);
            ((C7822mv1) interfaceC0752Fu1).a.o(AbstractC8166nv1.b, null);
            if (propertyModel.j(ld2)) {
                return;
            }
            a(0, new C1142Iu1[0]);
            return;
        }
        if (fd2 != AbstractC6104hv1.f || (a = ((C7822mv1) interfaceC0752Fu1).a()) == null) {
            return;
        }
        propertyModel.o(AbstractC6104hv1.e, a.a);
    }

    public C2961Wu1(PropertyModel propertyModel, CL1 cl1, C7822mv1 c7822mv1, C6790jv1 c6790jv1) {
        this.a = propertyModel;
        this.g = cl1;
        this.h = c7822mv1;
        propertyModel.o(AbstractC6104hv1.j, new Callback() { // from class: Ru1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C2961Wu1 c2961Wu1 = C2961Wu1.this;
                c2961Wu1.getClass();
                LD2 ld2 = AbstractC6104hv1.k;
                int intValue = ((Integer) obj).intValue();
                JD2 jd2 = AbstractC6104hv1.a;
                PropertyModel propertyModel2 = c2961Wu1.a;
                propertyModel2.k(ld2, intValue <= ((C5175fD1) propertyModel2.i(jd2)).size() + (-2));
            }
        });
        propertyModel.o(AbstractC6104hv1.h, new Runnable() { // from class: Su1
            @Override // java.lang.Runnable
            public final void run() {
                C2961Wu1.this.b();
            }
        });
        PD2 pd2 = AbstractC6104hv1.g;
        propertyModel.o(pd2, new C5760gv1(c6790jv1));
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("AutofillKeyboardAccessory")) {
            ((C5175fD1) propertyModel.i(AbstractC6104hv1.a)).s((C5416fv1) propertyModel.i(pd2));
        }
        propertyModel.a(this);
    }

    @Override // defpackage.InterfaceC9646sE2
    /* renamed from: e */
    public final void a(int i, C1142Iu1[] c1142Iu1Arr) {
        int i2;
        ArrayList c = c(i);
        ArrayList arrayList = new ArrayList(c1142Iu1Arr.length);
        for (C1142Iu1 c1142Iu1 : c1142Iu1Arr) {
            int i3 = c1142Iu1.d;
            if (i3 != 0) {
                i2 = 1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 8) {
                            throw new IllegalArgumentException(AbstractC9076qb1.a("Unhandled action type:", i3));
                        }
                    }
                }
                throw new IllegalArgumentException(AbstractC9076qb1.a("No view defined for :", i3));
            }
            i2 = 0;
            arrayList.add(new C5416fv1(i2, c1142Iu1));
        }
        c.addAll(0, arrayList);
        C7928nE c7928nE = UN.a;
        boolean M09VlOh_ = N.M09VlOh_("AutofillKeyboardAccessory");
        PropertyModel propertyModel = this.a;
        if (M09VlOh_) {
            c.add(c.size(), (C5416fv1) propertyModel.i(AbstractC6104hv1.g));
        }
        ((C5175fD1) propertyModel.i(AbstractC6104hv1.a)).A(c);
    }

    public final ArrayList c(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C5175fD1) this.a.i(AbstractC6104hv1.a)).iterator();
        while (it.hasNext()) {
            C5416fv1 c5416fv1 = (C5416fv1) it.next();
            C1142Iu1 c1142Iu1 = c5416fv1.b;
            if (c1142Iu1 != null && c1142Iu1.d != i) {
                arrayList.add(c5416fv1);
            }
        }
        return arrayList;
    }

    public final void b() {
        DL1.b(((C7822mv1) this.h).a().f, 1);
        this.a.k(AbstractC6104hv1.f, false);
        ((CL1) this.g).c1();
    }
}
