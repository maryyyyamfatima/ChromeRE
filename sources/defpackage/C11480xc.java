package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xc */
/* loaded from: classes.dex */
public final class C11480xc implements RO2 {
    public final C11823yc a;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        C11823yc c11823yc = this.a;
        return AbstractC1207Jh1.b(c11823yc.b, (InputStream) obj, c11823yc.a) == ImageHeaderParser$ImageType.ANIMATED_WEBP;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        ImageDecoder$Source createSource;
        createSource = ImageDecoder.createSource(RD.b((InputStream) obj));
        this.a.getClass();
        return C11823yc.a(createSource, i, i2, c0543Ee2);
    }

    public C11480xc(C11823yc c11823yc) {
        this.a = c11823yc;
    }
}
