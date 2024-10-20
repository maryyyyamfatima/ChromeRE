package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ns3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8150ns3 extends AbstractC10430uY0 {
    public int a;
    public float b;
    public float c;
    public final /* synthetic */ AbstractC9180qs3 d;

    @Override // defpackage.AbstractC10430uY0
    public final void a(int i, int i2) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        if (abstractC9180qs3.i != 2) {
            return;
        }
        abstractC9180qs3.i = 0;
        i(i, i2);
        boolean z = i > this.a;
        boolean z2 = this.b < ((float) abstractC9180qs3.m);
        float translationY = abstractC9180qs3.getTranslationY();
        float f = abstractC9180qs3.m;
        abstractC9180qs3.d((!z && (((1.0f - (translationY / f)) > (z2 ? 0.9f : 0.2f) ? 1 : ((1.0f - (translationY / f)) == (z2 ? 0.9f : 0.2f) ? 0 : -1)) > 0)) || ((((float) i) > (f * 0.5f) ? 1 : (((float) i) == (f * 0.5f) ? 0 : -1)) < 0));
    }

    @Override // defpackage.AbstractC10430uY0
    public final void c(int i, int i2) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        if (abstractC9180qs3.i != 1) {
            return;
        }
        abstractC9180qs3.i = 0;
        i(i, i2);
        abstractC9180qs3.d(abstractC9180qs3.f(i));
    }

    public final void h(int i, int i2) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        abstractC9180qs3.l = i;
        this.c = i2;
        this.b = abstractC9180qs3.getTranslationY();
    }

    public final void i(int i, int i2) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        float b = JM1.b(this.b + (i2 - this.c) + (i - abstractC9180qs3.l), abstractC9180qs3.m, 0.0f);
        if (b <= 0.0f) {
            h(i, i2);
        }
        abstractC9180qs3.setTranslationY(b);
    }

    public C8150ns3(AbstractC9180qs3 abstractC9180qs3) {
        this.d = abstractC9180qs3;
    }

    @Override // defpackage.AbstractC10430uY0
    public final void b(int i, int i2) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        ((C0967Hl1) abstractC9180qs3).getClass();
        if (C0967Hl1.w && abstractC9180qs3.a()) {
            h(i, i2);
            abstractC9180qs3.i = 2;
        }
    }

    @Override // defpackage.AbstractC10430uY0
    public final void d(int i, int i2, boolean z) {
        AbstractC9180qs3 abstractC9180qs3 = this.d;
        ((C0967Hl1) abstractC9180qs3).getClass();
        if (C0967Hl1.w && abstractC9180qs3.a()) {
            h(i, i2);
            this.a = i;
            abstractC9180qs3.i = 1;
        }
    }
}
