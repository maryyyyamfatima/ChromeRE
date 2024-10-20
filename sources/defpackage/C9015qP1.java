package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9015qP1 implements Comparator {
    public static final C9015qP1 a = new C9015qP1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((DQ1) obj).d.compareToIgnoreCase(((DQ1) obj2).d);
    }
}
