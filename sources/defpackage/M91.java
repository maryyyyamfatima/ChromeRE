package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.research.ink.core.jni.HostControllerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class M91 implements InterfaceC4582dW0 {
    public final /* synthetic */ C10745vS2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ HostControllerImpl c;

    public M91(HostControllerImpl hostControllerImpl, C10745vS2 c10745vS2, String str) {
        this.c = hostControllerImpl;
        this.a = c10745vS2;
        this.b = str;
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ((BK3) this.c.a).i(this.a, bitmap);
        } else {
            AbstractC4508dH1.e("no bitmap found for " + this.b);
        }
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void b(Throwable th) {
        StringBuilder sb = new StringBuilder("Failed to provide image for ");
        String str = this.b;
        sb.append(str);
        String sb2 = sb.toString();
        if (AbstractC4508dH1.d(5)) {
            Log.w("InkCore", sb2, th);
        }
        BK3 bk3 = (BK3) this.c.a;
        bk3.getClass();
        bk3.a.a(new VL2(str));
    }
}
