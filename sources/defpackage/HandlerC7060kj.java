package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import java.nio.ByteBuffer;
import org.chromium.content.browser.AppWebMessagePort;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kj */
/* loaded from: classes2.dex */
public final class HandlerC7060kj extends Handler implements DV1 {
    public final C11608xx2 a;

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public HandlerC7060kj(Looper looper, C11608xx2 c11608xx2) {
        super(looper);
        this.a = c11608xx2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException("undefined message");
        }
        String MWL_OG7s = N.MWL_OG7s(((C6716jj) message.obj).a);
        if (MWL_OG7s != null) {
            AbstractServiceConnectionC0378Cx2 abstractServiceConnectionC0378Cx2 = this.a.a.b;
            if (abstractServiceConnectionC0378Cx2.h != null) {
                synchronized (abstractServiceConnectionC0378Cx2.a) {
                    try {
                        try {
                            abstractServiceConnectionC0378Cx2.h.D0(abstractServiceConnectionC0378Cx2.g, MWL_OG7s, null);
                        } catch (RemoteException unused) {
                        }
                    } finally {
                    }
                }
            }
            EI2.b("CustomTabs.PostMessage.OnMessage", true);
            return;
        }
        AbstractC4851eH1.f("AppWebMessagePort", "Undecodable message received, dropping message", new Object[0]);
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        byte[] bArr;
        try {
            VU3 d = VU3.d(c8697pU1.a().b());
            int length = d.c.length;
            AppWebMessagePort[] appWebMessagePortArr = new AppWebMessagePort[length];
            for (int i = 0; i < length; i++) {
                appWebMessagePortArr[i] = new AppWebMessagePort(new C7404lj(d.c[i]));
            }
            C6716jj c6716jj = new C6716jj();
            C1544Lx c1544Lx = d.b.b;
            if (c1544Lx.a == 0) {
                bArr = c1544Lx.b;
            } else {
                C1674Mx c1674Mx = c1544Lx.c;
                InterfaceC9615s83 interfaceC9615s83 = c1674Mx.b;
                long j = c1674Mx.c;
                C9272r83 c9272r83 = C9272r83.c;
                ByteBuffer g = interfaceC9615s83.g(j);
                byte[] bArr2 = new byte[c1674Mx.c];
                g.get(bArr2);
                c1674Mx.b.K(g);
                bArr = bArr2;
            }
            c6716jj.a = bArr;
            sendMessage(obtainMessage(1, c6716jj));
            return true;
        } catch (C12221zl0 e) {
            AbstractC4851eH1.f("AppWebMessagePort", "Error deserializing message", e);
            return false;
        }
    }
}
