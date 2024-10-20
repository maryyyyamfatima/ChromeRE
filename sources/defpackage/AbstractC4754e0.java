package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4754e0 implements MessageLite {
    public int a = 0;

    @Override // com.google.protobuf.MessageLite
    public final ZD c() {
        try {
            QX0 qx0 = (QX0) this;
            if (qx0.h == -1) {
                C7931nE2 c7931nE2 = C7931nE2.c;
                c7931nE2.getClass();
                qx0.h = c7931nE2.b(qx0.getClass()).h(qx0);
            }
            int i = qx0.h;
            ZD zd = AbstractC4147cE.g;
            byte[] bArr = new byte[i];
            boolean z = KV.b;
            HV hv = new HV(bArr, i);
            ((QX0) this).f(hv);
            if (hv.T() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            return new ZD(bArr);
        } catch (IOException e) {
            throw new RuntimeException(AbstractC4199cO1.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public final byte[] toByteArray() {
        try {
            QX0 qx0 = (QX0) this;
            if (qx0.h == -1) {
                C7931nE2 c7931nE2 = C7931nE2.c;
                c7931nE2.getClass();
                qx0.h = c7931nE2.b(qx0.getClass()).h(qx0);
            }
            int i = qx0.h;
            byte[] bArr = new byte[i];
            boolean z = KV.b;
            HV hv = new HV(bArr, i);
            ((QX0) this).f(hv);
            if (hv.T() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC4199cO1.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // com.google.protobuf.MessageLite
    public final void a(OutputStream outputStream) {
        QX0 qx0 = (QX0) this;
        if (qx0.h == -1) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            qx0.h = c7931nE2.b(qx0.getClass()).h(qx0);
        }
        int i = qx0.h;
        boolean z = KV.b;
        if (i > 4096) {
            i = 4096;
        }
        JV jv = new JV(i, outputStream);
        qx0.f(jv);
        jv.Z();
    }
}
