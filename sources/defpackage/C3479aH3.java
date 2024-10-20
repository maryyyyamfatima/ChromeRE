package defpackage;

import android.widget.PopupWindow;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aH3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3479aH3 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C3823bH3 a;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        HashSet hashSet = C3823bH3.q;
        hashSet.remove(this.a);
        C3823bH3.r.p(Integer.valueOf(hashSet.size()));
    }

    public C3479aH3(C3823bH3 c3823bH3) {
        this.a = c3823bH3;
    }
}
