package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ht0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1006Ht0 extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public final AbstractC1136It0 a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public abstract void e();

    public AbstractC1006Ht0(AbstractC1006Ht0 abstractC1006Ht0, AbstractC1136It0 abstractC1136It0, Resources resources) {
        Resources resources2;
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = abstractC1136It0;
        if (resources != null) {
            resources2 = resources;
        } else {
            resources2 = abstractC1006Ht0 != null ? abstractC1006Ht0.b : null;
        }
        this.b = resources2;
        int i = abstractC1006Ht0 != null ? abstractC1006Ht0.c : 0;
        int i2 = AbstractC1136It0.r;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (abstractC1006Ht0 != null) {
            this.d = abstractC1006Ht0.d;
            this.e = abstractC1006Ht0.e;
            this.u = true;
            this.v = true;
            this.i = abstractC1006Ht0.i;
            this.l = abstractC1006Ht0.l;
            this.w = abstractC1006Ht0.w;
            this.x = abstractC1006Ht0.x;
            this.y = abstractC1006Ht0.y;
            this.z = abstractC1006Ht0.z;
            this.A = abstractC1006Ht0.A;
            this.B = abstractC1006Ht0.B;
            this.C = abstractC1006Ht0.C;
            this.D = abstractC1006Ht0.D;
            this.E = abstractC1006Ht0.E;
            this.F = abstractC1006Ht0.F;
            this.G = abstractC1006Ht0.G;
            if (abstractC1006Ht0.c == i) {
                if (abstractC1006Ht0.j) {
                    this.k = abstractC1006Ht0.k != null ? new Rect(abstractC1006Ht0.k) : null;
                    this.j = true;
                }
                if (abstractC1006Ht0.m) {
                    this.n = abstractC1006Ht0.n;
                    this.o = abstractC1006Ht0.o;
                    this.p = abstractC1006Ht0.p;
                    this.q = abstractC1006Ht0.q;
                    this.m = true;
                }
            }
            if (abstractC1006Ht0.r) {
                this.s = abstractC1006Ht0.s;
                this.r = true;
            }
            if (abstractC1006Ht0.t) {
                this.t = true;
            }
            Drawable[] drawableArr = abstractC1006Ht0.g;
            this.g = new Drawable[drawableArr.length];
            this.h = abstractC1006Ht0.h;
            SparseArray sparseArray = abstractC1006Ht0.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.g = new Drawable[10];
        this.h = 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            AbstractC8446ok3 abstractC8446ok3 = (AbstractC8446ok3) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = abstractC8446ok3.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            abstractC8446ok3.g = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(abstractC8446ok3.H, 0, iArr, 0, i);
            abstractC8446ok3.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = constantState.newDrawable(this.b);
                newDrawable.setLayoutDirection(this.x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.b);
        newDrawable.setLayoutDirection(this.x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.a);
        this.g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }
}
