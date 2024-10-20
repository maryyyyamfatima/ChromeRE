package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NB1 extends LinearLayoutManager {
    public NB1(int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final boolean F0() {
        if (this.p == 0) {
            return false;
        }
        return super.F0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC12077zK2
    public final AK2 s() {
        if (this.p == 1) {
            return new AK2(-1, -2);
        }
        return new AK2(-2, -1);
    }
}
