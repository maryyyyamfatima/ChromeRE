package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$Source;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FD implements RO2 {
    public final C10238ty a = new C10238ty();

    @Override // defpackage.RO2
    public final /* bridge */ /* synthetic */ boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return true;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        ImageDecoder$Source createSource;
        createSource = ImageDecoder.createSource((ByteBuffer) obj);
        return this.a.b(createSource, i, i2, c0543Ee2);
    }
}
