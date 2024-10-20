package defpackage;

import com.google.android.libraries.elements.converters.j;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xx0 */
/* loaded from: classes.dex */
public final class C11606xx0 extends TZ {
    public j i;
    public final String[] j = {"child"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (j) wz;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
