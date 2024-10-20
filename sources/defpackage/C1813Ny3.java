package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ny3 */
/* loaded from: classes.dex */
public final class C1813Ny3 extends C7616mK1 {
    public final int G(int i) {
        for (int i2 = 0; i2 < size(); i2++) {
            PropertyModel propertyModel = ((C7272lK1) get(i2)).b;
            if (propertyModel.h(AbstractC1683My3.a) == 0 && propertyModel.h(AbstractC9627sA3.a) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int H(int i) {
        int i2 = -1;
        if (i < 0) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size(); i4++) {
            if (((C7272lK1) get(i4)).b.h(AbstractC1683My3.a) == 0) {
                int i5 = i3 + 1;
                if (i3 == i) {
                    return i4;
                }
                i3 = i5;
                i2 = i4;
            }
        }
        return i2 + 1;
    }

    public final int E(int i) {
        if (i < 0) {
            return -1;
        }
        if (i > size()) {
            i = size();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (((C7272lK1) get(i3)).b.h(AbstractC1683My3.a) == 0) {
                i2++;
            }
        }
        return i2;
    }

    public final int F(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (((C7272lK1) get(i2)).b.h(AbstractC1683My3.a) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public final int D(int i) {
        long h = IE2.b(i).h();
        int i2 = 0;
        while (i2 < size()) {
            PropertyModel propertyModel = ((C7272lK1) get(i2)).b;
            if (propertyModel.h(AbstractC1683My3.a) == 0 && IE2.b(propertyModel.h(AbstractC9627sA3.a)).h() - h < 0) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public final int J(int i) {
        for (int size = size() - 1; size >= 0; size--) {
            PropertyModel propertyModel = ((C7272lK1) get(size)).b;
            if (propertyModel.h(AbstractC1683My3.a) == 1 && propertyModel.h(WU1.a) == i) {
                return size;
            }
        }
        return -1;
    }

    public final int I() {
        for (int size = size() - 1; size >= 0; size--) {
            if (((C7272lK1) get(size)).b.h(AbstractC1683My3.a) == 1) {
                return size;
            }
        }
        return -1;
    }

    public final void C(int i, C7272lK1 c7272lK1) {
        super.t(i, c7272lK1);
    }

    @Override // defpackage.AbstractC5519gD1
    public final void t(int i, C7272lK1 c7272lK1) {
        super.t(i, c7272lK1);
    }

    public final void M(int i, Tab tab) {
        if (((C7272lK1) get(i)).b.h(AbstractC1683My3.a) != 0) {
            return;
        }
        ((C7272lK1) get(i)).b.m(AbstractC9627sA3.a, tab.getId());
    }

    public final void L(int i, boolean z) {
        if (i < 0 || i >= size()) {
            return;
        }
        int i2 = z ? 2 : 1;
        PropertyModel propertyModel = ((C7272lK1) get(i)).b;
        ND2 nd2 = AbstractC9627sA3.l;
        if (propertyModel.h(nd2) == i2) {
            return;
        }
        ((C7272lK1) get(i)).b.m(nd2, i2);
        ((C7272lK1) get(i)).b.l(AbstractC1683My3.b, z ? 0.8f : 1.0f);
    }

    public final void K(int i, boolean z) {
        if (i < 0 || i >= size()) {
            return;
        }
        int i2 = z ? 4 : 3;
        PropertyModel propertyModel = ((C7272lK1) get(i)).b;
        ND2 nd2 = AbstractC9627sA3.l;
        if (propertyModel.h(nd2) == i2) {
            return;
        }
        ((C7272lK1) get(i)).b.m(nd2, i2);
    }
}
