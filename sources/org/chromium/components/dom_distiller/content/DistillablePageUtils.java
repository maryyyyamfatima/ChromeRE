package org.chromium.components.dom_distiller.content;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DistillablePageUtils {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface PageDistillableDelegate {
        void b0(boolean z, boolean z2, boolean z3);
    }

    public static void callOnIsPageDistillableUpdate(PageDistillableDelegate pageDistillableDelegate, boolean z, boolean z2, boolean z3) {
        if (pageDistillableDelegate != null) {
            pageDistillableDelegate.b0(z, z2, z3);
        }
    }
}
