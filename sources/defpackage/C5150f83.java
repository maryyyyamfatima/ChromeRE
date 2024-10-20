package defpackage;

import android.content.pm.ResolveInfo;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f83, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5150f83 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((ResolveInfo) obj).activityInfo.packageName.compareTo(((ResolveInfo) obj2).activityInfo.packageName);
    }
}
