package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ND1 implements InterfaceC3493aK2 {
    public final int a;
    public final boolean b;
    public final int c;
    public final MJ2 d;
    public final MD1 e;
    public int f = Integer.MAX_VALUE;
    public int g = 1;

    public ND1(int i, boolean z, int i2, MJ2 mj2, MD1 md1) {
        if (i == 1 && i2 != Integer.MIN_VALUE && i2 != -1) {
            throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
        }
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = mj2 == null ? LD1.f : mj2;
        this.e = md1 == null ? LD1.g : md1;
    }

    @Override // defpackage.InterfaceC3493aK2
    public final AbstractC2368Sf3 d() {
        return AbstractC3148Yf3.b(this.c, this.f, this.g);
    }

    @Override // defpackage.InterfaceC3493aK2
    public final int b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3493aK2
    public final int c() {
        return this.a;
    }

    @Override // defpackage.InterfaceC3493aK2
    public final InterfaceC4058by1 e(C7849n00 c7849n00) {
        this.e.getClass();
        return new PB1(this.a, this.b);
    }

    @Override // defpackage.InterfaceC3493aK2
    public final MJ2 a() {
        return this.d;
    }
}
