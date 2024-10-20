package org.chromium.ui.resources;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import defpackage.AbstractC9771sd;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class HandleViewResources {
    public static final int[] a = {R.attr.textSelectHandleLeft};
    public static final int[] b = {R.attr.textSelectHandle};
    public static final int[] c = {R.attr.textSelectHandleRight};

    public static float getHandleHorizontalPaddingRatio() {
        return 0.25f;
    }

    public static Bitmap a(Context context, int[] iArr) {
        Bitmap decodeResource;
        if (context == null) {
            context = V60.a;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.android.chrome.R.style.f107020_resource_name_obfuscated_res_0x7f1505fb);
        TypedArray obtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(obtainStyledAttributes.getIndex(0), 0);
        Resources resources = obtainStyledAttributes.getResources();
        obtainStyledAttributes.recycle();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = config;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(resources, resourceId, options);
        if (decodeResource2 != null) {
            return decodeResource2;
        }
        if (resources != contextThemeWrapper.getResources() && (decodeResource = BitmapFactory.decodeResource(contextThemeWrapper.getResources(), resourceId, options)) != null) {
            return decodeResource;
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.getTheme().obtainStyledAttributes(iArr);
        Drawable drawable = obtainStyledAttributes2.getDrawable(0);
        if (drawable == null) {
            try {
                drawable = AbstractC9771sd.c(contextThemeWrapper.getResources(), obtainStyledAttributes2.getResourceId(0, 0), 0);
            } catch (Resources.NotFoundException unused) {
            }
        }
        obtainStyledAttributes2.recycle();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getLeftHandleBitmap(Context context) {
        return a(context, a);
    }

    public static Bitmap getCenterHandleBitmap(Context context) {
        return a(context, b);
    }

    public static Bitmap getRightHandleBitmap(Context context) {
        return a(context, c);
    }
}
