package defpackage;

import android.os.StrictMode;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EM0 {
    public static final File a;

    static {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            a = V60.a.getDir("persisted_tab_data_storage", 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }
}
