package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fZ0 */
/* loaded from: classes.dex */
public final class C5284fZ0 extends Drawable implements InterfaceC7690mZ0, Animatable, InterfaceC4950eb {
    public final C4940eZ0 a;
    public boolean g;
    public boolean h;
    public boolean i;
    public int k;
    public boolean m;
    public Paint n;
    public Rect o;
    public ArrayList p;
    public boolean j = true;
    public final int l = -1;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public C5284fZ0(C4940eZ0 c4940eZ0) {
        AbstractC6464iy2.b(c4940eZ0);
        this.a = c4940eZ0;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.h = true;
        this.k = 0;
        if (this.j) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h = false;
        this.g = false;
        C8378oZ0 c8378oZ0 = this.a.a;
        ArrayList arrayList = c8378oZ0.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c8378oZ0.f = false;
        }
    }

    public final void b() {
        AbstractC6464iy2.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.i);
        C8378oZ0 c8378oZ0 = this.a.a;
        if (((C1993Pi3) c8378oZ0.a).l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.g) {
            return;
        }
        this.g = true;
        if (c8378oZ0.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c8378oZ0.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !c8378oZ0.f) {
            c8378oZ0.f = true;
            c8378oZ0.j = false;
            c8378oZ0.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC6464iy2.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.i);
        this.j = z;
        if (!z) {
            this.g = false;
            C8378oZ0 c8378oZ0 = this.a.a;
            ArrayList arrayList = c8378oZ0.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c8378oZ0.f = false;
            }
        } else if (this.h) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.a.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a.p;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.i) {
            return;
        }
        if (this.m) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.o == null) {
                this.o = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.o);
            this.m = false;
        }
        C8378oZ0 c8378oZ0 = this.a.a;
        C7346lZ0 c7346lZ0 = c8378oZ0.i;
        if (c7346lZ0 == null) {
            bitmap = c8378oZ0.l;
        } else {
            bitmap = c7346lZ0.l;
        }
        if (this.o == null) {
            this.o = new Rect();
        }
        Rect rect = this.o;
        if (this.n == null) {
            this.n = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.n);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        this.n.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.n == null) {
            this.n = new Paint(2);
        }
        this.n.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // defpackage.InterfaceC4950eb
    public final void a(AbstractC4607db abstractC4607db) {
        if (abstractC4607db == null) {
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(abstractC4607db);
    }
}
