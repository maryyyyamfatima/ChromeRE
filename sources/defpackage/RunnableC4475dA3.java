package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dA3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4475dA3 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = OA3.a;
        File[] listFiles = NA3.a.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file), new Object[0]);
                }
            } else {
                File[] listFiles2 = file.listFiles();
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        if (!file2.delete()) {
                            AbstractC4851eH1.a("tabmodel", TM0.a("Failed to delete file: ", file2), new Object[0]);
                        }
                    }
                }
            }
        }
    }
}
