package org.chromium.ui.display;

import J.N;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import defpackage.AbstractC1895Op0;
import defpackage.C2025Pp0;
import defpackage.C5067eu2;
import defpackage.V60;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DisplayAndroidManager {
    public static DisplayAndroidManager f;
    public long a;
    public int b;
    public final SparseArray c = new SparseArray();
    public final C2025Pp0 d = new C2025Pp0(this);
    public int e = 1073741823;

    public static DisplayAndroidManager b() {
        Object obj = ThreadUtils.a;
        if (f == null) {
            DisplayAndroidManager displayAndroidManager = new DisplayAndroidManager();
            f = displayAndroidManager;
            Display display = ((DisplayManager) V60.a.getSystemService("display")).getDisplay(0);
            if (display == null) {
                display = ((WindowManager) V60.a.getSystemService("window")).getDefaultDisplay();
            }
            displayAndroidManager.b = display.getDisplayId();
            int displayId = display.getDisplayId();
            C5067eu2 c5067eu2 = new C5067eu2(display);
            displayAndroidManager.c.put(displayId, c5067eu2);
            c5067eu2.g(display);
            C2025Pp0 c2025Pp0 = displayAndroidManager.d;
            c2025Pp0.getClass();
            ((DisplayManager) V60.a.getSystemService("display")).registerDisplayListener(c2025Pp0, null);
        }
        return f;
    }

    public static Display a(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                display = context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                display = null;
            }
            return display != null ? display : ((DisplayManager) V60.a.getSystemService("display")).getDisplay(0);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static void onNativeSideCreated(long j) {
        DisplayAndroidManager b = b();
        b.a = j;
        N.MdOwtyr6(j, b, b.b);
        int i = 0;
        while (true) {
            SparseArray sparseArray = b.c;
            if (i >= sparseArray.size()) {
                return;
            }
            b.c((AbstractC1895Op0) sparseArray.valueAt(i));
            i++;
        }
    }

    public final void c(AbstractC1895Op0 abstractC1895Op0) {
        int i;
        int i2;
        long j = this.a;
        if (j == 0) {
            return;
        }
        int i3 = abstractC1895Op0.b;
        Point point = abstractC1895Op0.c;
        int i4 = point.x;
        int i5 = point.y;
        float f2 = abstractC1895Op0.d;
        int i6 = abstractC1895Op0.g;
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = 90;
            } else if (i6 == 2) {
                i2 = 180;
            } else if (i6 == 3) {
                i2 = 270;
            }
            i = i2;
            N.M2$ANfTC(j, this, i3, i4, i5, f2, i, abstractC1895Op0.e, abstractC1895Op0.f, !abstractC1895Op0.k && abstractC1895Op0.l);
        }
        i = 0;
        N.M2$ANfTC(j, this, i3, i4, i5, f2, i, abstractC1895Op0.e, abstractC1895Op0.f, !abstractC1895Op0.k && abstractC1895Op0.l);
    }
}
