package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5130f51 implements InterfaceC3493aK2 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final MJ2 e;
    public final C4786e51 f;
    public final boolean g;
    public int h = Integer.MAX_VALUE;
    public int i = 1;

    public C5130f51(int i, int i2, boolean z, MJ2 mj2, C4786e51 c4786e51, int i3) {
        this.a = i;
        this.b = i2;
        this.d = z;
        this.e = mj2 == null ? C4443d51.h : mj2;
        this.g = false;
        this.f = c4786e51 == null ? C4443d51.i : c4786e51;
        this.c = i3;
    }

    @Override // defpackage.InterfaceC3493aK2
    public final AbstractC2368Sf3 d() {
        return AbstractC3148Yf3.b(this.c, this.h, this.i);
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
        this.f.getClass();
        return new Z41(this.b, this.a, this.d, this.g);
    }

    @Override // defpackage.InterfaceC3493aK2
    public final MJ2 a() {
        return this.e;
    }
}
