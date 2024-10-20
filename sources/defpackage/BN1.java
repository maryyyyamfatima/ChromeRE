package defpackage;

import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class BN1 implements Runnable {
    public final /* synthetic */ MediaDrmBridge a;

    public BN1(MediaDrmBridge mediaDrmBridge) {
        this.a = mediaDrmBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UUID uuid = MediaDrmBridge.l;
        this.a.d();
    }
}
