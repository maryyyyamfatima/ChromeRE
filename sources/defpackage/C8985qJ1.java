package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8985qJ1 {
    public Map c;
    public Map d;
    public Map e;
    public C1593Mg3 f;
    public C3487aJ1 g;
    public List h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public final C10887vr2 a = new C10887vr2();
    public final HashSet b = new HashSet();
    public int n = 0;

    public final void a(String str) {
        AbstractC5888hI1.a(str);
        this.b.add(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            sb.append(((C2456Sx1) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
