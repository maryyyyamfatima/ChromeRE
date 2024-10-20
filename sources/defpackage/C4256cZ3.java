package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cZ3 */
/* loaded from: classes.dex */
public final class C4256cZ3 implements InterfaceC5678gh3 {
    public final Activity a;
    public final C6022hh3 b;
    public final PC c;

    @Override // defpackage.InterfaceC5678gh3
    public final void a(Tab tab) {
    }

    @Override // defpackage.InterfaceC5678gh3
    public final boolean c() {
        return false;
    }

    public C4256cZ3(C5334fh3 c5334fh3, Activity activity, C6022hh3 c6022hh3, PC pc) {
        this.a = activity;
        this.b = c6022hh3;
        this.c = pc;
        long m = AbstractC2281Ro1.m("androidx.browser.trusted.KEY_SPLASH_SCREEN_FADE_OUT_DURATION", 0, pc.p().getBundleExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS"));
        c5334fh3.l = this;
        c5334fh3.p = m;
        if (c5334fh3.r) {
            c5334fh3.b1();
        }
    }

    @Override // defpackage.InterfaceC5678gh3
    public final View b() {
        ImageView.ScaleType scaleType;
        PC pc = this.c;
        Bitmap bitmap = (Bitmap) this.b.a.remove(pc.u());
        float[] fArr = null;
        if (bitmap == null) {
            return null;
        }
        ImageView imageView = new ImageView(this.a);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setImageBitmap(bitmap);
        Bundle bundleExtra = pc.p().getBundleExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS");
        imageView.setBackgroundColor(AbstractC3899bX.d(AbstractC2281Ro1.m("androidx.browser.trusted.trusted.KEY_SPLASH_SCREEN_BACKGROUND_COLOR", -1, bundleExtra)));
        int m = AbstractC2281Ro1.m("androidx.browser.trusted.KEY_SPLASH_SCREEN_SCALE_TYPE", -1, bundleExtra);
        ImageView.ScaleType[] values = ImageView.ScaleType.values();
        if (m < 0 || m >= values.length) {
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            scaleType = values[m];
        }
        imageView.setScaleType(scaleType);
        if (scaleType == ImageView.ScaleType.MATRIX) {
            try {
                fArr = bundleExtra.getFloatArray("androidx.browser.trusted.KEY_SPLASH_SCREEN_TRANSFORMATION_MATRIX");
            } catch (Throwable unused) {
                AbstractC4851eH1.a("IntentUtils", "getFloatArray failed on bundle " + bundleExtra, new Object[0]);
            }
            if (fArr != null && fArr.length == 9) {
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                imageView.setImageMatrix(matrix);
            }
        }
        return imageView;
    }
}
