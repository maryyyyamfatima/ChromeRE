package defpackage;

import java.io.File;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ea0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0521Ea0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file.lastModified() == file2.lastModified()) {
            return file.compareTo(file2);
        }
        return file.lastModified() < file2.lastModified() ? 1 : -1;
    }
}
