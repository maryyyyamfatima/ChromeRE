package defpackage;

import android.net.Uri;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Y63 implements InterfaceC5488g73 {
    public final /* synthetic */ Callback a;

    public Y63(C5165fB1 c5165fB1) {
        this.a = c5165fB1;
    }

    @Override // defpackage.InterfaceC5488g73
    public final void a(Uri uri) {
        this.a.onResult(uri);
    }

    @Override // defpackage.InterfaceC5488g73
    public final void b() {
        this.a.onResult(null);
    }
}
