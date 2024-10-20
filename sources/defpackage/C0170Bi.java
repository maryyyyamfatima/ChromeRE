package defpackage;

import android.os.Bundle;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bi */
/* loaded from: classes2.dex */
public final class C0170Bi extends View.AccessibilityDelegate implements InterfaceViewOnTouchListenerC0040Ai {
    public final C1340Ki a;
    public Runnable g;
    public boolean h;

    public C0170Bi(C1340Ki c1340Ki) {
        this.a = c1340Ki;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [Gi] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0170Bi.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 16) {
            C1340Ki c1340Ki = this.a;
            if (!c1340Ki.b()) {
                a(view, false);
            } else {
                c1340Ki.a();
            }
            view.playSoundEffect(0);
            view.sendAccessibilityEvent(1);
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public final boolean a(View view, boolean z) {
        C1340Ki c1340Ki = this.a;
        if (c1340Ki.b() || !c1340Ki.k(view, z)) {
            return false;
        }
        if (!z) {
            FI2.a("MobileUsingMenuBySwButtonTap");
        }
        Runnable runnable = this.g;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
