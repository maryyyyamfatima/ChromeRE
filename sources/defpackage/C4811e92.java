package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e92 */
/* loaded from: classes.dex */
public final class C4811e92 extends X82 {
    public final Iterable a;
    public final DV0 g;
    public final int h;

    public C4811e92(ArrayList arrayList, DV0 dv0, int i) {
        this.a = arrayList;
        this.g = dv0;
        this.h = i;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        InterfaceC7353la2[] interfaceC7353la2Arr = new X82[8];
        int i = 0;
        for (InterfaceC7353la2 interfaceC7353la2 : this.a) {
            if (i == interfaceC7353la2Arr.length) {
                InterfaceC7353la2[] interfaceC7353la2Arr2 = new InterfaceC7353la2[(i >> 2) + i];
                System.arraycopy(interfaceC7353la2Arr, 0, interfaceC7353la2Arr2, 0, i);
                interfaceC7353la2Arr = interfaceC7353la2Arr2;
            }
            interfaceC7353la2Arr[i] = interfaceC7353la2;
            i++;
        }
        if (i == 0) {
            interfaceC11128wa2.c(EnumC7565mA0.INSTANCE);
            interfaceC11128wa2.b();
            return;
        }
        C4468d92 c4468d92 = new C4468d92(i, this.h, interfaceC11128wa2, this.g);
        C4124c92[] c4124c92Arr = c4468d92.h;
        int length = c4124c92Arr.length;
        c4468d92.a.c(c4468d92);
        for (int i2 = 0; i2 < length && !c4468d92.m && !c4468d92.l; i2++) {
            interfaceC7353la2Arr[i2].a(c4124c92Arr[i2]);
        }
    }
}
