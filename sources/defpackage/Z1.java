package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z1 implements VD2 {
    public final PropertyModel a;
    public final Y1 g = new Y1(this);

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        C5454g2 c5454g2;
        FD2 fd2 = (FD2) obj;
        LD2 ld2 = AbstractC3736b2.c;
        if (fd2 != ld2 || !this.a.j(ld2) || a() == null || a().g == null) {
            return;
        }
        C4766e2 a = a().g.a();
        int i = 0;
        int i2 = 0;
        while (true) {
            c5454g2 = a.a;
            if (i >= c5454g2.size()) {
                break;
            }
            if (((C5110f2) c5454g2.get(i)).b == 2 || ((C5110f2) c5454g2.get(i)).b == 3 || ((C5110f2) c5454g2.get(i)).b == 4) {
                Iterator it = ((C1791Nu1) ((C5110f2) c5454g2.get(i)).a).c.iterator();
                while (it.hasNext()) {
                    if (((UserInfoField) it.next()).isSelectable()) {
                        i2++;
                    }
                }
            } else if (((C5110f2) c5454g2.get(i)).b == 9) {
                i2++;
            }
            i++;
        }
        int i3 = a.g;
        EI2.d(i2, DL1.a(i3, "KeyboardAccessory.AccessorySheetSuggestionCount"));
        if (i3 != 0) {
            EI2.d(i2, DL1.a(0, "KeyboardAccessory.AccessorySheetSuggestionCount"));
        }
        EI2.h(a.i, 8, "KeyboardAccessory.AccessoryActionImpression");
        for (int i4 = 0; i4 < c5454g2.size(); i4++) {
            C5110f2 c5110f2 = (C5110f2) c5454g2.get(i4);
            if (c5110f2.b == 8) {
                C1402Ku1 c1402Ku1 = (C1402Ku1) c5110f2.a;
                EI2.h(c1402Ku1.d == 6 ? !c1402Ku1.b ? 1 : 0 : 2, 2, "KeyboardAccessory.AccessoryToggleImpression");
            }
        }
    }

    public Z1(PropertyModel propertyModel) {
        this.a = propertyModel;
        propertyModel.a(this);
    }

    public final C1661Mu1 a() {
        ND2 nd2 = AbstractC3736b2.b;
        PropertyModel propertyModel = this.a;
        if (propertyModel.h(nd2) == -1) {
            return null;
        }
        return (C1661Mu1) ((C5175fD1) propertyModel.i(AbstractC3736b2.a)).get(propertyModel.h(nd2));
    }
}
