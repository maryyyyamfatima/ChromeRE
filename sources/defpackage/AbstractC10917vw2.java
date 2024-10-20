package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.FrameLayout;
import java.util.List;
import org.chromium.base.TraceEvent;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC10917vw2 extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final C3705aw2 a;
    public final GestureDetectorOnGestureListenerC7485lw2 g;
    public final InterfaceC11260ww2 h;
    public List i;
    public List j;
    public Matrix k;
    public final Matrix l;
    public InterfaceC6390il4 m;

    /* JADX WARN: Type inference failed for: r0v2, types: [tw2] */
    public AbstractC10917vw2(Context context, boolean z, C8173nw2 c8173nw2, C7829mw2 c7829mw2, RunnableC0763Fw2 runnableC0763Fw2) {
        super(context);
        this.l = new Matrix();
        setWillNotDraw(false);
        this.h = c8173nw2;
        this.a = new C3705aw2(new Runnable() { // from class: tw2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC10917vw2.this.postInvalidate();
            }
        }, runnableC0763Fw2);
        this.g = new GestureDetectorOnGestureListenerC7485lw2(context, z, c7829mw2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        C8173nw2 c8173nw2 = (C8173nw2) this.h;
        boolean isIdentity = c8173nw2.n.isIdentity();
        C11603xw2 c11603xw2 = c8173nw2.i;
        if (!isIdentity) {
            c11603xw2.getClass();
            c11603xw2.a = new Size(width, height);
            if (c11603xw2.e) {
                return;
            }
            c11603xw2.f = new Size(Math.min(width, 2500), Math.min(Math.round(height / 2.0f), 2500));
            return;
        }
        boolean z2 = c8173nw2.j;
        Size size = c8173nw2.b;
        if (!z2) {
            float width2 = width / size.getWidth();
            c8173nw2.m = width2;
            if (c8173nw2.l == 0.0f) {
                c8173nw2.l = width2;
            }
            for (int i5 = 0; i5 < c8173nw2.c.size(); i5++) {
                ((C8173nw2) c8173nw2.e.get(i5)).e(c8173nw2.l);
            }
            c8173nw2.h(new Size(width, Math.round(height / 2.0f)));
        }
        float b = c11603xw2.b();
        if (b == 0.0f) {
            b = c8173nw2.l;
        }
        if (width > 0 && height > 0) {
            c11603xw2.g(Math.max(0, Math.min(Math.round(c11603xw2.c()), Math.round(size.getWidth() * b) - width)), Math.max(0, Math.min(Math.round(c11603xw2.d()), Math.round(size.getHeight() * b) - height)));
            c11603xw2.a = new Size(width, height);
            if (!c11603xw2.e) {
                c11603xw2.f = new Size(Math.min(width, 2500), Math.min(Math.round(height / 2.0f), 2500));
            }
            float b2 = c11603xw2.b();
            c11603xw2.f(b);
            c8173nw2.j(b2 != b);
        }
        Runnable runnable = c8173nw2.r;
        if (runnable != null) {
            runnable.run();
            c8173nw2.r = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object obj;
        canvas.save();
        canvas.concat(this.l);
        canvas.concat(this.k);
        C3705aw2 c3705aw2 = this.a;
        if (!c3705aw2.h && c3705aw2.b != null) {
            Rect rect = c3705aw2.c;
            if (!rect.isEmpty() && c3705aw2.a.getWidth() > 0 && c3705aw2.a.getHeight() > 0) {
                Object obj2 = null;
                TraceEvent.b("PlayerFrameBitmapPainter.onDraw", null);
                int height = rect.top / c3705aw2.a.getHeight();
                int ceil = (int) Math.ceil(rect.bottom / c3705aw2.a.getHeight());
                int width = rect.left / c3705aw2.a.getWidth();
                int ceil2 = (int) Math.ceil(rect.right / c3705aw2.a.getWidth());
                int min = Math.min(ceil, c3705aw2.b.length);
                int i = 0;
                int min2 = Math.min(ceil2, min >= 1 ? c3705aw2.b[min - 1].length : 0);
                while (height < min) {
                    int i2 = width;
                    while (i2 < min2) {
                        Bitmap bitmap = c3705aw2.b[height][i2];
                        if (bitmap == null) {
                            obj = obj2;
                        } else {
                            int max = Math.max(rect.left - (c3705aw2.a.getWidth() * i2), i);
                            int max2 = Math.max(rect.top - (c3705aw2.a.getHeight() * height), i);
                            int min3 = Math.min(c3705aw2.a.getWidth(), (rect.right + max) - (c3705aw2.a.getWidth() * i2));
                            int min4 = Math.min(c3705aw2.a.getHeight(), (rect.bottom + max2) - (c3705aw2.a.getHeight() * height));
                            Rect rect2 = c3705aw2.d;
                            rect2.set(max, max2, min3, min4);
                            int max3 = Math.max((c3705aw2.a.getWidth() * i2) - rect.left, 0);
                            int max4 = Math.max((c3705aw2.a.getHeight() * height) - rect.top, 0);
                            int width2 = rect2.width() + max3;
                            int height2 = rect2.height() + max4;
                            Rect rect3 = c3705aw2.e;
                            rect3.set(max3, max4, width2, height2);
                            obj = null;
                            canvas.drawBitmap(bitmap, rect2, rect3, (Paint) null);
                            Runnable runnable = c3705aw2.g;
                            if (runnable != null) {
                                runnable.run();
                                c3705aw2.g = null;
                            }
                        }
                        i2++;
                        obj2 = obj;
                        i = 0;
                    }
                    height++;
                    i = 0;
                }
                TraceEvent.c("PlayerFrameBitmapPainter.onDraw");
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return this.g.a(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        InterfaceC6390il4 interfaceC6390il4 = this.m;
        if (interfaceC6390il4 != null && ((WebContentsAccessibilityImpl) interfaceC6390il4).G) {
            WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) interfaceC6390il4;
            webContentsAccessibilityImpl.getClass();
            if (!webContentsAccessibilityImpl.onHoverEvent(motionEvent.getAction())) {
                return false;
            }
            float x = motionEvent.getX();
            M0 m0 = webContentsAccessibilityImpl.g;
            return N.Mx2ry6ai(webContentsAccessibilityImpl.k, m0.k().b() + x, m0.k().g() + motionEvent.getY());
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void a() {
        if (this.i == null || this.j == null) {
            removeAllViews();
            return;
        }
        for (int i = 0; i < this.i.size(); i++) {
            View view = (View) this.i.get(i);
            if (view.getVisibility() != 0) {
                removeView(view);
            } else {
                if (view.getParent() == null) {
                    addView((View) this.i.get(i));
                } else if (view.getParent() != this) {
                    throw new IllegalStateException("Sub-frame view already has a parent.");
                }
                Rect rect = (Rect) this.j.get(i);
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        InterfaceC6390il4 interfaceC6390il4 = this.m;
        if (interfaceC6390il4 != null) {
            interfaceC6390il4.getClass();
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View
    public final AccessibilityNodeProvider getAccessibilityNodeProvider() {
        InterfaceC6390il4 interfaceC6390il4 = this.m;
        AccessibilityNodeProvider o = interfaceC6390il4 != null ? ((WebContentsAccessibilityImpl) interfaceC6390il4).o() : null;
        return o != null ? o : super.getAccessibilityNodeProvider();
    }
}
