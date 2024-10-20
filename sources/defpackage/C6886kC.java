package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6886kC implements Lq4 {
    public final int a;

    @Override // defpackage.Lq4
    public final boolean a(int i, int i2, int i3) {
        int i4 = this.a;
        return i >= i2 - i4 && i <= i3 + i4;
    }

    @Override // defpackage.Lq4
    public final boolean b(int i, int i2, int i3) {
        int i4 = this.a;
        return !(i >= i2 - i4 && i <= i3 + i4);
    }

    public C6886kC(int i) {
        this.a = i;
    }
}
