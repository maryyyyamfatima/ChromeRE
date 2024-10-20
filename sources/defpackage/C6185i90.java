package defpackage;

import android.view.View;
import java.util.Comparator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6185i90 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        WeakHashMap weakHashMap = Ec4.a;
        float z = ((View) obj).getZ();
        float z2 = ((View) obj2).getZ();
        if (z > z2) {
            return -1;
        }
        return z < z2 ? 1 : 0;
    }
}
