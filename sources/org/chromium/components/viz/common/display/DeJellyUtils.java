package org.chromium.components.viz.common.display;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.V60;
import java.lang.reflect.Field;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class DeJellyUtils implements DisplayManager.DisplayListener, ComponentCallbacks {
    public static DeJellyUtils k;
    public boolean a;
    public boolean g;
    public float h;
    public final DisplayManager i;
    public final Field j;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static float screenWidth() {
        if (k == null) {
            k = new DeJellyUtils();
        }
        return k.h;
    }

    public static boolean useDeJelly() {
        if (k == null) {
            k = new DeJellyUtils();
        }
        DeJellyUtils deJellyUtils = k;
        if (Settings.Global.getInt(V60.a.getContentResolver(), "sem_support_scroll_filter", 1) == 0) {
            return false;
        }
        return deJellyUtils.a && deJellyUtils.g;
    }

    public DeJellyUtils() {
        DisplayManager displayManager = (DisplayManager) V60.a.getSystemService("display");
        this.i = displayManager;
        displayManager.registerDisplayListener(this, null);
        V60.a.registerComponentCallbacks(this);
        onDisplayChanged(0);
        onConfigurationChanged(V60.a.getResources().getConfiguration());
        try {
            this.j = Configuration.class.getDeclaredField("semDisplayDeviceType");
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        if (i != 0) {
            return;
        }
        Display display = this.i.getDisplay(i);
        this.a = display.getRotation() == 0;
        if (Build.VERSION.SDK_INT >= 30) {
            maximumWindowMetrics = ((WindowManager) V60.a.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
            bounds = maximumWindowMetrics.getBounds();
            this.h = bounds.width();
        } else {
            display.getRealSize(new Point());
            this.h = r0.x;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Field field = this.j;
        if (field != null) {
            try {
                this.g = field.getInt(configuration) != 5;
                return;
            } catch (Exception unused) {
            }
        }
        this.g = true;
    }
}
