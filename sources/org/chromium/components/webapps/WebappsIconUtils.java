package org.chromium.components.webapps;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9771sd;
import defpackage.C6964kR2;
import defpackage.Ge4;
import defpackage.V60;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class WebappsIconUtils {
    public static Bitmap createHomeScreenIconFromWebIcon(Bitmap bitmap, boolean z) {
        int round;
        int min = Math.min(Math.round(((ActivityManager) V60.a.getSystemService("activity")).getLauncherLargeIconSize() * 1.25f), Math.max(bitmap.getWidth(), bitmap.getHeight()));
        Rect rect = new Rect(0, 0, min, min);
        if (z) {
            round = Math.round(min * 0.15454549f);
        } else {
            int width = bitmap.getWidth() - 1;
            int height = bitmap.getHeight() - 1;
            round = Color.alpha(bitmap.getPixel(0, 0)) != 0 && Color.alpha(bitmap.getPixel(width, height)) != 0 && Color.alpha(bitmap.getPixel(0, height)) != 0 && Color.alpha(bitmap.getPixel(width, 0)) != 0 ? Math.round(min * 0.045454547f) : 0;
        }
        int i = (round * 2) + min;
        rect.offset(round, round);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            AbstractC4851eH1.a("WebappsIconUtils", "OutOfMemoryError while creating bitmap for home screen icon.", new Object[0]);
            return bitmap;
        }
    }

    public static Bitmap generateHomeScreenIcon(GURL gurl, int i, int i2, int i3) {
        Context context = V60.a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int launcherLargeIconSize = activityManager.getLauncherLargeIconSize();
        int launcherLargeIconDensity = activityManager.getLauncherLargeIconDensity();
        try {
            Bitmap createBitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f = launcherLargeIconSize;
            int i4 = (int) (0.083333336f * f);
            Rect rect = new Rect(0, 0, launcherLargeIconSize, launcherLargeIconSize);
            Drawable c = AbstractC9771sd.c(context.getResources(), R.mipmap.shortcut_icon_shadow, launcherLargeIconDensity);
            canvas.drawBitmap(c instanceof BitmapDrawable ? ((BitmapDrawable) c).getBitmap() : null, (Rect) null, rect, new Paint(2));
            int i5 = launcherLargeIconSize - (i4 * 2);
            Bitmap b = new C6964kR2(i5, i5, Math.round(0.0625f * f), Color.rgb(i, i2, i3), Math.round(f * 0.33333334f)).b(gurl.i(), false);
            if (b == null) {
                return null;
            }
            float f2 = i4;
            canvas.drawBitmap(b, f2, f2, (Paint) null);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            AbstractC4851eH1.f("WebappsIconUtils", "OutOfMemoryError while trying to draw bitmap on canvas.", new Object[0]);
            return null;
        }
    }

    public static int[] getIconSizes() {
        Context context = V60.a;
        float dimension = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080849);
        float f = context.getResources().getDisplayMetrics().density;
        return new int[]{a(context, R.dimen.0_resource_name_obfuscated_res_0x7f080849), Math.round((f - 1.0f) * (dimension / f)), a(context, R.dimen.0_resource_name_obfuscated_res_0x7f08084a), a(context, R.dimen.0_resource_name_obfuscated_res_0x7f08084b), a(context, R.dimen.0_resource_name_obfuscated_res_0x7f080846), a(context, R.dimen.0_resource_name_obfuscated_res_0x7f080845), Ge4.b(context, 48.0f)};
    }

    public static int getIdealIconCornerRadiusPxForPromptUI() {
        return V60.a.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f080847);
    }

    public static boolean isIconLargeEnoughForLauncher(int i, int i2) {
        int launcherLargeIconSize = ((ActivityManager) V60.a.getSystemService("activity")).getLauncherLargeIconSize() / 2;
        return i >= launcherLargeIconSize && i2 >= launcherLargeIconSize;
    }

    public static Bitmap generateAdaptiveIconBitmap(Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        int intrinsicWidth;
        int intrinsicHeight;
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(createHomeScreenIconFromWebIcon(bitmap, true));
        AdaptiveIconDrawable adaptiveIconDrawable = (AdaptiveIconDrawable) createWithAdaptiveBitmap.loadDrawable(V60.a);
        intrinsicWidth = adaptiveIconDrawable.getIntrinsicWidth();
        intrinsicHeight = adaptiveIconDrawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        adaptiveIconDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        adaptiveIconDrawable.draw(canvas);
        return createBitmap;
    }

    public static int a(Context context, int i) {
        return Math.round(context.getResources().getDimension(i));
    }
}
