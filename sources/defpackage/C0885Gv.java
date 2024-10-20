package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0885Gv {
    public int a;
    public boolean b;

    public final void a(Activity activity) {
        if (this.b) {
            FrameLayout frameLayout = (FrameLayout) activity.getWindow().getDecorView();
            if ((frameLayout.getSystemUiVisibility() & 1024) == 0) {
                frameLayout.setSystemUiVisibility(this.a);
            }
        }
    }
}
