package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4443d51 implements ZJ2 {
    public static final MJ2 h = new LJ2().a();
    public static final C4786e51 i = new C4786e51();
    public int a = 1;
    public int b = 2;
    public boolean c = false;
    public MJ2 d = h;
    public final C4786e51 e = i;
    public int f = 1;
    public int g = Integer.MIN_VALUE;

    @Override // defpackage.ZJ2
    public final ZJ2 a(MJ2 mj2) {
        this.d = mj2;
        return this;
    }

    @Override // defpackage.ZJ2
    public final InterfaceC3493aK2 build() {
        int i2;
        int i3 = this.a;
        C5130f51 c5130f51 = new C5130f51(i3, this.b, this.c, this.d, this.e, this.g);
        c5130f51.h = Integer.MAX_VALUE;
        c5130f51.i = this.f;
        if (i3 != 1 || (i2 = c5130f51.c) == Integer.MIN_VALUE || i2 == -1) {
            return c5130f51;
        }
        throw new UnsupportedOperationException("Only snap to start is implemented for vertical lists");
    }
}
