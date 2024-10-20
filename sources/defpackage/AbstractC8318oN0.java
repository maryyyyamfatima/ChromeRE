package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8318oN0 {
    public static void a(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(TM0.a("Unable to create parent directories of ", file));
        }
    }
}
