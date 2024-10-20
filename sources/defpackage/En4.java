package defpackage;

import java.io.File;
import org.chromium.base.PathUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class En4 extends AbstractC1649Ms {
    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        int i;
        File[] listFiles = new File(PathUtils.getCacheDirectory(), "webapk/update").listFiles();
        if (listFiles != null) {
            i = 0;
            for (File file : listFiles) {
                C12237zn4 c = Wn4.a.c(file.getName());
                if (c != null) {
                    int i2 = System.currentTimeMillis() - c.b.getLong("last_check_web_manifest_update_time", 0L) < 86400000 ? i2 + 1 : 0;
                }
                i++;
            }
        } else {
            i = 0;
        }
        EI2.e(i, "WebApk.Update.NumStaleUpdateRequestFiles");
        AbstractC7974nN0.d(V60.a.getDir("WebappActivity", 0), AbstractC7974nN0.a);
        return null;
    }
}
