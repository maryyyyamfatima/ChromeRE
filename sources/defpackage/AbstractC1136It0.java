package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: It0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1136It0 extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int r = 0;
    public AbstractC1006Ht0 a;
    public Rect g;
    public Drawable h;
    public Drawable i;
    public boolean k;
    public boolean m;
    public RunnableC0746Ft0 n;
    public long o;
    public long p;
    public C0876Gt0 q;
    public int j = 255;
    public int l = -1;

    public abstract void d(C1564Mb c1564Mb);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        return changingConfigurations | abstractC1006Ht0.e | abstractC1006Ht0.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        boolean z = false;
        Rect rect2 = null;
        if (!abstractC1006Ht0.i) {
            Rect rect3 = abstractC1006Ht0.k;
            if (rect3 != null || abstractC1006Ht0.j) {
                rect2 = rect3;
            } else {
                abstractC1006Ht0.c();
                Rect rect4 = new Rect();
                int i = abstractC1006Ht0.h;
                Drawable[] drawableArr = abstractC1006Ht0.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC1006Ht0.j = true;
                abstractC1006Ht0.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.h;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.a.A && getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.k && this.j == i) {
            return;
        }
        this.k = true;
        this.j = i;
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.o == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (abstractC1006Ht0.w != z) {
            abstractC1006Ht0.w = z;
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        abstractC1006Ht0.C = true;
        if (abstractC1006Ht0.B != colorFilter) {
            abstractC1006Ht0.B = colorFilter;
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        abstractC1006Ht0.F = true;
        if (abstractC1006Ht0.D != colorStateList) {
            abstractC1006Ht0.D = colorStateList;
            AbstractC0486Dt0.b(this.h, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        abstractC1006Ht0.G = true;
        if (abstractC1006Ht0.E != mode) {
            abstractC1006Ht0.E = mode;
            AbstractC0486Dt0.c(this.h, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (abstractC1006Ht0.A != z) {
            abstractC1006Ht0.A = z;
            Drawable drawable = this.h;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.i;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.i = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.k) {
                this.h.setAlpha(this.j);
            }
        }
        if (this.p != 0) {
            this.p = 0L;
            z = true;
        }
        if (this.o != 0) {
            this.o = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.g;
        if (rect == null) {
            this.g = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.g;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.i;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        int i2 = this.l;
        int i3 = abstractC1006Ht0.h;
        Drawable[] drawableArr = abstractC1006Ht0.g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        abstractC1006Ht0.x = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (!abstractC1006Ht0.l) {
            Drawable drawable = this.h;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return -1;
        }
        if (!abstractC1006Ht0.m) {
            abstractC1006Ht0.b();
        }
        return abstractC1006Ht0.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (!abstractC1006Ht0.l) {
            Drawable drawable = this.h;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return -1;
        }
        if (!abstractC1006Ht0.m) {
            abstractC1006Ht0.b();
        }
        return abstractC1006Ht0.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (!abstractC1006Ht0.l) {
            Drawable drawable = this.h;
            if (drawable != null) {
                return drawable.getMinimumWidth();
            }
            return 0;
        }
        if (!abstractC1006Ht0.m) {
            abstractC1006Ht0.b();
        }
        return abstractC1006Ht0.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (!abstractC1006Ht0.l) {
            Drawable drawable = this.h;
            if (drawable != null) {
                return drawable.getMinimumHeight();
            }
            return 0;
        }
        if (!abstractC1006Ht0.m) {
            abstractC1006Ht0.b();
        }
        return abstractC1006Ht0.q;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (abstractC1006Ht0 != null) {
            abstractC1006Ht0.r = false;
            abstractC1006Ht0.t = false;
        }
        if (drawable != this.h || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.h || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.h || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.h;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (abstractC1006Ht0.r) {
            return abstractC1006Ht0.s;
        }
        abstractC1006Ht0.c();
        int i = abstractC1006Ht0.h;
        Drawable[] drawableArr = abstractC1006Ht0.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        abstractC1006Ht0.s = opacity;
        abstractC1006Ht0.r = true;
        return opacity;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.l
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            Ht0 r0 = r9.a
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.i
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.h
            if (r0 == 0) goto L29
            r9.i = r0
            Ht0 r0 = r9.a
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.p = r0
            goto L35
        L29:
            r9.i = r4
            r9.p = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.h
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            Ht0 r0 = r9.a
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.h = r0
            r9.l = r10
            if (r0 == 0) goto L5a
            Ht0 r10 = r9.a
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.o = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.h = r4
            r10 = -1
            r9.l = r10
        L5a:
            long r0 = r9.o
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.p
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7c
        L67:
            Ft0 r10 = r9.n
            if (r10 != 0) goto L76
            Ft0 r10 = new Ft0
            r1 = r9
            Rb r1 = (defpackage.C2214Rb) r1
            r10.<init>(r1)
            r9.n = r10
            goto L79
        L76:
            r9.unscheduleSelf(r10)
        L79:
            r9.a(r0)
        L7c:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1136It0.c(int):boolean");
    }

    public final void b(Drawable drawable) {
        if (this.q == null) {
            this.q = new C0876Gt0();
        }
        C0876Gt0 c0876Gt0 = this.q;
        c0876Gt0.a = drawable.getCallback();
        drawable.setCallback(c0876Gt0);
        try {
            if (this.a.y <= 0 && this.k) {
                drawable.setAlpha(this.j);
            }
            AbstractC1006Ht0 abstractC1006Ht0 = this.a;
            if (abstractC1006Ht0.C) {
                drawable.setColorFilter(abstractC1006Ht0.B);
            } else {
                if (abstractC1006Ht0.F) {
                    drawable.setTintList(abstractC1006Ht0.D);
                }
                AbstractC1006Ht0 abstractC1006Ht02 = this.a;
                if (abstractC1006Ht02.G) {
                    drawable.setTintMode(abstractC1006Ht02.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.g;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0876Gt0 c0876Gt02 = this.q;
            Drawable.Callback callback = c0876Gt02.a;
            c0876Gt02.a = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.h
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.o
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.j
            r3.setAlpha(r9)
            r13.o = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            Ht0 r10 = r13.a
            int r10 = r10.y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.j
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.o = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.i
            if (r9 == 0) goto L61
            long r10 = r13.p
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.i = r0
            r13.p = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            Ht0 r4 = r13.a
            int r4 = r4.z
            int r3 = r3 / r4
            int r4 = r13.j
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.p = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            Ft0 r14 = r13.n
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1136It0.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (theme == null) {
            abstractC1006Ht0.getClass();
            return;
        }
        abstractC1006Ht0.c();
        int i = abstractC1006Ht0.h;
        Drawable[] drawableArr = abstractC1006Ht0.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                abstractC1006Ht0.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            abstractC1006Ht0.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = abstractC1006Ht0.c;
            abstractC1006Ht0.c = i3;
            if (i4 != i3) {
                abstractC1006Ht0.m = false;
                abstractC1006Ht0.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        AbstractC1006Ht0 abstractC1006Ht0 = this.a;
        if (abstractC1006Ht0.u) {
            z = abstractC1006Ht0.v;
        } else {
            abstractC1006Ht0.c();
            abstractC1006Ht0.u = true;
            int i = abstractC1006Ht0.h;
            Drawable[] drawableArr = abstractC1006Ht0.g;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        abstractC1006Ht0.v = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    abstractC1006Ht0.v = true;
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.m && super.mutate() == this) {
            C2214Rb c2214Rb = (C2214Rb) this;
            C1564Mb c1564Mb = new C1564Mb(c2214Rb.u, c2214Rb, null);
            c1564Mb.e();
            d(c1564Mb);
            this.m = true;
        }
        return this;
    }
}
