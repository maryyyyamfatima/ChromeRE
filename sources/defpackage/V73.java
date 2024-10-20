package defpackage;

import J.N;
import android.graphics.Bitmap;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class V73 implements InterfaceC11001wB0 {
    public final /* synthetic */ Y73 a;

    @Override // defpackage.InterfaceC11001wB0
    public final void a() {
    }

    @Override // defpackage.InterfaceC11001wB0
    public final void b(Bitmap bitmap) {
        if (bitmap != null) {
            Y73 y73 = this.a;
            N.MTm9IWhH(y73.a.getString(R.string.f85420_resource_name_obfuscated_res_0x7f1409b2, String.valueOf(System.currentTimeMillis())), bitmap);
            y73.b.run();
        }
    }

    public V73(Y73 y73) {
        this.a = y73;
    }
}
