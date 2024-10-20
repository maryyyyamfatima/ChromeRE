package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uX0 */
/* loaded from: classes.dex */
public final class C10425uX0 {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC12077zK2 abstractC12077zK2 = recyclerView.s;
        if (recyclerView.r == null || abstractC12077zK2 == null || !abstractC12077zK2.i) {
            return;
        }
        if (z) {
            if (!recyclerView.j.g()) {
                abstractC12077zK2.j(recyclerView.r.q(), this);
            }
        } else if (!recyclerView.Q()) {
            abstractC12077zK2.i(this.a, this.b, recyclerView.n0, this);
        }
        int i = this.d;
        if (i > abstractC12077zK2.j) {
            abstractC12077zK2.j = i;
            abstractC12077zK2.k = z;
            recyclerView.h.m();
        }
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int[] iArr3 = new int[i3 * 2];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i3] = i;
        iArr4[i3 + 1] = i2;
        this.d++;
    }
}
