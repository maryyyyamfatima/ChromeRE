package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ey3 */
/* loaded from: classes.dex */
public final class C5091ey3 {
    public static C4747dy3 l;
    public static C4747dy3 m;
    public static C4747dy3 n;
    public static C4747dy3 o;
    public static C4747dy3 p;
    public static C4747dy3 q;
    public static C4747dy3 r;
    public static C4747dy3 s;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Context h;
    public boolean i;
    public Profile j;
    public WH0 k;

    public C5091ey3(Context context, boolean z) {
        this.h = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08078f);
        this.d = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b4);
        this.c = dimensionPixelSize2;
        this.e = z ? dimensionPixelSize2 : dimensionPixelSize;
        this.f = Ge4.b(context, context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0807b3));
        this.g = z;
        int g = AbstractC5521gD3.g(context, false, false);
        int g2 = AbstractC5521gD3.g(context, false, true);
        this.a = g2;
        int g3 = AbstractC5521gD3.g(context, true, false);
        int g4 = AbstractC5521gD3.g(context, true, true);
        this.b = g4;
        if (l == null) {
            l = b(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090212), dimensionPixelSize), g, false, g2);
        }
        if (m == null) {
            m = b(BitmapFactory.decodeResource(context.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f09011f), g, false, g2);
        }
        if (n == null) {
            n = b(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090239), dimensionPixelSize), g, false, g2);
        }
        if (o == null) {
            o = b(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090212), dimensionPixelSize), g3, false, g4);
        }
        if (p == null) {
            p = b(BitmapFactory.decodeResource(context.getResources(), R.drawable.0_resource_name_obfuscated_res_0x7f09011f), g3, false, g4);
        }
        if (q == null) {
            q = b(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090239), dimensionPixelSize), g3, false, g4);
        }
        if (r == null) {
            Drawable g5 = g(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f090212), dimensionPixelSize2), true);
            r = new C4747dy3(g5, g5, false);
        }
        if (s == null) {
            Drawable g6 = g(d(AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f09011f), dimensionPixelSize2), true);
            s = new C4747dy3(g6, g6, false);
        }
    }

    public final void f(Profile profile) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.j = profile;
        this.k = new WH0();
    }

    public static Bitmap d(Drawable drawable, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i);
        drawable.draw(canvas);
        return createBitmap;
    }

    public final Drawable g(Bitmap bitmap, boolean z) {
        int i = z ? this.c : this.d;
        Context context = this.h;
        C5590gR2 b = AbstractC4855eI0.b(context.getResources(), Bitmap.createScaledBitmap(bitmap, i, i, true));
        if (!z) {
            return b;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{AbstractC2884Wf.a(context, R.drawable.0_resource_name_obfuscated_res_0x7f0904b6), b});
        int i2 = this.f;
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    public final void c(final GURL gurl, final boolean z, final Callback callback) {
        C4747dy3 c4747dy3;
        if (this.k != null && !T34.k(gurl)) {
            WH0 wh0 = this.k;
            Profile profile = this.j;
            FaviconHelper$FaviconImageCallback faviconHelper$FaviconImageCallback = new FaviconHelper$FaviconImageCallback() { // from class: by3
                @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
                public final void onFaviconAvailable(Bitmap bitmap, GURL gurl2) {
                    C4747dy3 c4747dy32;
                    C5091ey3 c5091ey3 = C5091ey3.this;
                    boolean z2 = z;
                    if (bitmap == null) {
                        c4747dy32 = c5091ey3.e(z2);
                    } else {
                        c5091ey3.getClass();
                        boolean i = T34.i(gurl);
                        boolean z3 = c5091ey3.g;
                        if (!i || z3) {
                            Drawable g = c5091ey3.g(bitmap, z3);
                            c4747dy32 = new C4747dy3(g, g, false);
                        } else {
                            Bitmap d = C5091ey3.d(c5091ey3.g(bitmap, false), c5091ey3.d);
                            if (z2) {
                                c4747dy32 = c5091ey3.b(d, 0, true, c5091ey3.b);
                            } else {
                                c4747dy32 = c5091ey3.b(d, 0, true, c5091ey3.a);
                            }
                        }
                    }
                    callback.onResult(c4747dy32);
                }
            };
            wh0.getClass();
            wh0.a(profile, gurl.i(), this.e, faviconHelper$FaviconImageCallback);
            return;
        }
        if (this.g) {
            c4747dy3 = s;
        } else if (z) {
            c4747dy3 = p;
        } else {
            c4747dy3 = m;
            a(c4747dy3);
        }
        callback.onResult(c4747dy3);
    }

    public final void a(C4747dy3 c4747dy3) {
        Context context = this.h;
        c4747dy3.a.setColorFilter(new PorterDuffColorFilter(AbstractC5521gD3.g(context, false, false), PorterDuff.Mode.SRC_IN));
        Drawable drawable = c4747dy3.a;
        Drawable drawable2 = c4747dy3.b;
        if (drawable != drawable2) {
            drawable2.setColorFilter(new PorterDuffColorFilter(AbstractC5521gD3.g(context, false, true), PorterDuff.Mode.SRC_IN));
        }
    }

    public final C4747dy3 e(boolean z) {
        if (this.g) {
            return r;
        }
        if (z) {
            return o;
        }
        C4747dy3 c4747dy3 = l;
        a(c4747dy3);
        return c4747dy3;
    }

    public final C4747dy3 b(Bitmap bitmap, int i, boolean z, int i2) {
        Drawable g = g(bitmap, false);
        if (!z) {
            g.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        Drawable g2 = g(bitmap, false);
        g2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        return new C4747dy3(g, g2, true);
    }
}
