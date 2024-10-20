package defpackage;

import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QW1 extends SW1 {
    public final AbstractC10078tW1 b;
    public final AbstractC10078tW1 c;
    public final int[] d;
    public final int e;

    public QW1(AbstractC10078tW1 abstractC10078tW1, AbstractC10078tW1 abstractC10078tW12) {
        this.b = abstractC10078tW1;
        this.c = abstractC10078tW12;
        int d = abstractC10078tW12.d() + abstractC10078tW1.d();
        if (!(d <= 28)) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[d];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < d) {
            GW1 d2 = d(i);
            long j2 = d2.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (d2.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = d2.c ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // defpackage.SW1
    public final void c(BW1 bw1, C0102Au1 c0102Au1) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            GW1 d = d(i2 & 31);
            if (d.c) {
                bw1.b(d, new PW1(this, d, i2), c0102Au1);
            } else {
                AbstractC10078tW1 abstractC10078tW1 = this.b;
                int d2 = abstractC10078tW1.d();
                if (i2 >= d2) {
                    i2 -= d2;
                    abstractC10078tW1 = this.c;
                }
                bw1.a(d, d.b.cast(abstractC10078tW1.c(i2)), c0102Au1);
            }
        }
    }

    @Override // defpackage.SW1
    public final int a() {
        return this.e;
    }

    @Override // defpackage.SW1
    public final Set b() {
        return new OW1(this);
    }

    public final GW1 d(int i) {
        AbstractC10078tW1 abstractC10078tW1 = this.b;
        int d = abstractC10078tW1.d();
        if (i >= d) {
            abstractC10078tW1 = this.c;
            i -= d;
        }
        return abstractC10078tW1.b(i);
    }
}
