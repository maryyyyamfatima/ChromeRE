package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10424uX extends AbstractC6759jq0 {
    public final /* synthetic */ AtomicReference g;

    public C10424uX(AtomicReference atomicReference) {
        this.g = atomicReference;
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void onError(Throwable th) {
        this.g.set(Status.g);
    }

    @Override // defpackage.InterfaceC10434uZ
    public final void b() {
        this.g.set(Status.OK);
    }
}
