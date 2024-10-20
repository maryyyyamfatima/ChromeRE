package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AD implements InterfaceC11696yD {
    @Override // defpackage.InterfaceC11696yD
    public final Object b(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @Override // defpackage.InterfaceC11696yD
    public final Class a() {
        return InputStream.class;
    }
}
