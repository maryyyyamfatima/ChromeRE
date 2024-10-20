package defpackage;

import android.net.Uri;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class X63 implements InterfaceC5488g73 {
    public final /* synthetic */ Callback a;

    @Override // defpackage.InterfaceC5488g73
    public final void b() {
    }

    public X63(Callback callback) {
        this.a = callback;
    }

    @Override // defpackage.InterfaceC5488g73
    public final void a(Uri uri) {
        this.a.onResult(uri);
    }
}
