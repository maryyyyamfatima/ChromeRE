package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hd4 */
/* loaded from: classes.dex */
public final class C5999hd4 extends DK2 {
    public final C8748pd4 a;
    public RecyclerView j;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public int k = 0;

    public C5999hd4(C8748pd4 c8748pd4) {
        this.a = c8748pd4;
    }

    @Override // defpackage.DK2
    public final void r(int i, RecyclerView recyclerView) {
        int i2;
        if (i != this.k) {
            C8748pd4 c8748pd4 = this.a;
            if (i == 0 && ((i2 = this.g) != 0 || this.h != 0)) {
                c8748pd4.d(i2, this.h);
                this.g = 0;
                this.h = 0;
            } else if (i == 1) {
                c8748pd4.g();
            }
        }
        this.k = i;
    }

    @Override // defpackage.DK2
    public final void s(RecyclerView recyclerView, int i, int i2) {
        this.g += i;
        this.h += i2;
    }
}
