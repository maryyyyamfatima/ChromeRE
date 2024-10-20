package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dy */
/* loaded from: classes2.dex */
public abstract class AbstractC0510Dy {
    public static Bitmap a(C10924vy c10924vy) {
        C1804Nx c1804Nx;
        C1544Lx c1544Lx = c10924vy.c;
        if (c1544Lx == null) {
            return null;
        }
        C11267wy c11267wy = c10924vy.b;
        int i = c11267wy.c;
        int i2 = c11267wy.d;
        long j = i * i2;
        if (i <= 0 || i2 <= 0 || j > 2305843009213693951L) {
            return null;
        }
        if (c1544Lx.a != 0) {
            C1674Mx c1674Mx = c1544Lx.c;
            InterfaceC9615s83 interfaceC9615s83 = c1674Mx.b;
            long j2 = c1674Mx.c;
            C9272r83 c9272r83 = C9272r83.c;
            c1804Nx = new C1804Nx(c1674Mx.b, interfaceC9615s83.g(j2));
        } else {
            c1804Nx = new C1804Nx(null, ByteBuffer.wrap(c1544Lx.b));
        }
        try {
            ByteBuffer byteBuffer = c1804Nx.g;
            if (byteBuffer.capacity() <= 0) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            c1804Nx.close();
            return createBitmap;
        } finally {
            try {
                c1804Nx.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static C8009nU0 b(C10924vy c10924vy) {
        Bitmap a = a(c10924vy);
        if (a == null) {
            return null;
        }
        C8009nU0 c8009nU0 = new C8009nU0();
        int width = a.getWidth();
        int height = a.getHeight();
        c8009nU0.c = a;
        C7665mU0 c7665mU0 = c8009nU0.a;
        c7665mU0.a = width;
        c7665mU0.b = height;
        return c8009nU0;
    }
}
