package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ai2 */
/* loaded from: classes.dex */
public final class C0043Ai2 extends AbstractC0173Bi2 {
    public final AbstractC0173Bi2 a;
    public final DV0 b;
    public final boolean c = false;
    public final int d = Integer.MAX_VALUE;
    public final int e;

    public C0043Ai2(C1732Ni2 c1732Ni2, C11176wi2 c11176wi2, int i) {
        this.a = c1732Ni2;
        this.b = c11176wi2;
        this.e = i;
    }

    @Override // defpackage.AbstractC0173Bi2
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.AbstractC0173Bi2
    public final void b(InterfaceC0334Co3[] interfaceC0334Co3Arr) {
        if (c(interfaceC0334Co3Arr)) {
            int length = interfaceC0334Co3Arr.length;
            InterfaceC0334Co3[] interfaceC0334Co3Arr2 = new InterfaceC0334Co3[length];
            for (int i = 0; i < length; i++) {
                InterfaceC0334Co3 interfaceC0334Co3 = interfaceC0334Co3Arr[i];
                DV0 dv0 = this.b;
                boolean z = this.c;
                int i2 = this.d;
                int i3 = this.e;
                int i4 = EQ0.c;
                interfaceC0334Co3Arr2[i] = new DQ0(interfaceC0334Co3, dv0, z, i2, i3);
            }
            this.a.b(interfaceC0334Co3Arr2);
        }
    }
}
