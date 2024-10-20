package defpackage;

import J.N;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lD3 */
/* loaded from: classes.dex */
public abstract class AbstractC7239lD3 {
    public static Activity b(Tab tab) {
        WindowAndroid Q0;
        WebContents b = tab != null ? tab.b() : null;
        if (b == null || b.isDestroyed() || (Q0 = b.Q0()) == null) {
            return null;
        }
        return (Activity) Q0.k().get();
    }

    public static Rect a(Context context) {
        Rect rect = new Rect();
        Point point = new Point();
        DisplayAndroidManager.a(context).getSize(point);
        Resources resources = context.getResources();
        try {
            point.y -= resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
        }
        rect.set(0, resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08015e), point.x, point.y);
        return rect;
    }

    public static void e(int i, Tab tab, boolean z, boolean z2) {
        tab.b().i().u(i, z, !tab.isNativePage());
        if (z2) {
            int i2 = z ? 2 : 1;
            if (N.MJSt3Ocq(Profile.b(tab.b()), 74) == z) {
                i2 = 0;
            }
            C1695Nb0 m = C1695Nb0.m(tab);
            if (m.z == i2) {
                return;
            }
            m.z = i2;
            m.l();
        }
    }

    public static float c(Context context) {
        if (AbstractC5177fD3.i(context) && context.getResources().getConfiguration().orientation == 2) {
            return (context.getResources().getConfiguration().screenWidthDp * 1.0f) / (context.getResources().getConfiguration().screenHeightDp * 1.0f);
        }
        return JM1.b((float) AbstractC5177fD3.b.c(), 0.5f, 2.0f);
    }

    public static int d(Context context) {
        return ((int) context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080783)) + (((int) AbstractC5521gD3.c(context)) * 2) + ((int) context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080787));
    }
}
