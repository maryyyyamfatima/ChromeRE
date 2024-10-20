package defpackage;

import J.N;
import android.media.NotProvisionedException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class CN1 implements Callback {
    public final /* synthetic */ long a;
    public final /* synthetic */ MediaDrmBridge g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public CN1(MediaDrmBridge mediaDrmBridge, long j) {
        this.g = mediaDrmBridge;
        this.a = j;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        PN1 pn1 = (PN1) obj;
        long j = this.a;
        MediaDrmBridge mediaDrmBridge = this.g;
        if (pn1 != null) {
            byte[] bArr = pn1.a;
            UUID uuid = MediaDrmBridge.l;
            mediaDrmBridge.getClass();
            try {
                byte[] m = mediaDrmBridge.m();
                if (m == null) {
                    mediaDrmBridge.i(j, "Failed to open session to load license.");
                    return;
                }
                RN1 rn1 = mediaDrmBridge.g;
                QN1 a = rn1.a(pn1);
                pn1.b = m;
                rn1.b.put(ByteBuffer.wrap(m), a);
                if (mediaDrmBridge.g.a(pn1).c == 3) {
                    AbstractC4851eH1.f("media", "Persistent license is waiting for release ack.", new Object[0]);
                    mediaDrmBridge.j(j, pn1);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MediaDrmBridge.KeyStatus(MediaDrmBridge.m, 1));
                    mediaDrmBridge.k(pn1, arrayList.toArray(), false, true);
                    return;
                }
                mediaDrmBridge.k = new NN1(pn1);
                mediaDrmBridge.a.restoreKeys(pn1.b, pn1.c);
                mediaDrmBridge.j(j, pn1);
                ArrayList arrayList2 = mediaDrmBridge.k.b;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList2.clear();
                mediaDrmBridge.k = null;
                return;
            } catch (NotProvisionedException unused) {
                AbstractC4851eH1.f("media", "Persistent license load fail because origin isn't provisioned.", new Object[0]);
                mediaDrmBridge.c(pn1);
                RN1 rn12 = mediaDrmBridge.g;
                DN1 dn1 = new DN1(mediaDrmBridge, j);
                rn12.getClass();
                pn1.c = null;
                SN1 sn1 = rn12.c;
                long j2 = sn1.a;
                if (!(j2 != -1)) {
                    dn1.onResult(Boolean.TRUE);
                    return;
                } else {
                    N.MYa_y6Dg(j2, sn1, bArr, dn1);
                    return;
                }
            } catch (IllegalStateException unused2) {
                mediaDrmBridge.c(pn1);
                RN1 rn13 = mediaDrmBridge.g;
                DN1 dn12 = new DN1(mediaDrmBridge, j);
                rn13.getClass();
                pn1.c = null;
                SN1 sn12 = rn13.c;
                long j3 = sn12.a;
                if (!(j3 != -1)) {
                    dn12.onResult(Boolean.TRUE);
                    return;
                } else {
                    N.MYa_y6Dg(j3, sn12, bArr, dn12);
                    return;
                }
            }
        }
        UUID uuid2 = MediaDrmBridge.l;
        mediaDrmBridge.getClass();
        byte[] bArr2 = new byte[0];
        mediaDrmBridge.j(j, new PN1(bArr2, bArr2, null));
    }
}
