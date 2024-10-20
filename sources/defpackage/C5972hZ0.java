package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hZ0 */
/* loaded from: classes.dex */
public final class C5972hZ0 implements VO2 {
    @Override // defpackage.LA0
    public final boolean a(Object obj, File file, C0543Ee2 c0543Ee2) {
        try {
            RD.d(((C1993Pi3) ((C5284fZ0) ((JO2) obj).get()).a.a.a).d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.VO2
    public final GA0 b(C0543Ee2 c0543Ee2) {
        return GA0.SOURCE;
    }
}
