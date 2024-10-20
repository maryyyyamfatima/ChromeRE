package defpackage;

import android.util.Pair;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Go4 extends Pair {
    public Go4(C6751jo4 c6751jo4, C6751jo4 c6751jo42) {
        super(c6751jo4, c6751jo42);
    }

    @Override // android.util.Pair
    public final int hashCode() {
        Object obj = ((Pair) this).first;
        int hashCode = ((obj == null ? 0 : ((C6751jo4) obj).hashCode()) + 31) * 31;
        Object obj2 = ((Pair) this).second;
        return hashCode + (obj2 != null ? ((C6751jo4) obj2).hashCode() : 0);
    }
}
