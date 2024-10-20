package defpackage;

import android.util.Pair;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SB0 implements DV0 {
    public final AbstractC0952Hi1 a;

    @Override // defpackage.DV0
    public final Object apply(Object obj) {
        C0822Gi1 a = AbstractC0952Hi1.a();
        for (Object obj2 : (Object[]) obj) {
            Pair pair = (Pair) obj2;
            String str = (String) pair.first;
            a.b(str, (byte[]) ((AbstractC9095qe2) pair.second).d((byte[]) this.a.get(str)));
        }
        return a.a(true);
    }

    public SB0(TL2 tl2) {
        this.a = tl2;
    }
}
