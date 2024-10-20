package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4766e2 implements InterfaceC9646sE2 {
    public final C5454g2 a;
    public final int g;
    public final int h;
    public final int i;
    public final C10502uk2 j;

    public C4766e2(C5454g2 c5454g2, int i, int i2, int i3, C10502uk2 c10502uk2) {
        this.a = c5454g2;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = c10502uk2;
    }

    @Override // defpackage.InterfaceC9646sE2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(int i, C1012Hu1 c1012Hu1) {
        C5110f2[] c5110f2Arr;
        if (c1012Hu1 == null) {
            c5110f2Arr = new C5110f2[0];
        } else {
            ArrayList arrayList = new ArrayList();
            final C1402Ku1 c1402Ku1 = c1012Hu1.d;
            if (c1402Ku1 != null) {
                C10502uk2 c10502uk2 = this.j;
                boolean z = c1402Ku1.b;
                c10502uk2.a(z);
                arrayList.add(new C5110f2(8, new C1402Ku1(c1402Ku1.a, z, c1402Ku1.d, new Callback() { // from class: d2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        Boolean bool = (Boolean) obj;
                        C4766e2 c4766e2 = C4766e2.this;
                        c4766e2.getClass();
                        C1402Ku1 c1402Ku12 = c1402Ku1;
                        EI2.h(c1402Ku12.d == 6 ? !c1402Ku12.b ? 1 : 0 : 2, 2, "KeyboardAccessory.AccessoryToggleClicked");
                        int i2 = 0;
                        while (true) {
                            C5454g2 c5454g2 = c4766e2.a;
                            if (i2 >= c5454g2.size()) {
                                break;
                            }
                            C5110f2 c5110f2 = (C5110f2) c5454g2.get(i2);
                            if (c5110f2.b == 8) {
                                C1402Ku1 c1402Ku13 = (C1402Ku1) c5110f2.a;
                                c5454g2.B(i2, new C5110f2(8, new C1402Ku1(c1402Ku13.a, !c1402Ku13.b, c1402Ku13.d, c1402Ku13.c)));
                                break;
                            }
                            i2++;
                        }
                        c4766e2.j.a(bool.booleanValue());
                        c1402Ku12.c.onResult(bool);
                    }
                })));
            }
            Iterator it = c1012Hu1.f.iterator();
            while (it.hasNext()) {
                arrayList.add(new C5110f2(9, (C1531Lu1) it.next()));
            }
            ArrayList arrayList2 = c1012Hu1.e;
            C7928nE c7928nE = UN.a;
            if (!N.M09VlOh_("AutofillKeyboardAccessory") || arrayList2.isEmpty()) {
                arrayList.add(new C5110f2(1, c1012Hu1.a));
            }
            String str = c1012Hu1.b;
            if (!str.isEmpty()) {
                arrayList.add(new C5110f2(7, str));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C5110f2(this.h, (C1791Nu1) it2.next()));
            }
            Iterator it3 = c1012Hu1.g.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C5110f2(6, (C1272Ju1) it3.next()));
            }
            c5110f2Arr = (C5110f2[]) arrayList.toArray(new C5110f2[0]);
        }
        C5454g2 c5454g2 = this.a;
        c5454g2.getClass();
        c5454g2.A(Arrays.asList(c5110f2Arr));
    }
}
