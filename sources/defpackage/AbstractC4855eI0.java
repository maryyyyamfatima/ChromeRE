package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eI0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4855eI0 {
    public static C6964kR2 a(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f29340_resource_name_obfuscated_res_0x7f080101);
        return new C6964kR2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize / 2, context.getColor(R.color.f17660_resource_name_obfuscated_res_0x7f07010e), r0.getDimensionPixelSize(R.dimen.f29350_resource_name_obfuscated_res_0x7f080102));
    }

    public static C6964kR2 c(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
        return new C6964kR2(dimensionPixelSize, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.f30450_resource_name_obfuscated_res_0x7f080177), context.getColor(R.color.f17660_resource_name_obfuscated_res_0x7f07010e), resources.getDimensionPixelSize(R.dimen.f30460_resource_name_obfuscated_res_0x7f080178));
    }

    public static C5590gR2 b(Resources resources, Bitmap bitmap) {
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f30450_resource_name_obfuscated_res_0x7f080177);
        C5590gR2 c5590gR2 = new C5590gR2(resources, bitmap);
        c5590gR2.b(dimensionPixelSize);
        return c5590gR2;
    }

    public static Drawable e(Bitmap bitmap, GURL gurl, int i, C6964kR2 c6964kR2, Resources resources, int i2) {
        return d(bitmap, gurl.i(), i, c6964kR2, resources, i2);
    }

    public static Drawable d(Bitmap bitmap, String str, int i, C6964kR2 c6964kR2, Resources resources, int i2) {
        if (bitmap != null) {
            return b(resources, Bitmap.createScaledBitmap(bitmap, i2, i2, false));
        }
        c6964kR2.e.setColor(i);
        return new BitmapDrawable(resources, c6964kR2.b(str, false));
    }
}
