package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eu2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5067eu2 extends AbstractC1895Op0 {
    public static final boolean p;
    public static Float q;
    public final Context n;
    public final ComponentCallbacksC4723du2 o;

    static {
        p = Build.VERSION.SDK_INT >= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Point r17, float r18, android.view.Display r19) {
        /*
            r16 = this;
            java.lang.Float r0 = defpackage.C5067eu2.q
            r1 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L3f
            AX r0 = defpackage.AX.e()
            java.lang.String r5 = "force-device-scale-factor"
            java.lang.String r0 = r0.f(r5)
            if (r0 != 0) goto L1a
            defpackage.C5067eu2.q = r2
            goto L3f
        L1a:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L2b
            defpackage.C5067eu2.q = r5     // Catch: java.lang.NumberFormatException -> L2b
            float r5 = r5.floatValue()     // Catch: java.lang.NumberFormatException -> L2b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 > 0) goto L29
            goto L2b
        L29:
            r5 = r4
            goto L2c
        L2b:
            r5 = r3
        L2c:
            if (r5 == 0) goto L3f
            java.lang.String r5 = "Ignoring invalid forced DIP scale '"
            java.lang.String r6 = "'"
            java.lang.String r0 = defpackage.AbstractC4199cO1.a(r5, r0, r6)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "DisplayAndroid"
            defpackage.AbstractC4851eH1.f(r6, r0, r5)
            defpackage.C5067eu2.q = r2
        L3f:
            java.lang.Float r0 = defpackage.C5067eu2.q
            float r0 = r0.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
            goto L4b
        L4a:
            r3 = r4
        L4b:
            if (r3 == 0) goto L54
            java.lang.Float r0 = defpackage.C5067eu2.q
            float r0 = r0.floatValue()
            goto L56
        L54:
            r0 = r18
        L56:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L60
            boolean r4 = defpackage.AbstractC1574Md.a(r19)
        L60:
            android.view.Display$Mode r14 = r19.getMode()
            android.view.Display$Mode[] r1 = r19.getSupportedModes()
            java.util.List r15 = java.util.Arrays.asList(r1)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r0 = 24
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            int r0 = r19.getRotation()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            r12 = 0
            float r0 = r19.getRefreshRate()
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            r5 = r16
            r6 = r17
            r5.d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5067eu2.e(android.graphics.Point, float, android.view.Display):void");
    }

    public C5067eu2(Display display) {
        super(display.getDisplayId());
        Context createWindowContext;
        if (p) {
            createWindowContext = V60.a.createWindowContext(display, 2, null);
            this.n = createWindowContext;
            ComponentCallbacksC4723du2 componentCallbacksC4723du2 = new ComponentCallbacksC4723du2(this);
            this.o = componentCallbacksC4723du2;
            createWindowContext.registerComponentCallbacks(componentCallbacksC4723du2);
            f();
            return;
        }
        this.n = null;
        this.o = null;
    }

    public final void f() {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        Display display;
        Point point = new Point();
        Context context = this.n;
        maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        point.set(bounds.width(), bounds.height());
        float f = context.getResources().getDisplayMetrics().density;
        display = context.getDisplay();
        e(point, f, display);
    }

    public final void g(Display display) {
        if (p) {
            f();
            return;
        }
        Point point = new Point();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealSize(point);
        display.getRealMetrics(displayMetrics);
        e(point, displayMetrics.density, display);
    }
}
