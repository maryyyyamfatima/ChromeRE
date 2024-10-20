package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XH0 {
    public final Context a;
    public final C6964kR2 b;
    public final int c;

    public XH0(Context context) {
        this.a = context;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803a3);
        this.b = AbstractC4855eI0.a(context);
    }

    public final Drawable b(String str) {
        Context context = this.a;
        return AbstractC4855eI0.d(null, str, context.getColor(R.color.0_resource_name_obfuscated_res_0x7f07010e), this.b, context.getResources(), this.c);
    }

    public final void a(final Callback callback, String str) {
        LargeIconBridge largeIconBridge = new LargeIconBridge(Profile.d());
        final GURL gurl = new GURL(str);
        if (gurl.b) {
            largeIconBridge.b(gurl, this.c, new LargeIconBridge.LargeIconCallback() { // from class: UH0
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
                    GURL gurl2 = gurl;
                    XH0 xh0 = XH0.this;
                    callback.onResult(AbstractC4855eI0.e(bitmap, gurl2, i, xh0.b, xh0.a.getResources(), xh0.c));
                }
            });
        }
    }
}
