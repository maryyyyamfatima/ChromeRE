package org.chromium.ui.gfx;

import android.content.res.Resources;
import android.os.StrictMode;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.android.chrome.R;
import defpackage.Kc4;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ViewConfigurationHelper {
    public ViewConfiguration a;
    public float b;

    public ViewConfigurationHelper() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            this.a = ViewConfiguration.get(V60.a);
            if (vmPolicy != null) {
                StrictMode.setVmPolicy(vmPolicy);
            }
            this.b = V60.a.getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            if (vmPolicy != null) {
                try {
                    StrictMode.setVmPolicy(vmPolicy);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final float getMinScalingSpan() {
        int applyDimension;
        Resources resources = V60.a.getResources();
        try {
            applyDimension = resources.getDimensionPixelSize(R.dimen.f29740_resource_name_obfuscated_res_0x7f08012f);
        } catch (Resources.NotFoundException unused) {
            applyDimension = (int) TypedValue.applyDimension(5, 12.0f, resources.getDisplayMetrics());
        }
        return applyDimension / this.b;
    }

    public static int getDoubleTapTimeout() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    public static int getLongPressTimeout() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public static int getTapTimeout() {
        return ViewConfiguration.getTapTimeout();
    }

    public final float getMaximumFlingVelocity() {
        return this.a.getScaledMaximumFlingVelocity() / this.b;
    }

    public final float getMinimumFlingVelocity() {
        return this.a.getScaledMinimumFlingVelocity() / this.b;
    }

    public final float getTouchSlop() {
        return this.a.getScaledTouchSlop() / this.b;
    }

    public final float getDoubleTapSlop() {
        return this.a.getScaledDoubleTapSlop() / this.b;
    }

    public static ViewConfigurationHelper createWithListener() {
        ViewConfigurationHelper viewConfigurationHelper = new ViewConfigurationHelper();
        V60.a.registerComponentCallbacks(new Kc4(viewConfigurationHelper));
        return viewConfigurationHelper;
    }
}
