package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C12282zv1 {
    public final C8985qJ1 a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public C12282zv1(C8985qJ1 c8985qJ1, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c8985qJ1;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public C12282zv1(C8985qJ1 c8985qJ1, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c8985qJ1;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = null;
    }

    public C12282zv1(C8985qJ1 c8985qJ1, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = c8985qJ1;
        this.b = pointF;
        this.c = pointF2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public C12282zv1(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float b() {
        C8985qJ1 c8985qJ1 = this.a;
        if (c8985qJ1 == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            float f = c8985qJ1.j;
            this.m = (this.g - f) / (c8985qJ1.k - f);
        }
        return this.m;
    }

    public final float a() {
        C8985qJ1 c8985qJ1 = this.a;
        if (c8985qJ1 == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                this.n = ((this.h.floatValue() - this.g) / (c8985qJ1.k - c8985qJ1.j)) + b();
            }
        }
        return this.n;
    }

    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        Float f = this.h;
        String valueOf3 = String.valueOf(this.d);
        StringBuilder a = AbstractC10975w63.a("Keyframe{startValue=", valueOf, ", endValue=", valueOf2, ", startFrame=");
        a.append(this.g);
        a.append(", endFrame=");
        a.append(f);
        a.append(", interpolator=");
        return Y5.a(a, valueOf3, "}");
    }
}
