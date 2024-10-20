package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yR3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11770yR3 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((View) obj).getTop() - ((View) obj2).getTop();
    }
}
