package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GD implements LA0 {
    @Override // defpackage.LA0
    public final boolean a(Object obj, File file, C0543Ee2 c0543Ee2) {
        try {
            RD.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
