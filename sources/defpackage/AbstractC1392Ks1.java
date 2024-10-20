package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ks1 */
/* loaded from: classes.dex */
public abstract class AbstractC1392Ks1 extends AbstractC1002Hs1 {
    public final int c = 0;
    public final int d;

    @Override // defpackage.AbstractC1002Hs1
    public int c(RecyclerView recyclerView, d dVar) {
        int i = this.c;
        int i2 = this.d;
        return (i << 8) | ((i | i2) << 0) | (i2 << 16);
    }

    public AbstractC1392Ks1(int i) {
        this.d = i;
    }
}
