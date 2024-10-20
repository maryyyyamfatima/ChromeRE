package defpackage;

import java.io.File;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: de0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4626de0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long lastModified = ((File) obj).lastModified();
        long lastModified2 = ((File) obj2).lastModified();
        if (lastModified2 < lastModified) {
            return -1;
        }
        return lastModified2 == lastModified ? 0 : 1;
    }
}
