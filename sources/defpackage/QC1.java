package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QC1 implements InterfaceC11007wC1 {
    public final C0351Cs0 a;
    public InterfaceC11007wC1 b;

    public QC1(C0351Cs0 c0351Cs0) {
        this.a = c0351Cs0;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final InterfaceC11007wC1 a(InterfaceC11007wC1 interfaceC11007wC1) {
        this.b = interfaceC11007wC1;
        return interfaceC11007wC1;
    }

    @Override // defpackage.InterfaceC11007wC1
    public final void b(ArrayList arrayList) {
        if (this.a.d) {
            int i = 0;
            while (i < arrayList.size()) {
                OC1 oc1 = (OC1) arrayList.get(i);
                if ((oc1 instanceof KC1) && ((KC1) oc1).e.i == 3) {
                    OC1 oc12 = i == 0 ? null : (OC1) arrayList.get(i - 1);
                    OC1 oc13 = i < arrayList.size() - 1 ? (OC1) arrayList.get(i + 1) : null;
                    boolean z = (oc12 instanceof KC1) && ((KC1) oc12).e.i == 3;
                    boolean z2 = (oc13 instanceof KC1) && ((KC1) oc13).e.i == 3;
                    if (!z && !z2) {
                        ((KC1) oc1).f = true;
                    }
                }
                i++;
            }
        }
        this.b.b(arrayList);
    }
}
