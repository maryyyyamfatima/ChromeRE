package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oi2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862Oi2 extends PV3 {
    public final ArrayList b = new ArrayList();

    public C1862Oi2(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            PV3 pv3 = (PV3) arrayList.get(i);
            boolean z = pv3 instanceof MV3;
            ArrayList arrayList2 = this.b;
            if (z) {
                MV3 mv3 = (MV3) pv3;
                mv3.a();
                ArrayList arrayList3 = mv3.b;
                if (arrayList3.size() > 1) {
                    arrayList2.add(new C1862Oi2(arrayList3));
                } else {
                    arrayList2.add((PV3) arrayList3.get(0));
                }
            } else if (pv3 != null) {
                arrayList2.add(pv3);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }
}
