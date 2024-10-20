package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tg */
/* loaded from: classes.dex */
public final class C10132tg {
    public final TextView a;
    public GN3 b;
    public GN3 c;
    public GN3 d;
    public GN3 e;
    public GN3 f;
    public GN3 g;
    public GN3 h;
    public final C0030Ag i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public C10132tg(TextView textView) {
        this.a = textView;
        this.i = new C0030Ag(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int autoSizeStepGranularity;
        int i2;
        int resourceId;
        LocaleList forLanguageTags;
        int i3;
        TextView textView = this.a;
        Context context = textView.getContext();
        C1195Jf a = C1195Jf.a();
        int[] iArr = JG2.m;
        IN3 m = IN3.m(context, attributeSet, iArr, i);
        Ec4.l(textView, textView.getContext(), iArr, attributeSet, m.b, i, 0);
        int i4 = m.i(0, -1);
        if (m.l(3)) {
            this.b = c(context, a, m.i(3, 0));
        }
        if (m.l(1)) {
            this.c = c(context, a, m.i(1, 0));
        }
        if (m.l(4)) {
            this.d = c(context, a, m.i(4, 0));
        }
        if (m.l(2)) {
            this.e = c(context, a, m.i(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (m.l(5)) {
            this.f = c(context, a, m.i(5, 0));
        }
        if (m.l(6)) {
            this.g = c(context, a, m.i(6, 0));
        }
        m.n();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = JG2.X0;
        if (i4 != -1) {
            IN3 in3 = new IN3(context, context.obtainStyledAttributes(i4, iArr2));
            if (z3 || !in3.l(14)) {
                z = false;
                z2 = false;
            } else {
                z = in3.a(14, false);
                z2 = true;
            }
            k(context, in3);
            if (in3.l(15)) {
                str = in3.j(15);
                i3 = 26;
            } else {
                i3 = 26;
                str = null;
            }
            str2 = (i5 < i3 || !in3.l(13)) ? null : in3.j(13);
            in3.n();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        IN3 in32 = new IN3(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && in32.l(14)) {
            z = in32.a(14, false);
            z2 = true;
        }
        if (in32.l(15)) {
            str = in32.j(15);
        }
        String str3 = str;
        if (i5 >= 26 && in32.l(13)) {
            str2 = in32.j(13);
        }
        String str4 = str2;
        if (i5 >= 28 && in32.l(0) && in32.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, in32);
        in32.n();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            textView.setFontVariationSettings(str4);
        }
        if (str3 != null) {
            if (i5 >= 24) {
                forLanguageTags = LocaleList.forLanguageTags(str3);
                textView.setTextLocales(forLanguageTags);
            } else {
                textView.setTextLocale(Locale.forLanguageTag(str3.split(",")[0]));
            }
        }
        int[] iArr3 = JG2.n;
        C0030Ag c0030Ag = this.i;
        Context context2 = c0030Ag.j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0030Ag.i;
        Ec4.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            c0030Ag.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0030Ag.f = C0030Ag.b(iArr4);
                c0030Ag.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!c0030Ag.i()) {
            c0030Ag.a = 0;
        } else if (c0030Ag.a == 1) {
            if (!c0030Ag.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i2 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i2 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0030Ag.j(dimension2, dimension3, dimension);
            }
            c0030Ag.g();
        }
        if (InterfaceC0975Hn.b && c0030Ag.a != 0) {
            int[] iArr5 = c0030Ag.f;
            if (iArr5.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0030Ag.d), Math.round(c0030Ag.e), Math.round(c0030Ag.c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        IN3 in33 = new IN3(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i7 = in33.i(8, -1);
        Drawable b = i7 != -1 ? a.b(context, i7) : null;
        int i8 = in33.i(13, -1);
        Drawable b2 = i8 != -1 ? a.b(context, i8) : null;
        int i9 = in33.i(9, -1);
        Drawable b3 = i9 != -1 ? a.b(context, i9) : null;
        int i10 = in33.i(6, -1);
        Drawable b4 = i10 != -1 ? a.b(context, i10) : null;
        int i11 = in33.i(10, -1);
        Drawable b5 = i11 != -1 ? a.b(context, i11) : null;
        int i12 = in33.i(7, -1);
        Drawable b6 = i12 != -1 ? a.b(context, i12) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, drawable2, b4);
            }
        }
        if (in33.l(11)) {
            ColorStateList b7 = in33.b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(b7);
            } else if (textView instanceof JN3) {
                ((JN3) textView).f(b7);
            }
        }
        if (in33.l(12)) {
            PorterDuff.Mode c = AbstractC3085Xt0.c(in33.h(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(c);
            } else if (textView instanceof JN3) {
                ((JN3) textView).a(c);
            }
        }
        int d = in33.d(15, -1);
        int d2 = in33.d(18, -1);
        int d3 = in33.d(19, -1);
        in33.n();
        if (d != -1) {
            GJ3.a(d, textView);
        }
        if (d2 != -1) {
            GJ3.b(d2, textView);
        }
        if (d3 != -1) {
            GJ3.c(d3, textView);
        }
    }

    public final void h(int i) {
        C0030Ag c0030Ag = this.i;
        if (c0030Ag.i()) {
            if (i == 0) {
                c0030Ag.a = 0;
                c0030Ag.d = -1.0f;
                c0030Ag.e = -1.0f;
                c0030Ag.c = -1.0f;
                c0030Ag.f = new int[0];
                c0030Ag.b = false;
                return;
            }
            if (i == 1) {
                DisplayMetrics displayMetrics = c0030Ag.j.getResources().getDisplayMetrics();
                c0030Ag.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (c0030Ag.g()) {
                    c0030Ag.a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown auto-size text type: ", i));
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        C0030Ag c0030Ag = this.i;
        if (c0030Ag.i()) {
            DisplayMetrics displayMetrics = c0030Ag.j.getResources().getDisplayMetrics();
            c0030Ag.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0030Ag.g()) {
                c0030Ag.a();
            }
        }
    }

    public final void k(Context context, IN3 in3) {
        String j;
        Typeface create;
        Typeface create2;
        this.j = in3.h(2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int h = in3.h(11, -1);
            this.k = h;
            if (h != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (in3.l(10) || in3.l(12)) {
            this.l = null;
            int i2 = in3.l(12) ? 12 : 10;
            int i3 = this.k;
            int i4 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface g = in3.g(i2, this.j, new C7042kg(this, i3, i4, new WeakReference(this.a)));
                    if (g != null) {
                        if (i < 28 || this.k == -1) {
                            this.l = g;
                        } else {
                            create2 = Typeface.create(Typeface.create(g, 0), this.k, (this.j & 2) != 0);
                            this.l = create2;
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l != null || (j = in3.j(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                this.l = Typeface.create(j, this.j);
                return;
            } else {
                create = Typeface.create(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                this.l = create;
                return;
            }
        }
        if (in3.l(1)) {
            this.m = false;
            int h2 = in3.h(1, 1);
            if (h2 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (h2 == 2) {
                this.l = Typeface.SERIF;
            } else {
                if (h2 != 3) {
                    return;
                }
                this.l = Typeface.MONOSPACE;
            }
        }
    }

    public final void g(int[] iArr, int i) {
        C0030Ag c0030Ag = this.i;
        if (c0030Ag.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0030Ag.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0030Ag.f = C0030Ag.b(iArr2);
                if (!c0030Ag.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0030Ag.g = false;
            }
            if (c0030Ag.g()) {
                c0030Ag.a();
            }
        }
    }

    public final void e(Context context, int i) {
        String j;
        IN3 in3 = new IN3(context, context.obtainStyledAttributes(i, JG2.X0));
        boolean l = in3.l(14);
        TextView textView = this.a;
        if (l) {
            textView.setAllCaps(in3.a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (in3.l(0) && in3.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, in3);
        if (i2 >= 26 && in3.l(13) && (j = in3.j(13)) != null) {
            textView.setFontVariationSettings(j);
        }
        in3.n();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public static GN3 c(Context context, C1195Jf c1195Jf, int i) {
        ColorStateList i2;
        synchronized (c1195Jf) {
            i2 = c1195Jf.a.i(context, i);
        }
        if (i2 == null) {
            return null;
        }
        GN3 gn3 = new GN3();
        gn3.d = true;
        gn3.a = i2;
        return gn3;
    }

    public final void b() {
        GN3 gn3 = this.b;
        TextView textView = this.a;
        if (gn3 != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void a(Drawable drawable, GN3 gn3) {
        if (drawable == null || gn3 == null) {
            return;
        }
        C1195Jf.e(drawable, gn3, this.a.getDrawableState());
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new GN3();
        }
        GN3 gn3 = this.h;
        gn3.a = colorStateList;
        gn3.d = colorStateList != null;
        this.b = gn3;
        this.c = gn3;
        this.d = gn3;
        this.e = gn3;
        this.f = gn3;
        this.g = gn3;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new GN3();
        }
        GN3 gn3 = this.h;
        gn3.b = mode;
        gn3.c = mode != null;
        this.b = gn3;
        this.c = gn3;
        this.d = gn3;
        this.e = gn3;
        this.f = gn3;
        this.g = gn3;
    }
}
