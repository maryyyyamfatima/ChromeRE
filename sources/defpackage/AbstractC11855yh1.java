package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yh1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC11855yh1 {
    public static void a(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setClickable(z);
            childAt.setImportantForAccessibility(z ? 1 : 2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z);
            }
        }
    }
}
