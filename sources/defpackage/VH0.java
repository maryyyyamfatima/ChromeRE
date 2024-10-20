package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.android.chrome.R;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VH0 {
    public Bitmap a;
    public Bitmap b;
    public Bitmap c;
    public Bitmap d;

    public static Bitmap a(Resources resources, int i, boolean z) {
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i);
        Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int color = resources.getColor(z ? R.color.f17720_resource_name_obfuscated_res_0x7f070114 : R.color.f17810_resource_name_obfuscated_res_0x7f070121);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public final Bitmap b(Resources resources, GURL gurl, boolean z) {
        Bitmap bitmap;
        boolean i = T34.i(gurl);
        if (i) {
            bitmap = z ? this.a : this.b;
        } else {
            bitmap = z ? this.c : this.d;
        }
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap a = a(resources, T34.i(gurl) ? R.drawable.f45620_resource_name_obfuscated_res_0x7f09011f : R.drawable.f45950_resource_name_obfuscated_res_0x7f090153, z);
        if (i && z) {
            this.a = a;
        } else if (i) {
            this.b = a;
        } else if (z) {
            this.c = a;
        } else {
            this.d = a;
        }
        return a;
    }
}
