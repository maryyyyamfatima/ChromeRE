package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dF2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4499dF2 extends Drawable implements Animatable {
    public final XE2 a;
    public final Paint g;
    public final Rect h;
    public final Rect i;
    public final Rect j;
    public C4155cF2 k;
    public boolean l;
    public boolean m;
    public long n;
    public final InterfaceC3812bF2 o;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public static C4499dF2 c(Context context, YE2 ye2, InterfaceC3812bF2 interfaceC3812bF2) {
        UE2 ue2 = new UE2(ye2);
        PathInterpolator pathInterpolator = new PathInterpolator(0.8f, 0.0f, 0.6f, 1.0f);
        if (interfaceC3812bF2 == null) {
            interfaceC3812bF2 = new ZE2();
        }
        C4499dF2 c4499dF2 = new C4499dF2(context, pathInterpolator, ue2, interfaceC3812bF2);
        c4499dF2.setAlpha(76);
        return c4499dF2;
    }

    public static C4499dF2 b(Context context, InterfaceC3812bF2 interfaceC3812bF2) {
        WE2 we2 = new WE2(context.getResources().getDimensionPixelSize(R.dimen.f34360_resource_name_obfuscated_res_0x7f08038c));
        if (interfaceC3812bF2 == null) {
            interfaceC3812bF2 = new ZE2();
        }
        return c(context, we2, interfaceC3812bF2);
    }

    public C4499dF2(Context context, Interpolator interpolator, InterfaceC3468aF2 interfaceC3468aF2, InterfaceC3812bF2 interfaceC3812bF2) {
        this(new C4155cF2(interpolator, interfaceC3468aF2), interfaceC3812bF2);
        e(context, false);
    }

    public C4499dF2(C4155cF2 c4155cF2, InterfaceC3812bF2 interfaceC3812bF2) {
        this.a = new XE2(this);
        this.g = new Paint(1);
        this.h = new Rect();
        this.i = new Rect();
        this.j = new Rect();
        this.k = c4155cF2;
        this.o = interfaceC3812bF2;
    }

    public final void e(Context context, boolean z) {
        int g;
        if (!z) {
            g = AbstractC10957w33.g(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context);
        } else {
            g = context.getColor(R.color.f17740_resource_name_obfuscated_res_0x7f070116);
        }
        if (this.k.b == g) {
            return;
        }
        int alpha = getAlpha();
        C4155cF2 c4155cF2 = this.k;
        c4155cF2.a = g;
        c4155cF2.b = g;
        setAlpha(alpha);
        invalidateSelf();
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.h.set(i, i2, i3, i4);
        Rect rect = this.i;
        if (rect.isEmpty()) {
            return;
        }
        setBounds(rect);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        boolean z = this.m;
        XE2 xe2 = this.a;
        if (z) {
            unscheduleSelf(xe2);
            scheduleSelf(xe2, SystemClock.uptimeMillis() + 16);
            return;
        }
        this.m = true;
        C4155cF2 c4155cF2 = this.k;
        if (c4155cF2.c == 0) {
            c4155cF2.c = SystemClock.uptimeMillis();
            this.n = this.k.c;
        }
        xe2.run();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.m = false;
        this.k.c = 0L;
        unscheduleSelf(this.a);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.i.set(i, i2, i3, i4);
        Rect rect = this.h;
        int i5 = i + rect.left;
        int i6 = i2 + rect.top;
        int i7 = i3 - rect.right;
        int i8 = i4 - rect.bottom;
        Rect rect2 = this.j;
        rect2.set(i5, i6, i7, i8);
        super.setBounds(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.g;
        paint.setColor(this.k.a);
        C4155cF2 c4155cF2 = this.k;
        c4155cF2.f.b(this, paint, canvas, c4155cF2.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C4155cF2 c4155cF2 = this.k;
        int i2 = c4155cF2.b;
        int i3 = ((((i2 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i2 << 8) >>> 8);
        if (c4155cF2.a != i3) {
            c4155cF2.a = i3;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k.a >>> 24;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (visible || z2) {
            start();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.l && super.mutate() == this) {
            this.k = new C4155cF2(this.k);
            this.l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.k;
    }
}
