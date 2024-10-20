package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ky3 */
/* loaded from: classes.dex */
public final class C7153ky3 extends AbstractC4099c51 {
    public final /* synthetic */ GridLayoutManager c;
    public final /* synthetic */ C1553Ly3 d;

    @Override // defpackage.AbstractC4099c51
    public final int c(int i) {
        int i2 = ((C7272lK1) this.d.e.get(i)).a;
        if (i2 == 3 || i2 == 6) {
            return this.c.F;
        }
        return 1;
    }

    public C7153ky3(C1553Ly3 c1553Ly3, GridLayoutManager gridLayoutManager) {
        this.d = c1553Ly3;
        this.c = gridLayoutManager;
    }
}
