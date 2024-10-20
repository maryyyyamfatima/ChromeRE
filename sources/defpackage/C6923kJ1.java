package defpackage;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6923kJ1 implements MJ1 {
    @Override // defpackage.MJ1
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        C11325x74 c11325x74 = C74.a;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            AbstractC5888hI1.b("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
