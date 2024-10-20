package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n41 */
/* loaded from: classes.dex */
public final class C7874n41 extends AbstractC7482lw {
    public final String o;
    public final boolean p;
    public final C3487aJ1 q;
    public final C3487aJ1 r;
    public final RectF s;
    public final int t;
    public final int u;
    public final C5812h41 v;
    public final C2712Uw2 w;
    public final C2712Uw2 x;
    public J74 y;

    @Override // defpackage.AbstractC7482lw, defpackage.InterfaceC3345Zt0
    public final void g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.p) {
            return;
        }
        d(this.s, matrix, false);
        int i2 = this.t;
        C5812h41 c5812h41 = this.v;
        C2712Uw2 c2712Uw2 = this.x;
        C2712Uw2 c2712Uw22 = this.w;
        if (i2 == 1) {
            long i3 = i();
            C3487aJ1 c3487aJ1 = this.q;
            shader = (LinearGradient) c3487aJ1.d(i3);
            if (shader == null) {
                PointF pointF = (PointF) c2712Uw22.f();
                PointF pointF2 = (PointF) c2712Uw2.f();
                C5124f41 c5124f41 = (C5124f41) c5812h41.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(c5124f41.b), c5124f41.a, Shader.TileMode.CLAMP);
                c3487aJ1.i(i3, shader);
            }
        } else {
            long i4 = i();
            C3487aJ1 c3487aJ12 = this.r;
            shader = (RadialGradient) c3487aJ12.d(i4);
            if (shader == null) {
                PointF pointF3 = (PointF) c2712Uw22.f();
                PointF pointF4 = (PointF) c2712Uw2.f();
                C5124f41 c5124f412 = (C5124f41) c5812h41.f();
                int[] e = e(c5124f412.b);
                float[] fArr = c5124f412.a;
                shader = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), e, fArr, Shader.TileMode.CLAMP);
                c3487aJ12.i(i4, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.g(canvas, matrix, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7874n41(defpackage.JJ1 r14, defpackage.AbstractC11937yv r15, defpackage.C7530m41 r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.h
            r1 = 0
            if (r0 == 0) goto Lad
            int r0 = r0 + (-1)
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L18
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L18
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L18:
            r3 = r0
            int r0 = r12.i
            if (r0 == 0) goto Lac
            int r0 = r0 + (-1)
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L28
            r4 = r1
            goto L31
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L30
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L30
        L2e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L30:
            r4 = r0
        L31:
            float r5 = r12.j
            ib r6 = r12.d
            gb r7 = r12.g
            java.util.List r8 = r12.k
            gb r9 = r12.l
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            aJ1 r0 = new aJ1
            r0.<init>()
            r10.q = r0
            aJ1 r0 = new aJ1
            r0.<init>()
            r10.r = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.s = r0
            java.lang.String r0 = r12.a
            r10.o = r0
            int r0 = r12.b
            r10.t = r0
            boolean r0 = r12.m
            r10.p = r0
            r0 = r14
            qJ1 r0 = r0.g
            float r1 = r0.k
            float r2 = r0.j
            float r1 = r1 - r2
            float r0 = r0.l
            float r1 = r1 / r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            long r0 = (long) r1
            float r0 = (float) r0
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.u = r0
            hb r0 = r12.c
            wv r0 = r0.a()
            r1 = r0
            h41 r1 = (defpackage.C5812h41) r1
            r10.v = r1
            r0.a(r13)
            r15.e(r0)
            lb r0 = r12.e
            wv r0 = r0.a()
            r1 = r0
            Uw2 r1 = (defpackage.C2712Uw2) r1
            r10.w = r1
            r0.a(r13)
            r15.e(r0)
            lb r0 = r12.f
            wv r0 = r0.a()
            r1 = r0
            Uw2 r1 = (defpackage.C2712Uw2) r1
            r10.x = r1
            r0.a(r13)
            r15.e(r0)
            return
        Lac:
            throw r1
        Lad:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7874n41.<init>(JJ1, yv, m41):void");
    }

    @Override // defpackage.Z40
    public final String getName() {
        return this.o;
    }

    public final int i() {
        float f = this.w.d;
        float f2 = this.u;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.x.d * f2);
        int round3 = Math.round(this.v.d * f2);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    public final int[] e(int[] iArr) {
        J74 j74 = this.y;
        if (j74 != null) {
            Integer[] numArr = (Integer[]) j74.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.AbstractC7482lw, defpackage.InterfaceC9190qu1
    public final void f(TJ1 tj1, Object obj) {
        super.f(tj1, obj);
        if (obj == NJ1.F) {
            J74 j74 = this.y;
            AbstractC11937yv abstractC11937yv = this.f;
            if (j74 != null) {
                abstractC11937yv.n(j74);
            }
            if (tj1 != null) {
                J74 j742 = new J74(tj1, null);
                this.y = j742;
                j742.a(this);
                abstractC11937yv.e(this.y);
                return;
            }
            this.y = null;
        }
    }
}
