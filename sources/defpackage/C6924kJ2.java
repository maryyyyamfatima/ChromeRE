package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kJ2 */
/* loaded from: classes.dex */
public final class C6924kJ2 implements J00 {
    public final /* synthetic */ O00 a;
    public final /* synthetic */ KJ2 b;

    public C6924kJ2(KJ2 kj2, O00 o00) {
        this.b = kj2;
        this.a = o00;
    }

    @Override // defpackage.J00
    public final void a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        O00 o00 = this.a;
        synchronized (o00) {
            i3 = o00.r;
        }
        if (i3 == i2) {
            return;
        }
        O00 o002 = this.a;
        synchronized (o002) {
            o002.r = i2;
        }
        KJ2 kj2 = this.b;
        if (kj2.a0 == null) {
            i4 = -1;
        } else if (kj2.d.p() == 0) {
            i4 = kj2.a0.b;
        } else {
            i4 = kj2.a0.a;
        }
        if (i4 != -1) {
            O00 o003 = this.a;
            synchronized (o003) {
                i5 = o003.r;
            }
            if (i5 <= i4) {
                return;
            }
        }
        synchronized (this.b) {
            KJ2.w(this.b, i);
            this.b.k0();
        }
    }
}
