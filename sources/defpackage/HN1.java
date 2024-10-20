package defpackage;

import J.N;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class HN1 implements Runnable {
    public final /* synthetic */ PN1 a;
    public final /* synthetic */ long g;
    public final /* synthetic */ IN1 h;

    public HN1(IN1 in1, PN1 pn1, long j) {
        this.h = in1;
        this.a = pn1;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PN1 pn1 = this.a;
        pn1.b();
        long j = this.g;
        MediaDrmBridge mediaDrmBridge = this.h.a;
        UUID uuid = MediaDrmBridge.l;
        if (mediaDrmBridge.h()) {
            N.MFLUFEZc(mediaDrmBridge.c, mediaDrmBridge, pn1.a, j);
        }
    }
}
