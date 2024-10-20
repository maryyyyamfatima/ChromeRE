package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ld3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1449Ld3 extends H5 {
    public C1449Ld3(WeakReference weakReference) {
        super(weakReference);
    }

    @Override // defpackage.C11939yv1
    public boolean f(Context context, View view) {
        Activity a = V60.a(context);
        if (a == null && view != null && (view.getContext() instanceof Activity)) {
            a = (Activity) view.getContext();
        }
        if (a != null) {
            C7851n02.i.getClass();
            if (C7851n02.q(a)) {
                return false;
            }
        }
        return e(view);
    }
}
