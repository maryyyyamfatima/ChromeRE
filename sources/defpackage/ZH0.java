package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ZH0 {
    public static void a(final Context context, LargeIconBridge largeIconBridge, final GURL gurl, final Callback callback) {
        final Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
        largeIconBridge.b(gurl, resources.getDimensionPixelSize(R.dimen.f30470_resource_name_obfuscated_res_0x7f080179), new LargeIconBridge.LargeIconCallback() { // from class: YH0
            @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
            public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
                callback.onResult(AbstractC4855eI0.e(bitmap, GURL.this, i, AbstractC4855eI0.a(context), resources, dimensionPixelSize));
            }
        });
    }
}
