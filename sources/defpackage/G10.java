package defpackage;

import java.util.ArrayList;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G10 extends IC {
    public final boolean k = true;
    public final ArrayList i = new ArrayList();
    public final F10 j = new Callback() { // from class: F10
        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            super/*IC*/.p(Integer.valueOf(G10.this.u()));
        }

        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [F10] */
    public G10(IC... icArr) {
        for (IC ic : icArr) {
            this.i.add(ic);
            ic.m(this.j);
        }
        super.p(Integer.valueOf(u()));
    }

    @Override // defpackage.IC, defpackage.C8385oa2
    /* renamed from: q */
    public final void p(Integer num) {
        if (this.k) {
            throw new IllegalStateException("Calling set on the composed delegate is not allowed.");
        }
        super.p(num);
    }

    public final int u() {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.i;
            boolean z2 = true;
            if (i >= arrayList.size()) {
                return z ? 1 : 3;
            }
            int intValue = ((Integer) ((IC) arrayList.get(i)).g).intValue();
            if (intValue == 2) {
                return 2;
            }
            if (intValue != 1) {
                z2 = false;
            }
            z |= z2;
            i++;
        }
    }
}
