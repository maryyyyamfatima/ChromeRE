package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9771sd {
    public static void h(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void g(Window window, int i) {
        if (Build.VERSION.SDK_INT < 26 && i == -16777216 && window.getNavigationBarColor() == -16777216) {
            window.clearFlags(Integer.MIN_VALUE);
        } else {
            window.addFlags(Integer.MIN_VALUE);
        }
        window.setStatusBarColor(i);
    }

    public static Drawable c(Resources resources, int i, int i2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (i2 == 0) {
                return resources.getDrawable(i, null);
            }
            return resources.getDrawableForDensity(i, i2, null);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static void i(int i, TextView textView) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    public static boolean e() {
        boolean isDemoUser;
        if (Build.VERSION.SDK_INT >= 25) {
            isDemoUser = ((UserManager) V60.a.getSystemService("user")).isDemoUser();
            if (isDemoUser) {
                return true;
            }
        }
        return false;
    }

    public static int a(int i, int i2, Context context, String str) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static boolean f(Activity activity) {
        boolean isInMultiWindowMode;
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        isInMultiWindowMode = activity.isInMultiWindowMode();
        return isInMultiWindowMode;
    }

    public static ArrayList d(Activity activity) {
        DisplayManager displayManager;
        boolean isActivityStartAllowedOnDisplay;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = new ArrayList();
            if (activity != null && (displayManager = (DisplayManager) activity.getSystemService("display")) != null) {
                Display[] displays = displayManager.getDisplays();
                ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
                for (Display display : displays) {
                    if (display.getState() == 2) {
                        isActivityStartAllowedOnDisplay = activityManager.isActivityStartAllowedOnDisplay(activity, display.getDisplayId(), new Intent(activity, activity.getClass()));
                        if (isActivityStartAllowedOnDisplay) {
                            arrayList.add(Integer.valueOf(display.getDisplayId()));
                        }
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
