package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5663gf0 implements TE3 {
    public final int a;
    public final int g;
    public GN2 h;

    @Override // defpackage.GA1
    public final void a() {
    }

    @Override // defpackage.GA1
    public final void b() {
    }

    @Override // defpackage.TE3
    public final void h(InterfaceC11153we3 interfaceC11153we3) {
    }

    @Override // defpackage.TE3
    public void i(Drawable drawable) {
    }

    @Override // defpackage.TE3
    public final void k(Drawable drawable) {
    }

    @Override // defpackage.GA1
    public final void onDestroy() {
    }

    public AbstractC5663gf0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC5663gf0(int i, int i2) {
        if (!AbstractC10296u74.g(i, i2)) {
            throw new IllegalArgumentException(AbstractC0800Ge.a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2));
        }
        this.a = i;
        this.g = i2;
    }

    @Override // defpackage.TE3
    public final void c(InterfaceC11153we3 interfaceC11153we3) {
        ((C3133Yc3) interfaceC11153we3).m(this.a, this.g);
    }

    @Override // defpackage.TE3
    public final void e(GN2 gn2) {
        this.h = gn2;
    }

    @Override // defpackage.TE3
    public final GN2 l() {
        return this.h;
    }
}
