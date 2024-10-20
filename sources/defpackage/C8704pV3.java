package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pV3 */
/* loaded from: classes.dex */
public final class C8704pV3 {
    public final Matrix a = new Matrix();
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC11251wv f;
    public AbstractC11251wv g;
    public AbstractC11251wv h;
    public AbstractC11251wv i;
    public AbstractC11251wv j;
    public C4552dQ0 k;
    public C4552dQ0 l;
    public AbstractC11251wv m;
    public AbstractC11251wv n;

    public C8704pV3(C9759sb c9759sb) {
        C6668jb c6668jb = c9759sb.a;
        this.f = c6668jb == null ? null : c6668jb.a();
        InterfaceC10445ub interfaceC10445ub = c9759sb.b;
        this.g = interfaceC10445ub == null ? null : interfaceC10445ub.a();
        C7700mb c7700mb = c9759sb.c;
        this.h = c7700mb == null ? null : c7700mb.a();
        C5638gb c5638gb = c9759sb.d;
        this.i = c5638gb == null ? null : c5638gb.a();
        C5638gb c5638gb2 = c9759sb.f;
        C4552dQ0 c4552dQ0 = c5638gb2 == null ? null : (C4552dQ0) c5638gb2.a();
        this.k = c4552dQ0;
        if (c4552dQ0 != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        C5638gb c5638gb3 = c9759sb.g;
        this.l = c5638gb3 == null ? null : (C4552dQ0) c5638gb3.a();
        C6326ib c6326ib = c9759sb.e;
        if (c6326ib != null) {
            this.j = c6326ib.a();
        }
        C5638gb c5638gb4 = c9759sb.h;
        if (c5638gb4 != null) {
            this.m = c5638gb4.a();
        } else {
            this.m = null;
        }
        C5638gb c5638gb5 = c9759sb.i;
        if (c5638gb5 != null) {
            this.n = c5638gb5.a();
        } else {
            this.n = null;
        }
    }

    public final void a(AbstractC11937yv abstractC11937yv) {
        abstractC11937yv.e(this.j);
        abstractC11937yv.e(this.m);
        abstractC11937yv.e(this.n);
        abstractC11937yv.e(this.f);
        abstractC11937yv.e(this.g);
        abstractC11937yv.e(this.h);
        abstractC11937yv.e(this.i);
        abstractC11937yv.e(this.k);
        abstractC11937yv.e(this.l);
    }

    public final void b(InterfaceC9536rv interfaceC9536rv) {
        AbstractC11251wv abstractC11251wv = this.j;
        if (abstractC11251wv != null) {
            abstractC11251wv.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv2 = this.m;
        if (abstractC11251wv2 != null) {
            abstractC11251wv2.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv3 = this.n;
        if (abstractC11251wv3 != null) {
            abstractC11251wv3.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv4 = this.f;
        if (abstractC11251wv4 != null) {
            abstractC11251wv4.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv5 = this.g;
        if (abstractC11251wv5 != null) {
            abstractC11251wv5.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv6 = this.h;
        if (abstractC11251wv6 != null) {
            abstractC11251wv6.a(interfaceC9536rv);
        }
        AbstractC11251wv abstractC11251wv7 = this.i;
        if (abstractC11251wv7 != null) {
            abstractC11251wv7.a(interfaceC9536rv);
        }
        C4552dQ0 c4552dQ0 = this.k;
        if (c4552dQ0 != null) {
            c4552dQ0.a(interfaceC9536rv);
        }
        C4552dQ0 c4552dQ02 = this.l;
        if (c4552dQ02 != null) {
            c4552dQ02.a(interfaceC9536rv);
        }
    }

    public final Matrix d() {
        float[] fArr;
        float l;
        Matrix matrix = this.a;
        matrix.reset();
        AbstractC11251wv abstractC11251wv = this.g;
        if (abstractC11251wv != null) {
            PointF pointF = (PointF) abstractC11251wv.f();
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(f, pointF.y);
            }
        }
        AbstractC11251wv abstractC11251wv2 = this.i;
        if (abstractC11251wv2 != null) {
            if (abstractC11251wv2 instanceof J74) {
                l = ((Float) abstractC11251wv2.f()).floatValue();
            } else {
                l = ((C4552dQ0) abstractC11251wv2).l();
            }
            if (l != 0.0f) {
                matrix.preRotate(l);
            }
        }
        if (this.k != null) {
            float cos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r2.l()) + 90.0f));
            float sin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(this.k.l()));
            int i = 0;
            while (true) {
                fArr = this.e;
                if (i >= 9) {
                    break;
                }
                fArr[i] = 0.0f;
                i++;
            }
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.b;
            matrix2.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                fArr[i2] = 0.0f;
            }
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.c;
            matrix3.setValues(fArr);
            for (int i3 = 0; i3 < 9; i3++) {
                fArr[i3] = 0.0f;
            }
            fArr[0] = cos;
            fArr[1] = f2;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        AbstractC11251wv abstractC11251wv3 = this.h;
        if (abstractC11251wv3 != null) {
            C11446xV2 c11446xV2 = (C11446xV2) abstractC11251wv3.f();
            float f3 = c11446xV2.a;
            if (f3 != 1.0f || c11446xV2.b != 1.0f) {
                matrix.preScale(f3, c11446xV2.b);
            }
        }
        AbstractC11251wv abstractC11251wv4 = this.f;
        if (abstractC11251wv4 != null) {
            PointF pointF2 = (PointF) abstractC11251wv4.f();
            float f4 = pointF2.x;
            if (f4 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(-f4, -pointF2.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        AbstractC11251wv abstractC11251wv = this.g;
        PointF pointF = abstractC11251wv == null ? null : (PointF) abstractC11251wv.f();
        AbstractC11251wv abstractC11251wv2 = this.h;
        C11446xV2 c11446xV2 = abstractC11251wv2 == null ? null : (C11446xV2) abstractC11251wv2.f();
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (c11446xV2 != null) {
            double d = f;
            matrix.preScale((float) Math.pow(c11446xV2.a, d), (float) Math.pow(c11446xV2.b, d));
        }
        AbstractC11251wv abstractC11251wv3 = this.i;
        if (abstractC11251wv3 != null) {
            float floatValue = ((Float) abstractC11251wv3.f()).floatValue();
            AbstractC11251wv abstractC11251wv4 = this.f;
            PointF pointF2 = abstractC11251wv4 != null ? (PointF) abstractC11251wv4.f() : null;
            matrix.preRotate(floatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final boolean c(TJ1 tj1, Object obj) {
        C4552dQ0 c4552dQ0;
        C4552dQ0 c4552dQ02;
        AbstractC11251wv abstractC11251wv;
        AbstractC11251wv abstractC11251wv2;
        if (obj == NJ1.e) {
            AbstractC11251wv abstractC11251wv3 = this.f;
            if (abstractC11251wv3 == null) {
                this.f = new J74(tj1, new PointF());
                return true;
            }
            abstractC11251wv3.k(tj1);
            return true;
        }
        if (obj == NJ1.f) {
            AbstractC11251wv abstractC11251wv4 = this.g;
            if (abstractC11251wv4 == null) {
                this.g = new J74(tj1, new PointF());
                return true;
            }
            abstractC11251wv4.k(tj1);
            return true;
        }
        if (obj == NJ1.g) {
            AbstractC11251wv abstractC11251wv5 = this.g;
            if (abstractC11251wv5 instanceof C1858Oh3) {
                C1858Oh3 c1858Oh3 = (C1858Oh3) abstractC11251wv5;
                TJ1 tj12 = c1858Oh3.m;
                c1858Oh3.m = tj1;
                return true;
            }
        }
        if (obj == NJ1.h) {
            AbstractC11251wv abstractC11251wv6 = this.g;
            if (abstractC11251wv6 instanceof C1858Oh3) {
                C1858Oh3 c1858Oh32 = (C1858Oh3) abstractC11251wv6;
                TJ1 tj13 = c1858Oh32.n;
                c1858Oh32.n = tj1;
                return true;
            }
        }
        if (obj == NJ1.m) {
            AbstractC11251wv abstractC11251wv7 = this.h;
            if (abstractC11251wv7 == null) {
                this.h = new J74(tj1, new C11446xV2());
                return true;
            }
            abstractC11251wv7.k(tj1);
            return true;
        }
        if (obj == NJ1.n) {
            AbstractC11251wv abstractC11251wv8 = this.i;
            if (abstractC11251wv8 == null) {
                this.i = new J74(tj1, Float.valueOf(0.0f));
                return true;
            }
            abstractC11251wv8.k(tj1);
            return true;
        }
        if (obj == NJ1.c) {
            AbstractC11251wv abstractC11251wv9 = this.j;
            if (abstractC11251wv9 == null) {
                this.j = new J74(tj1, 100);
                return true;
            }
            abstractC11251wv9.k(tj1);
            return true;
        }
        if (obj == NJ1.A && (abstractC11251wv2 = this.m) != null) {
            if (abstractC11251wv2 == null) {
                this.m = new J74(tj1, 100);
                return true;
            }
            abstractC11251wv2.k(tj1);
            return true;
        }
        if (obj == NJ1.B && (abstractC11251wv = this.n) != null) {
            if (abstractC11251wv == null) {
                this.n = new J74(tj1, 100);
                return true;
            }
            abstractC11251wv.k(tj1);
            return true;
        }
        if (obj == NJ1.o && (c4552dQ02 = this.k) != null) {
            if (c4552dQ02 == null) {
                this.k = new C4552dQ0(Collections.singletonList(new C12282zv1(Float.valueOf(0.0f))));
            }
            this.k.k(tj1);
            return true;
        }
        if (obj != NJ1.p || (c4552dQ0 = this.l) == null) {
            return false;
        }
        if (c4552dQ0 == null) {
            this.l = new C4552dQ0(Collections.singletonList(new C12282zv1(Float.valueOf(0.0f))));
        }
        this.l.k(tj1);
        return true;
    }
}
