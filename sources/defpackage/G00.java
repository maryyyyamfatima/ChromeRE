package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G00 extends GK3 {
    public final int g;
    public final C5277fX3 h;
    public final String i;
    public final boolean j;
    public final /* synthetic */ ComponentTree k;

    public G00(ComponentTree componentTree, int i, C5277fX3 c5277fX3, String str, boolean z) {
        this.k = componentTree;
        this.g = i;
        this.h = c5277fX3;
        this.i = str;
        this.j = z;
    }

    @Override // defpackage.GK3
    public final void a(GK3 gk3) {
        ComponentTree componentTree = this.k;
        int i = this.g;
        String str = this.i;
        C5277fX3 c5277fX3 = this.h;
        boolean z = this.j;
        AtomicInteger atomicInteger = ComponentTree.i0;
        componentTree.c(null, i, str, c5277fX3, z);
    }
}
