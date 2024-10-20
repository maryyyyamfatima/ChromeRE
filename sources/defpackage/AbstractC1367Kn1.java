package defpackage;

import java.util.concurrent.ExecutionException;
import org.chromium.components.gcm_driver.instance_id.InstanceIDBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kn1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1367Kn1 {
    public final /* synthetic */ InstanceIDBridge a;

    public abstract Object a();

    public abstract void c(Object obj);

    public AbstractC1367Kn1(InstanceIDBridge instanceIDBridge) {
        this.a = instanceIDBridge;
    }

    public final void b() {
        C1237Jn1 c1237Jn1 = new C1237Jn1(this);
        c1237Jn1.c(AbstractC0185Bl.e);
        if (InstanceIDBridge.d) {
            try {
                c(c1237Jn1.f());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
