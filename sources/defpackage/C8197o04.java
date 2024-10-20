package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.chrome.R;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o04 */
/* loaded from: classes.dex */
public final class C8197o04 {
    public final Context a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final LargeIconBridge f;
    public final C6964kR2 g;

    public C8197o04(Activity activity, LargeIconBridge largeIconBridge) {
        this.a = activity;
        this.f = largeIconBridge;
        Resources resources = activity.getResources();
        this.b = (int) resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080179);
        this.c = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08017a);
        this.d = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090352, R.color.0_resource_name_obfuscated_res_0x7f07012b, activity);
        this.e = AbstractC8540p04.e(R.drawable.0_resource_name_obfuscated_res_0x7f090212, R.color.0_resource_name_obfuscated_res_0x7f07012b, activity);
        this.g = AbstractC4855eI0.c(activity);
    }

    public final String a(C1756Nn1 c1756Nn1) {
        int i = c1756Nn1.b == -1 ? 0 : c1756Nn1.g;
        int d = d(c1756Nn1);
        Resources resources = this.a.getResources();
        int i2 = c1756Nn1.c;
        if (i2 == 1) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14053c);
        }
        if (i2 == 2) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140536);
        }
        if (d == 0) {
            return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14053f);
        }
        boolean z = c1756Nn1.h;
        int i3 = c1756Nn1.f;
        if (!z || i <= 0) {
            if (i == 0) {
                return resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001e, i3, Integer.valueOf(i3));
            }
            return resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001d, d, Integer.valueOf(i), Integer.valueOf(d), Integer.valueOf(i));
        }
        if (i3 == 0) {
            return resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001c, i, Integer.valueOf(i));
        }
        return resources.getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12001d, d, Integer.valueOf(i), Integer.valueOf(d), Integer.valueOf(i));
    }

    public final String b(C1756Nn1 c1756Nn1) {
        boolean z = false;
        int i = c1756Nn1.b == -1 ? 0 : c1756Nn1.g;
        int d = d(c1756Nn1);
        Resources resources = this.a.getResources();
        if (d != 0) {
            String str = c1756Nn1.e;
            if (d == 1 && TextUtils.isEmpty(c1756Nn1.d) && TextUtils.isEmpty(str)) {
                z = true;
            }
            if (!z) {
                return (!c1756Nn1.h || i <= 0) ? str : resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1406f0);
            }
        }
        return resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14053d);
    }

    public final void c(final PropertyModel propertyModel, final PD2 pd2, final C1756Nn1 c1756Nn1) {
        boolean z = false;
        int i = c1756Nn1.b == -1 ? 0 : c1756Nn1.g;
        int d = d(c1756Nn1);
        if (d != 0) {
            String str = c1756Nn1.d;
            if (d == 1 && TextUtils.isEmpty(str) && TextUtils.isEmpty(c1756Nn1.e)) {
                z = true;
            }
            if (!z) {
                if (c1756Nn1.h && i > 0) {
                    propertyModel.o(pd2, this.d);
                    return;
                } else {
                    this.f.b(new GURL(str), this.b, new LargeIconBridge.LargeIconCallback() { // from class: i04
                        @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                        public final void onLargeIconAvailable(Bitmap bitmap, int i2, boolean z2, int i3) {
                            Bitmap createScaledBitmap;
                            C8197o04 c8197o04 = C8197o04.this;
                            c8197o04.getClass();
                            String str2 = c1756Nn1.d;
                            if (bitmap == null) {
                                C6964kR2 c6964kR2 = c8197o04.g;
                                c6964kR2.e.setColor(i2);
                                createScaledBitmap = c6964kR2.b(str2, false);
                            } else {
                                int i4 = c8197o04.c;
                                createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i4, true);
                            }
                            propertyModel.o(pd2, new BitmapDrawable(c8197o04.a.getResources(), createScaledBitmap));
                        }
                    });
                    return;
                }
            }
        }
        propertyModel.o(pd2, this.e);
    }

    public static int d(C1756Nn1 c1756Nn1) {
        return c1756Nn1.f + (c1756Nn1.b == -1 ? 0 : c1756Nn1.g);
    }
}
