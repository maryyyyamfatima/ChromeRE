package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cJ2 */
/* loaded from: classes.dex */
public final class C4175cJ2 implements J00 {
    public final /* synthetic */ DJ2 a;
    public final /* synthetic */ O00 b;
    public final /* synthetic */ KJ2 c;

    public C4175cJ2(KJ2 kj2, DJ2 dj2, O00 o00) {
        this.c = kj2;
        this.a = dj2;
        this.b = o00;
    }

    @Override // defpackage.J00
    public final void a(int i, int i2) {
        this.c.c0(this.a);
        O00 o00 = this.b;
        synchronized (o00) {
            ComponentTree componentTree = o00.s;
            if (componentTree != null) {
                synchronized (componentTree) {
                    ArrayList arrayList = componentTree.j;
                    if (arrayList != null) {
                        arrayList.remove(this);
                    }
                }
            }
        }
    }
}
