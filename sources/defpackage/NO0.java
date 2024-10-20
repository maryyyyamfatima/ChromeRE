package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NO0 implements InterfaceC11096wU0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean g;

    @Override // defpackage.InterfaceC11096wU0
    public final void a(Activity activity) {
        if (!this.g && this.a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new MO0(this, decorView));
        }
    }
}
