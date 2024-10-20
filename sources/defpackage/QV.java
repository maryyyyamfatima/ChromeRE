package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QV {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public float f11462J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final View a;
    public float a0;
    public float b;
    public float b0;
    public final Rect c;
    public CharSequence c0;
    public final Rect d;
    public final RectF e;
    public ColorStateList j;
    public ColorStateList k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public JF y;
    public int f = 16;
    public int g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt z = TextUtils.TruncateAt.END;
    public final boolean D = true;
    public final int d0 = 1;
    public final float e0 = 1.0f;
    public final int f0 = 1;

    public QV(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            h(false);
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final boolean j(Typeface typeface) {
        JF jf = this.y;
        if (jf != null) {
            jf.c = true;
        }
        if (this.t == typeface) {
            return false;
        }
        this.t = typeface;
        Typeface a = KZ3.a(this.a.getContext().getResources().getConfiguration(), typeface);
        this.s = a;
        if (a == null) {
            a = this.t;
        }
        this.r = a;
        return true;
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.t;
            if (typeface != null) {
                this.s = KZ3.a(configuration, typeface);
            }
            Typeface typeface2 = this.w;
            if (typeface2 != null) {
                this.v = KZ3.a(configuration, typeface2);
            }
            Typeface typeface3 = this.s;
            if (typeface3 == null) {
                typeface3 = this.t;
            }
            this.r = typeface3;
            Typeface typeface4 = this.v;
            if (typeface4 == null) {
                typeface4 = this.w;
            }
            this.u = typeface4;
            h(true);
        }
    }

    public final void k(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.b) {
            this.b = f;
            float f2 = this.c.left;
            Rect rect = this.d;
            float f3 = f(f2, rect.left, f, this.P);
            RectF rectF = this.e;
            rectF.left = f3;
            rectF.top = f(this.l, this.m, f, this.P);
            rectF.right = f(r1.right, rect.right, f, this.P);
            rectF.bottom = f(r1.bottom, rect.bottom, f, this.P);
            this.p = f(this.n, this.o, f, this.P);
            this.q = f(this.l, this.m, f, this.P);
            l(f);
            HH0 hh0 = AbstractC0270Cc.b;
            this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, hh0);
            WeakHashMap weakHashMap = Ec4.a;
            View view = this.a;
            view.postInvalidateOnAnimation();
            this.b0 = f(1.0f, 0.0f, f, hh0);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f4 = this.V;
            float f5 = this.W;
            if (f4 != f5) {
                textPaint.setLetterSpacing(f(f5, f4, f, hh0));
            } else {
                textPaint.setLetterSpacing(f4);
            }
            this.H = f(0.0f, this.R, f, null);
            this.I = f(0.0f, this.S, f, null);
            this.f11462J = f(0.0f, this.T, f, null);
            int a = a(f, e(null), e(this.U));
            this.K = a;
            textPaint.setShadowLayer(this.H, this.I, this.f11462J, a);
            view.postInvalidateOnAnimation();
        }
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final boolean b(CharSequence charSequence) {
        EH3 eh3;
        WeakHashMap weakHashMap = Ec4.a;
        boolean z = this.a.getLayoutDirection() == 1;
        if (!this.D) {
            return z;
        }
        if (z) {
            eh3 = GH3.d;
        } else {
            eh3 = GH3.c;
        }
        return eh3.b(charSequence, charSequence.length());
    }

    public final void l(float f) {
        c(f, false);
        WeakHashMap weakHashMap = Ec4.a;
        this.a.postInvalidateOnAnimation();
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.c.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.i;
            f3 = this.V;
            this.F = 1.0f;
            typeface = this.r;
        } else {
            float f4 = this.h;
            float f5 = this.W;
            Typeface typeface2 = this.u;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f, this.Q) / this.h;
            }
            float f6 = this.i / this.h;
            width = (!z && width2 * f6 > width) ? Math.min(width / f6, width2) : width2;
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > 0.0f) {
            boolean z3 = this.G != f2;
            boolean z4 = this.X != f3;
            boolean z5 = this.x != typeface;
            StaticLayout staticLayout2 = this.Y;
            boolean z6 = z3 || z4 || (staticLayout2 != null && (width > ((float) staticLayout2.getWidth()) ? 1 : (width == ((float) staticLayout2.getWidth()) ? 0 : -1)) != 0) || z5 || this.M;
            this.G = f2;
            this.X = f3;
            this.x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.B == null || z2) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.x);
            textPaint.setLetterSpacing(this.X);
            boolean b = b(this.A);
            this.C = b;
            int i = this.d0;
            if (!(i > 1 && !b)) {
                i = 1;
            }
            try {
                if (i != 1) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f, b ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity == 5) {
                        alignment = this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                    } else {
                        alignment = this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                C0314Ck3 c0314Ck3 = new C0314Ck3(this.A, textPaint, (int) width);
                c0314Ck3.l = this.z;
                c0314Ck3.k = b;
                c0314Ck3.e = alignment;
                c0314Ck3.j = false;
                c0314Ck3.f = i;
                float f7 = this.e0;
                c0314Ck3.g = 0.0f;
                c0314Ck3.h = f7;
                c0314Ck3.i = this.f0;
                staticLayout = c0314Ck3.a();
            } catch (AbstractC0184Bk3 e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayout = null;
            }
            this.Y = staticLayout;
            this.B = staticLayout.getText();
        }
    }

    public final void h(boolean z) {
        float measureText;
        StaticLayout staticLayout;
        View view = this.a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z) {
            return;
        }
        c(1.0f, z);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.z);
        }
        CharSequence charSequence2 = this.c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.m = rect.top;
        } else if (i != 80) {
            this.m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.o = rect.centerX() - (this.Z / 2.0f);
        } else if (i2 == 5) {
            this.o = rect.right - this.Z;
        } else {
            this.o = rect.left;
        }
        c(0.0f, z);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 != null && this.d0 > 1) {
            measureText = staticLayout2.getWidth();
        } else {
            CharSequence charSequence3 = this.B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f, this.C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.c;
        if (i3 == 48) {
            this.l = rect2.top;
        } else if (i3 != 80) {
            this.l = rect2.centerY() - (height / 2.0f);
        } else {
            this.l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 == 5) {
            this.n = rect2.right - measureText;
        } else {
            this.n = rect2.left;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.b);
        float f = this.b;
        float f2 = f(rect2.left, rect.left, f, this.P);
        RectF rectF = this.e;
        rectF.left = f2;
        rectF.top = f(this.l, this.m, f, this.P);
        rectF.right = f(rect2.right, rect.right, f, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f, this.P);
        this.p = f(this.n, this.o, f, this.P);
        this.q = f(this.l, this.m, f, this.P);
        l(f);
        HH0 hh0 = AbstractC0270Cc.b;
        this.a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f, hh0);
        WeakHashMap weakHashMap = Ec4.a;
        view.postInvalidateOnAnimation();
        this.b0 = f(1.0f, 0.0f, f, hh0);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, e(colorStateList2), e(this.k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            textPaint.setLetterSpacing(f(f4, f3, f, hh0));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.H = f(0.0f, this.R, f, null);
        this.I = f(0.0f, this.S, f, null);
        this.f11462J = f(0.0f, this.T, f, null);
        int a = a(f, e(null), e(this.U));
        this.K = a;
        textPaint.setShadowLayer(this.H, this.I, this.f11462J, a);
        view.postInvalidateOnAnimation();
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float f(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = AbstractC0270Cc.a;
        return AbstractC2277Rn2.a(f2, f, f3, f);
    }
}
