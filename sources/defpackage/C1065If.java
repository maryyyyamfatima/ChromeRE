package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: If, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065If {
    public final int[] a = {R.drawable.f44520_resource_name_obfuscated_res_0x7f090092, R.drawable.f44500_resource_name_obfuscated_res_0x7f090090, R.drawable.f43760_resource_name_obfuscated_res_0x7f090046};
    public final int[] b = {R.drawable.f44000_resource_name_obfuscated_res_0x7f09005e, R.drawable.f44350_resource_name_obfuscated_res_0x7f090081, R.drawable.f44070_resource_name_obfuscated_res_0x7f090065, R.drawable.f44020_resource_name_obfuscated_res_0x7f090060, R.drawable.f44030_resource_name_obfuscated_res_0x7f090061, R.drawable.f44060_resource_name_obfuscated_res_0x7f090064, R.drawable.f44050_resource_name_obfuscated_res_0x7f090063};
    public final int[] c = {R.drawable.f44490_resource_name_obfuscated_res_0x7f09008f, R.drawable.f44510_resource_name_obfuscated_res_0x7f090091, R.drawable.f43930_resource_name_obfuscated_res_0x7f090057, R.drawable.f44450_resource_name_obfuscated_res_0x7f09008b, R.drawable.f44460_resource_name_obfuscated_res_0x7f09008c, R.drawable.f44470_resource_name_obfuscated_res_0x7f09008d, R.drawable.f44480_resource_name_obfuscated_res_0x7f09008e};
    public final int[] d = {R.drawable.f44250_resource_name_obfuscated_res_0x7f090077, R.drawable.f43910_resource_name_obfuscated_res_0x7f090055, R.drawable.f44240_resource_name_obfuscated_res_0x7f090076};
    public final int[] e = {R.drawable.f44430_resource_name_obfuscated_res_0x7f090089, R.drawable.f44530_resource_name_obfuscated_res_0x7f090093};
    public final int[] f = {R.drawable.f43790_resource_name_obfuscated_res_0x7f090049, R.drawable.f43850_resource_name_obfuscated_res_0x7f09004f, R.drawable.f43800_resource_name_obfuscated_res_0x7f09004a, R.drawable.f43860_resource_name_obfuscated_res_0x7f090050};

    public final ColorStateList d(Context context, int i) {
        if (i == R.drawable.f43960_resource_name_obfuscated_res_0x7f09005a) {
            return Y50.b(context, R.color.f15850_resource_name_obfuscated_res_0x7f070015);
        }
        if (i == R.drawable.f44420_resource_name_obfuscated_res_0x7f090088) {
            return Y50.b(context, R.color.f15880_resource_name_obfuscated_res_0x7f070018);
        }
        if (i != R.drawable.f44410_resource_name_obfuscated_res_0x7f090087) {
            if (i == R.drawable.f43840_resource_name_obfuscated_res_0x7f09004e) {
                return b(context, AbstractC3838bK3.c(context, R.attr.f4830_resource_name_obfuscated_res_0x7f050110));
            }
            if (i == R.drawable.f43780_resource_name_obfuscated_res_0x7f090048) {
                return b(context, 0);
            }
            if (i == R.drawable.f43830_resource_name_obfuscated_res_0x7f09004d) {
                return b(context, AbstractC3838bK3.c(context, R.attr.f4800_resource_name_obfuscated_res_0x7f05010d));
            }
            if (i == R.drawable.f44370_resource_name_obfuscated_res_0x7f090083 || i == R.drawable.f44380_resource_name_obfuscated_res_0x7f090084) {
                return Y50.b(context, R.color.f15870_resource_name_obfuscated_res_0x7f070017);
            }
            if (a(this.b, i)) {
                return AbstractC3838bK3.d(context, R.attr.f4870_resource_name_obfuscated_res_0x7f050114);
            }
            if (a(this.e, i)) {
                return Y50.b(context, R.color.f15840_resource_name_obfuscated_res_0x7f070014);
            }
            if (a(this.f, i)) {
                return Y50.b(context, R.color.f15830_resource_name_obfuscated_res_0x7f070013);
            }
            if (i == R.drawable.f44340_resource_name_obfuscated_res_0x7f090080) {
                return Y50.b(context, R.color.f15860_resource_name_obfuscated_res_0x7f070016);
            }
            return null;
        }
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList d = AbstractC3838bK3.d(context, R.attr.f5520_resource_name_obfuscated_res_0x7f050155);
        if (d == null || !d.isStateful()) {
            iArr[0] = AbstractC3838bK3.b;
            iArr2[0] = AbstractC3838bK3.b(context, R.attr.f5520_resource_name_obfuscated_res_0x7f050155);
            iArr[1] = AbstractC3838bK3.e;
            iArr2[1] = AbstractC3838bK3.c(context, R.attr.f4850_resource_name_obfuscated_res_0x7f050112);
            iArr[2] = AbstractC3838bK3.f;
            iArr2[2] = AbstractC3838bK3.c(context, R.attr.f5520_resource_name_obfuscated_res_0x7f050155);
        } else {
            int[] iArr3 = AbstractC3838bK3.b;
            iArr[0] = iArr3;
            iArr2[0] = d.getColorForState(iArr3, 0);
            iArr[1] = AbstractC3838bK3.e;
            iArr2[1] = AbstractC3838bK3.c(context, R.attr.f4850_resource_name_obfuscated_res_0x7f050112);
            iArr[2] = AbstractC3838bK3.f;
            iArr2[2] = d.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public static ColorStateList b(Context context, int i) {
        int c = AbstractC3838bK3.c(context, R.attr.f4860_resource_name_obfuscated_res_0x7f050113);
        return new ColorStateList(new int[][]{AbstractC3838bK3.b, AbstractC3838bK3.d, AbstractC3838bK3.c, AbstractC3838bK3.f}, new int[]{AbstractC3838bK3.b(context, R.attr.f4830_resource_name_obfuscated_res_0x7f050110), AbstractC4242cX.f(c, i), AbstractC4242cX.f(c, i), i});
    }

    public static LayerDrawable c(C9701sP2 c9701sP2, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable g = c9701sP2.g(context, R.drawable.f44390_resource_name_obfuscated_res_0x7f090085);
        Drawable g2 = c9701sP2.g(context, R.drawable.f44400_resource_name_obfuscated_res_0x7f090086);
        if ((g instanceof BitmapDrawable) && g.getIntrinsicWidth() == dimensionPixelSize && g.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) g;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            g.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((g2 instanceof BitmapDrawable) && g2.getIntrinsicWidth() == dimensionPixelSize && g2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) g2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            g2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            g2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        int[] iArr = AbstractC3085Xt0.a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1195Jf.b;
        }
        mutate.setColorFilter(C1195Jf.c(i, mode));
    }

    public static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
