package org.chromium.device.power_save_blocker;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PowerSaveBlocker {
    public static final WeakHashMap b = new WeakHashMap();
    public WeakReference a;

    public static PowerSaveBlocker create() {
        return new PowerSaveBlocker();
    }

    public final void applyBlock(View view) {
        this.a = new WeakReference(view);
        WeakHashMap weakHashMap = b;
        Integer num = (Integer) weakHashMap.get(view);
        if (num == null) {
            weakHashMap.put(view, 1);
        } else {
            weakHashMap.put(view, Integer.valueOf(num.intValue() + 1));
        }
        if (num == null || num.intValue() == 0) {
            view.setKeepScreenOn(true);
        }
    }

    public final void removeBlock() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return;
        }
        View view = (View) weakReference.get();
        this.a = null;
        if (view == null) {
            return;
        }
        WeakHashMap weakHashMap = b;
        Integer num = (Integer) weakHashMap.get(view);
        weakHashMap.put(view, Integer.valueOf(num.intValue() - 1));
        if (num.intValue() == 1) {
            view.setKeepScreenOn(false);
        }
    }
}
