package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.base.UnguessableToken;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kw2 */
/* loaded from: classes2.dex */
public final class C7141kw2 {
    public final C8173nw2 a;
    public final C9203qw2 b;
    public final C9888sw2 c;
    public final C10574uw2 d;
    public final ArrayList e = new ArrayList();

    /* JADX WARN: Type inference failed for: r3v3, types: [hw2] */
    /* JADX WARN: Type inference failed for: r4v1, types: [iw2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [gw2] */
    public C7141kw2(Context context, PlayerCompositorDelegateImpl playerCompositorDelegateImpl, UnguessableToken unguessableToken, int i, int i2, int i3, int i4, float f, boolean z, C1802Nw2 c1802Nw2, final C11946yw2 c11946yw2, RunnableC0763Fw2 runnableC0763Fw2, C0893Gw2 c0893Gw2, RunnableC1023Hw2 runnableC1023Hw2) {
        PropertyModel propertyModel = new PropertyModel(PropertyModel.e(AbstractC8860pw2.h));
        OverScroller overScroller = new OverScroller(context);
        overScroller.setFriction(ViewConfiguration.getScrollFriction() / 2.0f);
        C8173nw2 c8173nw2 = new C8173nw2(propertyModel, playerCompositorDelegateImpl, c11946yw2, unguessableToken, new Size(i, i2), i3, i4, f, runnableC1023Hw2);
        this.a = c8173nw2;
        if (z) {
            Matrix matrix = (Matrix) propertyModel.i(AbstractC8860pw2.g);
            Objects.requireNonNull(c11946yw2);
            this.b = new C9203qw2(matrix, c8173nw2, c0893Gw2, new Callback() { // from class: gw2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    Runnable runnable = C11946yw2.this.a;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (!booleanValue || AbstractC1932Ow2.a("PaintPreview.Player.Zoomed")) {
                        return;
                    }
                    FI2.a("PaintPreview.Player.Zoomed");
                    AbstractC1932Ow2.a.put("PaintPreview.Player.Zoomed", Long.valueOf(System.currentTimeMillis()));
                }
            });
        }
        Objects.requireNonNull(c11946yw2);
        C9888sw2 c9888sw2 = new C9888sw2(overScroller, c8173nw2, new Runnable() { // from class: hw2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable = C11946yw2.this.a;
                if (runnable != null) {
                    runnable.run();
                }
                if (AbstractC1932Ow2.a("PaintPreview.Player.Scrolled")) {
                    return;
                }
                FI2.a("PaintPreview.Player.Scrolled");
                AbstractC1932Ow2.a.put("PaintPreview.Player.Scrolled", Long.valueOf(System.currentTimeMillis()));
            }
        }, new Runnable() { // from class: iw2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable = C11946yw2.this.a;
                if (runnable != null) {
                    runnable.run();
                }
                if (AbstractC1932Ow2.a("PaintPreview.Player.Flung")) {
                    return;
                }
                FI2.a("PaintPreview.Player.Flung");
                AbstractC1932Ow2.a.put("PaintPreview.Player.Flung", Long.valueOf(System.currentTimeMillis()));
            }
        });
        this.c = c9888sw2;
        C7829mw2 c7829mw2 = new C7829mw2(this.b, c9888sw2, c8173nw2);
        int i5 = AbstractC10917vw2.n;
        C10574uw2 c10574uw2 = new C10574uw2(context, z, c8173nw2, c7829mw2, runnableC0763Fw2);
        this.d = c10574uw2;
        if (c1802Nw2 != null) {
            c9888sw2.a = c1802Nw2;
        }
        UD2.a(propertyModel, c10574uw2, new TD2() { // from class: jw2
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                AbstractC10917vw2 abstractC10917vw2 = (AbstractC10917vw2) obj;
                FD2 fd2 = (FD2) obj2;
                PD2 pd2 = AbstractC8860pw2.a;
                if (fd2.equals(pd2)) {
                    Bitmap[][] bitmapArr = (Bitmap[][]) propertyModel2.i(pd2);
                    C3705aw2 c3705aw2 = abstractC10917vw2.a;
                    if (c3705aw2.h) {
                        return;
                    }
                    c3705aw2.b = bitmapArr;
                    c3705aw2.f.run();
                    return;
                }
                PD2 pd22 = AbstractC8860pw2.b;
                if (!fd2.equals(pd22)) {
                    PD2 pd23 = AbstractC8860pw2.c;
                    if (fd2.equals(pd23)) {
                        Point point = (Point) propertyModel2.i(pd23);
                        abstractC10917vw2.l.setTranslate(point.x, point.y);
                        return;
                    }
                    PD2 pd24 = AbstractC8860pw2.d;
                    if (fd2.equals(pd24)) {
                        Rect rect = (Rect) propertyModel2.i(pd24);
                        int i6 = rect.left;
                        int i7 = rect.top;
                        int i8 = rect.right;
                        int i9 = rect.bottom;
                        C3705aw2 c3705aw22 = abstractC10917vw2.a;
                        if (!c3705aw22.h) {
                            c3705aw22.c.set(i6, i7, i8, i9);
                            c3705aw22.f.run();
                        }
                        abstractC10917vw2.a();
                        return;
                    }
                    PD2 pd25 = AbstractC8860pw2.e;
                    if (!fd2.equals(pd25)) {
                        PD2 pd26 = AbstractC8860pw2.f;
                        if (!fd2.equals(pd26)) {
                            PD2 pd27 = AbstractC8860pw2.g;
                            if (fd2.equals(pd27)) {
                                Matrix matrix2 = (Matrix) propertyModel2.i(pd27);
                                abstractC10917vw2.k = matrix2;
                                if (matrix2.isIdentity()) {
                                    return;
                                }
                                abstractC10917vw2.postInvalidate();
                                abstractC10917vw2.a();
                                return;
                            }
                            return;
                        }
                        abstractC10917vw2.j = (List) propertyModel2.i(pd26);
                        return;
                    }
                    abstractC10917vw2.i = (List) propertyModel2.i(pd25);
                    return;
                }
                abstractC10917vw2.a.a = (Size) propertyModel2.i(pd22);
            }
        });
    }

    public final void b() {
        C9888sw2 c9888sw2 = this.c;
        if (c9888sw2 != null) {
            c9888sw2.k = false;
        }
        C9203qw2 c9203qw2 = this.b;
        if (c9203qw2 != null) {
            c9203qw2.h = false;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((C7141kw2) it.next()).b();
        }
    }

    public final void a() {
        C3705aw2 c3705aw2 = this.d.a;
        c3705aw2.h = true;
        c3705aw2.b = null;
        C5423fw2 c5423fw2 = this.a.p;
        C4735dw2 c4735dw2 = c5423fw2.a;
        if (c4735dw2 != null) {
            c4735dw2.c();
            c5423fw2.a = null;
        }
        C4735dw2 c4735dw22 = c5423fw2.b;
        if (c4735dw22 != null) {
            c4735dw22.c();
            c5423fw2.b = null;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((C7141kw2) it.next()).a();
        }
    }
}
