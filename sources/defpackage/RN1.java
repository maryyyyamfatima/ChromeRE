package defpackage;

import J.N;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.chromium.media.MediaDrmStorageBridge$PersistentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class RN1 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final SN1 c;

    public final void b(PN1 pn1, byte[] bArr, LN1 ln1) {
        pn1.c = bArr;
        QN1 a = a(pn1);
        PN1 pn12 = a.a;
        MediaDrmStorageBridge$PersistentInfo mediaDrmStorageBridge$PersistentInfo = new MediaDrmStorageBridge$PersistentInfo(pn12.a, pn12.c, a.b, a.c);
        SN1 sn1 = this.c;
        long j = sn1.a;
        if (!(j != -1)) {
            ln1.onResult(Boolean.FALSE);
        } else {
            N.MeALR1v2(j, sn1, mediaDrmStorageBridge$PersistentInfo, ln1);
        }
    }

    public RN1(SN1 sn1) {
        this.c = sn1;
    }

    public final QN1 a(PN1 pn1) {
        return (QN1) this.a.get(ByteBuffer.wrap(pn1.a));
    }
}
