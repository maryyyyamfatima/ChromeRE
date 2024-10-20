package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QU1 implements JV1 {
    public final Context a;
    public final InterfaceC0079Ap3 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final RU1 e;

    public QU1(Context context, C5172fC3 c5172fC3, C5516gC3 c5516gC3) {
        this.a = context;
        this.b = c5172fC3;
        this.e = c5516gC3;
    }

    public final void a(int i) {
        this.d.remove(Integer.valueOf(i));
        this.e.a(i);
    }
}
