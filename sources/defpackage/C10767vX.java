package defpackage;

import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10767vX extends AbstractC6759jq0 {
    public final /* synthetic */ JSPromiseResolver g;

    public C10767vX(JSPromiseResolver jSPromiseResolver) {
        this.g = jSPromiseResolver;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.g.reject(Status.e.withDescription(th.getMessage() == null ? "error" : th.getMessage()));
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.g.resolve();
    }
}
