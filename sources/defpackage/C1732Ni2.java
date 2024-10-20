package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ni2 */
/* loaded from: classes.dex */
public final class C1732Ni2 extends AbstractC0173Bi2 {
    public final AbstractC0173Bi2 a;
    public final AbstractC10422uW2 b;
    public final int c;

    public C1732Ni2(C0563Ei2 c0563Ei2, AbstractC10422uW2 abstractC10422uW2, int i) {
        this.a = c0563Ei2;
        this.b = abstractC10422uW2;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0173Bi2
    public final void b(InterfaceC0334Co3[] interfaceC0334Co3Arr) {
        if (c(interfaceC0334Co3Arr)) {
            int length = interfaceC0334Co3Arr.length;
            InterfaceC0334Co3[] interfaceC0334Co3Arr2 = new InterfaceC0334Co3[length];
            AbstractC10422uW2 abstractC10422uW2 = this.b;
            if (abstractC10422uW2 instanceof BW2) {
                ((BW2) abstractC10422uW2).a(length, new C1343Ki2(this, interfaceC0334Co3Arr, interfaceC0334Co3Arr2));
            } else {
                for (int i = 0; i < length; i++) {
                    d(i, interfaceC0334Co3Arr, interfaceC0334Co3Arr2, abstractC10422uW2.b());
                }
            }
            this.a.b(interfaceC0334Co3Arr2);
        }
    }

    public final void d(int i, InterfaceC0334Co3[] interfaceC0334Co3Arr, InterfaceC0334Co3[] interfaceC0334Co3Arr2, AbstractC10079tW2 abstractC10079tW2) {
        InterfaceC0334Co3 interfaceC0334Co3 = interfaceC0334Co3Arr[i];
        int i2 = this.c;
        C7058ki3 c7058ki3 = new C7058ki3(i2);
        if (interfaceC0334Co3 instanceof AbstractC3359Zw) {
            interfaceC0334Co3Arr2[i] = new C1473Li2((AbstractC3359Zw) interfaceC0334Co3, i2, c7058ki3, abstractC10079tW2);
        } else {
            interfaceC0334Co3Arr2[i] = new C1602Mi2(interfaceC0334Co3, i2, c7058ki3, abstractC10079tW2);
        }
    }

    @Override // defpackage.AbstractC0173Bi2
    public final int a() {
        return this.a.a();
    }
}
