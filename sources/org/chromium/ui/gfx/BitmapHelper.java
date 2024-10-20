package org.chromium.ui.gfx;

import android.graphics.Bitmap;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9210qy;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BitmapHelper {
    public static int getBitmapFormatForConfig(Bitmap.Config config) {
        int i = AbstractC9210qy.a[config.ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 7;
        }
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                return 0;
            }
        }
        return i2;
    }

    public static Bitmap createBitmap(int i, int i2, int i3, boolean z) {
        Bitmap.Config config;
        if (i3 == 4) {
            config = Bitmap.Config.RGB_565;
        } else if (i3 == 7) {
            config = Bitmap.Config.ARGB_4444;
        } else if (i3 == 8) {
            config = Bitmap.Config.ALPHA_8;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        try {
            return Bitmap.createBitmap(i, i2, config);
        } catch (OutOfMemoryError e) {
            if (!z) {
                throw e;
            }
            AbstractC4851eH1.f("BitmapHelper", "createBitmap OOM-ed", e);
            return null;
        }
    }

    public static int getByteCount(Bitmap bitmap) {
        return bitmap.getByteCount();
    }
}
