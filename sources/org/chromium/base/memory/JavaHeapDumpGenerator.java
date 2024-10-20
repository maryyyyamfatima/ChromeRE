package org.chromium.base.memory;

import android.os.Debug;
import defpackage.AbstractC4851eH1;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JavaHeapDumpGenerator {
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            AbstractC4851eH1.d("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e.getMessage(), new Object[0]);
            return false;
        }
    }
}
