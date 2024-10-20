package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3778b9 {
    public static File a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }
}
