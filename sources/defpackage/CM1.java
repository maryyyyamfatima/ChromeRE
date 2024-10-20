package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CM1 extends Drawable.ConstantState {
    public S53 a;
    public C2720Uy0 b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public final float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public final int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public final Paint.Style u;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public CM1(S53 s53) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = s53;
        this.b = null;
    }

    public CM1(CM1 cm1) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = cm1.a;
        this.b = cm1.b;
        this.k = cm1.k;
        this.c = cm1.c;
        this.d = cm1.d;
        this.g = cm1.g;
        this.f = cm1.f;
        this.l = cm1.l;
        this.i = cm1.i;
        this.r = cm1.r;
        this.p = cm1.p;
        this.t = cm1.t;
        this.j = cm1.j;
        this.m = cm1.m;
        this.n = cm1.n;
        this.o = cm1.o;
        this.q = cm1.q;
        this.s = cm1.s;
        this.e = cm1.e;
        this.u = cm1.u;
        if (cm1.h != null) {
            this.h = new Rect(cm1.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        DM1 dm1 = new DM1(this);
        dm1.j = true;
        return dm1;
    }
}
