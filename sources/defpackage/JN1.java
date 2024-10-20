package defpackage;

import android.media.MediaDrm;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JN1 implements Runnable {
    public final /* synthetic */ PN1 a;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ KN1 j;

    public JN1(KN1 kn1, PN1 pn1, boolean z, List list, boolean z2) {
        this.j = kn1;
        this.a = pn1;
        this.g = z;
        this.h = list;
        this.i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PN1 pn1 = this.a;
        pn1.b();
        MediaDrmBridge mediaDrmBridge = this.j.a;
        ArrayList arrayList = new ArrayList();
        for (MediaDrm.KeyStatus keyStatus : this.h) {
            arrayList.add(new MediaDrmBridge.KeyStatus(keyStatus.getKeyId(), keyStatus.getStatusCode()));
        }
        Object[] array = arrayList.toArray();
        UUID uuid = MediaDrmBridge.l;
        mediaDrmBridge.k(pn1, array, this.g, this.i);
    }
}
