package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.proto.nano.Display$DisplayParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gq0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5729gq0 {
    public static Display b(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static DisplayMetrics c(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i < i2) {
            displayMetrics.widthPixels = i2;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static DisplayMetrics d(Display display, Display$DisplayParams display$DisplayParams) {
        DisplayMetrics c = c(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                c.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                c.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return c;
    }

    public static float a(Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null || !display$DisplayParams.hasBottomBezelHeight()) {
            return 0.003f;
        }
        return display$DisplayParams.getBottomBezelHeight();
    }
}
