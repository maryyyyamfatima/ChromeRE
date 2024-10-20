package defpackage;

import android.graphics.Bitmap;
import com.android.chrome.R;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DR1 implements LargeIconBridge.LargeIconCallback {
    public final /* synthetic */ ER1 a;

    public DR1(ER1 er1) {
        this.a = er1;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        ER1 er1 = this.a;
        if (er1.g()) {
            return;
        }
        if (bitmap == null) {
            er1.k.h = R.drawable.0_resource_name_obfuscated_res_0x7f0900a3;
            er1.i();
        } else {
            er1.j(bitmap);
        }
    }
}
