package defpackage;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L9 extends SocketImpl {
    @Override // java.net.SocketImpl
    public final void close() {
    }

    @Override // java.net.SocketImpl
    public final void create(boolean z) {
    }

    public L9(FileDescriptor fileDescriptor) {
        ((SocketImpl) this).fd = fileDescriptor;
    }

    @Override // java.net.SocketImpl
    public final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    public final int available() {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    public final void bind(InetAddress inetAddress, int i) {
        throw new RuntimeException("accept not implemented");
    }

    @Override // java.net.SocketImpl
    public final void connect(InetAddress inetAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    @Override // java.net.SocketImpl
    public final void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    @Override // java.net.SocketImpl
    public final void connect(String str, int i) {
        throw new RuntimeException("connect not implemented");
    }

    @Override // java.net.SocketImpl
    public final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    @Override // java.net.SocketImpl
    public final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    @Override // java.net.SocketImpl
    public final void listen(int i) {
        throw new RuntimeException("listen not implemented");
    }

    @Override // java.net.SocketImpl
    public final void sendUrgentData(int i) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    @Override // java.net.SocketOptions
    public final Object getOption(int i) {
        throw new RuntimeException("getOption not implemented");
    }

    @Override // java.net.SocketOptions
    public final void setOption(int i, Object obj) {
        throw new RuntimeException("setOption not implemented");
    }
}
