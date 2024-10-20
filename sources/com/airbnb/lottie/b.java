package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;
import defpackage.AbstractC11728yJ1;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC2576Tv1;
import defpackage.AbstractC4809e90;
import defpackage.C11325x74;
import defpackage.C1568Mb3;
import defpackage.C3926bc;
import defpackage.C6923kJ1;
import defpackage.C7267lJ1;
import defpackage.C74;
import defpackage.C7611mJ1;
import defpackage.C8847pu1;
import defpackage.C8985qJ1;
import defpackage.CallableC10356uJ1;
import defpackage.CallableC10699vJ1;
import defpackage.CallableC7955nJ1;
import defpackage.CallableC8299oJ1;
import defpackage.IJ1;
import defpackage.JG2;
import defpackage.JJ1;
import defpackage.MJ1;
import defpackage.NJ1;
import defpackage.RJ1;
import defpackage.SJ1;
import defpackage.TJ1;
import defpackage.Y50;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b extends AppCompatImageView {
    public static final C6923kJ1 B = new C6923kJ1();
    public C8985qJ1 A;
    public final C7267lJ1 i;
    public final C7611mJ1 j;
    public MJ1 k;
    public int l;
    public final JJ1 m;
    public boolean n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final HashSet x;
    public int y;
    public RJ1 z;

    public b(Context context) {
        super(context, null);
        this.i = new C7267lJ1(this);
        this.j = new C7611mJ1(this);
        this.l = 0;
        JJ1 jj1 = new JJ1();
        this.m = jj1;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = true;
        this.w = 1;
        this.x = new HashSet();
        this.y = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, JG2.f0, R.attr.0_resource_name_obfuscated_res_0x7f0502e6, 0);
        this.v = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(10, 0);
            if (resourceId != 0) {
                h(resourceId);
            }
        } else if (hasValue2) {
            String string = obtainStyledAttributes.getString(5);
            if (string != null) {
                i(string);
            }
        } else if (hasValue3) {
            obtainStyledAttributes.getString(16);
        }
        this.l = obtainStyledAttributes.getResourceId(4, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.s = true;
            this.u = true;
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        SJ1 sj1 = jj1.h;
        if (z) {
            sj1.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            sj1.setRepeatMode(obtainStyledAttributes.getInt(13, 1));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            sj1.setRepeatCount(obtainStyledAttributes.getInt(12, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            sj1.h = obtainStyledAttributes.getFloat(15, 1.0f);
        }
        jj1.n = obtainStyledAttributes.getString(7);
        jj1.k(obtainStyledAttributes.getFloat(9, 0.0f));
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        if (jj1.p != z2) {
            jj1.p = z2;
            if (jj1.g != null) {
                jj1.d();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            jj1.b(new C8847pu1("**"), NJ1.E, new TJ1(new C1568Mb3(Y50.b(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            jj1.i = obtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            int i = obtainStyledAttributes.getInt(11, 0);
            this.w = AbstractC2373Sg3.c(3)[i >= AbstractC2373Sg3.c(3).length ? 0 : i];
            c();
        }
        jj1.k = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        C11325x74 c11325x74 = C74.a;
        jj1.j = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
        c();
        this.n = true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        a();
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        JJ1 jj1;
        boolean z = this.t;
        if (!z && drawable == (jj1 = this.m)) {
            SJ1 sj1 = jj1.h;
            if (sj1 == null ? false : sj1.p) {
                d();
                super.unscheduleDrawable(drawable);
            }
        }
        if (!z && (drawable instanceof JJ1)) {
            JJ1 jj12 = (JJ1) drawable;
            SJ1 sj12 = jj12.h;
            if (sj12 != null ? sj12.p : false) {
                jj12.l.clear();
                jj12.h.k(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        JJ1 jj1 = this.m;
        if (drawable2 == jj1) {
            super.invalidateDrawable(jj1);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:            if (r6.s != false) goto L69;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r6 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.airbnb.lottie.LottieAnimationView$SavedState r1 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r1.<init>(r0)
            java.lang.String r0 = r6.o
            r1.a = r0
            int r0 = r6.p
            r1.g = r0
            JJ1 r0 = r6.m
            SJ1 r2 = r0.h
            qJ1 r3 = r2.o
            if (r3 != 0) goto L1b
            r3 = 0
            goto L25
        L1b:
            float r4 = r2.k
            float r5 = r3.j
            float r4 = r4 - r5
            float r3 = r3.k
            float r3 = r3 - r5
            float r3 = r4 / r3
        L25:
            r1.h = r3
            r3 = 0
            if (r2 != 0) goto L2c
            r2 = r3
            goto L2e
        L2c:
            boolean r2 = r2.p
        L2e:
            if (r2 != 0) goto L3c
            java.util.WeakHashMap r2 = defpackage.Ec4.a
            boolean r2 = r6.isAttachedToWindow()
            if (r2 != 0) goto L3d
            boolean r2 = r6.s
            if (r2 == 0) goto L3d
        L3c:
            r3 = 1
        L3d:
            r1.i = r3
            java.lang.String r2 = r0.n
            r1.j = r2
            SJ1 r0 = r0.h
            int r2 = r0.getRepeatMode()
            r1.k = r2
            int r0 = r0.getRepeatCount()
            r1.l = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        String str = lottieAnimationView$SavedState.a;
        this.o = str;
        if (!TextUtils.isEmpty(str)) {
            i(this.o);
        }
        int i = lottieAnimationView$SavedState.g;
        this.p = i;
        if (i != 0) {
            h(i);
        }
        float f = lottieAnimationView$SavedState.h;
        JJ1 jj1 = this.m;
        jj1.k(f);
        if (lottieAnimationView$SavedState.i) {
            f();
        }
        jj1.n = lottieAnimationView$SavedState.j;
        jj1.h.setRepeatMode(lottieAnimationView$SavedState.k);
        jj1.h.setRepeatCount(lottieAnimationView$SavedState.l);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (this.n) {
            if (isShown()) {
                if (this.r) {
                    g();
                } else if (this.q) {
                    f();
                }
                this.r = false;
                this.q = false;
                return;
            }
            SJ1 sj1 = this.m.h;
            if (sj1 != null ? sj1.p : false) {
                d();
                this.r = true;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.u || this.s) {
            f();
            this.u = false;
            this.s = false;
        }
    }

    public final void h(int i) {
        RJ1 a;
        RJ1 rj1;
        this.p = i;
        this.o = null;
        if (isInEditMode()) {
            rj1 = new RJ1(new CallableC7955nJ1(this, i), true);
        } else {
            if (this.v) {
                Context context = getContext();
                String h = AbstractC11728yJ1.h(context, i);
                a = AbstractC11728yJ1.a(h, new CallableC10699vJ1(new WeakReference(context), context.getApplicationContext(), i, h));
            } else {
                Context context2 = getContext();
                HashMap hashMap = AbstractC11728yJ1.a;
                a = AbstractC11728yJ1.a(null, new CallableC10699vJ1(new WeakReference(context2), context2.getApplicationContext(), i, null));
            }
            rj1 = a;
        }
        k(rj1);
    }

    public final void i(String str) {
        RJ1 a;
        RJ1 rj1;
        this.o = str;
        this.p = 0;
        if (isInEditMode()) {
            rj1 = new RJ1(new CallableC8299oJ1(this, str), true);
        } else {
            if (this.v) {
                Context context = getContext();
                HashMap hashMap = AbstractC11728yJ1.a;
                String a2 = AbstractC4809e90.a("asset_", str);
                a = AbstractC11728yJ1.a(a2, new CallableC10356uJ1(context.getApplicationContext(), str, a2));
            } else {
                Context context2 = getContext();
                HashMap hashMap2 = AbstractC11728yJ1.a;
                a = AbstractC11728yJ1.a(null, new CallableC10356uJ1(context2.getApplicationContext(), str, null));
            }
            rj1 = a;
        }
        k(rj1);
    }

    public final void a() {
        RJ1 rj1 = this.z;
        if (rj1 != null) {
            C7267lJ1 c7267lJ1 = this.i;
            synchronized (rj1) {
                rj1.a.remove(c7267lJ1);
            }
            RJ1 rj12 = this.z;
            C7611mJ1 c7611mJ1 = this.j;
            synchronized (rj12) {
                rj12.b.remove(c7611mJ1);
            }
        }
    }

    public final void j(C8985qJ1 c8985qJ1) {
        JJ1 jj1 = this.m;
        jj1.setCallback(this);
        this.A = c8985qJ1;
        boolean z = true;
        this.t = true;
        if (jj1.g == c8985qJ1) {
            z = false;
        } else {
            jj1.t = false;
            jj1.e();
            jj1.g = c8985qJ1;
            jj1.d();
            SJ1 sj1 = jj1.h;
            boolean z2 = sj1.o == null;
            sj1.o = c8985qJ1;
            if (z2) {
                sj1.q((int) Math.max(sj1.m, c8985qJ1.j), (int) Math.min(sj1.n, c8985qJ1.k));
            } else {
                sj1.q((int) c8985qJ1.j, (int) c8985qJ1.k);
            }
            float f = sj1.k;
            sj1.k = 0.0f;
            sj1.o((int) f);
            sj1.h();
            jj1.k(sj1.getAnimatedFraction());
            jj1.i = jj1.i;
            ArrayList arrayList = jj1.l;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                IJ1 ij1 = (IJ1) it.next();
                if (ij1 != null) {
                    ij1.run();
                }
                it.remove();
            }
            arrayList.clear();
            c8985qJ1.a.a = false;
            Drawable.Callback callback = jj1.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(jj1);
            }
        }
        this.t = false;
        c();
        if (getDrawable() != jj1 || z) {
            if (!z) {
                SJ1 sj12 = jj1.h;
                boolean z3 = sj12 != null ? sj12.p : false;
                setImageDrawable(null);
                setImageDrawable(jj1);
                if (z3) {
                    jj1.g();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.x.iterator();
            while (it2.hasNext()) {
                C3926bc c3926bc = (C3926bc) it2.next();
                c3926bc.getClass();
                c3926bc.a.x = c8985qJ1.i.width();
            }
        }
    }

    public final void f() {
        if (isShown()) {
            this.m.f();
            c();
        } else {
            this.q = true;
        }
    }

    public final void g() {
        if (isShown()) {
            this.m.g();
            c();
        } else {
            this.q = false;
            this.r = true;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        JJ1 jj1 = this.m;
        SJ1 sj1 = jj1.h;
        if (sj1 == null ? false : sj1.p) {
            this.s = false;
            this.r = false;
            this.q = false;
            jj1.l.clear();
            jj1.h.cancel();
            c();
            this.s = true;
        }
        super.onDetachedFromWindow();
    }

    public final void d() {
        this.u = false;
        this.s = false;
        this.r = false;
        this.q = false;
        JJ1 jj1 = this.m;
        jj1.l.clear();
        jj1.h.k(true);
        c();
    }

    public final void k(RJ1 rj1) {
        this.A = null;
        this.m.e();
        a();
        C7267lJ1 c7267lJ1 = this.i;
        synchronized (rj1) {
            if (rj1.d != null && rj1.d.a != null) {
                c7267lJ1.onResult(rj1.d.a);
            }
            rj1.a.add(c7267lJ1);
        }
        C7611mJ1 c7611mJ1 = this.j;
        synchronized (rj1) {
            if (rj1.d != null && rj1.d.b != null) {
                c7611mJ1.onResult(rj1.d.b);
            }
            rj1.b.add(c7611mJ1);
        }
        this.z = rj1;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        this.y++;
        super.buildDrawingCache(z);
        if (this.y == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            this.w = 2;
            c();
        }
        this.y--;
        AbstractC2576Tv1.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:            if (((r0 == null || !r0.m || android.os.Build.VERSION.SDK_INT >= 28) && !((r0 != null && r0.n > 4) || (r0 = android.os.Build.VERSION.SDK_INT) == 24 || r0 == 25)) != false) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:            if (r0 != 1) goto L119;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:            r1 = 2;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r4 = this;
            int r0 = r4.w
            int r0 = defpackage.AbstractC2373Sg3.b(r0)
            r1 = 1
            if (r0 == 0) goto Lc
            if (r0 == r1) goto L33
            goto L34
        Lc:
            qJ1 r0 = r4.A
            if (r0 == 0) goto L1b
            boolean r2 = r0.m
            if (r2 == 0) goto L1b
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 >= r3) goto L1b
            goto L30
        L1b:
            if (r0 == 0) goto L23
            int r0 = r0.n
            r2 = 4
            if (r0 <= r2) goto L23
            goto L30
        L23:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 == r2) goto L30
            r2 = 25
            if (r0 != r2) goto L2e
            goto L30
        L2e:
            r0 = r1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L34
        L33:
            r1 = 2
        L34:
            int r0 = r4.getLayerType()
            if (r1 == r0) goto L3e
            r0 = 0
            r4.setLayerType(r1, r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.c():void");
    }
}
