package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462Lg1 {
    public static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public C1462Lg1(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str.concat("/");
        } else {
            this.b = str;
        }
        if (!(callback instanceof View)) {
            AbstractC5888hI1.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
        } else {
            this.a = ((View) callback).getContext();
            this.c = map;
        }
    }
}
