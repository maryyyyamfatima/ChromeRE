package defpackage;

import java.nio.ByteBuffer;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mb0 */
/* loaded from: classes.dex */
public final class C1565Mb0 implements InterfaceC7876n43 {
    public ByteBuffer a;
    public String b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ C1695Nb0 j;

    public C1565Mb0(C1695Nb0 c1695Nb0) {
        this.j = c1695Nb0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.InterfaceC7876n43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1565Mb0.a():void");
    }

    @Override // defpackage.InterfaceC7876n43
    public final ByteBuffer get() {
        ByteBuffer byteBuffer = null;
        TraceEvent i = TraceEvent.i("CriticalPersistedTabData.Serialize", null);
        try {
            ByteBuffer byteBuffer2 = this.a;
            if (byteBuffer2 != null) {
                byteBuffer = byteBuffer2.asReadOnlyBuffer();
            }
            if (byteBuffer != null) {
                byteBuffer.rewind();
            }
            UP0 up0 = new UP0();
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocate(0).put(new byte[0]);
            }
            int remaining = byteBuffer.remaining();
            up0.p(1, remaining, 1);
            ByteBuffer byteBuffer3 = up0.a;
            int i2 = up0.b - remaining;
            up0.b = i2;
            byteBuffer3.position(i2);
            up0.a.put(byteBuffer);
            int j = up0.j();
            String str = this.b;
            if (str == null) {
                str = " ";
            }
            int g = up0.g(str);
            up0.o(9);
            up0.c(0, this.c);
            up0.c(1, this.d);
            long j2 = this.e;
            if (j2 != 0) {
                up0.n(8, 0);
                ByteBuffer byteBuffer4 = up0.a;
                int i3 = up0.b - 8;
                up0.b = i3;
                byteBuffer4.putLong(i3, j2);
                up0.d[2] = up0.m();
            }
            up0.e(3, j);
            up0.c(4, this.f);
            up0.e(5, g);
            up0.c(6, this.g);
            up0.c(7, this.h);
            up0.c(8, this.i);
            up0.k(up0.i());
            ByteBuffer h = up0.h();
            if (i != null) {
                i.close();
            }
            return h;
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
