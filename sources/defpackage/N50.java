package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class N50 {
    public static int b(int i) {
        if (i == 1) {
            return R.string.f90940_resource_name_obfuscated_res_0x7f140bfe;
        }
        if (i == 2) {
            return R.string.f91020_resource_name_obfuscated_res_0x7f140c06;
        }
        if (i != 3) {
            return 0;
        }
        return R.string.f90990_resource_name_obfuscated_res_0x7f140c03;
    }

    public static M50 c(int i) {
        if (i == 0) {
            return new M50(R.drawable.f51990_resource_name_obfuscated_res_0x7f090400, R.string.f71780_resource_name_obfuscated_res_0x7f1403d3, 1, 2, R.string.f91120_resource_name_obfuscated_res_0x7f140c10, 0);
        }
        if (i == 15) {
            return new M50(R.drawable.f52020_resource_name_obfuscated_res_0x7f090403, R.string.f83800_resource_name_obfuscated_res_0x7f14090d, 3, 2, 0, 0);
        }
        if (i == 25) {
            return new M50(R.drawable.f54160_resource_name_obfuscated_res_0x7f0904e6, R.string.f67280_resource_name_obfuscated_res_0x7f1401cd, 1, 2, 0, R.string.f90920_resource_name_obfuscated_res_0x7f140bfc);
        }
        if (i == 30) {
            return new M50(R.drawable.f50630_resource_name_obfuscated_res_0x7f090343, R.string.f87460_resource_name_obfuscated_res_0x7f140a86, 1, 2, R.string.f91410_resource_name_obfuscated_res_0x7f140c30, R.string.f91420_resource_name_obfuscated_res_0x7f140c31);
        }
        if (i == 32) {
            int i2 = R.string.f77800_resource_name_obfuscated_res_0x7f14066f;
            int i3 = R.string.f91290_resource_name_obfuscated_res_0x7f140c21;
            int i4 = R.string.f91300_resource_name_obfuscated_res_0x7f140c22;
            try {
                if (AbstractC8293oI0.b()) {
                    if (N.MVi$blz$("GenericSensorExtraClasses")) {
                        i2 = R.string.f86120_resource_name_obfuscated_res_0x7f1409fd;
                        i3 = R.string.f91390_resource_name_obfuscated_res_0x7f140c2e;
                        i4 = R.string.f91400_resource_name_obfuscated_res_0x7f140c2f;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new M50(R.drawable.f53240_resource_name_obfuscated_res_0x7f090488, i2, 1, 2, i3, i4);
        }
        if (i == 35) {
            return new M50(R.drawable.f46570_resource_name_obfuscated_res_0x7f090197, R.string.f91650_resource_name_obfuscated_res_0x7f140c4a, 3, 2, R.string.f91440_resource_name_obfuscated_res_0x7f140c33, R.string.f91450_resource_name_obfuscated_res_0x7f140c34);
        }
        if (i == 38) {
            return new M50(R.drawable.f46480_resource_name_obfuscated_res_0x7f09018e, R.string.f91530_resource_name_obfuscated_res_0x7f140c3c, 3, 2, R.string.f91240_resource_name_obfuscated_res_0x7f140c1c, R.string.f91250_resource_name_obfuscated_res_0x7f140c1d);
        }
        if (i == 43) {
            return new M50(R.drawable.f46450_resource_name_obfuscated_res_0x7f09018b, R.string.f90910_resource_name_obfuscated_res_0x7f140bfb, 3, 2, R.string.f91050_resource_name_obfuscated_res_0x7f140c09, 0);
        }
        if (i == 2) {
            return new M50(R.drawable.f52000_resource_name_obfuscated_res_0x7f090401, R.string.f75620_resource_name_obfuscated_res_0x7f140573, 1, 2, R.string.f91260_resource_name_obfuscated_res_0x7f140c1e, 0);
        }
        if (i == 3) {
            return new M50(R.drawable.f52010_resource_name_obfuscated_res_0x7f090402, R.string.f81760_resource_name_obfuscated_res_0x7f140840, 1, 2, 0, R.string.f91350_resource_name_obfuscated_res_0x7f140c28);
        }
        if (i == 4) {
            return new M50(R.drawable.f46500_resource_name_obfuscated_res_0x7f090190, R.string.f91490_resource_name_obfuscated_res_0x7f140c38, 3, 2, R.string.f91270_resource_name_obfuscated_res_0x7f140c1f, 0);
        }
        if (i == 5) {
            return new M50(R.drawable.f46540_resource_name_obfuscated_res_0x7f090194, R.string.f83810_resource_name_obfuscated_res_0x7f14090e, 3, 2, R.string.f91330_resource_name_obfuscated_res_0x7f140c25, 0);
        }
        if (i == 8) {
            return new M50(R.drawable.f46510_resource_name_obfuscated_res_0x7f090191, R.string.f91670_resource_name_obfuscated_res_0x7f140c4c, 3, 2, R.string.f91280_resource_name_obfuscated_res_0x7f140c20, 0);
        }
        if (i == 9) {
            return new M50(R.drawable.f46580_resource_name_obfuscated_res_0x7f090198, R.string.f91660_resource_name_obfuscated_res_0x7f140c4b, 3, 2, R.string.f91060_resource_name_obfuscated_res_0x7f140c0a, 0);
        }
        if (i == 12) {
            return new M50(R.drawable.f50890_resource_name_obfuscated_res_0x7f09035d, R.string.f68730_resource_name_obfuscated_res_0x7f140261, 3, 2, R.string.f90990_resource_name_obfuscated_res_0x7f140c03, 0);
        }
        if (i == 13) {
            return new M50(R.drawable.f46560_resource_name_obfuscated_res_0x7f090196, R.string.f77660_resource_name_obfuscated_res_0x7f140660, null, null, 0, 0);
        }
        if (i == 56) {
            return new M50(R.drawable.f46460_resource_name_obfuscated_res_0x7f09018c, R.string.f90190_resource_name_obfuscated_res_0x7f140bb1, 3, 2, R.string.f91460_resource_name_obfuscated_res_0x7f140c35, R.string.f91470_resource_name_obfuscated_res_0x7f140c36);
        }
        if (i == 57) {
            return new M50(R.drawable.f46460_resource_name_obfuscated_res_0x7f09018c, R.string.f67690_resource_name_obfuscated_res_0x7f1401f9, 3, 2, R.string.f90970_resource_name_obfuscated_res_0x7f140c01, R.string.f90980_resource_name_obfuscated_res_0x7f140c02);
        }
        switch (i) {
            case 19:
                return new M50(R.drawable.f46570_resource_name_obfuscated_res_0x7f090197, 0, 3, 2, 0, 0);
            case 20:
                return new M50(R.drawable.f53220_resource_name_obfuscated_res_0x7f090486, R.string.f90900_resource_name_obfuscated_res_0x7f140bfa, 3, 2, R.string.f91030_resource_name_obfuscated_res_0x7f140c07, R.string.f91040_resource_name_obfuscated_res_0x7f140c08);
            case 21:
                return new M50(R.drawable.f51980_resource_name_obfuscated_res_0x7f0903ff, R.string.f68910_resource_name_obfuscated_res_0x7f140273, 1, 2, R.string.f90960_resource_name_obfuscated_res_0x7f140c00, 0);
            default:
                switch (i) {
                    case 51:
                        return new M50(R.drawable.f46530_resource_name_obfuscated_res_0x7f090193, R.string.f78260_resource_name_obfuscated_res_0x7f1406cf, 3, 2, R.string.f91310_resource_name_obfuscated_res_0x7f140c23, R.string.f91320_resource_name_obfuscated_res_0x7f140c24);
                    case 52:
                        return new M50(R.drawable.f53220_resource_name_obfuscated_res_0x7f090486, 0, 3, 2, 0, 0);
                    case 53:
                        return new M50(R.drawable.f46470_resource_name_obfuscated_res_0x7f09018d, R.string.f70670_resource_name_obfuscated_res_0x7f140361, 3, 2, R.string.f91070_resource_name_obfuscated_res_0x7f140c0b, R.string.f91080_resource_name_obfuscated_res_0x7f140c0c);
                    default:
                        switch (i) {
                            case 73:
                                return new M50(R.drawable.f47060_resource_name_obfuscated_res_0x7f0901cb, R.string.f67830_resource_name_obfuscated_res_0x7f140207, 1, 2, R.string.f91000_resource_name_obfuscated_res_0x7f140c04, R.string.f91010_resource_name_obfuscated_res_0x7f140c05);
                            case 74:
                                return new M50(R.drawable.f47270_resource_name_obfuscated_res_0x7f0901e3, R.string.f72060_resource_name_obfuscated_res_0x7f1403f1, 1, 2, R.string.f91180_resource_name_obfuscated_res_0x7f140c16, R.string.f91200_resource_name_obfuscated_res_0x7f140c18);
                            case 75:
                                return new M50(R.drawable.f46880_resource_name_obfuscated_res_0x7f0901b8, R.string.f91520_resource_name_obfuscated_res_0x7f140c3b, 1, 2, R.string.f91220_resource_name_obfuscated_res_0x7f140c1a, R.string.f91230_resource_name_obfuscated_res_0x7f140c1b);
                            default:
                                return null;
                        }
                }
        }
    }

    public static BitmapDrawable a(Resources resources, Drawable drawable) {
        ColorFilter colorFilter = drawable.getColorFilter();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int width = canvas.getWidth();
        drawable.setBounds(0, 0, width, width);
        drawable.draw(canvas);
        float f = width;
        float f2 = f * 0.08f;
        float f3 = f * 0.15f;
        float f4 = (f2 / 2.0f) * 0.7071f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        float f5 = 0.5f * f4;
        paint.setStrokeWidth(1.5f * f2);
        float f6 = f - f3;
        canvas.drawLine(f3 + f5, f3 - f5, f6 + f5, f6 - f5, paint);
        paint.setColor(-16777216);
        paint.setXfermode(null);
        paint.setStrokeWidth(f2);
        canvas.drawLine(f3 - f4, f3 + f4, f6 - f4, f6 + f4, paint);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, createBitmap);
        bitmapDrawable.setColorFilter(colorFilter);
        return bitmapDrawable;
    }
}
