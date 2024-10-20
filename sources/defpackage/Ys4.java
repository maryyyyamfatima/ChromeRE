package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ys4 {
    public final C3701av4 a;

    public Ys4(C3701av4 c3701av4) {
        this.a = c3701av4;
    }

    public final synchronized void a(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Integer) Au4.a(assets, "addAssetPath", Integer.class, String.class, ((File) it.next()).getPath())).intValue();
        }
    }
}
