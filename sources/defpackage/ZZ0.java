package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.google.android.libraries.elements.interfaces.ImageProxy;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZZ0 extends AbstractC6026hi1 {
    public final C8753pe3 i;
    public final ImageProxy j;
    public final InterfaceC2376Sh1 k;
    public final ImageProxy l;
    public final ImageProxy m;
    public final AbstractC9896sy0 n;
    public final C2506Th1 o;
    public boolean p;

    @Override // defpackage.AbstractC6026hi1, defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
        Drawable drawable = (Drawable) obj;
        if (!this.p) {
            n();
        }
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.k;
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.c(((ImageView) this.a).hashCode());
        }
        ImageProxy imageProxy = this.j;
        if (imageProxy != null) {
            drawable = j(drawable, imageProxy);
        }
        super.d(drawable, ov3);
    }

    @Override // defpackage.AbstractC6026hi1
    public final void f(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    public ZZ0(C8753pe3 c8753pe3, ImageView imageView, ImageProxy imageProxy, InterfaceC2376Sh1 interfaceC2376Sh1, ImageProxy imageProxy2, ImageProxy imageProxy3, C12160zb c12160zb, AbstractC9896sy0 abstractC9896sy0, C2506Th1 c2506Th1) {
        super(imageView);
        this.p = false;
        this.i = c8753pe3;
        this.j = imageProxy;
        this.k = interfaceC2376Sh1;
        this.l = imageProxy2;
        this.m = imageProxy3;
        this.n = abstractC9896sy0;
        this.o = c2506Th1;
    }

    @Override // defpackage.AbstractC6026hi1, defpackage.TE3
    public final void k(Drawable drawable) {
        ImageProxy imageProxy;
        n();
        if (drawable != null && (imageProxy = this.l) != null) {
            drawable = j(drawable, imageProxy);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
                animatedImageDrawable.setRepeatCount(-1);
                animatedImageDrawable.start();
            }
        }
        super.k(drawable);
    }

    public final void n() {
        this.p = true;
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.k;
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.b(((ImageView) this.a).hashCode());
        }
    }

    @Override // defpackage.AbstractC6026hi1, defpackage.TE3
    public final void i(Drawable drawable) {
        ImageProxy imageProxy;
        if (!this.p) {
            n();
        }
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.k;
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.a(((ImageView) this.a).hashCode());
        }
        if (drawable != null && (imageProxy = this.m) != null) {
            drawable = j(drawable, imageProxy);
            if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
                animatedImageDrawable.setRepeatCount(-1);
                animatedImageDrawable.start();
            }
        }
        super.i(drawable);
    }

    @Override // defpackage.AbstractC6026hi1, defpackage.TE3
    public final void m(Drawable drawable) {
        ImageProxy imageProxy;
        InterfaceC2376Sh1 interfaceC2376Sh1 = this.k;
        if (interfaceC2376Sh1 != null) {
            interfaceC2376Sh1.f(((ImageView) this.a).hashCode());
        }
        if (drawable != null && (imageProxy = this.l) != null) {
            drawable = j(drawable, imageProxy);
        }
        super.m(drawable);
    }

    @Override // defpackage.AbstractC6026hi1, defpackage.TE3
    public final void c(InterfaceC11153we3 interfaceC11153we3) {
        C8753pe3 c8753pe3 = this.i;
        ((C3133Yc3) interfaceC11153we3).m(c8753pe3.a, c8753pe3.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0449  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable j(android.graphics.drawable.Drawable r32, com.google.android.libraries.elements.interfaces.ImageProxy r33) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZZ0.j(android.graphics.drawable.Drawable, com.google.android.libraries.elements.interfaces.ImageProxy):android.graphics.drawable.Drawable");
    }
}
