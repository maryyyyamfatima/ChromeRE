package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SI3 extends AbstractC11937yv {
    public final RI3 A;
    public final HashMap B;
    public final C3487aJ1 C;
    public final PI3 D;
    public final JJ1 E;
    public final C8985qJ1 F;
    public final DW G;
    public J74 H;
    public final DW I;

    /* renamed from: J */
    public J74 f11468J;
    public final C4552dQ0 K;
    public J74 L;
    public final C4552dQ0 M;
    public J74 N;
    public J74 O;
    public J74 P;
    public final StringBuilder w;
    public final RectF x;
    public final Matrix y;
    public final QI3 z;

    public SI3(JJ1 jj1, C2456Sx1 c2456Sx1) {
        super(jj1, c2456Sx1);
        C5638gb c5638gb;
        C5638gb c5638gb2;
        C5294fb c5294fb;
        C5294fb c5294fb2;
        this.w = new StringBuilder(2);
        this.x = new RectF();
        this.y = new Matrix();
        this.z = new QI3();
        this.A = new RI3();
        this.B = new HashMap();
        this.C = new C3487aJ1();
        this.E = jj1;
        this.F = c2456Sx1.b;
        PI3 pi3 = new PI3(c2456Sx1.q.a);
        this.D = pi3;
        pi3.a(this);
        e(pi3);
        C9074qb c9074qb = c2456Sx1.r;
        if (c9074qb != null && (c5294fb2 = c9074qb.a) != null) {
            AbstractC11251wv a = c5294fb2.a();
            this.G = (DW) a;
            a.a(this);
            e(a);
        }
        if (c9074qb != null && (c5294fb = c9074qb.b) != null) {
            AbstractC11251wv a2 = c5294fb.a();
            this.I = (DW) a2;
            a2.a(this);
            e(a2);
        }
        if (c9074qb != null && (c5638gb2 = c9074qb.c) != null) {
            AbstractC11251wv a3 = c5638gb2.a();
            this.K = (C4552dQ0) a3;
            a3.a(this);
            e(a3);
        }
        if (c9074qb == null || (c5638gb = c9074qb.d) == null) {
            return;
        }
        AbstractC11251wv a4 = c5638gb.a();
        this.M = (C4552dQ0) a4;
        a4.a(this);
        e(a4);
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC3345Zt0
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        C8985qJ1 c8985qJ1 = this.F;
        rectF.set(0.0f, 0.0f, c8985qJ1.i.width(), c8985qJ1.i.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0434  */
    @Override // defpackage.AbstractC11937yv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.graphics.Canvas r33, android.graphics.Matrix r34, int r35) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SI3.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public static void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    @Override // defpackage.AbstractC11937yv, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        if (obj == NJ1.a) {
            J74 j74 = this.H;
            if (j74 != null) {
                n(j74);
            }
            if (tj1 == null) {
                this.H = null;
                return;
            }
            J74 j742 = new J74(tj1, null);
            this.H = j742;
            j742.a(this);
            e(this.H);
            return;
        }
        if (obj == NJ1.b) {
            J74 j743 = this.f11468J;
            if (j743 != null) {
                n(j743);
            }
            if (tj1 == null) {
                this.f11468J = null;
                return;
            }
            J74 j744 = new J74(tj1, null);
            this.f11468J = j744;
            j744.a(this);
            e(this.f11468J);
            return;
        }
        if (obj == NJ1.q) {
            J74 j745 = this.L;
            if (j745 != null) {
                n(j745);
            }
            if (tj1 == null) {
                this.L = null;
                return;
            }
            J74 j746 = new J74(tj1, null);
            this.L = j746;
            j746.a(this);
            e(this.L);
            return;
        }
        if (obj == NJ1.r) {
            J74 j747 = this.N;
            if (j747 != null) {
                n(j747);
            }
            if (tj1 == null) {
                this.N = null;
                return;
            }
            J74 j748 = new J74(tj1, null);
            this.N = j748;
            j748.a(this);
            e(this.N);
            return;
        }
        if (obj == NJ1.D) {
            J74 j749 = this.O;
            if (j749 != null) {
                n(j749);
            }
            if (tj1 == null) {
                this.O = null;
                return;
            }
            J74 j7410 = new J74(tj1, null);
            this.O = j7410;
            j7410.a(this);
            e(this.O);
            return;
        }
        if (obj == NJ1.G) {
            J74 j7411 = this.P;
            if (j7411 != null) {
                n(j7411);
            }
            if (tj1 == null) {
                this.P = null;
                return;
            }
            J74 j7412 = new J74(tj1, null);
            this.P = j7412;
            j7412.a(this);
            e(this.P);
        }
    }
}
