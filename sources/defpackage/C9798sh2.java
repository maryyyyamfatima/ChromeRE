package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sh2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9798sh2 {
    public final Q44 a;
    public final View b;

    public C9798sh2(Activity activity, ImageView imageView) {
        this.a = new Q44(activity, new Handler(Looper.getMainLooper()));
        this.b = imageView;
    }
}
