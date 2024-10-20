package defpackage;

import java.util.Comparator;
import org.chromium.base.LocaleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4305ci implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return LocaleUtils.b((String) obj).compareTo(LocaleUtils.b((String) obj2));
    }
}
