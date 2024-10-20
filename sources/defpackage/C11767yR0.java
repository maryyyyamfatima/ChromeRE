package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yR0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11767yR0 {
    public final AssetManager d;
    public final H02 a = new H02();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final String e = ".ttf";

    public C11767yR0(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            AbstractC5888hI1.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }
}
