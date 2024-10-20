package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M20 implements BW2 {
    public final int a;
    public final N20[] b;
    public long c;

    public M20(int i, ThreadFactory threadFactory) {
        this.a = i;
        this.b = new N20[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.b[i2] = new N20(threadFactory);
        }
    }

    public final N20 b() {
        int i = this.a;
        if (i == 0) {
            return O20.f;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.b[(int) (j % i)];
    }

    @Override // defpackage.BW2
    public final void a(int i, C1343Ki2 c1343Ki2) {
        C1732Ni2 c1732Ni2 = c1343Ki2.c;
        InterfaceC0334Co3[] interfaceC0334Co3Arr = c1343Ki2.b;
        InterfaceC0334Co3[] interfaceC0334Co3Arr2 = c1343Ki2.a;
        int i2 = this.a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                c1732Ni2.d(i3, interfaceC0334Co3Arr2, interfaceC0334Co3Arr, O20.f);
            }
            return;
        }
        int i4 = ((int) this.c) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            c1732Ni2.d(i5, interfaceC0334Co3Arr2, interfaceC0334Co3Arr, new L20(this.b[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.c = i4;
    }
}
