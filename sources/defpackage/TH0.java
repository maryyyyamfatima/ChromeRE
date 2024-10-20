package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.chrome.R;
import org.chromium.base.task.PostTask;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TH0 {
    public final LruCache a;
    public final InterfaceC0079Ap3 b;
    public final int c;
    public final C6964kR2 d;

    public TH0(Context context, C8503ou0 c8503ou0) {
        this.b = c8503ou0;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.f37810_resource_name_obfuscated_res_0x7f08062c);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f42040_resource_name_obfuscated_res_0x7f0807e9);
        this.d = new C6964kR2(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize / 2, context.getColor(R.color.f17660_resource_name_obfuscated_res_0x7f07010e), context.getResources().getDimensionPixelSize(R.dimen.f42060_resource_name_obfuscated_res_0x7f0807eb));
        this.a = new LruCache(256);
    }

    public final void b(GURL gurl, boolean z, SH0 sh0) {
        Integer num = (Integer) this.a.get(gurl);
        if (num == null) {
            num = 1;
        }
        if (num.intValue() == 3 && !z) {
            sh0.a(0, null);
        } else {
            a(num.intValue(), new RH0(this, gurl, sh0, z), gurl);
        }
    }

    public final void a(final int i, final SH0 sh0, final GURL gurl) {
        LargeIconBridge largeIconBridge = (LargeIconBridge) this.b.get();
        if ((i == 1 || i == 2) && largeIconBridge == null) {
            sh0.a(i, null);
            return;
        }
        int i2 = this.c;
        if (i == 1) {
            largeIconBridge.b(gurl, i2, new LargeIconBridge.LargeIconCallback() { // from class: OH0
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i3, boolean z, int i4) {
                    SH0.this.a(i, bitmap);
                }
            });
            return;
        }
        if (i == 2) {
            largeIconBridge.b(gurl, i2 / 2, new LargeIconBridge.LargeIconCallback() { // from class: PH0
                @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
                public final void onLargeIconAvailable(Bitmap bitmap, int i3, boolean z, int i4) {
                    SH0.this.a(i, bitmap);
                }
            });
        } else if (i == 3) {
            PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: QH0
                @Override // java.lang.Runnable
                public final void run() {
                    C6964kR2 c6964kR2 = this.d;
                    c6964kR2.getClass();
                    sh0.a(i, c6964kR2.b(gurl.i(), false));
                }
            });
        } else {
            sh0.a(i, null);
        }
    }
}
