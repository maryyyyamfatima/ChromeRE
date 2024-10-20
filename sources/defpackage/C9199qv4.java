package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9199qv4 implements InterfaceC5763gv4 {
    public final FileChannel a;
    public final long b;
    public final long c;

    public C9199qv4(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.InterfaceC5763gv4
    public final long a() {
        return this.c;
    }

    @Override // defpackage.InterfaceC5763gv4
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
