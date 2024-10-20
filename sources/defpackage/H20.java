package defpackage;

import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H20 {
    public final ArrayList a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C6651jX3 c6651jX3 = (C6651jX3) arrayList.get(size);
            C11325x74 c11325x74 = C74.a;
            if (c6651jX3 != null && !c6651jX3.a) {
                C74.a(path, c6651jX3.d.l() / 100.0f, c6651jX3.e.l() / 100.0f, c6651jX3.f.l() / 360.0f);
            }
        }
    }
}
