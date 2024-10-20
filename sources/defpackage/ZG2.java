package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZG2 {
    public final AbstractC0952Hi1 a;
    public final int b;
    public int c = -1;

    public ZG2(AbstractC0952Hi1 abstractC0952Hi1, int i) {
        this.b = 0;
        this.a = abstractC0952Hi1;
        this.b = i;
    }

    public final int a(int i, C4363cr3 c4363cr3) {
        C5050er3 c5050er3;
        C5050er3 c5050er32;
        if (c4363cr3.j == 6) {
            c5050er3 = (C5050er3) c4363cr3.k;
        } else {
            c5050er3 = C5050er3.p;
        }
        if (c5050er3.o.size() == 0) {
            return this.c;
        }
        if (c4363cr3.j == 6) {
            c5050er32 = (C5050er3) c4363cr3.k;
        } else {
            c5050er32 = C5050er3.p;
        }
        for (C4706dr3 c4706dr3 : c5050er32.o) {
            Iterator it = c4706dr3.j.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == i) {
                    C4014bq3 c4014bq3 = c4706dr3.k;
                    if (c4014bq3 == null) {
                        c4014bq3 = C4014bq3.l;
                    }
                    int i2 = c4014bq3.j;
                    int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 4 : 3 : 2 : 1;
                    if (i3 == 0) {
                        i3 = 5;
                    }
                    int b = AbstractC2373Sg3.b(i3);
                    if (b == 2) {
                        C4014bq3 c4014bq32 = c4706dr3.k;
                        if (c4014bq32 == null) {
                            c4014bq32 = C4014bq3.l;
                        }
                        String str = c4014bq32.k;
                        AbstractC0952Hi1 abstractC0952Hi1 = this.a;
                        if (abstractC0952Hi1.containsKey(str)) {
                            C4014bq3 c4014bq33 = c4706dr3.k;
                            if (c4014bq33 == null) {
                                c4014bq33 = C4014bq3.l;
                            }
                            this.c = ((Integer) abstractC0952Hi1.get(c4014bq33.k)).intValue();
                        }
                    } else if (b == 3) {
                        this.c = this.b;
                    }
                    return this.c;
                }
            }
        }
        return this.c;
    }
}
