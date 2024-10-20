package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class GF {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final Matrix d = new Matrix();
    public C8066ne3 e = new C8066ne3(0, 0);
    public boolean f = false;
    public final T82 c = new T82(new EF(this), "CameraTransformChanged Pool");
}
