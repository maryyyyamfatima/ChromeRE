package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Um3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2663Um3 {
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
