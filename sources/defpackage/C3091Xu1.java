package defpackage;

import java.util.HashSet;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xu1 */
/* loaded from: classes.dex */
public final class C3091Xu1 implements InterfaceC7581mD1, VD2 {
    public final HashSet a = new HashSet();
    public final HashSet g = new HashSet();
    public final PropertyModel h;
    public final InterfaceC0752Fu1 i;

    @Override // defpackage.InterfaceC7581mD1
    public final /* synthetic */ void f(int i, int i2) {
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void k(int i, int i2) {
    }

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        int i;
        FD2 fd2 = (FD2) obj;
        LD2 ld2 = AbstractC6104hv1.b;
        if (fd2 != ld2) {
            return;
        }
        PropertyModel propertyModel = this.h;
        boolean j = propertyModel.j(ld2);
        HashSet hashSet = this.a;
        if (!j) {
            hashSet.clear();
            this.g.clear();
            return;
        }
        boolean isEmpty = hashSet.isEmpty();
        int i2 = 0;
        if (isEmpty) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    i = 0;
                    break;
                } else {
                    if (c(i3)) {
                        i = 1;
                        break;
                    }
                    i3++;
                }
            }
            a(i);
        }
        a(4);
        a(2);
        if (!propertyModel.j(ld2)) {
            return;
        }
        while (true) {
            JD2 jd2 = AbstractC6104hv1.a;
            if (i2 >= ((C5175fD1) propertyModel.i(jd2)).size()) {
                return;
            }
            C1142Iu1 c1142Iu1 = ((C5416fv1) ((C5175fD1) propertyModel.i(jd2)).get(i2)).b;
            if (c1142Iu1 != null) {
                a(c1142Iu1.d == 2 ? 4 : 3);
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void p(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2, Object obj) {
        for (int i3 = i; i3 < i + i2; i3++) {
            C1142Iu1 c1142Iu1 = ((C5416fv1) ((C5175fD1) this.h.i(AbstractC6104hv1.a)).get(i3)).b;
            if (c1142Iu1 != null) {
                this.g.remove(Integer.valueOf(c1142Iu1.d));
            }
        }
        b(i, i2);
    }

    public C3091Xu1(PropertyModel propertyModel, C7822mv1 c7822mv1) {
        this.h = propertyModel;
        this.i = c7822mv1;
    }

    public final void b(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            C1142Iu1 c1142Iu1 = ((C5416fv1) ((C5175fD1) this.h.i(AbstractC6104hv1.a)).get(i3)).b;
            if (c1142Iu1 != null) {
                int i4 = c1142Iu1.d;
                a(i4 == 2 ? 4 : 3);
                if (this.g.add(Integer.valueOf(i4))) {
                    EI2.h(i4, 8, "KeyboardAccessory.AccessoryActionImpression");
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7581mD1
    public final void m(InterfaceC7925nD1 interfaceC7925nD1, int i, int i2) {
        b(i, i2);
    }

    public final void a(int i) {
        if (c(i)) {
            this.a.add(Integer.valueOf(i));
            EI2.h(i, 5, "KeyboardAccessory.AccessoryBarShown");
        }
    }

    public final boolean c(int i) {
        LD2 ld2 = AbstractC6104hv1.b;
        PropertyModel propertyModel = this.h;
        if (!propertyModel.j(ld2) || this.a.contains(Integer.valueOf(i))) {
            return false;
        }
        if (i == 0 || i == 1) {
            return true;
        }
        if (i == 2) {
            return ((C5175fD1) ((C7822mv1) this.i).a.i(AbstractC8166nv1.a)).size() > 0;
        }
        JD2 jd2 = AbstractC6104hv1.a;
        if (i == 3) {
            return AbstractC3221Yu1.a((C5175fD1) propertyModel.i(jd2), new int[]{1, 0});
        }
        if (i != 4) {
            return false;
        }
        return AbstractC3221Yu1.a((C5175fD1) propertyModel.i(jd2), new int[]{2});
    }
}
