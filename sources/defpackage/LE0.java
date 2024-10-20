package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LE0 implements InterfaceC0947Hh1 {
    @Override // defpackage.InterfaceC0947Hh1
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final int d(InputStream inputStream, C3492aK1 c3492aK1) {
        KE0 ke0 = new KE0(inputStream);
        GE0 c = ke0.c("Orientation");
        int i = 1;
        if (c != null) {
            try {
                i = c.f(ke0.f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i == 0) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.InterfaceC0947Hh1
    public final int b(ByteBuffer byteBuffer, C3492aK1 c3492aK1) {
        AtomicReference atomicReference = RD.a;
        return d(new PD(byteBuffer), c3492aK1);
    }
}
